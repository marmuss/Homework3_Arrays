import java.util.Arrays;
import java.util.Scanner;

public class Homework3_numberDeleting {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = userInput.nextInt();

        int[] array = {3, 17, 67, 29, 90, 46, 12, 34, 65, 34, 76, 87, 12, 55};


        int begin = 0;
        int end = array.length-1;
        int[] serviceArray = new int[array.length];

        for (int item : array) {
                if (item == number) {
                    serviceArray[end--] = 0;
                } else {
                    serviceArray[begin++] = item;
            }
        }

        if (end < array.length-1){
            int[] newArray = new int[end+1];
            System.arraycopy(serviceArray, 0, newArray, 0, end+1);
            System.out.println("Было " + Arrays.toString(array));
            System.out.println("Стало " + Arrays.toString(newArray));
        } else {
            System.out.println("Такого числа в массиве нет \n" + Arrays.toString(array));
        }
    }
}
