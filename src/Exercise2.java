import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Double user = 0.0;
        while(user <= 0) {
            System.out.print("Enter an Integer: ");
            user = inputInt.nextDouble();
        }
        inputInt.close();
        int userInt = user.intValue();
        String rString = String.valueOf(userInt);
        int length = rString.length();
        for(int i = length-1; i > -1; i--) {
            String subInt = rString.substring(i, i+1);
            if(i == 0){
                System.out.print(subInt + ". ");
            }
            else {
                System.out.print(subInt + ", ");
            }
        }
        System.out.print("\n");
    }
}