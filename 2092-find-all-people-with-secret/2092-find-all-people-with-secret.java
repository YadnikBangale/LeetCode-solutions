import java.util.*;

class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);

        Set<Integer> knowSecret = new HashSet<>();
        knowSecret.add(0);
        knowSecret.add(firstPerson);

        int i = 0;

        while (i < meetings.length) {

            int time = meetings[i][2];

            // Graph for same time meetings
            Map<Integer, List<Integer>> graph = new HashMap<>();

            // People involved at this time
            Set<Integer> people = new HashSet<>();

            while (i < meetings.length && meetings[i][2] == time) {
                int x = meetings[i][0];
                int y = meetings[i][1];

                graph.putIfAbsent(x, new ArrayList<>());
                graph.putIfAbsent(y, new ArrayList<>());

                graph.get(x).add(y);
                graph.get(y).add(x);

                people.add(x);
                people.add(y);

                i++;
            }

            // BFS starting from people who already know secret
            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();

            for (int person : people) {
                if (knowSecret.contains(person)) {
                    queue.offer(person);
                    visited.add(person);
                }
            }

            while (!queue.isEmpty()) {
                int curr = queue.poll();
                knowSecret.add(curr);

                for (int next : graph.getOrDefault(curr, new ArrayList<>())) {
                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }
        }

        return new ArrayList<>(knowSecret);
    }
}