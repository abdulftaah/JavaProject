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
public interface Attack_Strategy {
    Unit Best_Unit_To_Attack(ArrayList<Unit> unit);
    
}
