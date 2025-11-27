/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author omgit
 */
public class Carrot extends VegGuide implements HarvestTime{
    private String seasonCheck;
    
        public Carrot(String seasonCheck, String colour, double time, double size, double rot){
        super(colour, time, size, rot);
        this.seasonCheck = seasonCheck;
    }

        public String getSeasonCheck() {
            return seasonCheck;
        }

        public void setSeasonCheck(String seasonCheck) {
            this.seasonCheck = seasonCheck;
        }
        
    @Override
    public double HarvestTime(){
        
    }
    
    @Override
    public String printResult(){
    return super.printResult()+" , "+seasonCheck;
    }
}
