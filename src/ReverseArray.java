import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        reverseArray(array);

        for (int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }

    public static void reverseArray(int[] array){
        int size = array.length;
        for (int i=0;i< size/2;i++){
            int temp = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = temp;
        }
    }
}
