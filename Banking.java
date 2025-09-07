import java.util.*;

public class Banking {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        String correctusername= "satvik2813";
        String correctpassword = "GitHub";
        char choice;

        do {
            System.out.println("Enter your Username: ");
            String username = sc.next();

            System.out.println("Enter Password: ");
            String password = sc.next();

            if (correctusername.equals(username) && correctpassword.equals(password)) {
                System.out.println("Login Successful!");

                break;
            } else {
                System.out.println("Invalid Username/Password");
                System.out.print("Do you want to try logging in again? (y/n): ");
                choice = sc.next().charAt(0);
                if (choice == 'n' || choice == 'N' ){
                    System.out.println("Please visit us again");System.exit(0);
                }
            }

        } while (choice == 'y' || choice == 'Y');
        System.out.println("WELCOME TO YOUR ACCOUNT " + correctusername);





        double balance = 1000;
        boolean isrunning = true;
        int num;
        while(isrunning){
            System.out.println("1.BALANCE \n2.DEPOSIT \n3.WITHDRAW \n4.EXIT");
            System.out.println("Please Choose (1 - 4) From Main Menu ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit();

                    break;
                case 3:
                    balance -= withdraw(balance);
                    break;
                case 4:
                    isrunning = false;
                    System.out.println("THANK YOU!!PLEASE VISIT US AGAIN");
                    break;
                default:
                    System.out.println("INVALID CHOICE");

        }

            }
        }
        static void showBalance(double balance ){
            System.out.printf("=======>" + "₹%.2f\n",balance );
        }
        static double deposit(){
            double amount;
            System.out.println("ENTER THE AMOUNT TO BE DEPOSITED :");
            amount = sc.nextDouble();
            if(amount<0){
                System.out.println("AMOUNT CAN'T BE NEGATIVE");
                return 0;
            }
            else{
                return amount;
            }
        }
        static double withdraw(double balance) {
            double amount;
            System.out.println("ENTER AMOUNT TO BE WITHDRAWN : ");
            amount = sc.nextDouble();
            if (amount > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                return 0;
            } else if (amount < 0) {
                System.out.println("AMOUNT CAN'T BE NEGATIVE");
                return 0;
            } else {
                return amount;
            }


        }

    }

