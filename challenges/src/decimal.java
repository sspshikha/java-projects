public class decimal {
    public static boolean DecimalComparator(double d1,double d2){
        int a = (int)(d1*1000);
        int b = (int)(d2*1000);
        if(a == b){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
}
