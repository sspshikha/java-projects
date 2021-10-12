public class DogBarking {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay ) {
        boolean ans = false;
        if (barking){

        if(hourOfDay >= 0 && hourOfDay <= 23){
          if(hourOfDay < 8 || hourOfDay >22){
              ans = true;
            }
          else  {
              return false;
          }  
        //   else if( hourOfDay <0 || hourOfDay > 23 ){
        //       return false;
        //   }
        }
    }
        return ans;
    }
}

//public class BarkingDog {
//     public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//         boolean ans = false;
//         if(barking){
//             if(hourOfDay &gt;= 0 &amp;&amp; hourOfDay &lt;= 23)
//             {
//                 if(hourOfDay &lt; 8 || hourOfDay &gt; 22){
//                     ans = true;
//             }
            
//         }
//         return ans;
//     }
 
// }