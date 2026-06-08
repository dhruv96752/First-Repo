public class even_odd {
    public void findevenodd(int num) {
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        even_odd obj = new even_odd();
        obj.findevenodd(0);
    }
}
