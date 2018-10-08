import java.net.SocketOption;
import java.util.Scanner;

public class SimpleEquasion {

    public static void main(String[] args) {
        System.out.println("ax + b = c");
        System.out.println("Please enter values for a, b and c.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();
        System.out.print("Please enter c: ");
        int c = scanner.nextInt();

        boolean isAZero = a == 0;
        if (isAZero) {
            System.out.println("Malo!");
            return;
        }

        float result = 1.0f * (c - b) / a;

        System.out.println("x = " + result);

        String s = "";

    }
}
