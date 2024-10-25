/*
thiet lap equals
thiet lap to string
*/
package Chuong6B39B40;

import java.util.Objects;


public class MACHINE {
    protected int year;
    protected int version;
    protected String name;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void move(){
        System.out.println("Xe chay tiet kiem dien");
        
        
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
   
   
   MACHINE other = (MACHINE)otherobj;
   return Objects.equals(this.name,other.name )&& this.year == other.year
           && this.version == other.version;
    }

    @Override
    public String toString() {
        return this.getClass().getName()+"{" + "year=" + year + ", version=" + version + ", name=" + name + '}';
    }
    
    
    
}
