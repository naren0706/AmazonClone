import java.util.Scanner;

public class Product {

    static Scanner sc = new Scanner(System.in);

    public static String productname() {
        System.out.print("Enter Product Name:");
        return sc.next();
    }

    public static String prize() {
        System.out.print("Enter Prize of the product:");
        return sc.next();
    }

    public static int stockAvailable() {
        System.out.print("Enter number of available stock");
        return sc.nextInt();
    }

}
