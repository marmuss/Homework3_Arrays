
import java.util.Arrays;
import java.util.Scanner;

public class Homework3_numberSearch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = userInput.nextInt();

        int[] array = {4, 76, 22, 89, 54, 89, 94, 2, 8, 12, 54};

        Arrays.sort(array);

        int numberPosition = Arrays.binarySearch(array, number);

        if (numberPosition >= 0) {
            System.out.println("Такое число в массиве есть");
        } else {
            System.out.println("Такого числа в массиве нет");
        }

    }
}
