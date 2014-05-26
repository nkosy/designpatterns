/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.structural.AdapterPattern;

/**
 *
 * @author nkosy
 */
public class CelciusReporter{
    double temperatureInC;

    public CelciusReporter() {
    }

    public double getTemperatureInC() {
        return temperatureInC;
    }

    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
}
