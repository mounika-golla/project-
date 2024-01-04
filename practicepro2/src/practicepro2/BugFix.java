package practicepro2;

public class BugFix {

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        
        String message = "Hello, World!";

        int count = 4;
        System.out.println("Count: " + count);

        int numerator = 10;
        int denominator = 2; 
        int result = numerator / denominator;

        int[] numbers = {1, 2, 3};
        if (numbers.length > 0) {
            System.out.println("Value at index 2: " + numbers[2]);
        } else {
            System.out.println("Invalid index");
        }
    }
}

