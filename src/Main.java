import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextFloat();
        System.out.print("Input y: ");
        double y = in.nextFloat();

        Resolver resolver = new Resolver(x, y);
        System.out.println("Result: " + resolver.Solve());
    }
}