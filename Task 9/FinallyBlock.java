package ExceptionHandling;

public class FinallyBlock {

    public static void main(String[] args) {
        try {
            first();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block in main method");
        }
    }

    public static void first() {
        try {
           middle();
        } catch (Exception e) {
            System.out.println("Caught Exception in first: " + e.getMessage());
        } finally {
            System.out.println("Finally block in first");
        }
    }

    public static void middle() {
        try {
            last();
        } catch (Exception e) {
            System.out.println("Caught Exception in middle: " + e.getMessage());
        } finally {
            System.out.println("Finally block in middle");
        }
    }

    public static void last() {
        
        int result = 10 / 0; 
        System.out.println("Result: " + result);
    }
}
