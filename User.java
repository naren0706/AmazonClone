import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    static HashMap<String, String> userNamePassword = new HashMap<>();
    static List<String> userNameSerialNo = new ArrayList<>();

    static User[] user = new User[10];

    static Scanner sc = new Scanner(System.in);
    static int noOfUser = 0;
    String password;
    String userName;

    public static void user() {
        System.out.println("1.user Login");
        System.out.println("2.user Register");
        System.out.println("3.change user Password");
        System.out.println("4.exit");
        int choice;
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    userLogin();
                    break;
                case 2:
                    userRegister();
                    break;
                case 3:
                    changeUserPassword();
                    break;
                case 4:
                    Index.exit();
                    break;

                default:
                    break;
            }
        } while (choice != 4);

    }

    private static void changeUserPassword() {

        System.out.print("Enter user Name:   ");
        String inputUserName = sc.next();
        System.out.print("Enter Password:   ");
        String inputPassword = sc.next();
        if (userNamePassword.get(inputUserName).equals(inputPassword)) {
            System.out.println("Enter new Password");
            userNamePassword.put(inputUserName, sc.next());
        } else {
            System.out.println("Try again,Invalid User name or Password");
        }

    }

    private static void userRegister() {
        System.out.print("Enter user Name:   ");
        String inputUserName = sc.next();
        System.out.print("Enter Password:   ");
        String inputPassword = sc.next();
        userNamePassword.put(inputUserName, inputPassword);
        user[noOfUser] = new User();
        user[noOfUser].userName = inputUserName;
        user[noOfUser].password = inputPassword;
        userNameSerialNo.add(inputUserName);

        System.out.println("UserName has been created successfully");

    }

    private static void userLogin() {
        System.out.print("Enter user Name:   ");
        String userName = sc.next();
        System.out.print("Enter Password:   ");
        String password = sc.next();
        if (userNamePassword.get(userName).equals(password)) {
            int choice;
            do {
                System.out.println("Hi" + userName);
                System.out.println("1.view Products");
                System.out.println("2.exit");

                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        viewProduct();
                        break;
                    case 2:
                        Index.exit();
                        break;
                    default:
                        break;
                }
            } while (choice != 2);

        }

    }

    public static void viewProduct() {
        int sno = 1;
        for (String i : Merchant.productNames) {
            {
                System.out.println(sno + i + "         " + Merchant.productNamePrize.get(i));
            }
        }
        int choice;
        do {

            System.out.print("1. add to cart : ");
            System.out.print("3.  exit: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addToCart();
                    break;
                case 2:
                    Index.exit();
                    break;

                default:
                    break;
            }

        } while (choice != 3);

    }

    private static void addToCart() {
        List<String> totalProductInCart = new ArrayList<>();
        int totalPrize = 0;
        int dummy = 55;
        while (dummy > 0) {
            System.out.println("Enter the name of the product to add to cart");
            System.out.println("press 2 to exit");
            System.out.println("Press 3 to view Product");
            System.out.println("press 4 to view cart");
            String name = sc.next();
            if (name.equals("2")) {
                Index.exit();
                break;
            } else if (name.equals("3")) {
                int sno = 1;
                for (String i : Merchant.productNames) {
                    {
                        System.out.println(sno + i + "         " + Merchant.productNamePrize.get(i));
                    }
                }

            } else if (name.equals("4")) {
                for (String i : totalProductInCart) {
                    System.out.println(i);

                }
                System.out.println("total Prize is" + totalPrize);

            } else {

                totalProductInCart.add(name);
                totalPrize += Merchant.productNamePrize.get(name);

            }

        }

    }

}
