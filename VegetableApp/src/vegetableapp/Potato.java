/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author
 */
public class Potato extends VegGuide implements HarvestTime{
    private String sunlightCheck; //the unique variable for Potato
    
    public Potato(String colour, String saveName, int time, String size, int rot, int randomDays, String sunlightCheck){
        super(colour, saveName, time, size, rot, randomDays);
        this.sunlightCheck = sunlightCheck;
    }

   // Potato(String colour, String saveName, int time, String size, double rot, String sunlightCheck) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

        public String getSunlightCheck() {
            return sunlightCheck;
        }

        public void setSunlightCheck(String sunlightCheck) {
            this.sunlightCheck = sunlightCheck;
        }
        
    @Override
    public String HarvestTime(){
        return sunlightCheck;
    }
    
    @Override
    public String printResult(){
        return super.printResult()+" , "+sunlightCheck;
    }
}


