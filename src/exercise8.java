import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //enter info
        System.out.print("Students:");
        int students = in.nextInt();

        System.out.print("Teachers:");
        int teachers = in.nextInt();

        System.out.print("Capacity:");
        int capacity = in.nextInt();

        //calculate overflow
        int totalppl = students + teachers;
        int overflow = totalppl % capacity;
        //calculate busses required
        int tbusses = ((students + teachers + capacity - 1)/capacity);


        //display
        System.out.println("");
        System.out.println("Buses required     : " + tbusses );
        System.out.println("Overflow passengers: " + overflow);
    }
}
