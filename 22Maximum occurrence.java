import java.util.*;

public class Main {
    static int maximum_occurrence(int arr[], int n) {
        //Write code here
          Arrays.sort(arr);
        int temp_count = 0, max_count = 0, ans = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                temp_count++;
            } else {
                if (temp_count > max_count) {
                    max_count = temp_count;
                    ans = arr[i];
                }
                temp_count = 0;
            }
        }
        return ans;

    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }
}
