/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.LinkedList;
import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

/**
 *
 * @author Abdulfatah
 */
public class Linked {
    Unit Uint_New ;
    LinkedList<Unit> Unit_Linked = new LinkedList<>();
    
    public void Add_Unit_To_Linked (Unit temp){
            Unit_Linked.add(temp); 
    }
    
   public Position Get_Position_Of_Unit(int i){
       if (Unit_Linked.get(i)!= null){
    Unit t = Unit_Linked.get(i);
       Position temp = t.Pos;
       return temp;}
       else System.out.println(" fun Get_Position_Of_Unit in class Linked Error not found");
   return null;
   }
    
   public boolean Search_By_Position (Position p){
       for (Unit i : Unit_Linked) {
           if (i.Pos.Center_x == p.Center_x && i.Pos.Center_y == p.Center_y) return true;
       }
       return false;           
       
   }
   
   public Unit Get_Unit (int x){
       return Unit_Linked.get(x);
   }
   
   public void print(){
       
       for (Unit u : Unit_Linked) {
           System.out.print(u.Num);
           
       }
   }
}
