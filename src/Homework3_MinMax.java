
import java.util.Arrays;
import java.util.Scanner;

public class Homework3_MinMax {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int arraySize = inputNumber.nextInt();
        double[] array = new double[arraySize];

        for (int i = 0; i < arraySize; i++){
            array[i] = Math.random();
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        double min = array[0];
        double max = array[arraySize-1];
        double average = Arrays.stream(array).average().orElse(Double.NaN);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);



    }
}
