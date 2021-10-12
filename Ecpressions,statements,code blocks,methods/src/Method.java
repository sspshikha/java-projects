public class Method {
        public static void main(String args[]) {
      boolean gameOver = true;      
      calculateScore();
      int score = 10000;
      int levelCompleted = 8;
      int bonus = 200;
      if(gameOver){
      int finalScore = score + (levelCompleted * bonus);
      System.out.println("Your finalScore is = " + finalScore); 
    }
    
        
    }
    public static void calculateScore() {

        {
            boolean gameOver = true;
            int score = 3000;
            int levelCompleted = 5;
            int bonus = 100;
            if(gameOver == true) //or if(gameOver) can also be used
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);
        }
    }
    }
    
}
