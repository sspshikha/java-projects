

public class leapYear {
    public static boolean isLeapYear(int year) {
    //    boolean ans = true;
    //    if(ans){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("true");
                return true;
            }
            //System.out.println("This is not a leapyear");
            // if(year % 4 == 0){
            //     if(year % 100 == 0){
            //         if(year % 400 == 0){
            //             System.out.println("This is a leapyear!");
            //         }


            //     }
            //     return true;

            // }
            // return false;
        }

    // }
    System.out.println("false");
    return false;
    }
}
// public class leapYear {
//     public static boolean isLeapYear(int year){
//         if(year < 1 && year > 9999){
//             return false;
//         } else if((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)|| year % 400 == 0 && (year >= 1 && year <= 9999)){
//             return true;
//         } else {
//             return false;
//         }
//     }
// }
            
