import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ele=0;
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            ele = ele^arr[i];
        }
        System.out.println(ele);

    }
}
