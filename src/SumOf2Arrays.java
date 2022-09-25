import java.io.*;
import java.util.*;

public class SumOf2Arrays {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        sum(arr1, arr2, n1, n2);
    }

    static void sum(int[] arr1, int[] arr2, int n1, int n2) {
        int carry = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int[] res = new int[Math.max(n1, n2)];
        int k = res.length - 1;
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0) {
                sum += arr1[i];
                i--;
            }
            if (j >= 0) {
                sum += arr2[j];
                j--;
            }
            sum += carry;
            if (sum >= 10) {
                carry = sum / 10;
                sum %= 10;
            } else {
                carry = 0;
            }
            res[k] = sum;
            k--;
        }
        if (carry > 0) {
            System.out.println(carry);
        }
        for (int m = 0; m < res.length; m++) {
            System.out.println(res[m]);
        }
    }
}