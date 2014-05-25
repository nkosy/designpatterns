/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.creational.factorymethod;

/**
 *
 * @author nkosy
 */
public class AnimalFactory {
    private static AnimalFactory factory = null;
    
    public static AnimalFactory getInstance(){
        if (factory == null)
            factory = new AnimalFactory();
        return factory;
    }
    
    public Animal getAnimal(String type){
        if("canine".equals(type))
            return new Dog();
        else
            return new Cat();
    }
    
}
