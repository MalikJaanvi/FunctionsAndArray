import java.util.Scanner;

class PrintSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i=0;i<n1;i++){
            arr[i] = sc.nextInt();
        }
        // 1
        // 1 2
        // 1 2 3
        // 2
        // 2 3
        // 3
        for (int i=0;i< arr.length;i++){
            String concat = "";
            for (int j=i;j< arr.length;j++){
                concat += arr[j];
                concat +="\t";
                System.out.println(concat);
            }
        }
    }
}
