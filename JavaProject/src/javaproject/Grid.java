/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.ArrayList;

/**
 *
 * @author Abdulfatah
 */
public class Grid {
    
    int Num_Cells = 4;
    int Grid_Size_X = 50;
    int Grid_Size_Y = 50;
    ArrayList<Linked> Element = new ArrayList<>();
    
    
    
    public boolean Accept_Unit_Movment (Unit Temp_Unit,  int x ,int y ){

        int tempX = Temp_Unit.Pos.Center_x;
            int     tempY = Temp_Unit.Pos.Center_y;
                
                int tempR = Temp_Unit.Pos.Radius;
        
        
        
           for (Linked linked : Element) {
           if (tempX != linked.Get_Position_Of_Unit(0).Center_x &&tempY != linked.Get_Position_Of_Unit(0).Center_y )
           {
               
        int cx =  linked.Get_Position_Of_Unit(0).Center_x;
        int cy = linked.Get_Position_Of_Unit(0).Center_y;
        int cr = linked.Get_Position_Of_Unit(0).Radius;
//           System.out.println(Element.get(u).Get_Unit(0).Num);
//         System.out.println("u : " +u);
//         System.out.println("i : " +i);
//         System.out.println("cx : " + cx);
//         System.out.println("j : " +j);
//         System.out.println("cy : " + cy);
        int Dis= (int) Math.sqrt((x-cx)*(x-cx)  +  (y-cy)*(y-cy));
        int Dis2 = tempR+cr;
//              System.out.println("dis : " + Dis);
//              System.out.println("dis2 : " + Dis2);
        
        if (Dis<=Dis2) return false; 
      

     
       
       }
         
      }
//         if (i+dx[z]<this.Grid_Size_X &&i+dx[z]>0) i+= dx[z];
//       if (j+dy[z]<this.Grid_Size_Y &&j+dy[z]>0) j+= dy[z];
     
      return true;
    }
    public void Add_unit (Unit temp){
        
if(Element.isEmpty())
{
    Linked ob = new Linked();
    ob.Add_Unit_To_Linked(temp);
    Element.add(ob);
}
else 
    
{
   
    for (Linked l : Element) {
        if (l.Get_Position_Of_Unit(0).Center_x == temp.Pos.Center_x && l.Get_Position_Of_Unit(0).Center_y == temp.Pos.Center_y){
       
       l.Add_Unit_To_Linked(temp);
        
       return;}
        }
        
      Linked ob = new Linked();
    ob.Add_Unit_To_Linked(temp);
    Element.add(ob);
    
    
}
      
       
    }
    public void print (){
       
        for (Linked a : Element) {
             
           a.print();
            System.out.println();
        }
       
        
    }
    
    public ArrayList<Unit> Get_All_Unit_In_Rang(Unit Temp_Unit){
        
        int x = Temp_Unit.Pos.Center_x;
        int y = Temp_Unit.Pos.Center_y;
        int r = Temp_Unit.Pos.Radius;
          ArrayList <Unit> In_Range = new ArrayList<>() ;
                
        
        for (Linked linked : Element) {
              if (x != linked.Get_Position_Of_Unit(0).Center_x &&y!= linked.Get_Position_Of_Unit(0).Center_y )
           {
            
            
//            if (((linked.Get_Unit(0).Pos.Center_x-x)+(linked.Get_Unit(0).Pos.Center_y-y)) == (r*r)){
//                
//            }

int Dis= (int) Math.sqrt((x-linked.Get_Position_Of_Unit(0).Center_x)*(x-linked.Get_Position_Of_Unit(0).Center_x)  +  (y-linked.Get_Position_Of_Unit(0).Center_y)*(y-linked.Get_Position_Of_Unit(0).Center_y));
        int Dis2 = Temp_Unit.Unit_Range+linked.Get_Position_Of_Unit(0).Radius;
//              System.out.println("dis : " + Dis);
//              System.out.println("dis2 : " + Dis2);
        
        if (Dis<=Dis2)
In_Range.add(linked.Get_Unit(0));
            
        }
        
    
        }
        return In_Range;
    }
    
    
    
}
