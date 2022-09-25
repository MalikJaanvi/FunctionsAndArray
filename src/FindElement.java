import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int findele = sc.nextInt();
        int index = -1;
        for (int i=0 ;i<size;i++){
            if (array[i] == findele){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
