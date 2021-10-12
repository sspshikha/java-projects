public class q8 {
    public static void main(String args[]) {
        double numberOfClassHeld = 56;
        double numberOfClassattended = 40;
        double attendenceOfStudentInPercentage = (numberOfClassattended / numberOfClassHeld) * 100 ;
        System.out.println("Attendence Percentage = " + attendenceOfStudentInPercentage);
        if (attendenceOfStudentInPercentage > 75){
            System.out.println("The student is allowed to sit in exam");
        }
        else{
            System.out.println("Not allowed");
        }
         
        
    }
    
}
