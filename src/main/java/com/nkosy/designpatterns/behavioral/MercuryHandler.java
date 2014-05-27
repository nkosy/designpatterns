/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nkosy.designpatterns.behavioral;

/**
 *
 * @author nkosy
 */
public class MercuryHandler extends PlanetHandler {

    public void handleRequest(PlanetEnum request) {
        if (request == PlanetEnum.MERCURY) {
            System.out.println("MercuryHandler handles " + request);
            System.out.println("Mercury is hot.\n");
        } else {
            System.out.println("MercuryHandler doesnt handle " + request);
            if (successor != null) {
                successor.handlerequest(request);
            }
        }
    }

    @Override
    public void handlerequest(PlanetEnum request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

