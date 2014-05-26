/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.structural.adapterpattern.test;

import com.nkosy.designpatterns.Config.AppConfig;
import com.nkosy.designpatterns.structural.AdapterPattern.CelciusReporter;
import com.nkosy.designpatterns.structural.AdapterPattern.TemperatureClassReporter;
import com.nkosy.designpatterns.structural.AdapterPattern.TemperatureInfo;
import com.nkosy.designpatterns.structural.AdapterPattern.TemperatureObjectReporter;
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
public class AdapterPatternTest {
    private TemperatureObjectReporter obj;
    private CelciusReporter obj2;
    private TemperatureInfo tempInfo;
            
    public AdapterPatternTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void classAdapter() {
        tempInfo = new TemperatureClassReporter();
        tempInfo.setTemperatureInC(0.0);
        assertEquals(0.0,tempInfo.getTemperatureInC());
    }
    
    @Test
    public void objectAdapter(){
        tempInfo = new TemperatureObjectReporter();
        tempInfo.setTemperatureInF(85);
        assertEquals(85.0, tempInfo.getTemperatureInF());
        assertEquals(29.444444444444443, tempInfo.getTemperatureInC());
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
        obj = (TemperatureObjectReporter) ctx.getBean("tempObjectReporter");
        obj2 = (CelciusReporter) ctx.getBean("classReporter");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
