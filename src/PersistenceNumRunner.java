import java.util.Scanner;

public class PersistenceNumRunner {
    public static Long persistenceCheck(Long n){

        Long num = 0L;


        do {
        }while(n.toString().length() > 1 );

        return num;
    }
    public static void main(String[] args) {
        System.out.println("This is a codewars problem");
        Scanner scan = new Scanner(System.in);
        Long num = scan.nextLong();
        System.out.println(persistenceCheck(num));
    }
}
