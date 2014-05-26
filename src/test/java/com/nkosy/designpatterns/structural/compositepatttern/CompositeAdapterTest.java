/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.structural.compositepatttern;

import com.nkosy.designpatterns.Config.AppConfig;
import com.nkosy.designpatterns.structural.compositepattern.Composite;
import com.nkosy.designpatterns.structural.compositepattern.Leaf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
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
public class CompositeAdapterTest {
    private Composite obj;
    
    public CompositeAdapterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void addLeaf() {
        Leaf leaf1 = new Leaf("Bob");
        Leaf leaf2 = new Leaf("Fred");
        Leaf leaf3 = new Leaf("Sue");
        Leaf leaf4 = new Leaf("Ellen");
        Leaf leaf5 = new Leaf("Joe");
        
        Composite composite1 = new Composite();
        composite1.add(leaf1);
        composite1.add(leaf2);
        
        Composite composite2 = new Composite();
        composite2.add(leaf3);
        composite2.add(leaf4);
        
        Composite composite3 = new Composite();
        composite3.add(composite1);
        composite3.add(composite2);
        composite3.add(leaf5);
        
        Assert.assertNotNull(composite1);
        Assert.assertNotNull(composite2);
        Assert.assertNotNull(composite3);
        
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
        obj = (Composite) ctx.getBean("composite"); 
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
