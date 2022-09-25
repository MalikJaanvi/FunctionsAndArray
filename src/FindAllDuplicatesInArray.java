import java.util.*;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findDuplicates(arr);
    }

    private static int[] findDuplicates(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]==arr[i+1]){
//                set.add(arr[i]);
            }
        }
//        for (int i:set){
//            System.out.println(i);
//        }
//        return set;
        return arr;
    }
}
