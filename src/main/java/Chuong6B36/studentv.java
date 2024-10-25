
package Chuong6B36;


public class studentv extends humanv{

    public void active() {
        this.eat();
        System.out.println("Chuong6B36.studentv.behavior()");
    }
 
   
    public static void main(String[] args) {
          studentv Tom =  new studentv();
          Tom.active();
        
    }
}
