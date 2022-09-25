import java.util.Scanner;

public class AnyBaseAddition {

    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int b = scn.nextInt();
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();

            int d = Sum(b, n1, n2);
            System.out.println(d);
        System.out.println(getValueInAnyBase(512,8));
        }
        public static int Sum(int b, int n1, int n2) {
            int sum =0;
            int carry =0;
            int multiplier =1;
            int result =0;

            while (n1>0 || n2>0 || carry>0){
                int digit1 = n1%10;
                int digit2 = n2 %10;
                sum = digit1 + digit2 + carry;
                carry = sum / b;
                int value = sum%b;
                result += value * multiplier;
                multiplier *=10;
                n1 /=10;n2/=10;
            }
            return result;
        }

        public static int getSum(int b, int n1, int n2) {
            int sum1 = getValueInDecimal(n1,b);
            int sum2 = getValueInDecimal(n2,b);
            int sum = sum1+sum2;
//            return  getValueInAnyBase(sum,b);
            return sum;
    }

    public static int getValueInDecimal(int n, int sourceBase) {
        int num = 0;
        int multiplier = 1;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            num += rem * multiplier;
            multiplier *= sourceBase;
        }
        return num;
    }
    public static int getValueInAnyBase(int n,int soureBase){
        int num=0;
        int power =1;
        while (n!=0){
            int rem = n%soureBase;
            num += rem *power;
            num /= soureBase;
            power *=10;
        }
        return num;
    }



}
