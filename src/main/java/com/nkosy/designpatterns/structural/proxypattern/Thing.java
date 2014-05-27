/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.structural.proxypattern;

import java.util.Date;

/**
 *
 * @author nkosy
 */
public abstract class Thing {
    
    public void saysHello() {
        System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
    }
    
}
