import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int temp = n;
                int dig = 0;
                int rev = 0;

                while(temp>0){
                        dig = temp%10;
                        rev = (rev*10) + dig;
                        temp = temp/10;
                }
                if(rev==n){
                        System.out.println(true);
                }
                else{
                        System.out.println(false);
                }
                
                
	}
}
