import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        double circ = 2 * Math.PI * r;
        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Circumference = %.2f%n", circ);
    }
}
