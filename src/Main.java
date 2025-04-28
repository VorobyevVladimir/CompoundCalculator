
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        //principal input
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        //principal foolproof
        if (principal < 0) {
            System.out.println("Invalid date! ");
            principal = scanner.nextDouble();
            if (principal == 0) {
                System.out.println("Invalid date! ");
                principal = scanner.nextDouble();
            }
        } else if (principal == 0) {
            System.out.println("it's pointless with 0.");
            int choise;
            System.out.println("Select your action :\n 1) continue\n 2) stop ");
            choise = scanner.nextInt();
            if (choise < 1 || choise > 2) {
                System.out.println("Error!");
                return;
            } else if (choise == 2) {
                return;
            } else {
                System.out.println("Enter principal amount: ");
                principal = scanner.nextDouble();
            }
        }

        //rate input
        System.out.print("Enter rate (in %): ");
        rate = scanner.nextDouble();

        //rate foolproof
        if (rate > 100 || rate < 1) {
            System.out.println("Invalid data!");
            int choise;
            System.out.println("Select your action :\n 1) continue\n 2) stop ");
            choise = scanner.nextInt();
            if (choise < 1 || choise > 2) {
                System.out.println("Error!");
                return;
            } else if (choise == 2) {
                return;
            } else {
                System.out.println("Enter rate: ");
                rate = scanner.nextDouble();
            }
        }

        //times compounded per year input
        System.out.print("Enter how many times it will be compounded(min = 1, max =12): ");
        timesCompounded = scanner.nextInt();

        //timesCompounded foolproof
        if (timesCompounded > 12 || timesCompounded < 1) {
            System.out.println("Invalid data!");
            int choise;
            System.out.println("Select your action :\n 1) continue\n 2) stop ");
            choise = scanner.nextInt();
            if (choise < 1 || choise > 2) {
                System.out.println("Error!");
                return;
            } else if (choise == 2) {
                return;
            } else {
                System.out.println("Enter how many times: ");
                timesCompounded = scanner.nextInt();
                if (timesCompounded > 12 || timesCompounded < 1) {
                    System.out.println("Invalid data!");
                    return;
                }
            }
        }

        //years input
        System.out.print("Enter how many years(5years is max): ");
        years = scanner.nextInt();

        //years foolproof
        if (years < 1 || years > 5) {
            System.out.println("Invalid data!");
            int choise;
            System.out.println("Select your action :\n 1) continue\n 2) stop ");
            choise = scanner.nextInt();
            if (choise < 1 || choise > 2) {
                System.out.println("Error!");
                return;
            }
            else if (choise == 2) {
                return;
            }
            else {
                System.out.println("Enter how many years: ");
                years = scanner.nextInt();
                if(years > 5 || years < 1){
                    System.out.println("Error");
                    return;
                }
            }
        }

        //amount calculate

        amount = principal;

        for (int i = 1; i <= years; i++){
            amount += amount * (rate / 100);
        }


        amount -= amount % 0.01;

        System.out.print("Your amount un the end is: " + amount);

        scanner.close();
    }
}
//Vorobyev V. 28.04.25