import java.util.Scanner;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getproductWithSingleDigit(int b,int n1,int digit2)
    {
        int carry =0;
        int ans =0;
        int power =1;

        while(n1!=0 || carry !=0){
            int digit1 = n1%10;
            int mul = digit1*digit2+carry;

            if (mul>=b){
                carry = mul /b;
                mul %= b;
            }else{
                carry =0;
            }

            ans +=mul*power;

            n1 /=10;
            power *=10;
        }
        return ans;
    }

    public static int getProduct(int b, int n1, int n2){
        int result =0;
        int power =1;

        while(n2 !=0){
            int digit2 = n2 %10;
            int ans = getproductWithSingleDigit(b,n1,digit2);
            result = getSum(b,result,ans*power);
            power *=10;
            n2 /=10;
        }

        return result;
    }

    public static int getSum(int b, int n1, int n2){
        int carry =0;
        int result =0;
        int power =1;
        while(n1 !=0 || n2  !=0 || carry >0){
            int rem = n1%10;
            int rem2 = n2 %10;
            int digit = (rem+rem2)+carry;
            if (digit>=b){
                carry= digit /b;
                digit %= b;
            }else{
                carry=0;
            }
            result += digit*power;

            power*=10;
            n1 /=10;
            n2 /=10;
        }
        return result;
    }
}
