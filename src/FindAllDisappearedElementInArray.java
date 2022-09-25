import java.util.*;

public class FindAllDisappearedElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findAllDisappeared(arr));
    }

    private static List<Integer> findAllDisappeared(int[] arr) {
//        Set<Integer> set = new HashSet<Integer>();
//        for (int i=1;i<= arr.length;i++){
//            set.add(i);
//        }
//        for (int i:arr){
//          if (set.contains(i)){
//              set.remove(i);
//          }
//        }
//        Arrays.sort(arr);
//        for (int i=1;i<= arr.length;i++){
//            if (!set.contains(i)){
//            }
//                list.add(i);
//        }
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            int idx = Math.abs(arr[i]);
//            if (arr[idx-1]>0) {
//                arr[idx - 1] = arr[idx - 1] * -1;
//            }
//        }
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>0){
//                list.add(i+1);
//            }
//        }
//    return list;

// best solution

        List<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            int idx = Math.abs(arr[i]);
            arr[idx - 1] = -Math.abs(arr[idx - 1]);
        }
        for (int j=1;j<=arr.length;j++){
            if (arr[j-1]>0){
                list.add(j);
            }
        }
        return list;
    }
}
