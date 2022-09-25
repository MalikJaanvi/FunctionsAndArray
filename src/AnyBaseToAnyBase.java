import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
            int dn = getValueInDecimal(n, sourceBase,destBase);
            System.out.println(dn);
        }

    public static int getValueInDecimal(int n,int sourceBase,int destbase){
        int num=0;
        int multiplier = 1;
        while(n!=0){
            int rem = n%10;
            n /=10;
            num += rem *multiplier;
            multiplier *=sourceBase;
        }
        return getValueInBase(num,10,destbase);

    }
        public static int getValueInBase(int n, int sourceBase,int destBase){
            int num =0;
            int power =1;
            while(n!=0){

                int rem = n%destBase;
                n /= destBase;
                num += rem * power;
                power *=sourceBase;
            }
            return num;
        }
}
