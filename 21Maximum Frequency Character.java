import java.util.*;

public class Main {
    
     static char MaximumFrequencyChar(String s) {
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, 0);

        for(int i = 0; i < s.length(); ++i) {
            ++alphabets[s.charAt(i) - 'a'];
        }

        char maxChar = 'a';
        int maxFreq = 0;

        for(int i = 0; i < 26; ++i) {
            if(alphabets[i] > maxFreq) {
                maxFreq = alphabets[i];
                char a = 'a';
                maxChar = (a += i);
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(MaximumFrequencyChar(s));
    }
}
