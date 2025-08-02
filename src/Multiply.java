import java.util.ArrayList;
import java.util.List;

public class Multiply
{
    public static void main(String[] args) {
        int n =7 ;
        int k = 8 ;

//        System.out.println(-5*-8);
//
//        System.out.println(5>>1);
//        System.out.println(  multiply(k,n));
//        System.out.println(  multiply2(k,n));

       int y = 10 ;
       System.out.println(+y);

        int num1 = 7;
        int num2 = 8;
    //   System.out.println("Product of " + num1 + " and " + num2 + ": " + multiply(num1, num2)); // Output: 56

        int num5 = -4;
        int num6 = -2;
       System.out.println("Product of " + num5 + " and " + num6 + ": " + multiply(num5, num6)); // Output: 24


        int num3 = 5;
        int num4 = -3;
       //System.out.println("Product of " + num3 + " and " + num4 + ": " + multiply(num3, num4)); // Output: -15



    }

    static int multiply ( int a , int b ){
        // Base case: if b is 0, the product is 0.
        if (b == 0) {
            return 0;
        }
        // Recursive step: add 'a' to the result of multiplying 'a' by (b-1).
        else if (b > 0) {
            int x = a + multiply(a, b - 1);
            return x;
        }
        // Handle negative 'b': if b is negative, multiply 'a' by the absolute value of 'b'
        // and then negate the result.
        else { // b < 0
            int i = -multiply(a, -b);
            return i;
        }


    }


    static int multiply2 ( int k , int n ){
        int sum = 0;
        for ( int i = 0 ; i < n ; i++ ){
            sum += k ;
        }
        return sum;
    }


}
