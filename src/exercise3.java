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

            //message prints, but commas don't work and check the math with check thingy

            String ansMessage = " square millimeters.";
            System.out.printf("%.2f",  (height * width) * 25.4 );
            System.out.println(ansMessage);

            input.close();
        }
    }


