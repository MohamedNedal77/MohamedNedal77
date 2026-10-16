import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        double avg = (a + b + c) / 3.0;
        System.out.println(Math.round(avg));
        System.out.printf("%.2f%n", avg);
    }
}
