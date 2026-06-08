public class reverse_a_number{
    public void reverse(int num){
        int rev=0;
        boolean isneg=false;
        if(num<0){
            isneg=true;
            num=-1*num;

        }
        while(num>0){
            int digit=num%10;
            rev = rev*10+digit;
            num=num/10;
        }
        if(isneg){
            rev=-1*rev;
        }
        System.out.println("Reversed Number is "+rev);
    }
    public static void main(String[] args) {
        reverse_a_number obj=new reverse_a_number();
        obj.reverse(0);
    }
}