import java.util.zip.DeflaterOutputStream;

public class q1 {
    
    public static void main(String args[]) {
        double dolphinsScore = 96+108+89;
        double koalasScore = 88+91+110;
        double avgDolphinScore = dolphinsScore / 3;
        double avgKoalasScore = koalasScore /3;
        System.out.println("avgDolphinScore = " + avgDolphinScore);
        System.out.println("avgKoalasScore = " + avgKoalasScore);
        if(avgDolphinScore > avgKoalasScore){
            System.out.println("Dolphins are the winners");
        }
        else if(avgDolphinScore == avgKoalasScore){
            System.out.println("There is a draw");
        }
        else{
            System.out.println("Koalas's are the winners");
        }
        double dolphinBonusOneScore = 97+112+101;
        double koalasBonusOneScore = 109+93+123;
        double avgDolphinBonusOneScore = dolphinBonusOneScore / 3;
        double avgKoalasBonusOneScore = koalasBonusOneScore / 3;
        System.out.println("avgDolphinBonusOneScore= " + avgDolphinBonusOneScore);
        System.out.println("avgKoalasBonusOneScore = " + avgKoalasBonusOneScore);
        //System.out.println("dolphinBonusOneScore = " + dolphinBonusOneScore);
        //System.out.println("koalasBonusOneScore = " + koalasBonusOneScore);
    //     if(dolphinBonusOneScore >= 100){
    //     if(dolphinBonusOneScore >= koalasBonusOneScore){
    //         System.out.println("Dolphins are the winners of Bonus one");
    //     }
    // }
    //     else if(koalasBonusOneScore >= 100){
    //         if(koalasBonusOneScore >= dolphinBonusOneScore){
    //         System.out.println("Koalas's are the winners of bonus one");
            
    //     }
    // }
        if(avgDolphinBonusOneScore >= 100 && avgKoalasBonusOneScore >= 100){
            if(avgDolphinBonusOneScore > avgKoalasBonusOneScore){
                System.out.println("Dolphins are the winners of Bonus one");
            }
            else{
                System.out.println("Koalas's are the winners of bonus one");
            }
        }
        
        double dolphinBonusTwoScore =97+112+101;
        double koalasBonusTwoScore =109+95+107;
        double avgDolphinBonusTwoScore = dolphinBonusTwoScore / 3;
        double avgKoalasBonusTwoScore = koalasBonusTwoScore / 3;
        System.out.println("avgDolphinBonusTwoScore= " + avgDolphinBonusTwoScore);
        System.out.println("avgKoalasBonusTwoScore = " + avgKoalasBonusTwoScore);
        if(avgDolphinBonusTwoScore == avgKoalasBonusTwoScore){
            boolean dBonusTwo = avgDolphinBonusTwoScore >= 100;
            boolean kBonusTwo = avgKoalasBonusTwoScore >= 100;
            if( dBonusTwo && kBonusTwo){
                System.out.println("There is a Draw");
            }
        }
            else{
                System.out.println("No team wins the Trophy");
            }

        





        
    }
}
