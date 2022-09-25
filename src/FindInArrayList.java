
import java.util.*;

class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        ArrayList<ArrayList <Integer>> arr = new ArrayList <>();
        while(n-- >0){
            ArrayList<Integer> temp = new ArrayList<>();
            num = sc.nextInt();
            for(int i=0;i<num;i++){
                int ele = sc.nextInt();
                temp.add(ele);
            }
            arr.add(temp);
        }
        int query = sc.nextInt();
        while(query-- >0){
            int aridx = sc.nextInt();
            int idx = sc.nextInt();

                if(idx-1 < arr.get(aridx-1).size()){
                    int arrele = arr.get(aridx-1).get(idx-1);
                    System.out.println(arrele);
                }else{
                    System.out.println("ERROR!");
                }
        }
    }
}