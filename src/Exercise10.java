import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("Fahrenheit : ");
        double fah = in.nextDouble();

        //math
        double cels = (fah - 32) * (5/9);
        double kel = (fah - 32) * (5/9) + 273.15;

        //display
        System.out.println("");
        System.out.printf("Celsius : %.2f\n", cels);
        System.out.printf("Kelvin  : %.2f\n", kel);

        in.close();
    }
}
