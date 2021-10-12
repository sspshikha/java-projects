import java.io.PushbackInputStream;

public class key {
    public static void main(String args[]) {
        {
        boolean gameOver = true;
        int score = 3000;
        int levelCompleted = 5;
        int bonus = 100;
        // if(score < 5000 && score >1000){
        //     System.out.println("Your score was less then 5000 but greater then 1000");
        //     //System.out.println("This was executed");
        // }
        // else if(score < 1000){
        //     System.out.println("your score was less then 1000");
        // }
        // else
        // {
        //     System.out.println("Got here");
        // }
        
        if(gameOver == true) //or if(gameOver) can also be used
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);
        }
    }
    {
      int score = 10000;
      int levelCompleted = 8;
      int bonus = 200;
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("Your finalScore is = " + finalScore); 
    }
    
        
    }
    
}
