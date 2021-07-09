import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalRunner {

    public static void main(String[] args) {

        // Precision isn't "true" when it comes to storing values in [int, double, long, float]
        // data types.  i.e. [.012 + .012 + .012 = .036000000000000004{false}/ .036{true}

        //initialize variable
        double value = .012;

        //the result variable is double and will compile [Double Data Structures]
        double result = value + value + value;

        //The result that prints is 18 decimal places from the . separator when it should be 3.
        System.out.println(result);

        //creating object to store the conversion of a double value to string starting witht he
        //double wrapper class.to string method and passing the double value.
        var stringValue = Double.toString(value);

        //object holding the conversion of a string value to a decimal value using the BigDecimal
        //wrapper method
        var bigValue = new BigDecimal(stringValue);

        //var bigSum = bigValue.add(bigValue).add(bigValue);
        // .add is a Math function that is being used on  the BigDecimal value stored in bigValue
        // and is being stored in the big some string object.  The object itself is protected.

        var bigSum = bigValue.add(bigValue).add(bigValue);

        System.out.println(bigSum);


    }
}
