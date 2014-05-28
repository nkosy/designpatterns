package com.nkosy.designpatterns.creational.builderpattern;

import java.util.Objects;

/**
 *
 * @author nkosy
 */
public class Meal {

    private String drink;
    private String mainCourse;
    private String side;

    public Meal() {
    }

    public Meal(Builder builder) {
        drink = builder.drink;
        mainCourse = builder.mainCourse;
        side = builder.side;
    }
    
    public static class Builder{
        private String drink;
        private String mainCourse;
        private String side;
        
        public Builder(String value){
            drink = value;
        }
        
        public Builder mainCourse(String value){
            mainCourse = value;
            return this;
        }
        
        public Builder side(String value){
            side = value;
            return this;
        }
        
        public Meal build(){
            return new Meal(this);
        }
    }

    public String getDrink() {
        return drink;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.drink);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Meal other = (Meal) obj;
        if (!Objects.equals(this.drink, other.drink)) {
            return false;
        }
        return true;
    }
}
