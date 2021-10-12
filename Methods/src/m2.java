public class m2 {
    public static void main(String args[]) {
        //String playerName ;
        //int positionInTHeHighScoreTable ;
       //int playerScore;

        int positionInTHeHighScoreTable = calculateHighScorePosition(1500);
        displayHighScorePosition("dubulu", positionInTHeHighScoreTable);

        positionInTHeHighScoreTable = calculateHighScorePosition(900);
        displayHighScorePosition("dinesh", positionInTHeHighScoreTable);

        positionInTHeHighScoreTable = calculateHighScorePosition(400);
        displayHighScorePosition("deepu", positionInTHeHighScoreTable);

        positionInTHeHighScoreTable = calculateHighScorePosition(50);
        displayHighScorePosition("gai", positionInTHeHighScoreTable);
    }

    public static void displayHighScorePosition(String playerName,int positionInTHeHighScoreTable) {
        //boolean playerScore = true;
        //if(playerScore){
          System.out.println(playerName + " managed to get into position " 
           + positionInTHeHighScoreTable + 
          " on the high score table");
        //}
     }
    public static int calculateHighScorePosition(int playerScore) {
        // if(playerScore > 1000){
        //     //System.out.println("1");
        //     return 1;
        // }
        // else if (playerScore > 500 && playerScore <= 1000){
        //     //System.out.println("2");
        //     return 2;
        // }
        // else if(playerScore > 100 && playerScore <= 500){
        //     //System.out.println("3");
        //     return 3;
        // }
        // return 4;
        int position = 4;
            if(playerScore >= 1000){
                //System.out.println("1");
                position = 1;
            }
            else if (playerScore >= 500){
                //System.out.println("2");
                position = 2;
            }
            else if(playerScore >= 100){
                //System.out.println("3");
                position = 3;
            }
            return position;

        
    }
    
}
// tu acchu?    
//han
//wahh badhya tah
//aau tu ebe kn karuchu
//kixi nai
//kn je lekhu thilu pa
// haha
//tu padhe ..... sarile khibu
// aare mu ebe diffmerg tool download karuchi
//ohho wahh tu download kriki dekhe tahele;
// hahaha.
//-_-
//wow
//(:
//cool
//(-_^)
//tu padhe mu katuci connection hela
//ta ta 