
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        if (principal < 0){
            System.out.println("Invalid date! ");
            principal = scanner.nextDouble();
        }
        else if(principal == 0){
            System.out.println("it's pointless with 0.");
            int choise;
            System.out.println("Select your action :\n 1) continue\n 2) stop ");
            choise = scanner.nextInt();
            if (choise < 1 || choise > 2){
                System.out.println("Error!");
                return;
            }
            else if (choise == 2){
                return;
            }
            else {
                System.out.println("Enter principal amount: ");
                principal = scanner.nextDouble();
            }
            }

        System.out.print("Enter rate (in %): ");
        rate = scanner.nextDouble();


        System.out.print(principal);

        scanner.close();
    }
}