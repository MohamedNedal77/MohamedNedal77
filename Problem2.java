import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        final double TAX_RATE = 0.14;
        Scanner in = new Scanner(System.in);
        double price = in.nextDouble();
        int qty = in.nextInt();
        double subtotal = price * qty;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        System.out.printf("Subtotal = %.2f, Tax = %.2f, Total = %.2f%n",
                subtotal, tax, total);
    }
}
