package InsertionSort;
import java.util.Scanner;

public class ArrayClass {

    public static void createArray(int value){

        Scanner elements = new Scanner(System.in);
        int[] array = new int[value];
        for(int i = 0; i < value; i++) {
            int count = i + 1;
            System.out.println("Enter your " + count + "number:");
            array[i] = elements.nextInt();
            count++;
        }
        for(int i = 0; i < value; i++) {

            System.out.printarray[i]+ " ");
        }

    }
}
