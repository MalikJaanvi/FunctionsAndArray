import java.util.Scanner;

public class AnyBaseSubstraction {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int b = scn.nextInt();
            int n1 = scn.nextInt();
            int n2 = scn.nextInt();

            int d = Substraction(b, n1, n2);
            System.out.println(d);
        }

        public static int Substraction(int b, int n2, int n1) {
            int borrow = 0;
            int multiplier = 1;
            int result = 0;

            while (n1 > 0) {
                int digit1 = n1 % 10;
                int digit2 = n2 % 10;
                digit1 -= borrow;

                if (digit1 < digit2) {
                    borrow = 1;
                    digit1 += b;
                }
                else{
                    borrow =0;
                }
                int value = digit1 - digit2;
                result += value * multiplier;

                multiplier *= 10;
                n1 /= 10;n2 /= 10;
            }
            return result;
        }
    }