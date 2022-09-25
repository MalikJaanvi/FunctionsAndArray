import java.util.Arrays;
import java.util.Scanner;

public class FirstPositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findFirst(arr));
    }
//0
    private static int findFirst(int[] arr) {

        // 2nd approach --> correct 37ms time
//        int ele =1;
//        Arrays.sort(arr);
//        while(ele!=0){
//            if (Arrays.binarySearch(arr,ele) <0){
//                break;
//            }else{
//                ele++;
//            }
//        }
//        return ele;


        // my first approach  --> wrong approach
        // convert 0 or -1 to +ve
//        for (int i=0;i< arr.length;i++){
//            if(arr[i]==0 || arr[i]<0){
//                arr[i] = Integer.MAX_VALUE;
//            }
//        }
//        Arrays.sort(arr);
//        int ele = 1 ;
//        for (int i:arr){
//            if (i != ele){
//                break;
//            }else{
//                ele++;
//            }
//        }

        // 3rd approach --> 19ms
//Arrays.sort(arr);
//        int xor =1;
//        for (int i=0;i< arr.length;i++){
//            if ((arr[i]^xor)==0){
//                xor++;
//            }
//        }
//        return xor;

        // 4th approach  -->157ms ooghhh...
//
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]<0  || arr[i]==0) {
//                arr[i] = (arr.length)+1;
//            }
//        }
//        for (int i=0;i< arr.length;i++){
//            int idx = Math.abs(arr[i]);
//            if (idx>0 && idx<=arr.length){
//                arr[idx-1] = -(Math.abs(arr[idx-1]));
//            }
//        }
//        for (int i:arr){
//            System.out.println(i);
//        }
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>=0){
//                return i+1;
//            }
//        }
//        return arr.length+1;

        // best approach
        // TC: O(n), SC: O(n)
            int n = arr.length;
            boolean[] exists = new boolean[n];
            for (int num : arr) {
                if (num > 0 && num <= n) exists[num - 1] = true;
            }
            for (int i = 0; i < exists.length; i++) {
                if (!exists[i]) return i + 1;
            }
            return n + 1;
    }
}
