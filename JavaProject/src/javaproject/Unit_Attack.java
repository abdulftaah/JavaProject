/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import javaproject.Unit;

/**
 *
 * @author ola
 */
public abstract class Unit_Attack {
    //  هاد الديكريتور البطيخ
   protected Unit_Attack attack; 
   private Attack_Resault resault;
   protected Unit_Attack(Unit_Attack t){
       this.attack = t;
       resault = new Health_Unit_Attack_Resault(resault);
   }
   public Attack_Resault Get_Resault(){
       return this.resault;
   }
   public abstract Attack_Resault Perform_Attack(Unit unit);
}
