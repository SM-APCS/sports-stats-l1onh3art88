/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sport_stats;

/**
 *
 * @author spenc_000
 */
public class Volleyball extends Sport{
    int points;
    
    public Volleyball(String player){
        super(player);
        points = 0;
    }
    public void score(){
        score+=1;
    }
    public void getPoint(){
        points+=1;
    }
    public int getPoints(){
        return points;
    }
    public String toString(){
        String result = super.toString();
        result+="\nPoints: " + points;
        return result;
    }
}
