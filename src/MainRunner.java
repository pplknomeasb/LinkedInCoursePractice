public class MainRunner {
    public static void main(String[] args) {
        var unsigned = Integer.parseUnsignedInt("3000000000");
        System.out.println("Unsigned value is " + unsigned);
        var result = Integer.divideUnsigned(unsigned, 2);
        System.out.println("The result is " + result);
    }
}
