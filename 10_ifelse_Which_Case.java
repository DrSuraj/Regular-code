import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                // char a = nextChar(); ******not valid*****
                char a = sc.next().charAt(0);

                if(a >='a' &&  a<='z'){
                        System.out.println(0);
                }
                else if(a >='A' &&  a<='Z'){
                        System.out.println(1);
                }
                else{
                        System.out.println(-1);
                }
	}
}
