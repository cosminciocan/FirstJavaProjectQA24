import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        ReadFromKeyboard read = new ReadFromKeyboard();
//        int x = read.getInt();
//        System.out.println("numarul este: " +x);
//
//
//        float a = scan.nextFloat();
//        String z = scan.next();
//        System.out.println("String citit este: " + z);
//        System.out.println("Float-ul citit este: " + a);


        LogicalOperation op = new LogicalOperation();
        int[] array = read.getArray(3);
        op.printArray(array);


    }
}
