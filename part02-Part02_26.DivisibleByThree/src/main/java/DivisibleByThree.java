
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int beginning = scanner.nextInt();
        //int end = scanner.nextInt();

        //divisibleByThreeInRange(beginning, end);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int num = beginning; num <= end; num++) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
