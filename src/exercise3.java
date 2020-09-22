import java.util.Scanner;



    public class exercise3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Height:");
            double height = input.nextDouble();

            System.out.println("Width:");
            double width = input.nextDouble();


            System.out.println("Height: " + height);
            System.out.println("Width: " + width);

            //message prints, and commas work


            String ansMessage = " square millimeters.";
            System.out.printf("%,.2f",  (height * width) * 645.16 );
            System.out.println(ansMessage);

            input.close();
        }
    }


