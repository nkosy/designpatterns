package com.nkosy.designpatterns.creational.builderpattern;
/**
 *
 * @author nkosy
 */
public class ItalianMealBuilder implements MealBuilder {
    private Meal meal; 
    
    private static ItalianMealBuilder italianMealBuilder = null;
    
    private static ItalianMealBuilder getInstance(){
        if (italianMealBuilder == null)
            return  new ItalianMealBuilder();
        else
            return italianMealBuilder;
    }

    private ItalianMealBuilder(Meal meal) {
        meal = new Meal();
    }

    private ItalianMealBuilder() {
      
    }

    public ItalianMealBuilder(Builder builder) {
        meal = builder.meal;
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
    
    public static class Builder{
        private Meal meal;
        
        public Builder(Meal value)
        {
           meal = value;
        }
        
        public ItalianMealBuilder build(){
            return new ItalianMealBuilder(this);
        }
    }
}
