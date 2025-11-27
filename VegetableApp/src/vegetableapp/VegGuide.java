/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vegetableapp;

/**
 *
 * @author omgit
 */
public class VegGuide {
    private String colour;
    private double time;
    private double size;
    private double rot;
    
    public VegGuide(String colour, double time, double size, double rot){
        this.colour = colour;
        this.time = time;
        this.size = size;
        this.rot = rot;
    }
    
    public VegGuide(){
        colour = new String();
        time = 0;
        size = 0;
        rot = 0;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getRot() {
        return rot;
    }

    public void setRot(double rot) {
        this.rot = rot;
    }
    
    public String printResult(){
        return colour+" , "+time+" , "+size;
    }
}

