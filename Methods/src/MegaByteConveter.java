public class MegaByteConveter {
    // public static void main(String args[]) {
    //     printMegaByteAndKiloByte(1024);
        
    // }
    public static void printMegaBytesAndKiloBytes(int kiloByte) {
        if(kiloByte < 0){
            System.out.println("Invalid Value");
        }
        else{
            int megaByte = kiloByte / 1024;
            int kb = kiloByte % 1024;
            System.out.println(kiloByte + " KB = " + megaByte + " MB and " + kb + " KB" );
        }
        //return kiloByte;
        
    }
    
}
