
package Chuong6B36;


public class animalv {
 protected String name;
 protected int year;
 protected String address;
 protected String kindofanimal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getKindofanimal() {
        return kindofanimal;
    }

    public void setKindofanimal(String kindofanimal) {
        this.kindofanimal = kindofanimal;
    }
 
 protected void eat(){
    System.out.println("An nhu bao con vat.");
    
}
public void act(){
    System.out.println("Ngu hang ngay 8 tieng");
}   
}
