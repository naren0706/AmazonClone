
// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class MerchantAdmin {

    static Scanner sc = new Scanner(System.in);

    public static String contactNumber() {
        System.out.println("Enter Contact Number:");
        String temp = sc.next();
        return temp;
    }

    public static String address() {
        System.out.println("Enter Flat number:");
        String flatNumber = sc.next();
        // System.out.println("Enter Street Name:");
        // String streetName = sc.next();
        // System.out.println("Enter City:");
        // String city = sc.next();
        // System.out.println("Enter District:");
        // String district = sc.next();
        // System.out.println("Enter State:");
        // String state = sc.next();
        // System.out.println("Enter Country:");
        // String country = sc.next();

        // return flatNumber+streetName+city+district+state+country;
        return flatNumber;
    }

    public static String emailId() {
        System.out.println("Enter Email Id:");
        return sc.next();
    }

    public static String name() {
        System.out.println("Enter Company Name:");
        return sc.next();
    }

    public static Object product() {
        System.out.println("Enter Product Name:");
        return sc.next();
    }

    // public static Object product1() {
    // return sc.next();
    // }

    // public static Object product2() {
    // return sc.next();
    // }

    // public static Object product4() {
    // return sc.next();
    // }

    // public static Object product3() {
    // return null;
    // }

    public static int prize() {
        System.out.println("Enter the prize of the product");
        return sc.nextInt();
    }

}
