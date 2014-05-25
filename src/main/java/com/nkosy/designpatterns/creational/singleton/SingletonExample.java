/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.creational.singleton;

/**
 *
 * @author nkosy
 */
public class SingletonExample {
    private static SingletonExample singletonExample = null;
    
    public SingletonExample(){
    }
    
    public static SingletonExample getInstance(){
        if(singletonExample == null){
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
    
    public String sayHello(){
        return "Hello";
    }
}
