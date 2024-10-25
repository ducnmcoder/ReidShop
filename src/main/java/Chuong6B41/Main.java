/*
ep kieu trong moi quan he ke thua
*/
package Chuong6B41;


public class Main {
    public static void main(String[] args) {
        animal sim = new cat();// ep kieu upcasting tu con ve cha
    animal tom = new human();
    if( tom instanceof cat){// cai nay dung de kiem tra va  ep kieu downcasting tu cha xuong con 
        cat ca = (cat)tom;

    }
    }
    
}
