import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        //15 %
        System.out.println("Homework 1:");
        double hw1 = in.nextDouble();
        System.out.println("Homework 2:");
        double hw2 = in.nextDouble();
        System.out.println("Homework 3:");
        double hw3 = in.nextDouble();

        //35%
        System.out.println("Quiz 1:");
        double q1 = in.nextDouble();
        System.out.println("Quiz 2:");
        double q2 = in.nextDouble();

        //50%
        System.out.println("Test 1:");
        double t1 = in.nextDouble();

        double fHw = ( (( hw1 + hw2 + hw3)/3) * 0.15 );
        double fq = (((q1 + q2 )/2) * 0.35);
        double t = (t1 * 0.5);

        //printed vals
        System.out.println("Homework 1: " + hw1);
        System.out.println("Homework 2: " + hw2);
        System.out.println("Homework 3: " + hw3);
        System.out.println("Quiz 1:" + q1);
        System.out.println("Quiz 2: " + q2);
        System.out.println("Test 1: " + t1);
        //final
        System.out.print( fHw + fq + t + "%" + ".");

                in.close();
    }
}
