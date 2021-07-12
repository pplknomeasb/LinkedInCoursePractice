import java.util.Scanner;

public class PangramRunner {

    public static boolean checkPangram(String str)
    {
        //Creates an array as long as the alphabet
        //All index's are false values
        boolean[] mark = new boolean[26];

        //Assuming the statement is a pangram
        boolean isPangram = true;

        int index = 0;

        for (int i = 0; i < str.length(); i++){

            //Checks if the character at the first/next index is
            //lesser than all capital letter values
            if ('A'<= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';

            //Checks if the character at the first/next index is
            //lesser than all lowercase letter values
            else if('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';

            //If the letter at the index doesn't fall within a and z
            //both capital and lowercase letters,
            else
                continue;
            mark[index] = true;
        }

        for(int i = 0; i <=25; i++) {
            if (mark[i] == false)
                isPangram = false;

        }

        return isPangram;
    }
    public static void main(String[] args) {

        System.out.println("This is a codewars case.");


        Scanner scan = new Scanner(System.in);

        //Allows the user to input a character set
        String str = scan.nextLine();

        boolean pangramCheck;

        //Go to method for Pangram testing
        pangramCheck = checkPangram(str);

        //A boolean result is returned
        System.out.println(pangramCheck);


    }
}
