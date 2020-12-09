/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Abdulfatah
 */
public class Unit implements Unit_Destroy_Observer {

    
    int Num;
    Unit Base;
    Type_Unit Type;
    Unit next,prev;
    Type_Unit Can_Attack[];
    Position Pos;
    Unit Target;
    Unit_Property[] property;
    Grid Unit_Gride;
    int g;
    Movement Unit_Movement;
int Unit_Range;
     private double Attack_Damage;
    Attack_Strategy Strategy;
    Unit_Attack Active_Unit_Attack;
     ArrayList <Unit_Destroy_Observer> Unit_Destroy_Observers;
     Unit_Destroy_Observer Destruction_Observer;

    //  هاد بس للبيز
    public Unit(int x,int y,int num,int r,Grid gg) {
        this.Num = num;
      Pos = new Position(x, y);
       Pos.Radius = r;
      Unit_Gride = gg;
           property = new Unit_Property[3];
    }
            
    
    
    
    
    
    public Unit(int x,int y,int num,int r,Grid gg,Unit base,int range) {
        this.Num = num;
      Pos = new Position(x, y);
   // لا تنسى البروبرتي 
   
      Pos.Radius = r;
      Unit_Gride = gg; 
      Unit_Movement = new Movement_Def();
      this.Base = base;
    this.Unit_Range = range;
      
    }
    
     
   //تابع بيساعدني اسند القيم الموجودة باوبجكت لاوبجكت تاني بستخدمو بالاتاك ستراتيجي وهيك و ومالو كامل  
   public Unit clone(Unit temp){
      
        temp.Num = this.Num;
        temp.property = this.property;
        temp.Pos=this.Pos;
        return temp;
    }

      
    public double getDamage() {
        return Attack_Damage;
    }
    public void Set_Damage(double s){
        this.Attack_Damage = s;
    } 

    @Override
    //هاد التابع يلي بدمر فيه اليونت 
    public void On_Unit_Destroy(Unit Destroyed_Unit) {
        //بدي اوبجكت من المنجر لاستدعي التابع الاوبسرفر تبعووابعتلو اليونت قبل ماتنحذف ليعرف اثرها عاللعبة  ة
        DoD_Game_Manger d = new DoD_Game_Manger();
        d.On_Unit_Destroy(Destroyed_Unit);
        Linked s =Destroyed_Unit.Unit_Gride.Element.get(Destroyed_Unit.Num);
        s.Get_Unit(Destroyed_Unit.Num).next=null;
        s.Get_Unit(Destroyed_Unit.Num).prev=null;
        try {
            Destroyed_Unit.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(Unit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Add_Unit_Destroy_Observer(Unit_Destroy_Observer u){
        Unit_Destroy_Observers.add(u);
    }
    
    public void On_Destroy(){
        for(Unit_Destroy_Observer s:Unit_Destroy_Observers){
            s.On_Unit_Destroy(Target);
        }
         
    }
    
   /* public Unit_Attack Attack(){
      ArrayList <Unit> targets = new ArrayList<;
      Attack_Strategy s ;
      Unit temp;
      Unit_Attack a;
      Unit_Destroy_Observer ss;
      while(){
              this.Add_Unit_Destroy_Observer(ss);
              targets= this.Unit_Gride.Get_All_Unit_In_Rang(this);
              s= this.Strategy;
               temp = s.Best_Unit_To_Attack(targets);
      this.Target= temp;
      temp.Target=this;
      a = new Normal_Unit_Attack(this.Active_Unit_Attack);
        
      }
      return a;
    }
    
    public void Attack_Unit(Unit Target,Unit_Attack){}*/
    
    
    //هي الطباعة بدي كملا لازم تطبعلنا كلشي باليونت لانةلما اطبع اوبجكت بيطبعلي عنوان وانا ماهيك بديبدي كل معلوماتو
     public String toString(){
        String s = String.format("%d",this.Num);
        return s;
    }
  
       //هاد الكونستركتر للتيمب يونت يلي مابدي اعطيهم قيم 
    public Unit(){
        
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
}
