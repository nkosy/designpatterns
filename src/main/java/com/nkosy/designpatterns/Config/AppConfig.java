/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nkosy.designpatterns.Config;

import com.nkosy.designpatterns.creational.abstractfactory.AbstractFactory;
import com.nkosy.designpatterns.creational.builderpattern.Meal;
import com.nkosy.designpatterns.creational.factorymethod.AnimalFactory;
import com.nkosy.designpatterns.creational.prototypepattern.Person;
import com.nkosy.designpatterns.creational.singleton.SingletonExample;
import com.nkosy.designpatterns.structural.AdapterPattern.TemperatureClassReporter;
import com.nkosy.designpatterns.structural.AdapterPattern.TemperatureObjectReporter;
import com.nkosy.designpatterns.structural.compositepattern.Composite;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author nkosy
 */
@org.springframework.context.annotation.Configuration
public class AppConfig {

    @Bean(name = "singletonTest")
    public SingletonExample getService() {
        return new SingletonExample();
    }

    @Bean(name = "factorymethod")
    public AnimalFactory getFactoryService() {
       return new AnimalFactory();
    }
    
    @Bean(name = "abstractFactory")
    public AbstractFactory getAbstractFactoryService(){
        return new AbstractFactory();
    }
    
    @Bean(name = "builderPattern")
    public Meal getMealBuilderService(){
        return new Meal();
    }
    
    @Bean(name = "prototypePattern")
    public Person getPrototypePatternService(){
        return new Person(); 
    }
    
    @Bean(name = "classReporter")
    public TemperatureClassReporter getClassReporterService(){
        return new TemperatureClassReporter();
    }
    
    @Bean(name = "tempObjectReporter")
    public TemperatureObjectReporter getTemperatureReporterService(){
        return new TemperatureObjectReporter(); 
    }
    
    /*@Bean(name = "leaf")
    public Leaf getLeaftService(){
        return new Leaf();
    }*/
    
    @Bean(name = "composite")
    public Composite getCompositeService(){
        return new Composite();
    }
}
