import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer> arrayGenerator(String s){
	  String str = "";
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) == ','){
            list.add(Integer.parseInt(str));
            str = "";
        }
        else{
            str += s.charAt(i);
        }
    }
    list.add(Integer.parseInt(str));
    return list;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String s = input.nextLine();
            ArrayList<Integer> ans = arrayGenerator(s);
            System.out.print("[");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i));
                if (i != ans.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        
    }
}
