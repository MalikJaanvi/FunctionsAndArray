
import java.util.* ;
import java.io.*;
import java.util.* ;
import java.io.*;
class Solution{
        public static int[][] pairSum(int[] arr, int s) {
            List<List<Integer>>li = new ArrayList<>();
            Arrays.sort(arr);


            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j] == s){
                        List<Integer> a = new ArrayList <>();
                        a.add(arr[i]);
                        a.add(arr[j]);
                        li.add(a);
                    }
                }
            }

            // both are same

            int i=0;int j=i+1;
            while(i<arr.length && j<arr.length){
                if(arr[i]+arr[j] == s){
                    List<Integer> a = new ArrayList <>();
                    a.add(arr[i]);
                    a.add(arr[j]);
                    li.add(a);
                    j++;
                }else if (arr[i]+arr[j] != s){
                    j++;
                }
                if(j == arr.length){
                    j=i+2;
                    i++;
                }
            }
            int[][] ans = new int[li.size()][2];
            for(int m=0;m<li.size();m++){
                for(int n=0;n<2;n++){
                    ans[m][n] = li.get(m).get(n);
                }
            }
            return ans;
        }
}
