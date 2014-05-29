/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nkosy.designpatterns.behavioral.chainofresponsibilypattern;

/**
 *
 * @author nkosy
 */
public class VenusHandler extends PlanetHandler{

    private VenusHandler(Builder builder) {
        super();
        successor = builder.successor;
    }
    
    public static class Builder{
        
        public PlanetHandler successor;
        
        public Builder(){
        }
        
        public VenusHandler build(){
            return new VenusHandler(this);
        }           
    }
    
    @Override
    public void handlerequest(PlanetEnum request) {
         if (request == PlanetEnum.VENUS){
            System.out.println("VenusHandler handles  " + request);
            System.out.println("Venus is poisonous.\n");
        }
        else{
            System.out.println("VenusHandler does not handle  " + request);
            if(successor != null)
                successor.handlerequest(request);
        }       
    }
}
