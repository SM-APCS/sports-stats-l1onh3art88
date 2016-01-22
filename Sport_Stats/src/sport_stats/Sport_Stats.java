package sport_stats;

/**
 * Create at least 10 different sports. 
 * You should have more stats than sports 
 * since multiple sports have common attributes.
 * @author Spencer Cheng
 */
public class Sport_Stats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Baseball player1;
         Basketball player2;
         Football player3;
         Hockey player4;
         Lacrosse player5;
         PingPong player6;
         Polo player7;
         Rugby player8;
         Volleyball player9;
         WaterPolo player10;
         Soccer player11;
         
         //Initialize each class
         player1=new Baseball("Bob Jones");
         player2=new Basketball("John");
         player3 = new Football("Andrew");
         player4 = new Hockey("Will");
         player5 = new Lacrosse("Dill");
         player6 = new PingPong("Graham");
         player7 = new Polo("Brannon");
         player8 = new Rugby("Nico");
         player9 = new Volleyball("Ashton");
         player10 = new WaterPolo("Spencer");
         player11 = new Soccer("Anvit");
         
         //Different Scores per sport
         player1.score();
         player2.score();
         player3.score();
         player4.score();
         player5.score();
         player6.score();
         player7.score();
         player8.score();
         player9.score();
         player10.score();
         player11.score();
         //Prints Player
         
         System.out.println(player1);
         System.out.println(player2);
         System.out.println(player3);
         System.out.println(player4);
         System.out.println(player5);
         System.out.println(player6);
         System.out.println(player7);
         System.out.println(player8);
         System.out.println(player9);
         System.out.println(player10);
         System.out.println(player11);
                 
    }
    
}
