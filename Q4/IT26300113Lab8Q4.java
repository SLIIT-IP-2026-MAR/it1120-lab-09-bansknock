import java.util.Scanner;

public class IT26300113Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentsArray = new int[8]; 
        int count = 0;

        
        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": "); 
            int id = scanner.nextInt();

            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers"); 
            } else {
                studentsArray[count] = id;
                count++;
            }
        }

        // Search logic [cite: 103]
        System.out.print("\nEnter a Student ID to Search: "); 
        int searchId = scanner.nextInt();
        
        boolean found = false;
        for (int id : studentsArray) {
            if (id == searchId) {
                found = true;
                break;
            }
        }

        
        if (found) {
            System.out.println("\nStudent is Available"); 
        } else {
            System.out.println("\nStudent is Not Available"); 
        }

        scanner.close();
    }
}