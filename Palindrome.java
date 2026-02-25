
package palindrome;
   public class Palindrome {
    public static void main(String[] args) {
        String original = "ara";
        String reverse = new StringBuilder(original).reverse().toString();

        if (original.equalsIgnoreCase(reverse)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}