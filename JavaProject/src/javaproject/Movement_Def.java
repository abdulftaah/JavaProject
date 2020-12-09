/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.lang.Math;

/**
 *
 * @author Abdulfatah
 */
public class Movement_Def extends Movement{

    
    public void Move_Unit(Unit a,Unit base) {
     int x  = base.Pos.Center_x+(2*base.Pos.Radius);
     int y =  base.Pos.Center_y+(2*base.Pos.Radius);
     int r = base.Pos.Radius;
//           int dx[] = {1,-1,1,-1};
//       int dy[] = {1,-1,-1,1};
        
     int xu = a.Pos.Center_x;
     int yu = a.Pos.Center_y;
     int ru = a.Pos.Radius;
     int zx = -1;
     
     int dx[]={-1,0,0,1};
     int dy[]={0,1,-1,0};
     boolean temp=false;
     int z=1;
     int Tx = -1,Ty=-1;
     boolean Accept = false;
    while (true) {
        System.out.println(z);
        Accept = false;
        //عبد عدل الثلاثسن حط بدالها السبيد 
        Tx = a.Pos.Center_x;
        Ty = a.Pos.Center_y;
        for (int i = 0; i < 30; i++) {
        
          //  if (a.Pos.Center_x<base.Pos.Center_x&&)
            
        
         if(a.Pos.Center_x==base.Unit_Gride.Grid_Size_X)
         {    z=2; }
         if(a.Pos.Center_y==base.Unit_Gride.Grid_Size_Y) { z=0 ; }
         if(a.Pos.Center_x==(base.Pos.Center_x%a.Pos.Center_x)&&a.Pos.Center_y==(base.Pos.Center_y%a.Pos.Center_y)){
             if(!temp) {
                 temp=true;
                 z=1;  }
             else {
                 temp=false;
                 z=3; } } 
         Tx +=dx[z]; 
         Ty +=dy[z];
         if(a.Unit_Gride.Accept_Unit_Movment(a, Tx,Ty)){
         Accept = true; }
         else {Accept = false ; break;}
         
        }
//        
//int angle = 200;
//        for (int w = 0 ;w<30;w++){
//zx = ((x-4*r)+ (int)(java.lang.Math.cos(angle+10)*r))-ru;
//zy = ((y-4*r) + (int)(java.lang.Math.sin(angle+10)*r))-ru;
//angle++;
//         System.out.println("x"+zx);
//          System.out.println("y"+zy);
//         System.out.println("____________________________");
    
    
if (Accept==true){
    a.Pos.Center_x = Tx;
 a.Pos.Center_y = Ty;}

else {
    if (z==0)z=3;
    else if (z==1) z=2;
    else if (z==2) z=1;
    else z=0;
}

    } 
   }
 

    

    
}
