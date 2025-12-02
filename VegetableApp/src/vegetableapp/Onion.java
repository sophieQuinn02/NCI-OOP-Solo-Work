/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author Sophie Quinn
 */
public class Onion extends VegGuide implements HarvestTime{
    private String dirtCoverage; //the unique variable for Onion
    
        public Onion(String colour, String saveName, int time, String size, int rot, int randomDays, String dirtCoverage){
        super(colour, saveName, time, size, rot, randomDays);
        this.dirtCoverage = dirtCoverage;
    }

   // Onion(String colour, String saveName, int time, String size, double rot, String dirtCoverage) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }

        public String getDirtCoverage() {
            return dirtCoverage;
        }

        public void setDirtCoverage(String dirtCoverage) {
            this.dirtCoverage = dirtCoverage;
        }
        
    @Override
    public String HarvestTime(){
        return dirtCoverage;
    }
    
    @Override
    public String printResult(){
        return super.printResult()+" , "+dirtCoverage;
    }
}
