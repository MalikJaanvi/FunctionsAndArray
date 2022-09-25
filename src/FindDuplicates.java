import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {
        int xor=0;
        for (int i=0;i< arr.length;i++){
            xor ^= arr[i];
        }
        for (int i=0;i<arr.length;i++){
            xor ^=i;
        }
        return xor;
    }
}
// 1 2 2 3 4 --> 2                                                                                             