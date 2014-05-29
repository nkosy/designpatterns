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
public interface MealBuilder {
    public void buildMeal();
    public Meal getMeal();
}
