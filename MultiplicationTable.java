import java.util.Scanner;

public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dimension: ");
        int sizeofx = sc.nextInt();
        int sizeofy = sc.nextInt();

        int x;
        int y;
        int sum;
        for (x = 1; x <= sizeofx; x++) {
            for (y = 1; y <= sizeofy; y++) {
                sum = x * y;
                System.out.printf("%10d", sum);
            }
            System.out.println();
        }
    }
}
