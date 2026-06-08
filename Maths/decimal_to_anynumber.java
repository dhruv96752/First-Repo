public class decimal_to_anynumber {
    public void conversion(int input,int base){
        String res="";
        while(input>0){
            res=(input%base)+res;
            input=input/base;
        }
        System.out.println(res);

    }
    public static void main(String[] args) {
        decimal_to_anynumber obj=new decimal_to_anynumber();
        obj.conversion(151,8);
    }
    

    
}
