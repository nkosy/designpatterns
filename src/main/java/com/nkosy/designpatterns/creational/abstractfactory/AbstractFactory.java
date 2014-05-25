/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.creational.abstractfactory;

import com.nkosy.designpatterns.creational.factorymethod.ReptileFactory;

/**
 *
 * @author nkosy
 */
public class AbstractFactory {
    private static AbstractFactory abstractFactory = null;
    
    public static AbstractFactory getInstance(){
        if (abstractFactory == null)
            abstractFactory = new AbstractFactory();
        return
             abstractFactory;
            
    }
    public SpeciesFactory getSpeciesFactory(String type){
       if("mammal".equals(type)) {
           return new MammalFactory();
       }
       else
           return new ReptileFactory();
    }
    
}
