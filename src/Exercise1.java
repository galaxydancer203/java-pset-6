import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner inputBound = new Scanner(System.in);
        int lowerBound = 0;
        int upperBound = -1;

        while(upperBound < lowerBound) {
            System.out.print("Lower bound: ");
            lowerBound = inputBound.nextInt();
            System.out.print("Upper bound: ");
            upperBound = inputBound.nextInt();
        }
        inputBound.close();
        int sum = 0;
        for(int i = lowerBound; i <= upperBound; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.printf("%n%,d." , sum );
    }
}