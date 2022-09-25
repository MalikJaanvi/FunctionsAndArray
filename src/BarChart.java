import java.util.Arrays;
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size+1];

        int max = Integer.MIN_VALUE;

        for(int i=1;i<=size;i++){
            array[i] = sc.nextInt();
            if (array[i]>max){
                max=array[i];
            }
        }

        for (int i=max;i>=1;i--){
            for (int j=1;j<=size;j++){
                if (array[j]>=i) {
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
