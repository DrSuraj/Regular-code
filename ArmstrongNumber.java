import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		for(int i=1; i<=500;i++){
                        int ans = 0;
                        int temp = i;
                        while(temp>0){
                                int dig = temp%10;
                                ans = ans + (dig*dig*dig);
                                temp/=10;
                        }
                        if(ans==i){
                                System.out.println(ans);
                        }
                }
	}
}
