class Solution {

    static final long MOD = 1000000007L;

    public int zigZagArrays(int n, int l, int r) {

        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        // Length = 2 initialization
        for (int v = 0; v < m; v++) {
            up[v] = v;               // values smaller than v
            down[v] = m - 1 - v;     // values greater than v
        }

        if (n == 2) {
            long ans = 0;
            for (int i = 0; i < m; i++) {
                ans = (ans + up[i] + down[i]) % MOD;
            }
            return (int) ans;
        }

        for (int len = 3; len <= n; len++) {

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            long[] prefixDown = new long[m];
            long[] suffixUp = new long[m];

            prefixDown[0] = down[0];
            for (int i = 1; i < m; i++) {
                prefixDown[i] = (prefixDown[i - 1] + down[i]) % MOD;
            }

            suffixUp[m - 1] = up[m - 1];
            for (int i = m - 2; i >= 0; i--) {
                suffixUp[i] = (suffixUp[i + 1] + up[i]) % MOD;
            }

            for (int v = 0; v < m; v++) {

                // Previous move was DOWN, now must go UP
                if (v > 0) {
                    newUp[v] = prefixDown[v - 1];
                }

                // Previous move was UP, now must go DOWN
                if (v < m - 1) {
                    newDown[v] = suffixUp[v + 1];
                }
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;

        for (int v = 0; v < m; v++) {
            ans = (ans + up[v] + down[v]) % MOD;
        }

        return (int) ans;
    }
}