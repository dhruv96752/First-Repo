public class appenddigit{
    public void append(int num,int digit){
        boolean isneg=false;
        if(num<0){
            num=-1*num;
            isneg=true;
        }
        num=num*10+digit;
        if(isneg){
            System.out.println(-1*num);
            return;
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        appenddigit obj=new appenddigit();
        obj.append(-458,9);
    }
}