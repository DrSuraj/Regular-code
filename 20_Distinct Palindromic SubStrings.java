import java.util.*;

public class Main {
    static void palindromeSubStrs(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1))
                dp[i][i + 1] = true;
        }

        for (int len = 3; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                if (s.charAt(i) == s.charAt(i + (len - 1)) && dp[i + 1][i + (len - 1) - 1])
                    dp[i][i + (len - 1)] = true;
            }
        }

        int[] kmp = new int[n];
        for (int i = 0; i < n; i++) {
            int j = 0, k = 1;
            while (k + i < n) {
                if (s.charAt(j + i) == s.charAt(k + i)) {
                    dp[k + i - j][k + i] = false;
                    kmp[k++] = ++j;
                }
                else if (j > 0)
                    j = kmp[j - 1];
                else
                    kmp[k++] = 0;
            }
        }
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = i; j < n; j++) {
                str += s.charAt(j);
                if (dp[i][j])
                    ans.add(str);
            }
        }

        Collections.sort(ans.subList(0, ans.size()));
        if(ans.size() != 0)
            System.out.println(ans.get(0));
        for(int i = 1; i < ans.size(); i++) {
            if(!Objects.equals(ans.get(i - 1), ans.get(i))) {
                System.out.println(ans.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }
}
