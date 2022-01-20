
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Admin {
    static Scanner sc = new Scanner(System.in);
    static String adminName = "a";
    static String adminPassword = "a";

    static String merchantName = "merchant";
    static String merchantPassword = "merchant";

    static HashMap<String, Integer> merchantNameSerialNumber = new HashMap<>();
    static HashMap<String, String> merchantNamePassword = new HashMap<>();

    // List<String> company = new ArrayList<>();
    static Admin[] company = new Admin[10];
    static int serialNumber = 1;
    // private String name;

    int noOfProduct = 10;
    String address;
    String contactNumber;
    String emailId;
    Admin[] product;

    static Product[] details = new Product[100];

    // Object[] productName = new Object[10];
    List<String> productName = new ArrayList<>();

    Object product2;
    Object product3;
    Object product5;
    Object product4;
    Object product1;

    Object name;

    public String prize;

    public static void admin() {

        System.out.print("Enter Admin Name:");
        String inputAdminName = sc.next();
        System.out.print("Enter Admin Password:");
        String inputAdminPassword = sc.next();
        if (adminName.equals(inputAdminName) & adminPassword.equals(inputAdminPassword)) {
            int choice;
            do {
                System.out.println("1.Change admin name");
                System.out.println("2.Change admin Password");
                System.out.println("3.Add Merchant");
                System.out.println("4.Remove Merchant");
                System.out.println("5.exit");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        changeAdminName();
                        break;

                    case 2:
                        changeAdminPassword();
                        break;
                    case 3:
                        addMerchant();
                        break;
                    case 4:
                        RemoveMerchant();
                        break;
                    case 5:
                        Index.exit();
                        break;

                    default:
                        break;
                }

                System.out.println(
                        "----------------------------------------------------------------------------------------------------------------------------------");

            } while (choice != 5);
        } else {
            System.out.println("Try again,Invalid User name or Password");
        }

    }

    private static void changeAdminName() {
        System.out.print("Enter old Admin Name:");
        String inputAdminName = sc.next();
        System.out.print("Enter old Admin Password:");
        String inputAdminPassword = sc.next();
        if (adminName.equals(inputAdminName) & adminPassword.equals(inputAdminPassword)) {
            System.out.println("Enter the new Admin name");
            adminName = sc.next();
        } else {
            System.out.println("Try again,Invalid User name or Password");
        }

    }

    private static void changeAdminPassword() {

        System.out.print("Enter old Admin Name:");
        String inputAdminName = sc.next();
        System.out.print("Enter old Admin Password:");
        String inputAdminPassword = sc.next();
        if (adminName.equals(inputAdminName) & adminPassword.equals(inputAdminPassword)) {
            System.out.println("Enter the new Admin password");
            adminPassword = sc.next();
        } else {
            System.out.println("Try again,Invalid User name or Password");
        }

    }

    public static void addMerchant() {
        company[serialNumber] = new Admin();

        company[serialNumber].name = MerchantAdmin.name();
        company[serialNumber].address = MerchantAdmin.address();
        company[serialNumber].contactNumber = MerchantAdmin.contactNumber();
        company[serialNumber].emailId = MerchantAdmin.emailId();

        // Merchant.addProduct();
        // company[serialNumber].productName.add((String) MerchantAdmin.product());
        // company[serialNumber].product2 = MerchantAdmin.product2();
        // company[serialNumber].product3 = MerchantAdmin.product3();
        // company[serialNumber].product4 = MerchantAdmin.product4();
        // company[serialNumber].product5 = MerchantAdmin.product5();

        merchantNameSerialNumber.put((String) company[serialNumber].name, serialNumber);
        merchantNamePassword.put((String) company[serialNumber].name, "p");

        System.out.println("The merchant has been added successfuly");

        System.out.println("The merchant name is : " + company[serialNumber].name);
        System.out.println("The merchant id is :" + serialNumber);
        System.out.println("The password : password");
        serialNumber += 1;

    }

    private static void RemoveMerchant() {

        System.out.print("Enter Admin Name:");
        String inputAdminName = sc.next();
        System.out.print("Enter Admin Password:");
        String inputAdminPassword = sc.next();
        if (adminName.equals(inputAdminName) & adminPassword.equals(inputAdminPassword)) {
            System.out.println("Enter the Merchant Name you wanted to remove");
            String removeMerchantName = sc.next();
            int removeMerchantIndex = merchantNameSerialNumber.get(removeMerchantName);
            delete(removeMerchantIndex);
        } else {
            System.out.println("Try again,Invalid User name or Password");
        }

    }

    private static void delete(int removeMerchantIndex) {

        company[removeMerchantIndex].name = zero();
        company[removeMerchantIndex].address = zero();
        company[removeMerchantIndex].contactNumber = zero();
        company[removeMerchantIndex].emailId = zero();

    }

    private static String zero() {
        return "the merchat has been removed by the user";
    }

    public static void addProduct(Integer integer) {

        company[integer].productName.add((String) MerchantAdmin.product());

    }
}
