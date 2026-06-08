
import java.util.Scanner;

public class insertdigitatfirst {
    public int countnoofDigit(int num) {
        int count = 0;
        if (num == 0) {
            return 1;

        }
        if (num < 0) {
            num = num * -1;
        }
        while (num > 0) {
            num = num / 10;
            count++;

        }
        return count;
    }

    public void insertDigit(int num, int digit, int a) {
        boolean isneg = false;
        if (num < 0) {
            num = -1 * num;
            isneg = true;
        }
        int digi = digit * (int) Math.pow(10, a);
        int res = digi + num;
        if (isneg) {
            System.out.println(-1 * res);
            return;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int input = obj.nextInt();
        insertdigitatfirst ob = new insertdigitatfirst();
        int a = ob.countnoofDigit(input);
        ob.insertDigit(input, 9, a);
        obj.close();

    }

}
