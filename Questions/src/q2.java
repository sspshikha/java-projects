public class q2 {
    public static void main(String args[]) {
        double billValue = 430;
        double tip = (15.00/100) * billValue;
        //System.out.println("tip = " + tip);

        if(billValue >= 50 && billValue <= 300)
        {
            tip = (15.00/100) * billValue;
            System.out.println("tip = " + tip);
        }
        else{
            tip = (20.00/100) * billValue;
            System.out.println("tip = " + tip);
        }
        double finalValue = billValue +tip;
        System.out.println("the bill value = " + billValue + " the tip = " + tip + " and the final value = " + finalValue);
        
    }
    
}
