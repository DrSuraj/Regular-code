import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int num=0;
		for(int i=1; i<=n;i++){
			for(int j=1; j<=i; j++){
				num++;
				System.out.print(num+ " ");
			}
			System.out.println();
		}
	}
}
