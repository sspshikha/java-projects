public class q6 {
    public static void main(String args[]) {
        int Marks = 45;

        if(Marks < 25){
            System.out.println("The corresponding grade is F");
        }
        else if(Marks >= 25 && Marks <= 45){
            System.out.println("The corresponding grade is E");
        }
        else if(Marks >= 45 && Marks <= 50){
            System.out.println("The corresponding grade is D");
        }
        else if(Marks >= 50 && Marks <= 60){
            System.out.println("The corresponding grade is C");
        }
        else if(Marks >= 60 && Marks <= 80){
            System.out.println("The corresponding grade is B");
        }
        else if(Marks >= 80){
            System.out.println("The corresponding grade is A");
        }
        
    }
    
}
