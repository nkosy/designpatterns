package com.nkosy.designpatterns.structural.adapterPattern;

/**
 *
 * @author nkosy
 */
public class TemperatureObjectReporter implements TemperatureInfo{
    CelciusReporter celciusReporter;
    
    public TemperatureObjectReporter(){
        celciusReporter = new CelciusReporter();
    }

    @Override
    public double getTemperatureInC() {
        return celciusReporter.getTemperatureInC();
    }
    
    @Override
    public double getTemperatureInF() {
        return cToF(celciusReporter.getTemperatureInC());
    }
    
    @Override
    public void setTemperatureInC(double temperatureInC) {
        celciusReporter.setTemperatureInC(temperatureInC);
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celciusReporter.setTemperatureInC(fToC(temperatureInF));
    }
    
    private double fToC(double f) {
        return ((f - 32) * 5/9);
    }
    
    private double cToF(double c){
        return ((c * 9 / 5) + 32);
    }
}
