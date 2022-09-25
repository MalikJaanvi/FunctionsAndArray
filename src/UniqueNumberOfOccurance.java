import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumberOfOccurance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(uniqueOccurance(arr));

    }

    private static boolean uniqueOccurance(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        /*
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int occur = map.get(arr[i]);
                map.put(arr[i], occur + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
//         */ // Instead do this
        for (int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet hashSet = new HashSet<>(map.values());
        return hashSet.size() == map.size();
    }
}
