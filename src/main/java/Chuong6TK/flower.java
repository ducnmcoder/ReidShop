
package Chuong6TK;


public class flower extends Plant{
    public void quanghop(){
       this.takesun();
       this.setName("hoamatroi");
        System.out.println(getName());
    }

    @Override
    public void nuture() {
        System.out.println("lay anh sang va nang luong tu dat");
    }
    
    public static void main(String[] args) {
        Object hoahue = new flower();
        hoahue.toString();
         flower sunflower = new flower();
        sunflower.quanghop();
        sunflower.nuture();
        
    }
    
  
   
}
