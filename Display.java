
package display;

  class Display {
  
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(int a, int b) {
        System.out.println("Sum of two ints: " + (a + b));
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        Display obj = new Display();
        
        obj.show(10);          
        obj.show(10, 20);     
        obj.show("Hello");     
    }
}
   