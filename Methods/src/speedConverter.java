public class speedConverter {
    public static void main(String args[]) {
        //toMailesPerHour(67);
        //System.out.println("Number od miles per hour = " + toMailesPerHour);
        printConversion(1.5);
    }
    public static long toMailesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
        return -1;
        }

        //long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return Math.round(kilometersPerHour / 1.609);
        }

        public static void printConversion(double kilometersPerHour) {
            //long milesPerHour;
            if(kilometersPerHour < 0){
                System.out.println("Invalid value");
            }
            else{
                long milesPerHour = toMailesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
            }
            
        }
    
}
