import java.util.Scanner;

// 1,2,3,4,5,6  -->     2,1,4,3,6,5
//1,2,3,4,5     -->     2,1,4,3,5
public class AlternateSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        alternateSwap(arr,n);
        display(arr);
    }

    private static void display(int[] arr) {
        for (int ele:arr){
            System.out.print(ele+"\t");
        }
    }

    private static void alternateSwap(int[] arr, int n) {
        int idx = 0;
        while(idx<n){
            if (idx+1<n){
                int temp = arr[idx];
                arr[idx] = arr[idx+1];
                arr[idx+1] = temp;
            }
            idx +=2;
        }
    }
}
