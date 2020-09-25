import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Height:");
        double height = input.nextDouble();

        System.out.print("Width:");
        double width = input.nextDouble();

        String ansMessage = " centimeters.";
        System.out.printf("%,.2f", (( height * 2) + (width * 2 )) * 2.54 );
        System.out.println(ansMessage);

        input.close();
    }
}
