/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.creational.builderpattern.test;

import com.nkosy.designpatterns.Config.AppConfig;
import com.nkosy.designpatterns.creational.builderpattern.ItalianMealBuilder;
import com.nkosy.designpatterns.creational.builderpattern.JapaneseMealBuilder;
import com.nkosy.designpatterns.creational.builderpattern.Meal;
import com.nkosy.designpatterns.creational.builderpattern.MealBuilder;
import com.nkosy.designpatterns.creational.builderpattern.MealDirector;
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
public class BuilderPatternTest {
    private Meal obj;
    
    public BuilderPatternTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void addMeal() {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        Meal meal1= mealDirector.getMeal();
        //Assert.assertNotNull(meal1.toString());
        
//        mealBuilder = JapaneseMealBuilder.getInstance();
//        mealDirector = new MealDirector(mealBuilder);
//        mealDirector.constructMeal();
//        Meal meal2 = mealDirector.getMeal();
//        Assert.assertNotNull(meal2);
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
        obj = (Meal) ctx.getBean("builderPattern");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
