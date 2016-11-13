import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by blackalpha on 12.11.16.
 *
 * Exercise 2
 *
 * В целочисленной последовательности есть нулевые элементы.
 * Создать массив из номеров этих элементов.
 */


public class Main {

    public static void main(String[] args) {

        System.out.println("Input number of elements in array");
        Scanner sc = new Scanner(System.in);

        //Number of elements in array
        int num = 0;

        //Read the number of elements
        if(sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Wrong number");
        }

        int [] arr = new int[num];

        Random rand = new Random(47);

        //Put random elements in array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt() % 100;
        }

        //Print array
        System.out.println(Arrays.toString(arr));

        //Randomly put zeros in array
        for(int i = 0; i < num; i++) {
            if(rand.nextInt() % 2 == 0) {
                arr[i] = 0;
            }
        }

        //Print array with zeros
        System.out.println(Arrays.toString(arr));

        //Counter for zeros
        int counter = 0;

        //Put index of zero element in the beginning of array
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[counter] = i;
                counter++;
            }
        }

        //Create final array with indexes of zeros elements
        int[] indexArray = Arrays.copyOf(arr, counter);

        //Print final array
        System.out.println(Arrays.toString(indexArray));
    }
}
