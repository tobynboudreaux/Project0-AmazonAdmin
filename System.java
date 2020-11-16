import java.util.Scanner;

public class System {

    static Scanner scanner = new Scanner(java.lang.System.in);

    public static void systemStart() {
        java.lang.System.out.println("What would you like to do?");
        java.lang.System.out.println("Start");
        java.lang.System.out.println("Options");
        java.lang.System.out.println("Admin");
        java.lang.System.out.println("Quit");
        String input = scanner.nextLine();
        if (input.equals("Start")) {
            java.lang.System.out.println("Start");
        } else if (input.equals("Options")) {
            java.lang.System.out.println("Options");
        } else if (input.equals("Quit")) {
            java.lang.System.out.println("Goodbye");
        } else if (input.equals("Admin")) {
            App.changeAdmin(true);
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
}