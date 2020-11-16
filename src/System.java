import java.util.Scanner;

public class System {

    static Scanner scanner = new Scanner(java.lang.System.in);

    public static void systemStart() {
        java.lang.System.out.println();
        java.lang.System.out.println("What would you like to do?");
        java.lang.System.out.println("Start");
        java.lang.System.out.println("Options");
        java.lang.System.out.println("Admin");
        java.lang.System.out.println("Quit");
        String input = scanner.nextLine();
        if (input.equals("Start")) {
            start();
        } else if (input.equals("Options")) {
            options();
        } else if (input.equals("Quit")) {
            java.lang.System.out.println("Goodbye");
        } else if (input.equals("Admin")) {
            App app = new App();
            app.changeAdmin(true);
            app.adminLoop();
        } else {
            java.lang.System.out.println("Input not accepted.");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //TODO: handle exception
                java.lang.System.out.println("Caught Exception");
            }
            systemStart();
        }
    }

    public static void start() {
        java.lang.System.out.println();
        java.lang.System.out.println("What would you like to do?");
        java.lang.System.out.println("Orders");
        java.lang.System.out.println("Shipments");
        java.lang.System.out.println("Quit");
        String input = scanner.nextLine();
        if (input.equals("Orders")) {
            java.lang.System.out.println("Welcome to the Orders Interface");
        } else if (input.equals("Shipments")) {
            java.lang.System.out.println("Welcome to the Shipments Interface");
        } else if (input.equals("Quit")) {
            java.lang.System.out.println("Goodbye");
        } else {
            java.lang.System.out.println("Input not accepted.");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //TODO: handle exception
                java.lang.System.out.println("Caught Exception");
            }
            start();
        }
    }

    public static void options() {
        java.lang.System.out.println("Options");
        java.lang.System.out.println("Yeah");
    }

}