package com.nkosy.designpatterns.behavioral.chainofresponsibilypattern;

/**
 *
 * @author nkosy
 */
public class MercuryHandler extends PlanetHandler {
    
    private MercuryHandler(Builder builder){
        super();
        successor = builder.successor;
    }
    
    public static class Builder{
        
        private PlanetHandler successor;
        
        public Builder(){
        }
        
        public MercuryHandler build(){
            return new MercuryHandler(this);
        }
    }
    @Override
    public void handlerequest(PlanetEnum request) {
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
}

