import java.util.Arrays;

public class Homework3_sortingAnArrayOfStrings {
    public static void main(String[] args) {
        String[] names = {"Robert", "David", "Alex", "Josh", "Sam", "Bob"};
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
