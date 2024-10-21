import java.util.Scanner;
public class days50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        String grade;

        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
