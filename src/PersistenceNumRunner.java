import java.util.Scanner;

public class PersistenceNumRunner {
    public static Long persistenceCheck(Long n){

        Long num = 1L;


        do {
            Long[] numArray = new Long[Math.toIntExact(n)];

            for(int i = 0; i < num.toString().length(); i++)

                num = num * n.toString().charAt(i);

        }while(num.toString().length() > 1 );

        return num;
    }
    public static void main(String[] args) {
        System.out.println("This is a codewars problem");
        Scanner scan = new Scanner(System.in);
        Long num = scan.nextLong();
        System.out.println(persistenceCheck(num));
    }
}
