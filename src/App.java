public class App {

    private static boolean admin = false;

    public static void main(String[] args) {
        java.lang.System.out.println("Welcome to Amazon Admin!");

        adminLoop();
    }

    public static void changeAdmin(boolean input) {
        admin = input;
    }

    public static void adminLoop() {
        if (admin == false)  {
            System.systemStart();
        } else if (admin == true) {
            AdminMenu adminMenu = new AdminMenu("Toby", "1234");
            adminMenu.validateUsername();
        }
    }
}