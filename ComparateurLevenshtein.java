public class ComparateurLevenshtein extends ResponsableComparaison {
    public double comparer(Nom nom1, Nom nom2) {
        String s1 = nom1.getNomNormalise();
        String s2 = nom2.getNomNormalise();
        int distance = calculerDistanceLevenshtein(s1, s2);
        int maxLen = Math.max(s1.length(), s2.length());
        if (maxLen == 0)
            return 1.0;
        return 1.0 - ((double) distance / maxLen);
    }

    private int calculerDistanceLevenshtein(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++)
            dp[i][0] = i;
        for (int j = 0; j <= s2.length(); j++)
            dp[0][j] = j;

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                dp[i][j] = Math.min(Math.min(
                        dp[i - 1][j] + 1,
                        dp[i][j - 1] + 1),
                        dp[i - 1][j - 1] + cost);
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
