import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                for(int row = 1; row <=n; row++){
                        for(int col=row; col>=1; col--){
                                System.out.print(col);
                        }
                        System.out.println(); 
                }
	}
}
