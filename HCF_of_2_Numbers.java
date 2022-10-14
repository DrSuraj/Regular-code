import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int hcf = 0;

                for(int i = a; i>= 1; i--){
                        if(a%i==0 && b%i==0){
                                hcf = i;
                                break;
                        }
                }
                System.out.println(hcf);
	}
}
