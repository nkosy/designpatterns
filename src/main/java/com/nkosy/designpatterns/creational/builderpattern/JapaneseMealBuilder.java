package com.nkosy.designpatterns.creational.builderpattern;

/**
 *
 * @author nkosy
 */
public class JapaneseMealBuilder implements MealBuilder {
    
    private Meal meal;
    private static JapaneseMealBuilder jMeal = null;

    public JapaneseMealBuilder(Meal meal) {
        this.meal = meal;
    }

    public JapaneseMealBuilder(Builder builder) {
        this.meal = builder.meal;
    }
    
    public static class Builder{
        private Meal meal;
        
        public Builder(Meal meal){
            this.meal = meal;
        }
        
        public JapaneseMealBuilder build(){
            return new JapaneseMealBuilder(this);
        }   
    }
    
    @Override
    public void buildMeal() {
        meal = new Meal.Builder("red wine")
                .mainCourse("pizza")
                .side("chips")
                .build();
    }

    @Override
    public Meal getMeal() {
       return meal;
    }
}
