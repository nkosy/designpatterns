/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.creational.prototypepattern;

import com.nkosy.designpatterns.Config.AppConfig;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nkosy
 */
public class PrototypePatternTest {
    private Prototype obj;
    
    public PrototypePatternTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void cloneObject() {
        Person person1 = new Person("Fred");
        Assert.assertNotNull(person1);
        Person person2 = (Person) person1.doClone();
        Assert.assertNotNull(person2);
        
        Dog dog1 = new Dog("Woooof!");
        Assert.assertNotNull(dog1);
        Dog dog2 = (Dog) dog1.doClone();
        Assert.assertNotNull(dog1);
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
        obj = (Prototype) ctx.getBean("prototypePattern");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
