/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.creational.abstractfactory.test;

import com.nkosy.designpatterns.Config.AppConfig;
import com.nkosy.designpatterns.creational.abstractfactory.AbstractFactory;
import com.nkosy.designpatterns.creational.abstractfactory.SpeciesFactory;
import com.nkosy.designpatterns.creational.factorymethod.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nkosy
 */
public class AbstractFactoryTest {
    private AbstractFactory obj;
    
    public AbstractFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void abstractFactory() {
        AbstractFactory abstractFactory = AbstractFactory.getInstance();
        
        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");
        Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
        assertEquals("Roar", a1.makeSound());
        Animal a2 = speciesFactory1.getAnimal("snake");
        assertEquals("Hiss", a2.makeSound());
        
        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");
        Animal a3 = speciesFactory2.getAnimal("dog");
        assertEquals("Woof", a3.makeSound());
        Animal a4 = speciesFactory2.getAnimal("Cat");
        assertEquals("Meow", a4.makeSound());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj = (AbstractFactory) ctx.getBean("abstractFactory");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
