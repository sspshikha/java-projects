public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
        
    }
    public static String getDurationString(long minutes,long seconds) {
        if((minutes<0) || (seconds<0) || (seconds>59) ){
            return INVALID_VALUE_MESSAGE;
        }
            long hours = minutes / 60;
            long remaningMinutes = minutes % 60;
            String hoursString = hours + "h";
            if(hours< 10){
                hoursString = "0" + hoursString;
            }
            String minutesString = remaningMinutes + "m";
            if(remaningMinutes< 10){
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if(seconds< 10){
                secondsString = "0" + secondsString;
            }
            //return hours + "h " + remaningMinutes + "m " + seconds + "s ";
            return hoursString + " " + minutesString + " " + secondsString;
        }
    public static String getDurationString(long seconds) {
        if(seconds<0){ 
        return INVALID_VALUE_MESSAGE;
        }
            long minutes = seconds / 60;
            long remaningSeconds = seconds % 60;
            return getDurationString(minutes, remaningSeconds);
        }
    
}
