import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //enter amount
        System.out.print("Amount :");
        double amount = in.nextDouble();

        //math
        double quarters = amount / 0.25;
        quarters = (int) quarters;

        double dimes = ((amount - (quarters * 0.25)) / 0.10);
        dimes = (int) dimes;

        double nickles = ((amount - ((quarters * 0.25) + (dimes * 0.10))) / 0.05);
        nickles = (int) nickles;

        double pennies = ((amount - ((quarters * 0.25) + (dimes * 0.10) + (nickles * 0.05))) / 0.01);
        pennies = (int) pennies;

        //display change
        System.out.println(" ");
        System.out.printf("Quarters : %.0f\n",  quarters);
        System.out.printf("Dimes    : %.0f\n", dimes);
        System.out.printf("Nickles  : %.0f\n", nickles);
        System.out.printf("Pennies  : %.0f\n", pennies);
    }
}
