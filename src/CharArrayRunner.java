public class CharArrayRunner {
    public static void main(String[] args) {

        //working with variables to control outputs
        char c1 = '1';

        char c2 = '2';

        char c3 = '3';

        //unicode value for the dollar sign "$"
        char dollar = '\u0024';
        System.out.println(dollar);

        var upper = Character.toUpperCase(c1);
        System.out.println("uppper remains " + upper + " because it is numerical and its counter " +
                "part does not exist");

        c1 = 'a';

        //Capitalization is done.
        upper = Character.toUpperCase(c1);
        System.out.println(c1 + " is now " + upper);

        //creating an array of objects
        char[] chars = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(chars);

        //Placing an array of objects into a single object
        String s = new String(chars);

        var charArray = s.toCharArray();

        System.out.println(charArray);

    }
}
