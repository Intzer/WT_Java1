import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        float x = in.nextFloat();
        System.out.print("Input y: ");
        float y = in.nextFloat();

        double up = 1 + Math.pow(Math.sin(x + y), 2.0);
        double down = 2 + Math.abs(x - (2*x)/(1+Math.pow(x, 2.0)*Math.pow(y, 2.0)));
        double res = (up / down) + x;

        System.out.println("Result: " + res);
    }
}