
public class any_no_to_decimal {
    public int getdigit(char ch) {
        switch (ch) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'D':
                return 12;
            case 'E':
                return 13;
            case 'F':
                return 14;
            default:
                return (ch - '0');

        }
    }

    public void coversion(String num, int base) {
        int res = 0;
        int pos = 0;

        for (int i = (num.length() - 1); i >= 0; i--) {
            int n = getdigit(num.charAt(i));
            if (n >= base) {
                System.out.println("Base is wrong!!!!");
                return;
            }
            res = res + (n * ((int) Math.pow(base, pos)));
            pos++;
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        any_no_to_decimal obj = new any_no_to_decimal();
        obj.coversion("6B", 2);
    }

}