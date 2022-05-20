import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword;


        Scanner inp = new Scanner(System.in);
        System.out.print("Username: ");
        userName = inp.nextLine();
        System.out.print("Password: ");
        password = inp.nextLine();

        if (userName.equals("Java")) {
            if (password.equals("java123")) {
                System.out.print("Login Successful!");
            } else {
                System.out.println("The password is incorrect");
                System.out.println("Would you like to reset your password?\n1-Yes\n2-No");
                int select = inp.nextInt();
                inp.nextLine();
                switch (select) {
                    case 1:
                        System.out.print("New password: ");
                        newPassword = inp.nextLine();
                        if (newPassword.equals("java123")) {
                            System.out.println("Password generation failed!. Your new password can't be the same as your previous password, please try again");
                        } else {
                            System.out.println("The password has been created");
                        }
                        break;
                    case 2:
                        System.out.println("The program has ended");
                        break;
                    default:
                        System.out.println("You made the wrong choice. Try again!");
                }
            }
        } else {
            System.out.println("The username is incorrect!");
        }
    }
}
