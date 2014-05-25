package com.nkosy.designpatterns.creational.builderpattern;

/**
 *
 * @author nkosy
 */
public class MealDirector {
    
    private MealBuilder mealBuilder = null;
    private static MealDirector mealDirector = null;
    
    public static MealDirector getInstance(){
        if(mealDirector == null)
            return new MealDirector();
        else
            return mealDirector;
    }
    
    public MealDirector(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }

    public MealDirector() {
    }
    
    
    public void constructMeal(){
        mealBuilder.buildDrink();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
    }
    
    public Meal getMeal(){
        return mealBuilder.getMeal();
    }
}
