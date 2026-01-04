import java.util.Scanner;
public class LoginApp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String CorrectUser="admin";
String CorrectPass="1234";
System.out.print("Enter username: ");
String Username=sc.nextLine();
System.out.print("Enter password: ");
String password=sc.nextLine();
if(Username.equals(CorrectUser) && password.equals(CorrectPass)){
System.out.println("Login successful");
}
else{
System.out.println("Access denied");
}
sc.close();
}
}

