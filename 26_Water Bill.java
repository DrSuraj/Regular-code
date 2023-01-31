import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	public static int waterBill(int w){
		// write code here
		int bil;
		if(w>200){
			// 1bil=15*100=1500  2bil=14*100=1400
			bil = (w-200)*12 + 1500+1400;
		}
		else if(w>100 && w<=200){
			// 1bil = 15*100=1500
			bil=(w-100)*14 + 1500;
		}
		else{
			bil= w*15;
		}
		return bil;
	}
}

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
	    int w=sc.nextInt();
		System.out.println(Solution.waterBill(w));
	}
}
