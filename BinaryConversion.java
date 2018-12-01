import java.util.Scanner;

public class BinaryConversion {

    public Scanner scan;
    public String bin;

    public void getVal() {
        System.out.println("Binary to Decimal, Octal and HexaDecimal");
        scan = new Scanner(System.in);
        System.out.println("\nEnter the number :");
        bin = scan.nextLine();
    }

    public void convert() {
        int decimal = Integer.parseInt(bin, 2);
        System.out.println("Decimal Value is: " + decimal);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal Value is : " + octal);
        String hexa = Integer.toHexString(decimal);
        System.out.println("HexaDecimal Value is : " + hexa);

    }

    public static void main(String args[]) {
        Convert obj = new Convert();
        obj.getVal();
        obj.convert();
    }
}
