
package m4;
public class M4 {

    public static void main(String[] args) {
       abstract class Shape {
            abstract void area(); 
        }

        class Circle extends Shape {
            void area() { System.out.println("Circle Area: π * r * r"); }
        }

        class Rectangle extends Shape {
            void area() { System.out.println("Rectangle Area: L * W"); }
        }

    }
    
}


interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() { System.out.println("Paid via Credit Card."); }
}

class UPIPayment implements Payment {
    public void pay() { System.out.println("Paid via UPI."); }
}


public class StringDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.reverse();
        System.out.println("Reversed: " + sb); 
    }
}

final class FinalClass { 
    static int count = 0;
    final int ID = 101;  
    
    static void show() { System.out.println("Static Method"); }
    
    @Override
    protected void finalize() { System.out.println("Object Garbage Collected!"); }
}
