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
 abstract class Attack_Resault {
     protected Attack_Resault result;
     protected Attack_Resault(Attack_Resault s){
         this.result = s;
     }
     public abstract void Apply_Attack_Resault_In_Attacker(Unit u);
     public abstract void Apply_Attack_Resault_In_Reciever(Unit j,double damage);
    
}
