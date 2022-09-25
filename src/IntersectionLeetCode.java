import java.util.ArrayList;
import java.util.List;

public class IntersectionLeetCode {
    public static void main(String[] args) {
        int[] num1 ={1,2,2,1};
        int[] num2 ={2,2};
        intersect(num1,num2);
    }

    public static int[] intersect(int[] num1, int[] num2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < num1.length && j <= num2.length-1) {
            System.out.println(i+" " +j);
            if (num1[i] < num2[j]) {
                i++;
            } else if (num1[i] > num2[j]) {
                j++;
            } else {
                list.add(num1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[list.size()];
        for (int m = 0; m < list.size(); m++) {
            res[m] = list.get(m);
        }
        return res;
    }
}
