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
public class DoD_Game_Manger implements Unit_Destroy_Observer {
    
    Grid grid ;
    Unit Base ;
    Unit a;
    Unit b ;
      Team Teams[];
      Game_State state;
      
      
    //هون عرفت انو هي الكلاس سنغل تون وهاد النمط ثابت لكلشي سنغل تون 
     private static DoD_Game_Manger G = null;
     //DoD_Game_Manger(){}
     public DoD_Game_Manger Get_Game_Manger(){
         if(G==null) {
             G =new DoD_Game_Manger();
          
    
     
  Teams = new Team[2];
  Teams[0] = new Team_Defender();
  Teams[1] = new Team_Attcker();
 
  
  
        
        
        
        grid = new Grid();
        Base = new Unit(45, 45, -1, 5, grid);
        a = new Unit(19, 23, 1, 2, grid,Base,10);
//        b = new Unit(8, 8, 2, 3, grid,Base,10);
//       Unit ola = new Unit(4, 4, 3, 1, grid, Base, 0);
      
        
        a.Unit_Gride.Add_unit(a);
//        b.Unit_Gride.Add_unit(b);
//        ola.Unit_Gride.Add_unit(ola);
        
        a.Unit_Movement.Move_Unit(a, Base);
        
//        ola.Unit_Movement.Move_Unit(ola, Base);
     //   System.out.println("x " + ola.Pos.Center_x);
//       ArrayList<Unit> Temp_Arry ;
//        Temp_Arry = a.Unit_Gride.Get_All_Unit_In_Rang(a);
//        for (Unit unit : Temp_Arry) {
//            System.out.println("num"+unit.Num);
//            
//        }
        
         // System.out.println("x " + a.Pos.Center_x);
           
             
             
         }
         return G;
     }
     
     
  
    public void Create_New_Player_Gui(int Team_id) {
        Player temp  = new Player_GUI();
        temp.Team_Id = Team_id;
        temp.Coins = 3000;
        Teams[Team_id].Team_Player.add(temp);
        
        
    }
    public void By_Unit(Player temp,int x,int y,Type_Unit type){
        
        
        
    }

    @Override
    public void On_Unit_Destroy(Unit Destroyed_Unit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    


    
    
    
    
    
    
  
    
    
    
    
   
}
