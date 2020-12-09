/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.ArrayList;
import java.util.Random;
import javaproject.Unit;

/**
 *
 * @author ola
 */
public class Random_Attack implements Attack_Strategy {
    private static Random_Attack random;
    private Random_Attack(){};
    public static Random_Attack Get_Random(){
        if(Random_Attack.random==null){
                    Random_Attack.random=new Random_Attack();
                }
        return Random_Attack.random;
    }


    
    @Override
    public Unit Best_Unit_To_Attack(ArrayList<Unit> unit) {
          //تحقق من شرط الكان اتاك بليززززز 
        Random u = new Random();
       int temp = u.nextInt(unit.size());
     
       return unit.get(temp);
    }
    
}
