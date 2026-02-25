
package methodoverloading;
        class Calculator {
    void add(int a, int b) { System.out.println("Sum: " + (a + b)); }
    void add(int a, int b, int c) { System.out.println("Sum: " + (a + b + c)); }
    void add(double a, double b) { System.out.println("Sum: " + (a + b));
    }
    
}
