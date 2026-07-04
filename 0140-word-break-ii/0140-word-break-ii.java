class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);

        return dfs(s, set, new HashMap<>());
    }

    public List<String> dfs(String s, Set<String> set, Map<String, List<String>> memo) {

        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        List<String> ans = new ArrayList<>();

        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        for (int i = 1; i <= s.length(); i++) {

            String prefix = s.substring(0, i);

            if (set.contains(prefix)) {

                List<String> suffixWays = dfs(s.substring(i), set, memo);

                for (String way : suffixWays) {

                    if (way.equals("")) {
                        ans.add(prefix);
                    } else {
                        ans.add(prefix + " " + way);
                    }
                }
            }
        }

        memo.put(s, ans);

        return ans;
    }
}