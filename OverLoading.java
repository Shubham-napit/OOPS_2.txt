public class OverLoading {
    
        // Overloaded methods
        int add(int a, int b) {
            return a + b;
        }
    
        int add(int a, int b, int c) {
            return a + b + c;
        }
    
        double add(double a, double b) {
            return a + b;
        }
    
        String add(String a, String b) {
            return a + b;
        }
    }
    
    public class main {
        public static void main(String[] args) {
            Overloading calc = new OverLoading();
    
            // Call different overloaded methods
            System.out.println("Sum of two integers: " + calc.add(10, 20));
            System.out.println("Sum of three integers: " + calc.add(10, 20, 30));
            System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));
            System.out.println("Concatenation of two strings: " + calc.add("Hello", " World"));
        }
    }
    
// Prepare an Example to show OverLoading Concept

