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
public class WaterPolo extends Sport {
    int goals;
    public WaterPolo(String player){
        super (player);
    }
    public void score(){
        score += 1;
    }
    public void getGoal(){
        goals+=1;
    }
    public int getGoals(){
        return goals;
    }
    public String toString(){
        String result =super.toString();
        result += "\nGoals: " + goals;
        return result;
    }
}
