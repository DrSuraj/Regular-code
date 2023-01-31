import java.util.*;

public class Main {

    public static void main(String[] args) throws Throwable {

        Scanner cs = new Scanner(System.in);
        // System.out.println("Enter the row size:");
        int row_size = cs.nextInt();

		int num =1;
		for(int i=1; i<=row_size;i++){
			
			for(int sp=row_size; sp>i; sp--){
				System.out.print(" ");
			}
			for(int j=1; j<=num; j++){
				System.out.print(num);
			}
			System.out.println();
			num = num+2;
	    }
	}
}
