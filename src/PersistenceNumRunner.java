import java.util.Scanner;

public class PersistenceNumRunner {
    public static Long persistenceCheck(Long n){

        var count = 0L;
        var newNum = n.toString().split("");


        do{
            if(n.toString().length()==1){
                break;
            }

            var s

        }while();

//        do {
//            String[] numArray = new String[n.toString()];
//
//            for(int i = 0; i < num.toString().length(); i++)
//
//                num = num * n.toString().charAt(i);
//
//        }while(num.toString().length() > 1 );

        return count;
    }
    public static void main(String[] args) {
        System.out.println("This is a codewars problem");
        Scanner scan = new Scanner(System.in);
        Long num = scan.nextLong();
        System.out.println(persistenceCheck(num));
    }
}
