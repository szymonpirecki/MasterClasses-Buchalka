package section6;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;

        while (true){
            var number = getUserNumber();
            if (number < min)
                min = number;
            if (number > max)
                max = number;

            System.out.println("MAX: " + max);
            System.out.println("MIN: " + min);
        }
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
