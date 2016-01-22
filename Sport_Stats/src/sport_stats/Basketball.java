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
public class Basketball extends Sport{
    int freeThrows;
    int threePointers;
    
    public Basketball(String player){
        super(player);
        freeThrows = 0;
        threePointers = 0;
    }
    public void score(){
        score += 3*threePointers +2*freeThrows;
        
    }
    public void earFreeThrow(int freethrow){
        freeThrows += freethrow;        
    }
    public void earnThreePointer(int threepointer){
        threePointers += threepointer;
    }
    public int getFreeThrow(){
        return freeThrows;
    }
    public int getThreePointer(){
        return threePointers;
    }
    
    public String toString(){
        String result =super.toString();
        result += "\nFree Throws: " + freeThrows;
        result += "\nThree Pointers: " + threePointers;
        return result;
    }
}
