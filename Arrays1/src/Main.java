import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by blackalpha on 12.11.16.
 *
 * Excercise 1
 *
 * Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
 *
 */


public class Main {

    public static void main(String[] args) {
        System.out.println("Insert number of elements: ");
        int elemNumber = 0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()) {
            elemNumber = scanner.nextInt();
        } else {
            System.out.print("Wrong number");
        }

        System.out.println("Insert K ");
        int K = 0;

        if(scanner.hasNext()) {
            K = scanner.nextInt();
        } else {
            System.out.println("Wrong number");
        }

        int[] array = new int[elemNumber];

        Random rand = new Random(47);

         for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt() % 100;
        }

        System.out.println (Arrays.toString(array));

        int sum = 0;

        for (int i = 0; i < array.length; i ++) {
            if (array[i] % K == 0) sum += array[i];
        }

        System.out.println(sum);

    }


}
