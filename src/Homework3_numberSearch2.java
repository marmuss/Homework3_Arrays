import java.util.Scanner;

public class Homework3_numberSearch2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = userInput.nextInt();

        int[] defArray = {4, 76, 22, 89, 54, 89, 94, 2, 8, 12, 54, 89};

        int counter = 0;
        for (int item: defArray) {
            if (item == number){
                counter++;
            }
        }

        if (counter > 0) {
            System.out.println("Такое число в массиве есть");
        } else {
            System.out.println("Такого числа в массиве нет");
        }
    }
}
