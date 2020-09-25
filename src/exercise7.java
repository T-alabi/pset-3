import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // enter info
        System.out.print("Salary :");
        double sal = in.nextDouble();

        System.out.print("401(k) :");
        double k401 = in.nextDouble();

        System.out.print("Federal:");
        double fed = in.nextDouble();

        System.out.print("State  :");
        double state = in.nextDouble();

        //calc biweekly salary minus 401k money
        double biweekly = sal / 24;
        double deductk401 = biweekly * (k401/100);
        biweekly = biweekly - deductk401;

        //calc other deductions
        double deductFed = biweekly * (fed/100);
        double deductState = biweekly * (state/100);

        //calc final salary and print

        System.out.println();
        System.out.print("$");
        System.out.printf("%.2f", biweekly - (deductFed + deductState)  );
        System.out.print(".");
    }
}
