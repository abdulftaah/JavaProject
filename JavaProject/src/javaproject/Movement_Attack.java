/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author Abdulfatah
 */
public class Movement_Attack extends Movement{

    @Override
    public void Move_Unit(Unit Temp_Unit,Unit base) {
         // System.out.println("num" + Temp_Unit.Num);
     // int speed = 30;
      int i = Temp_Unit.Pos.Center_x ,j = Temp_Unit.Pos.Center_y , r = Temp_Unit.Pos.Radius;
        int dx[] = {1,-1,1,-1};
        int dy[] = {1,-1,-1,1};
        int z = -1;
        
        
        //int hhh = 0;
        
        // هدول الايفات وظيقتن يعرف لوين بدو يتحرك يعني بما معناه البيز بالنسبة قله ب اي اتجاه 
        if (Temp_Unit.Pos.Center_x<base.Pos.Center_x&&Temp_Unit.Pos.Center_y<base.Pos.Center_y)    
            z = 0;
        else if (Temp_Unit.Pos.Center_x>base.Pos.Center_x&&Temp_Unit.Pos.Center_y>base.Pos.Center_y)
            z= 1;
        else if (Temp_Unit.Pos.Center_x<base.Pos.Center_x&&Temp_Unit.Pos.Center_y>base.Pos.Center_y)
            z= 2;
        else if (Temp_Unit.Pos.Center_x>base.Pos.Center_x&&Temp_Unit.Pos.Center_y<base.Pos.Center_y)
            z= 3;
        
        
        // خليك عم تمشي طالما ما وصلت ل ابعاد البيز 
       while (i<(base.Pos.Center_x-base.Pos.Radius)&&j<(base.Pos.Center_y-base.Pos.Radius)) {
        
      if( Temp_Unit.Unit_Gride.Accept_Unit_Movment(Temp_Unit, i, j)){
          Temp_Unit.Pos.Center_x = i;
          Temp_Unit.Pos.Center_y = j;
        //  System.out.println("i"+i+"j"+j);
//hhh+=1;
//if(hhh==speed) hhh=0;
       
       }
      else  break;
      
      
         if (i+dx[z]<Temp_Unit.Unit_Gride.Grid_Size_X &&i+dx[z]>0) i+= dx[z];
       if (j+dy[z]<Temp_Unit.Unit_Gride.Grid_Size_Y &&j+dy[z]>0) j+= dy[z];
       
     }
      
      
      
      
    }
    
}
