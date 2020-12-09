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
public class Health_Unit_Attack_Resault extends Attack_Resault {

    public Health_Unit_Attack_Resault(Attack_Resault s) {
        super(s);
    }
    @Override
    public void Apply_Attack_Resault_In_Attacker(Unit u) {
       // System.out.println("bfbfbfb");
        
    }

    @Override
    //property[2] هي  Armor 
    public void Apply_Attack_Resault_In_Reciever(Unit j,double d) {
         double damage = d -((j.property[2].Value)*d); 
          double a =j.Target.property[0].Value -= damage;
          if(a<=0){
              j.On_Unit_Destroy(j.Target);
          }
            
        }
    
}
