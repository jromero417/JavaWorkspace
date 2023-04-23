package class12;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a username:");
        String username = scan.next();
        System.out.println("Enter a password with minimum 8 characters:");
        String password = scan.next();
        System.out.println("Confirm password");
        String confirmPass = scan.next();
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username or password cannot be empty.");
        }
        else if (password.length() < 8) {
            System.out.println("Password is too short");
        }
        else if (password.equals(username)) {
            System.out.println("Password cannot contain username");
        }
        else if (!confirmPass.equals(password)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }
    }
}
