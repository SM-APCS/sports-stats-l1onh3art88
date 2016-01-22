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
public class Football extends Sport{
    int yards;
    
    public Football(String player){
        super(player);
        yards = 0;
    }
    public void score(){
        score +=6;
    }
    //Changes the number of yards gained
    public void gainYards(int numYards){
        yards += numYards;
    }
    public int getYards(){
        return yards;
    }
    public String toString(){
        String result = super.toString();
        result += "\nYards: " + yards;
        return result;
    }
}
