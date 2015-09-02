/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;

/**
 *
 * @author simog
 */
public class GradeCalculator {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcIO.main(args);
        System.out.println("Working");
    }
    
    static double calcScore(double scoreGot, double total){
        double score;        
        score = (total/100)*scoreGot;
        
        return score;
    }
    
    static double calcPercentage(double scoreGot, double total){
        double scor;
        scor = (scoreGot/total) * 100;
        scor = Math.round(scor * 100);
        scor = scor/100;
        return scor;
    }
    
}
