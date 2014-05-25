/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.creational.abstractfactory;

import com.nkosy.designpatterns.creational.factorymethod.Animal;

/**
 *
 * @author nkosy
 */
public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type); 
}
