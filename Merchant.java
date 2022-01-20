import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Merchant {

    static Scanner sc = new Scanner(System.in);

    static Merchant[] product = new Merchant[100];

    static HashMap<String, Integer> productNamePrize = new HashMap<>();
    static List<String> productNames = new ArrayList<>();

    public static void merchant() {
        // System.out.println(Admin.nameSerialNumber.get("hello"));

        int choice;
        do {
            System.out.println("1. Change Password");
            System.out.println("2. Add Product");
            System.out.println("3. Remove Product");
            System.out.println("4.go back");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    changePassword();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    Index.exit();
                    break;

                default:
                    break;
            }

        } while (choice != 4);
    }

    private static void removeProduct() {
    }

    static int loop = 0;

    static void addProduct() {
        System.out.print("Enter Merchant Name:");
        String inputAdminName = sc.next();
        System.out.print("Enter  Merchant Password:");
        String inputAdminPassword = sc.next();

        if (Admin.merchantNamePassword.get(inputAdminName).equals(inputAdminPassword)) {
            int sno = Admin.merchantNameSerialNumber.get(inputAdminName);

            String productName = (String) MerchantAdmin.product();
            Admin.company[sno].productName.add(productName);

            int prize = MerchantAdmin.prize();
            productNamePrize.put(productName, prize);
            productNames.add(productName);
        } else {
            System.out.println("Try again,Invalid User name or Password");
        }

    }

    // private static void addProductValue(String inputMerchantName) {

    // System.out.print("Enter Merchant Name:");
    // String inputAdminName = sc.next();
    // System.out.print("Enter old Merchant Password:");
    // String inputAdminPassword = sc.next();

    // if (Admin.merchantNamePassword.get(inputAdminName) == inputAdminPassword) {

    // Admin.addProduct(Admin.merchantNameSerialNumber.get(inputAdminName));

    // } else {
    // System.out.println("Try again,Invalid User name or Password");
    // }
    // }

    private static void changePassword() {

        System.out.print("Enter Merchant Name:");
        String inputAdminName = sc.next();
        System.out.print("Enter old Merchant Password:");
        String inputAdminPassword = sc.next();

        if (Admin.merchantNamePassword.get(inputAdminName) == inputAdminPassword) {
            System.out.println("Enter the new Admin name");
            Admin.merchantNamePassword.put(inputAdminName, sc.next());
        } else {
            System.out.println("Try again,Invalid User name or Password");
        }
    }

}
