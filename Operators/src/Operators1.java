import java.lang.management.ThreadInfo;

public class Operators1 {
    public static void main(String args[]) 
    {
     
    //     int result = 1 + 2; //1 + 2 = 3
    //     System.out.println("1 + 2 = " + result);
    //     int preciousResult = result;
    //     System.out.println("previousResult = " + preciousResult);
    //     result = result - 1; //3 - 1 = 2
    //     System.out.println("3 - 1 = "+ result);
    //     System.out.println("previousResult = " + preciousResult);
    //     result = result * 10; //2 * 10 = 20
    //     System.out.println("2 * 10 = " + result);
    //     result = result/5; //20/5 = 4
    //     System.out.println("20/5 =" + result);
    //     result = result % 3; //the reminder of (4%3) = 1
    //     System.out.println("4 % 3 = "+ result);
        
    //     // ersut = result + 1;

    //     result++; //1 +1 = 2
    //     System.out.println("1 + 1 = " + result);


    //     result--; //2 - 1 = 1
    //     System.out.println("2 - 1 = " + result);

    //     //result = result +2;
    //     result += 2; //1 + 2 = 3
    //     System.out.println("1 + 2 = " + result);

    //     //result = result -2;
    //    // result -= 2; // 3 - 2 = 1
    //     //System.out.println("3 - 2 = " + result);

    //     //result = result * 10;
    //     result = result * 10; // 3 * 10 = 30
    //     System.out.println("3 * 10 = " + result);

    //     // result = result / 3
    //     result /= 3; // 30 / 3 = 10
    //     System.out.println("30 / 3 = " + result);

    //      //result = result -2;
    //      result -= 2; // 10 - 2 = 8
    //      System.out.println("10 - 2 = " + result);

    //      boolean isAlien = false;
    //      if (isAlien == false)
    //      {
    //         System.out.println("It is not an alien!");
    //         System.out.println("And I am scared of aliens");
    //      }
        //  int topScore = 80;
        //  if(topScore < 100)
        //  {
        //         System.out.println("You got the high score!");
        //  }
        //   int secondTopScore = 81;
        //   if(topScore > secondTopScore && topScore < 100)
        //   {
        //       System.out.println("Greater than second top score and less then 100");
        //   }

        //   int newValue = 50;
        //   if(newValue == 50){
        //       System.out.println("This is fixed");
        //   }

        //   boolean isCar = false;
        //   if(!isCar)
        //   {
        //       System.out.println("This is not supposed to happen");
        //   }
          
        //   boolean isCar = false;
        //   if(isCar)
        //   {
        //       System.out.println("This is not supposed to happen");
        //   }
        //   boolean isCar = true;
        //   boolean wasCar = isCar ? true : false;
        //   if(wasCar){
        //       System.out.println("wasCar is true");
        //   }
          
        //   int ageOfClient = 20;
        //   boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        //   System.out.println("Condition is true");

            double variableOne = 20.00;
            double variableTwo = 80.00;
            double variableThree = 100 * (variableOne + variableTwo);
            System.out.println("variableThree = " + variableThree);
            double remainderValue = variableThree % 40.00;
            System.out.println("remainderValue = " + remainderValue);
            boolean isZero = (remainderValue == 0) ? true : false;
            System.out.println("isZero = " + isZero);
            if(!isZero){
                System.out.println("Got some remainder");
            }
        }
    
}
