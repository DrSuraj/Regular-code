import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                long sum = 0;
                
                for(int i = 0; i<=N; i = i+2){
                                sum = sum + i;
                }
                System.out.println(sum);
	}
}
