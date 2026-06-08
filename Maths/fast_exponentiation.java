public class fast_exponentiation {
    public void fastexpo(int a, int b) {
        int res = 1;
        int base = a;
        int pow = b;
        while (pow > 0) {
            if (pow % 2 == 0) {
                base = base * base;
                pow = pow / 2;
            } else {
                pow = pow - 1;
                res = res * base;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        fast_exponentiation obj = new fast_exponentiation();
        obj.fastexpo(2, 5);
    }

}
