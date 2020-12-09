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
public class Lowest_Health_Attack implements Attack_Strategy {
    // singel ton

    private static Lowest_Health_Attack lowest;

    Lowest_Health_Attack() {
    }

    ;
    public static Lowest_Health_Attack Get_Lowest_Health() {
        if (Lowest_Health_Attack.lowest == null) {
            Lowest_Health_Attack.lowest = new Lowest_Health_Attack();
        }
        return Lowest_Health_Attack.lowest;
    }
////////////////////////////////////////////////////////////////////

    @Override
    public Unit Best_Unit_To_Attack(ArrayList<Unit> unit) {
        double Health = unit.get(0).property[0].Value;
        double temp;
        int i = 0;
        int g = 0;

        for (Unit element : unit) {
            /////اختبار شرط الكان اتاك 
            
            temp = element.property[0].Value;
            if (temp <= Health) {
                Health = temp;
                g = i;

            }
            i++;
        }

        return unit.get(g);
    }

}
