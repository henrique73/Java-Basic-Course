package Interfaces;

public class App {
    public static void main(String [] args){

        info info1 = new Animal(1);
        info info2 = new Person("Tomas");

        info1.showInfo();
        info2.showInfo();

        
    }
}
