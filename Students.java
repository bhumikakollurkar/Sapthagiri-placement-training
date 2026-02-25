
package students;
class Students {
    String name;
   
    Students() { name = "Unknown"; }
    
    Students(String n) { name = n; }

    public static void main(String[] args) {
        Students s1 = new Students("Bhumika");      
        Students s2 = new Students("Anu"); 
        System.out.println(s1.name + ", " + s2.name);
    }
}

  