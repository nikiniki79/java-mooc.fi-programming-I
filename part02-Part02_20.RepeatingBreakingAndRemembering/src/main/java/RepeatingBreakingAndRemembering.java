
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        
        int sum = 0;
        int count = 0;
        int countOdd = 0;
        int countEven = 0;

        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                System.out.println("Thx! Bye!"); 
                break;
            }

            if (num != -1) {
                sum += num;
                count += 1;
            }

            if (num % 2 == 0) {
                countEven += 1;
            } else {
                countOdd += 1;
            }

        }   
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double)sum / count );
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    
    }
}
