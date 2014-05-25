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
public class Meal {

    private String drink;
    private String mainCourse;
    private String side;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public String getSide() {
        return side;
    }

    public String toString()
    {
        return "drink:" + drink + ",main course:" + mainCourse + ", side" + side;
    }
}
