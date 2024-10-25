/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong6TK;

import java.util.Objects;

/**
 *
 * @author Nguyen Minh Duc
 */
public class  Creatures {
    protected String name;
    protected int yeardiscovery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYeardiscovery() {
        return yeardiscovery;
    }

    public void setYeardiscovery(int yeardiscovery) {
        this.yeardiscovery = yeardiscovery;
    }
    
    
    
    public void takesun(){
        System.out.println("Lay anh sang mat troi.");
        }
    public void nuture(){
        System.out.println("Cay lay chat dinh duong tu dat de song.");
    }

    @Override
    public boolean equals(Object otherobj) {
     if (this == otherobj){
      return true;
   }
   
   
   if (otherobj == null){
   return false;
   
   }
   
   if(!(this.getClass()==otherobj.getClass()))
   {
   return false;
   }
   
   
    flower other = (flower) otherobj;
     return Objects.equals(this.name,other.name )&& this.yeardiscovery == other.yeardiscovery;
    
    }
     
   
}
