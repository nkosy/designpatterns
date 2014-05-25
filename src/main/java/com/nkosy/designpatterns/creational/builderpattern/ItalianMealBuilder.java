package com.nkosy.designpatterns.creational.builderpattern;

/**
 *
 * @author nkosy
 */
public class ItalianMealBuilder implements MealBuilder {
    private Meal meal;
    
    private static ItalianMealBuilder italianMealBuilder = null;
    
    public static ItalianMealBuilder getInstance(){
        if (italianMealBuilder == null)
            return  new ItalianMealBuilder();
        else
            return italianMealBuilder;
    }

    public ItalianMealBuilder(Meal meal) {
        meal = new Meal();
    }

    public ItalianMealBuilder() {
      
    }
    

    @Override
    public void buildDrink() {
        meal.setDrink("red wine");
    }

    @Override
    public void buildMainCourse() {
       meal.setMainCourse("pizza");
    }

    @Override
    public void buildSide() {
      meal.setSide("bread");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
