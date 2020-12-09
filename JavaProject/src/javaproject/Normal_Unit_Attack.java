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
public class Normal_Unit_Attack extends Unit_Attack {

    public Normal_Unit_Attack(Unit_Attack t) {
        super(t);
    }

    @Override
    public Attack_Resault Perform_Attack(Unit unit) {
        //هاد الحكي تبع الرينج واختيار اليونت بدو يكون عملية بزريد مستمرة يعني طول ماعندي يونتسى هاجمها وبدا تكون باليونت بتابع الاتاك بس ماعاد زبط معي
      ArrayList <Unit> targets = unit.Unit_Gride.Get_All_Unit_In_Rang(unit);
      Attack_Strategy s= unit.Strategy;
      Unit temp = s.Best_Unit_To_Attack(targets);
      //يعني فعليا من هون بس الريسولت وفوق عم لاقي الهدف هي العملية بدا تكون برا
      unit.Target= temp;
      temp.Target=unit;
      Attack_Resault t = super.Get_Resault();
      t.Apply_Attack_Resault_In_Reciever(unit.Target,unit.getDamage());
      t.Apply_Attack_Resault_In_Attacker(temp);
      return t;
    }
    
}
