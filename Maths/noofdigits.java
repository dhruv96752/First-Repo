
import java.util.Scanner;

class noofdigits {

    public void digit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("Number of Digits is " + 1);
            return;
        }
        if (a < 0) {
            a = -1 * a;
        }
        // int digi=(int)Math.log10(a)+1;
        // System.out.println("Number of Digits are " + digi);
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        System.out.println("Number of Digits are " + count);
        
    }

    public static void main(String[] args) {
        noofdigits a = new noofdigits();
        a.digit();
    
        
    
    }
}
