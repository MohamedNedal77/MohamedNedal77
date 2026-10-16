import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int weeks = days / 7;
        int rem = days % 7;
        System.out.println(weeks + " weeks and " + rem + " days");
    }
}
