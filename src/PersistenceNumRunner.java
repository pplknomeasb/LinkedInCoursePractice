import java.math.BigDecimal;
import java.util.Scanner;

public class PersistenceNumRunner {
    public static Long persistenceCheck(Long n){

        var count = 0L;
        var multiplier=n.toString().length();
        BigDecimal valueBig;
        var resultBig = new BigDecimal(1);
        var nToString = n.toString().split("");




            if(multiplier<=1){
                //If the strings length has no multipliers, count remains 0
            }else{

                do {
                    for (int i = 0; i < multiplier; i++) {

                        valueBig = new BigDecimal(nToString[i]);
                        resultBig *= valueBig.;
                        count += 1;
                    }
                }while(resultBig>9);
//                do{
//                    var nToString = n.toString().split("");
//                    System.out.println(nToString);
//
//                }while();
            }




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
