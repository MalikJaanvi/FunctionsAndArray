import java.util.Scanner;

public class SumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i=0;i<n1;i++){
            arr[i] = sc.nextInt();
        }

        int count =0;
        for (int i=0;i< arr.length;i++){
            int sum =0;
            for (int j=i;j< arr.length;j++){
                sum += arr[j];
                if (sum <0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
