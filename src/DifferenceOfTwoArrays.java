import java.io.*;
import java.util.*;

class Main{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1;i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        diff(arr1, arr2, n1, n2);
    }
    static void diff(int[] arr1, int[] arr2, int n1, int n2){
        int[] res = new int[n2];
        int k = res.length-1 ;
        int i= n1-1;
        int j = n2-1;
        int b =0;
        while(k>=0){
            int diff =0;
            int av = i>=0?arr1[i]:0;
            if(arr2[j]+b >= av){
                diff = arr2[j]+b- av ;
                b = 0;
            }else{
                arr2[j] += 10;
                diff = arr2[j]+b-av ;
                b = -1;
            }
            res[k] = diff;
            i--;j--;k--;
        }

        int idx =0;
        while(idx < res.length){
            if(res[idx] ==0 ){
                idx++;
            }else{
                break;
            }
        }
        while(idx < res.length){
            System.out.println(res[idx]);
            idx++;
        }
    }
}