/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author Abdulfatah
 */
public class Unit_Property  {
    
  double Value;   
  Unit_Property_Health Health;
  Unit_Property_Speed speed;
  Unit_Property_Armor Armor;
    public Unit_Property() {
    }
    //هدول الكونسكترات لاقدر اوصل للانير كلاس
     public Unit_Property(Unit_Property_Health h) {
         Health = h;
     } 
     public Unit_Property(Unit_Property_Speed s) {
         speed = s;
     }   
    public Unit_Property(Unit_Property_Armor a) {
         Armor = a;
     }
    
    
    public static class Unit_Property_Health extends Unit_Property{
       public Unit_Property_Health(double v){
           
           Value = v;
       }
       public double get_Health() {
            return Value;
        }
       
       
    }
        
         
    public static class Unit_Property_Speed extends Unit_Property{

        public Unit_Property_Speed(double vv) {
            Value = vv;
        }

       public double get_Speed() {
            return Value;
        }
        
      
    }
    public static class Unit_Property_Armor extends Unit_Property{

        public Unit_Property_Armor(double vb) {
            Value = vb;
        }

       public double get_Armor() {
            return Value;
        }
        
    }
    
 
    
}
