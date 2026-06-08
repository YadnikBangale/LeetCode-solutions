class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", num, target, 0, 0, 0);
        return ans;
    }

    private void backtrack(List<String> ans,
                           String expr,
                           String num,
                           int target,
                           int index,
                           long currValue,
                           long prevNum) {

        // If we've used all digits
        if (index == num.length()) {
            if (currValue == target) {
                ans.add(expr);
            }
            return;
        }

        // Try all possible numbers starting from index
        for (int i = index; i < num.length(); i++) {

            // Skip numbers with leading zeros
            if (i > index && num.charAt(index) == '0') {
                break;
            }

            String currStr = num.substring(index, i + 1);
            long currNum = Long.parseLong(currStr);

            // First number in the expression
            if (index == 0) {
                backtrack(
                    ans,
                    currStr,
                    num,
                    target,
                    i + 1,
                    currNum,
                    currNum
                );
            } else {

                // Addition
                backtrack(
                    ans,
                    expr + "+" + currStr,
                    num,
                    target,
                    i + 1,
                    currValue + currNum,
                    currNum
                );

                // Subtraction
                backtrack(
                    ans,
                    expr + "-" + currStr,
                    num,
                    target,
                    i + 1,
                    currValue - currNum,
                    -currNum
                );

                // Multiplication
                backtrack(
                    ans,
                    expr + "*" + currStr,
                    num,
                    target,
                    i + 1,
                    currValue - prevNum + (prevNum * currNum),
                    prevNum * currNum
                );
            }
        }
    }
}