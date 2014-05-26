/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.structural.compositepattern;

/**
 *
 * @author nkosy
 */
public class Leaf implements Component {
    
    String name;

    public Leaf(String name) {
        this.name = name;
    }

    public Leaf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sayHello() {
        System.out.println(name + " leaf says hello"); 
    }

    @Override
    public void sayGoodbye() {
        System.out.println(name + " leaf says bye");
    }
}
