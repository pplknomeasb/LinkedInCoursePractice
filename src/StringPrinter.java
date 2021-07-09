import java.util.Scanner;

public class StringPrinter {
    public static void main(String[] args) {
        System.out.println("This is a program based on a hackerrank problem");

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int i = scan.nextInt();
        double d = scan.nextDouble();

        System.out.println("String " +s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


    }
}
