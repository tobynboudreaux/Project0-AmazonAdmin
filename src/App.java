public class App {

    private static boolean admin = false;

    public static void main(String[] args) {
        java.lang.System.out.println("Welcome to Amazon Admin!");

        if (admin == false)  {
            java.lang.System.out.println("Yeet");
            System.systemStart();
        } else {
            AdminMenu adminMenu = new AdminMenu("Toby", "1234");
            adminMenu.validateUsername();
        }
    }

    public static void changeAdmin(boolean input) {
        admin = input;
    }
}