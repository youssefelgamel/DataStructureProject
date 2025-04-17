import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Functions f = new Functions();
        int id;

        boolean on = true;
        while (on) {
            System.out.println("=================");
            System.out.println("Hello and Welcome!");
            System.out.println("=================");
            System.out.println("1.Add student\n2.Add course\n3.DisplayAllStudents\n4.DisplayAllCourses\n5.Quit");
    
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                
                System.out.println("Pls Enter Student's ID:");
                id = input.nextInt();
                f.addStudent(id);

                    break;
                case 2:

                System.out.println("Pls Enter course's ID:");
                id = input.nextInt();
                f.addCourse(id);
                    break;

                case 3:
                f.DisplayStudents();
                break;

                case 4:
                f.DisplayAllCourses();
                break;

                case 5:
                    on = false;
            

                default:
                    break;
            }

            
        }




    }
}
