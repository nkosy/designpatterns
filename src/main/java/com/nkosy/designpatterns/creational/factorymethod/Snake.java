/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.creational.factorymethod;

/**
 *
 * @author nkosy
 */
public class Snake extends Animal{
    @Override
    public String makeSound(){
        return "Hiss";
    }  
}
