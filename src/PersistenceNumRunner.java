import com.sun.jdi.LongValue;

import java.math.BigDecimal;
import java.util.Scanner;

public class PersistenceNumRunner {
    public static Long persistenceCheck(Long n){



        var multiplier=n.toString().length();
        Long count = 0L;
        Long result = 1L;
        Long[] numbersSplit = {n.longValue()};
        System.out.println(numbersSplit);
        do {
            if(multiplier<=1) {
                break;
            }else{
                count +=1;
                for(int i = 0; i<=multiplier; i++){
                    result = result * numbersSplit[LongValue(i)];
                    multiplier = result.toString().length();
                }

            }
        }while(multiplier<=1);

        return count;


//        if(multiplier<=1){
//            //If the strings length has no multipliers, count remains 0
//        }else{
//
//            do {
//
//                BigDecimal valueBig;
//                var resultBig = new BigDecimal(1);
//                var nToString = n.toString().split("");
//                var count = 0L;
//
//                    for (int i = 0; i < multiplier; i++) {
//                        var valueBig = BigDecimal(nToString[i]).multiply(resultBig);
//                        count += 1L;
//                    }
//                    multiplier = valueBig.toString().length();
//                }while(multiplier>2);
//                do{
//                    var nToString = n.toString().split("");
//                    System.out.println(nToString);
//
//                }while();
//            }




//        do {
//            String[] numArray = new String[n.toString()];
//
//            for(int i = 0; i < num.toString().length(); i++)
//
//                num = num * n.toString().charAt(i);
//
//        }while(num.toString().length() > 1 );

//        return count;
    }
    public static void main(String[] args) {
        System.out.println("This is a codewars problem");
        Scanner scan = new Scanner(System.in);
        Long num = scan.nextLong();
        System.out.println(persistenceCheck(num));
    }
}
