import java.util.Scanner;

public class SpanOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        int maxele = Integer.MIN_VALUE;
        int minele = Integer.MAX_VALUE;
        for (int i=0;i<size;i++){
            array[i] = sc.nextInt();
            if (array[i]>maxele){
                maxele = array[i];
            } else if (array[i]<minele) {
                minele = array[i];
            }
        }
        System.out.println(maxele-minele);
    }
}
