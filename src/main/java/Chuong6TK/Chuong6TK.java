// nho ghi ro chuc nang cua tung phan. (can lam them nhieu bai nang cao phan nay)
package Chuong6TK;

import java.util.ArrayList;


public class Chuong6TK {
    public static void main(String[] args) {
        /*Creatures hoanhai = new flower();
        Creatures Doom = new Doommusroom();
        flower hoahue = (flower) new Creatures();
        Doommusroom namua = (Doommusroom) new Creatures();
        Creatures hoahung = new Creatures();
        hoahung = hoanhai;
        Doom = hoanhai;
        Creatures hoahong = new flower();
        Creatures namlun = new Doommusroom();
        if( namlun instanceof flower){
        flower hoalan = (flower) hoahong;*/
        
        Creatures hoa = new Creatures();
        hoa.setName("hue");
        hoa.setYeardiscovery(1000);
        
        Creatures nam = new Creatures();
        nam.setName("nammua");
        nam.setYeardiscovery(2000);
        
            System.out.println(nam.equals(nam));
         
            Creatures tulip = new flower();
            Creatures namhuong = new Doommusroom();
            if(tulip instanceof Doommusroom){
                 Doommusroom namla = (Doommusroom)tulip;
                 
                ArrayList<Creatures> moclan = new ArrayList<>();
                moclan.add(new Creatures());
                moclan.add(new Creatures());
                moclan.add(new Creatures());
                moclan.add(new Creatures());
                moclan.add(new Creatures());// C1: kieu tao mang 
                
                Creatures [] thaomai = new Creatures[5];// C2: kieu tao mang
                
                Creatures a = moclan.get(1);// C1:ep ten tai vi tri 1
                moclan.set (1,new Creatures());//C2: ep ten tai vi tri 1
                
                ArrayList<Integer> num = new ArrayList<>();
                num.add(234);
                num.add(456);
                
                Integer df = null;
                
            }
               
                            
            
        
        
    }
}
