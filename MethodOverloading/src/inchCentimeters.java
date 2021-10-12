public class inchCentimeters {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5,11);
        calcFeetAndInchesToCentimeters(157);
    }
        

    public static double calcFeetAndInchesToCentimeters(double feet,double inch) {
        if(feet >= 0 && (inch >= 0 && inch <= 12)){
            double centimeter = (feet * 30.48) + (inch * 2.54);
            System.out.println(feet+" feet and " + inch + " inches = " + centimeter + " centimeters");
            return centimeter;
        }
        System.out.println("Invalid parameters! ");
        return -1;
        
    }
    public static double calcFeetAndInchesToCentimeters(double inch) {
        if(inch >= 0){
            double feet = (int)inch / 12;
            double remainingInchs = (int) inch % 12;
            System.out.println(inch + " inch = " + feet + " feet and " + remainingInchs + "inches");
            return feet;
        }
        System.out.println("Invalid parameters!");
        return -1;
        
    }

    
}
