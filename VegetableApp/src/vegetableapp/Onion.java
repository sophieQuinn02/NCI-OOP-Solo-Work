/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author omgit
 */
public class Onion extends VegGuide implements HarvestTime{
    private String dirtCoverage;
    
        public Onion(String dirtCoverage, String colour, double time, double size, double rot){
        super(colour, time, size, rot);
        this.dirtCoverage = dirtCoverage;
    }

        public String getDirtCoverage() {
            return dirtCoverage;
        }

        public void setDirtCoverage(String dirtCoverage) {
            this.dirtCoverage = dirtCoverage;
        }
        
    @Override
    public double HarvestTime(){
        
    }
    
    @Override
    public String printResult(){
        return super.printResult()+" , "+dirtCoverage;
    }
}
