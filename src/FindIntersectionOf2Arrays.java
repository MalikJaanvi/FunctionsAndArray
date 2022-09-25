import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindIntersectionOf2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }
        int m =sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i=0;i<m;i++){
            list2.add(sc.nextInt());
        }
        System.out.println(findIntersection(list1,n,list2,m));
    }

    private static ArrayList<Integer> findIntersection(ArrayList arr1, int n, ArrayList arr2, int m) {
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j< m){
            int ele1 = (int) arr1.get(i);
            int ele2 = (int) arr2.get(j);
            if (ele1 < ele2 ){
                i++;
            }else if (ele1 > ele2){
                j++;
            }else{
                res.add(ele1);
                i++;j++;
            }
        }
        return res;
    }
}
