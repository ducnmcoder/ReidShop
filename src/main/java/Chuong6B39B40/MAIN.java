
package Chuong6B39B40;


public class MAIN {
    public static void main(String[] args) {
        
        MACHINE plane = new MACHINE();
        plane.setName("boing787");
        plane.setVersion(101);
        plane.setYear(2002);
        
        MACHINE car =new MACHINE();
        car.setName("mecedes");
        car.setVersion(101);
        
        System.out.println(plane.equals(plane));
        System.out.println(plane);
    }   
   
}
