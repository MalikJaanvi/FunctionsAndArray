import java.util.*;

public class LeastNumberOfUniqueInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findLeastNumOfUniqueInts(arr,k));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
//        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
//        while (k>0){
//            k -= pq.poll();
//        }
//        return k<0? pq.size()+1 : pq.size();
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(o1,o2)-> o1.getValue().compareTo(o2.getValue()));
        list.forEach(s->{
            System.out.println(s.getKey()+" "+s.getValue());
        });
        int res=0;
        for(Map.Entry<Integer,Integer> i : list) {
            int val = i.getValue();
            if (k >= val) {
                k -= val;
                res++;
            }
        }
        return list.size()-res;
    }

    }
