public class IT26300113Lab9Q3 {  
 
    public static int add(int a, int b) {
        return a + b;
    }
  
    public static int multiply(int a, int b) {
        return a * b;
    }
 
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        
        int expr1 = square(add(multiply(3, 4), multiply(5, 7)));
        System.out.println("Result of (3 * 4 + 5 * 7)² = " + expr1);
   
        int expr2 = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("Result of (4 + 7)² + (8 + 3)² = " + expr2);
    }
}
