import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int temp = n;
                for(int i=1; i<=n; i++){
                        for(int s = 1;  s<=n-i; s++){
                                System.out.print(" ");
                        }
                        for(int j=1; j<=i; j++){
                                System.out.print("* ");
                        }
                        System.out.println();
                }
	}
}
