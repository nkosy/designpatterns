/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.creational.builderpattern;

/**
 *
 * @author nkosy
 */
public class JapaneseMealBuilder implements MealBuilder {
    
    private Meal meal;
    private static JapaneseMealBuilder jMeal = null;
    
    public static JapaneseMealBuilder getInstance(){
        if(jMeal == null)
            return new JapaneseMealBuilder();
        else
            return jMeal;
    }
    

    @Override
    public void buildDrink() {
        meal.setDrink("sake");
    }

    @Override
    public void buildMainCourse() {
       meal.setMainCourse("chicken teriyaki");
    }

    @Override
    public void buildSide() {
        meal.setSide("miso soup");
    }

    @Override
    public Meal getMeal() {
       return meal;
    }
    
    
}
