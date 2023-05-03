import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        int students, test, snumber, tnumber;
        double score, total, avg;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of students");
        students = keyboard.nextInt();
        System.out.println("Enter number of test per student");
        test = keyboard.nextInt();
        for (snumber = 1; snumber <= students; snumber++){
            total = 0;
            System.out.println("Student number " + snumber);
            System.out.println("---------------------");
            for (tnumber = 1; tnumber <= test; tnumber++){
                System.out.println("Enter score " + tnumber);
                score = keyboard.nextDouble();
                total = score + total;
            }
            avg = (total / test);
            System.out.println("The average for student " + snumber + " is " + avg);
        }
    }
}