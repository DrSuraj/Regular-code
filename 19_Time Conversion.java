import java.util.*;

public class Main {
		static void timeConversion(String s) { 
		StringBuilder result = new StringBuilder(); 
		result.setLength(8); 
		for (int i = 0; i < 8; i++) 
			result.setCharAt(i, s.charAt(i)); 
		if (s.charAt(0) == '1' && s.charAt(1) == '2') { 
			if (s.charAt(8) == 'A') { 
				result.setCharAt(0, '0'); 
				result.setCharAt(1, '0'); 
			} 
		} 
		else { 
			if (s.charAt(8) == 'P') { 
				result.setCharAt(0, (char) ((int) s.charAt(0) + 1)); 
				result.setCharAt(1, (char) ((int) s.charAt(1) + 2)); 
			} 
		} System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}
