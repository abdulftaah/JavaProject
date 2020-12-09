/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.ArrayList;
import javaproject.Unit;

/**
 *
 * @author ola
 */
public class Highest_Damage_Attack implements Attack_Strategy {

    //Create SingleTone Highest Damage Attack strategy
    
    private static Highest_Damage_Attack single = null;

    Highest_Damage_Attack() {
    }

    ;
    public static Highest_Damage_Attack Get_Heighst_Damage_Attack() {

        if (Highest_Damage_Attack.single == null) {
            Highest_Damage_Attack.single = new Highest_Damage_Attack();

        }
        return Highest_Damage_Attack.single;
    }

    //return prioritize unit
    @Override
    public Unit Best_Unit_To_Attack(ArrayList<Unit> unit) {
        double Highest_Damage = 0;
     int i = 0 ,g = 0;
        for (Unit element : unit) {
            if (element.getDamage() > Highest_Damage) {
                Highest_Damage = element.getDamage();
              g=i; 
                
            }
            i++;
        }
        return unit.get(g);
    }

}
