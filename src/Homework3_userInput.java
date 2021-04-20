import java.util.Arrays;
import java.util.Scanner;

public class Homework3_userInput {
    public static void main(String[] args) {
        Scanner inputSize = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int arraySize = inputSize.nextInt();

        if (arraySize <= 5 || arraySize > 10) {
            System.out.println("Вы ввели неправильное число, попробуйте еще раз");
            System.out.println("Подсказка: размер массива может быть больше 5 и меньше, либо равно 10");
            arraySize = inputSize.nextInt();
        }

        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            array[i] = (int) (Math.random() * 10);
        }

        int numberOfEven = 0;
        for (int i = 0; i < arraySize; i++){
            if (array[i] % 2 == 0){
                numberOfEven++;
            }
        }

        int[] evenArray = new int[numberOfEven];
        int newArrayIndex = 0;

        if (numberOfEven == 0) {
            System.out.println("В массиве нет четных чисел");
        } else {
            for (int i = 0; i < arraySize; i++){
                if (array[i] % 2 == 0){
                    evenArray[newArrayIndex] = array[i];
                    newArrayIndex++;
                }
            }
        }

        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        System.out.println("Новый массив из четных элементов: " + Arrays.toString(evenArray));
    }
}
