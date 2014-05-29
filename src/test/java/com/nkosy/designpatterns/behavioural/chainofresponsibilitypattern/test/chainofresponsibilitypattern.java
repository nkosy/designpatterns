/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.behavioural.chainofresponsibilitypattern.test;

import com.nkosy.designpatterns.Config.AppConfig;
import com.nkosy.designpatterns.behavioral.chainofresponsibilypattern.MercuryHandler;
import com.nkosy.designpatterns.behavioral.chainofresponsibilypattern.PlanetEnum;
import com.nkosy.designpatterns.behavioral.chainofresponsibilypattern.PlanetHandler;
import com.nkosy.designpatterns.behavioral.chainofresponsibilypattern.VenusHandler;
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
public class chainofresponsibilitypattern {
    
    public chainofresponsibilitypattern() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testChain() {
        PlanetHandler chain = setUpChain();
        chain.handlerequest(PlanetEnum.VENUS);
        chain.handlerequest(PlanetEnum.MERCURY);
        
        Assert.assertNotNull(chain);
    }
    
    public static PlanetHandler setUpChain(){
            PlanetHandler mercuryHandler = new MercuryHandler.Builder().build();
            PlanetHandler venusHandler = new VenusHandler.Builder().build();
            
            mercuryHandler.setSuccessor(venusHandler);
            return mercuryHandler;
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
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
