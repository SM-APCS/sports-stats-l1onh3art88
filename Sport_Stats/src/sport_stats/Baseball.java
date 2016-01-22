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
public class Baseball extends Sport{
    int hits, fouls;
    
    public Baseball(String player){
        super(player);
        hits = 0;
        fouls = 0; 
    }
    public void score(){
        score +=1;
    }
    public void getHit(){
        hits+=1;
    }
    public void commitFouls(){
        fouls+=1;
    }
    public int getHits(){
        return hits;
    }
    public int getFouls(){
        return fouls;
    }
    public String toString(){
        String result = super.toString();
        result +="\nHits: " + hits;
        result += "\nFouls: " + fouls;
        return result;
        
    }
}

