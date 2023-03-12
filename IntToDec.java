public class IntToDec {
    public static void main(String[] args) {

        // decimal to binary

        int decimalNumber = 10;
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary equivalent of " + decimalNumber + " is " + binaryNumber);

        // binary to decimal

        int binNum = Integer.parseInt("1010", 2);
        System.out.println("Decimal equivalent of 1010 is " + binNum);

    }
}
