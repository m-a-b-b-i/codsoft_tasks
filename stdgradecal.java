import java.util.Scanner;

public class stdgradecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Corrected "mew" to "new"
        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of subjects:");
        int ns = sc.nextInt();
        int total = 0;
        
        for (int i = 0; i < ns; i++) {
            System.out.println("Enter marks obtained in subject " + (i + 1) + ":"); // Improved prompt message
            int marks = sc.nextInt();
            total += marks;
        }
        
        double averP = (double) total / ns;
        char grade; // Corrected variable name to follow Java naming conventions
        
        if (averP >= 90) {
            grade = 'O'; // Uppercase 'O' is typically used for 'Outstanding'
        } else if (averP >= 80) { // Changed from `else` to `else if`
            grade = 'A';
        } else if (averP >= 70) {
            grade = 'B';
        } else if (averP >= 60) {
            grade = 'C';
        } else if (averP >= 50) {
            grade = 'D';
        } else if (averP >= 40) {
            grade = 'E';
        } else {
            grade = 'F'; // Changed from 'Fail' to 'F' to match char type
        }
        
        System.out.println("Total marks scored: " + total);
        System.out.println("Average percentage gained: " + averP + "%");
        System.out.println("Grade: " + grade); // Corrected typo in "println"
        
        sc.close(); // Added to close the Scanner object
    }
}
