import java.util.Locale;
import java.util.Scanner;

public class IsogramRunner {

    public static boolean checkIsogram(String str){
        //All index's are false values

        //converts the entire string to lowercase for ignore case
        String toLowerCase = str.toLowerCase();

        //Counter initialized to count the number of times a character repeats itself
        int counter = 0;

        //Assuming the statement is an Isogram
        boolean isIsogram = true;

        //The first loop will act as the index place
        for(int i = 0; i < str.length(); i++){

            //This loop loops through the entire string per character in the string
            for(int j = 0; j < str.length(); j++){

                //All characters will have a count of at least 1
                if(toLowerCase.charAt(i) == toLowerCase.charAt(j)){
                    counter += 1;
                }

                //If at any point a character repeats itself, the program is instructed to stop and exit
                //and return false
                if(counter>1){
                    isIsogram = false;
                    break;
                }
            }

            //counter always must go back to zero after the 2nd loop exits
            counter = 0;
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
