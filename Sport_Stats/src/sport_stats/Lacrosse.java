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
public class Lacrosse extends Sport {
    int goals;
    public Lacrosse(String player){
        super(player);
        goals = 0;
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
