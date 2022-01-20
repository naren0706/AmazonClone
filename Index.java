import java.util.Scanner;

public class Index {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        
        
        
        int choice;
        do {
            System.out.println("1.admin");
            System.out.println("2.user");
            System.out.println("3.merchant");
            System.out.println("4.exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Admin.admin();
                    break;
                case 2:
                    User.user();
                    break;
                case 3:
                    Merchant.merchant();
                    break;
                case 4:
                    exit();
                default:
                    break;
            }
        } while (choice!=4);

    }


    public static void exit() {
        System.out.println("-------------------------------------exit-----------------------------------------");
    }
}
