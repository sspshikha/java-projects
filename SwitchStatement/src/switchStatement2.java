public class switchStatement2 {
    public static void main(String[] args) {
        char charValue = 'C';
        switch (charValue) 
        {
            case 'A':case 'B':case 'C':case 'D':case 'E':
            System.out.println(charValue + " was found");
            break;
            default:
            System.out.println("Value was not found");
            break;
        }
            String month = "JANuaRbhY";
            switch(month.toLowerCase())
            {
                case "january":
                System.out.println(("Jan"));
                break;
                case "september":
                System.out.println("Sep");
                break;
                default:
                System.out.println("Not sure");
                break;
            }
            // case 'A':
            // System.out.println("Value was A");
            //  break;
            // case 'B':
            // System.out.println("Value was B");
            // break;
            // case 'C':
            // System.out.println("Value was C");
            //  break;
            //  case 'D':
            // System.out.println("Value was D");
            //  break;
            //  case 'E':
            // System.out.println("Value was E");
            //  break;
            //  default:
            //  System.out.println("Value was not found");
            //  break;
    }
    
}
