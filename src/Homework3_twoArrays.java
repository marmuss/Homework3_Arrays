import java.util.Arrays;

public class Homework3_twoArrays {
    public static void main(String[] args) {
        int[] array1 = {5, 54, 2, 6, 15};
        int[] array2 = {7, 18, 1, 6, 5};

        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));

        double average1 = Arrays.stream(array1).average().orElse(Double.NaN);
        double average2 = Arrays.stream(array2).average().orElse(Double.NaN);

        if (average1 > average2) {
            System.out.println("Среднее арифметическое первого массива больше второго");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое второго массива больше первого");
        } else {
            System.out.println("Среднее арифметическое первого массива равно среднему арифметическому второго массива");
        }
    }
}
