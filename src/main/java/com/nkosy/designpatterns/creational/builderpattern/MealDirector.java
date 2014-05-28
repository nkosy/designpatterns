package com.nkosy.designpatterns.creational.builderpattern;

/**
 *
 * @author nkosy
 */
public class MealDirector {
    
    private MealBuilder mealBuilder = null;
    private static MealDirector mealDirector = null;
    
    public MealDirector(Builder builder){
        this.mealBuilder = builder.mealBuilder;
    }

    public MealDirector() {
      
    }
    
    public static class Builder{
        private MealBuilder mealBuilder = null;
        
        public Builder(MealBuilder mealBuilder){
            this.mealBuilder = mealBuilder; 
        }
        
        public MealDirector build(){
            return new MealDirector(this);
        }
    }
    
    public void constructMeal(){
        mealBuilder.buildMeal();
        
    }
    
    public Meal getMeal(){
        return mealBuilder.getMeal();
    }
    
     public static MealDirector getInstance(){
        if(mealDirector == null)
            return new MealDirector();
        else
            return mealDirector;
    }
}
