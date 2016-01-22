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
public abstract class Sport {
    String player;
    int score;
    
    public Sport (String playerName){
        player = playerName;
        score = 0;
    }
    //Returns the Score
    public int getScore(){
        return score;
    }
    //Changes score depending on sport
    public abstract void score();
    
    public String toString(){
        String result ="Player: " + player;
        result += "\nScore: " + score;
        return result;
    }
}
