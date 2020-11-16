import java.util.Scanner;

public class AdminMenu {

    private String username;
    private String password;
    static Scanner scanner = new Scanner(java.lang.System.in);

    public AdminMenu(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void validateUsername() {
        java.lang.System.out.println("What is your username?");
        String input = scanner.nextLine();
        if (input.equals(this.username)) {
            java.lang.System.out.println("Success");
            validatePassword();
        } else if (input.equals("Quit")) {
            App app = new App();
            app.changeAdmin(false);
            app.adminLoop();
        } else {
            java.lang.System.out.println("Invalid Credentials");
            validateUsername();
        }
    }

    public void validatePassword() {
        java.lang.System.out.println("What is your password?");
        String input = scanner.nextLine();
        if (input.equals(this.password)) {
            java.lang.System.out.println("Success");
            adminStart();
        } else if (input.equals("Quit")) {
            App app = new App();
            app.changeAdmin(false);
            app.adminLoop();
        } else {
            java.lang.System.out.println("Invalid Credentials");
            validatePassword();
        }
    }

    public static void adminStart() {
        java.lang.System.out.println("You are now logged in as an Admin.");
        java.lang.System.out.println("What would you like to do?");
        java.lang.System.out.println("Start");
        java.lang.System.out.println("Options");
        java.lang.System.out.println("Quit");
        String input = scanner.nextLine();
        if (input.equals("Start")) {
            java.lang.System.out.println("Start");
        } else if (input.equals("Options")) {
            java.lang.System.out.println("Options");
        } else if (input.equals("Quit")) {
            java.lang.System.out.println("Goodbye");
            App app = new App();
            app.changeAdmin(false);
            app.adminLoop();
        } else {
            java.lang.System.out.println("Input not accepted.");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //TODO: handle exception
                java.lang.System.out.println("Caught Exception");
            }
            adminStart();
        }
    }
}