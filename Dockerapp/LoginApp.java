import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUser = "admin";
        String correctPass = "1234";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUser) && password.equals(correctPass)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}