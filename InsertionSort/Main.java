package InsertionSort;
import java.util.Scanner;
import InsertionSort.ArrayClass;


public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to insertion sort!");
        System.out.println("\n Enter in the number of elements that you want to sort");
        int sizeofArray = keyboard.nextInt();
        System.out.println("The size of your array is "+ sizeofArray);

        ArrayClass.createArray(sizeofArray);

    }
}
