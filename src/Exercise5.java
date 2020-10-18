import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        int given;
        do {
            System.out.print("Enter an integer: ");
            given = input.nextInt();
        }
        while (given < 0);
        for (int k = 2; k < Math.sqrt(given); k++) {
            if (given % k == 0) {
                temp = k;
                break;
            }
        }
        if (temp != 0) {
            System.out.println("Not prime.");
        }
        else {
            System.out.println("Prime.");
        }
        input.close();

    }
}