import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int p = 1;
                
                for(int i = 1; i<=b ; i++){
                        p = p * a;
                }
                System.out.println(p);
                
	}
}
