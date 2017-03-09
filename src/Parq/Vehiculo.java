/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
import becker.robots.*;*/

package Parq;

import becker.robots.*;

public class Vehiculo {
    private String placa;
    private String color;
    private String marca;
    private Dueño owner;
    private Thing car;
    private City park;
    
    
    
    public Vehiculo(String pl, String col, String mar, Dueño own, City prk){
        placa=pl;
        color=col;
        marca=mar;
        owner=own;
        park=prk;
        
        car=new Thing(park,6,6);
    }
}
