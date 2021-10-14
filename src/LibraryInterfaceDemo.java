import java.util.Scanner;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Book Type ");
        String book = sc.nextLine();
        KidUsers obj1 = new KidUsers(age,book);
        AdultUser obj2 = new AdultUser(age,book);
        obj1.RegisterAccount();
        obj1.RequestBook();
        obj2.RegisterAccount();
        obj2.RequestBook();
    }
}
