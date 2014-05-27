/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.structural.adapterPattern;

/**
 *
 * @author nkosy
 */
public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo{

    
    @Override
    public double getTemperatureInC(){
        return temperatureInC;
    }
    
    @Override
    public double getTemperatureInF(){
        return cToF(temperatureInC);
    }
    
    @Override
    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
    
    @Override
    public void setTemperatureInF(double temperatureInF) {
        this.temperatureInC = fToC(temperatureInF);
    }
    
    private double fToC(double f) {
        return ((f - 32) * 5/9);
    }
    
    private double cToF(double c){
        return ((c * 9 / 5) + 32);
    }
}
