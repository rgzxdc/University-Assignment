package xava.classtest.checknumber;

import java.util.Scanner;

public class CheckNumber {

    private static int positiveFlag = 0;
    public static int negativeFlag = 0;
    public static int oddFlag = 0;
    public static int evenFlag = 0;
    public static int zeroFlag = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = 0;
        int number = 0;
        while(range<5) {
            range++;
            System.out.println("Enter Number: " );
            number = scanner.nextInt();
            scanner.nextLine();
            testNumber(number);
        }

        System.out.println("Number of Positive Number: "+ positiveFlag);
        System.out.println("Number of Negative Number: "+ negativeFlag);
        System.out.println("Number of Even Number: "+ evenFlag);
        System.out.println("Number of Odd Number: "+ oddFlag);
        System.out.println("Number of Zero Number: "+ zeroFlag);
    }


    public static void testNumber(int n) {

        if(n==0) {
            zeroFlag++;
        }
        else if(n<0) {
            negativeFlag++;
            if(n%2 == 0) {
                evenFlag++;
            } else {
                oddFlag++;
            }
        } else if(n>0) {
            positiveFlag++;
            if(n%2 == 0) {
                evenFlag++;
            } else {
                oddFlag++;
            }
        }


    }
}
