public class PalindromePartitioningII {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] isPal = new boolean[n][n];
        int[] cuts = new int[n];

        for (int i = 0; i < n; i++) {
            int minCut = i; // maximum possible cuts
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j < 2 || isPal[j + 1][i - 1])) {
                    isPal[j][i] = true;
                    if (j == 0) minCut = 0;
                    else minCut = Math.min(minCut, cuts[j - 1] + 1);
                }
            }
            cuts[i] = minCut;
        }
        return cuts[n - 1];
    }

    public static void main(String[] args) {
        PalindromePartitioningII solver = new PalindromePartitioningII();

        System.out.println(solver.minCut("aab"));      // Output: 1
        System.out.println(solver.minCut("a"));        // Output: 0
        System.out.println(solver.minCut("abccbc"));   // Output: 2  -> "a" | "bccb" | "c"
    }
}
