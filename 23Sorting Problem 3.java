import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(N, arr);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int N, int[] arr) {
		for(int i=0; i<=(N-1);i++){
			arr[i] = arr[i]*arr[i];
		}
		
		for(int i=0;i<(N-1);i++){
			for(int j=0;j<(N-i-1);j++){
				if(arr[j]>arr[j+1]){ 
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
    }
}
