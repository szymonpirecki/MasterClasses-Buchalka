package section6;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        var max = Integer.MIN_VALUE;
        var counter = 0;
        do {
            var number = getUserNumber();
            if (number > max) {
                max = number;
            }
            counter++;
        } while (counter != 4);
        System.out.println("MAX: " + max);
    }

    private static int getUserNumber() {
        var number = 0;
        var sc = new Scanner(System.in);

        System.out.println("Please enter a Number: ");
        var input = sc.nextLine();
        try {
            number = Integer.parseInt(input);
        } catch (Exception e) {
            System.exit(0);
        }
        return number;
    }
}
