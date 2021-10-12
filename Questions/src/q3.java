public class q3 {
    public static void main(String aregs[]) {
        double marksHeight = 1.69;
        double marksWeight = 78;
        double jhonsHeight = 1.95;
        double jhonsWeight = 92;
        double markBMI = marksWeight / (marksHeight * marksHeight);
        double jhonBMI = jhonsWeight / (jhonsHeight * jhonsHeight);
        System.out.println("markHigherBMI = " + markBMI);
        System.out.println("jhonHigherBMI = " + jhonBMI);
        // if(markBMI > jhonBMI){
        //     System.out.println("Mark has higher BMI");
        // }
        // else{
        //     System.out.println("Jhon has higher BMI");
        // }
        boolean markHigherBMI = markBMI > jhonBMI;
        if(markHigherBMI){
            System.out.println("Mark has higher BMI");
        }
        else{
            System.out.println("Jhon has higher BMI");
        }

    }
    
}
