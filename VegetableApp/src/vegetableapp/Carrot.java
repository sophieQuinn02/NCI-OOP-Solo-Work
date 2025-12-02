/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author Sophie Quinn
 */
public class Carrot extends VegGuide implements HarvestTime{
    private String seasonCheck; //the unique variable for Carrot
    
        public Carrot(String colour, String saveName, int time, String size, int rot, int randomDays, String seasonCheck){
        super(colour, saveName, time, size, rot, randomDays);
        this.seasonCheck = seasonCheck;
    }

    //Carrot(String colour, String saveName, int time, String size, double rot, String seasonCheck) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }

        public String getSeasonCheck() {
            return seasonCheck;
        }

        public void setSeasonCheck(String seasonCheck) {
            this.seasonCheck = seasonCheck;
        }
        
    @Override
    public String HarvestTime(){
        return seasonCheck;
    }
    
    @Override
    public String printResult(){
    return super.printResult()+" , "+seasonCheck;
    }
}
