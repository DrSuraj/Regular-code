import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc = new Scanner (System.in);
                int n = sc.nextInt();
                int count = 0;

                for(int i = 1; i<=n; i++){
                        if(n%i==0){
                                count++;
                        }
                }
                if(count ==1 || count ==2){
                        System.out.println(n + " is a prime number");
                }
                else{
                        System.out.println(n + " is not a prime number");
                }
                
	}
}
