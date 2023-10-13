public class Resolver {
    private double x;
    private double y;

    public Resolver(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double Solve() {
        double up = 1 + Math.pow(Math.sin(x + y), 2.0);
        double down = 2 + Math.abs(x - (2*x)/(1+Math.pow(x, 2.0)*Math.pow(y, 2.0)));
        double res = (up / down) + x;
        return res;
    }
}
