import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int user = -1;
        while(user <= 0) {
            System.out.print("Enter an integer: ");
            user = inputNumber.nextInt();
        }
        inputNumber.close();
        int sum = 0;
        String userString = String.valueOf(user);
        int length = userString.length();
        for(int i = 0; i < length; i++){
            String intSub = userString.substring(i, i+1);
            int intString = Integer.parseInt(intSub);
            if(intString % 2 != 0){
                sum+= intString;
            }
        }
        System.out.println("\n" + sum + ".");
    }}