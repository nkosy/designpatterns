package com.nkosy.designpatterns.creational.factorymethod.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.nkosy.designpatterns.Config.AppConfig;
import com.nkosy.designpatterns.creational.factorymethod.Animal;
import com.nkosy.designpatterns.creational.factorymethod.AnimalFactory;
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
public class FactoryMethodTest {
    public AnimalFactory obj;
    
    public FactoryMethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void factory() {
        AnimalFactory animalFactory = AnimalFactory.getInstance();
        
        Animal a1 = animalFactory.getAnimal("feline");
        Animal a2 = animalFactory.getAnimal("canine");
        
        assertEquals("Woof", a2.makeSound());
        assertEquals("Meow", a1.makeSound());
        
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
        obj = (AnimalFactory) ctx.getBean("factorymethod");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
