/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parq;
import becker.robots.*;
/**
 *
 * @author Estudiante
 */
public class Main {
    
    public static void main(String[] args){
        City bcc=new City(10,10);
        Parqueadero p=new Parqueadero(bcc);
        Dueño hjjh=new Dueño("jon","alvarez",554545);
        Vehiculo c=new Vehiculo("sdf123", "Azul", "Lkkd", hjjh, bcc);
    }
    
}
