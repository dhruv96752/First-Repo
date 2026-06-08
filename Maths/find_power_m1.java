public class find_power_m1 {
    public void power(int a, int b) {
        boolean isnegb = false;
        boolean isnega = false;
        double res = 1;
        if (a < 0) {
            isnega = true;
        }
        if (b < 0) {
            isnegb = true;
            b = -1 * b;
        }
        for (int i = 0; i < b; i++) {
            res = res * a;
        }
        if (isnega&&isnegb==false) {
            System.out.println(-1 * res);
            return;
        }
        if (isnegb&&isnega==false) {
            res = 1 / res;
            System.out.println(res);
            return;
        }
        if (isnegb && isnega) {
            res = -1 / res;
            System.out.println(res);
            return;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        find_power_m1 obj = new find_power_m1();
        obj.power(-2, -4);
    }
}
