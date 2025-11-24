/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author omgit
 */
public class Potato extends VegGuide implements HarvestTime{
    private double sunlightCheck;
    
    public Potato(double sunlightCheck, String colour, double time, double size, double rot){
        super(colour, time, size, rot);
        this.sunlightCheck = sunlightCheck;
    }
}

    @Override
    public double HarvestTime(){
        
    }
