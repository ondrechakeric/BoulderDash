/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1795863
 */
public class Score {
    long id;
    String name;
    int pointsEarned;
    int level;
    
    
    @Override
    public String toString() {
        return String.format("%d: %s earned %d points on %d",id, name, pointsEarned, level);
    }
    
}
