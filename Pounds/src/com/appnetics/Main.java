package com.appnetics;

public class Main {

    public static void main(String[] args) {
        int result = 1 +2; // 1 + 2 = 3
        System.out.println("1 plus 2 = " + result);

        int previousResult = result;
        System.out.println("previous Result = " + previousResult);
        result = result -1 ; // 3 -1 = result
        System.out.println("3 -1 = " + result);
        System.out.println("previous Result = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("the result is" + ' ' +result);

        result = result / 5; // 20 /5 =4;
        System.out.println("owh, its " + result);

        result = result % 3; // the remainder of (4 % 3) =1
        System.out.println("4 % 3 = " + result);

        result++; // 1 +1 = 2
        System.out.println(result);

        result--;// 2 -1 = 1
        System.out.println("minus minus" + result);

        result +=2; // result = result + 2
        System.out.println("1 +2 = " +result );

        result *= 10; // result = result * 10;
        System.out.println("3 * 10 = " + result);

        result /= 3; // result = result / 3
        System.out.println("30 /3 = " + result);

        result -=2 ;// result = result - 2
        System.out.println("10 - 2 = " + result);


    }
}
