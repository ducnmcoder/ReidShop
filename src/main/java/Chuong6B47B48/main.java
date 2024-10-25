
package Chuong6B47B48;

import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        ArrayList<Animal> rnimal = new ArrayList<>();// Kieu tao mang thu 1
        rnimal.add(new Animal());
         rnimal.add(new Animal());
          rnimal.add(new Animal());
           rnimal.add(new Animal());
           
           Animal a = rnimal.get(2);// ep kieu cho mang animal tai vi tri 2
           rnimal.set(1,new Animal() );
           
           Animal [] cat = new Animal[5];// mot kieu tao mang moi
           System.out.println(cat.length);
        
           
           ArrayList<Integer> num = new ArrayList<>();//Voi
           num.add(123);
           num.add(189);
           Integer e = null  ;// ghi nay de su dung nhieu funtion cho e hon.
           e.floatValue();// => tuong tu.
           
           
           //integer.(ten phuong thuc) dung de su dung nhieu muc dich hon.
    }
    
}
