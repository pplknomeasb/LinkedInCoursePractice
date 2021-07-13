import java.util.Locale;
import java.util.Scanner;

public class IsogramRunner {

    public static boolean checkIsogram(String str){
        //Creates an array as long as the alphabet
        //All index's are false values

        String toLowerCase = str.toLowerCase(Locale.ROOT);

        int counter = 0;
        int index = 0;

        //Assuming the statement is an Isogram
        boolean isIsogram = true;


        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length(); i++){
                if(toLowerCase.charAt(j) == toLowerCase.charAt(index)){
                    counter += 1;
                }
                index += 1;
                if(counter > 1){
                    isIsogram = false;
                    break;

                    }

                }
            counter = 0;
            index = 0;
            }





        return isIsogram;
    }
    public static void main(String[] args) {

        System.out.println("This is a codewars problem.");

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        boolean isogramCheck;

        isogramCheck = checkIsogram(str);

        System.out.println(isogramCheck);

    }
}
