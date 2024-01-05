public class Main {
    public static void main(String[] args) {
        printHeader();
        printMessage("My name is: ");
        printHeader();
        printMessage("Anthony");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    private static void printHeader() {
        System.out.println("**************************");
    }
}
