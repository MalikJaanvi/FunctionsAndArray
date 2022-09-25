import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] a = runningSum(arr);
        display(a);
    }

    private static void display(int[] arr) {
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int sum =0;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] =sum;
        }
        return arr;
    }
}
