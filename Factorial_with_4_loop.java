import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                long p = 1;
                for(int i = n; i>=1; i--){
                        p = n * p;
                        n = n-1;
                }
                System.out.println(p);
	}
}
