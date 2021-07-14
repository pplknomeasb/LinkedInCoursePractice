import java.util.Scanner;

public class PersistenceNumRunner {
    public static Long persistenceCheck(Long n){

        var count = 0L;
        var multiplier=1l;




            if(n.toString().length()<=1){
                //If the strings length has no multipliers, count remains 0
            }else{
                do{
                    var nToString = n.toString().split("");
                    for (int i = 0; i < nToString.length; i++){
                        multiplier *= nToString.to
                    }

                }while();
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
