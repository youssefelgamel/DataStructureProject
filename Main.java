import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Functions f;
        int id;

        boolean on = true;
        while (on) {
            System.out.println("Hello and Welcome!");
            System.out.println("1.Add student\n2.Add course\n3.DisplayAllStudents\n4.Quit");
    
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                
                System.out.println("Pls Enter Student's ID:");
                id = input.nextInt();
                f = new Functions();
                f.addStudent(id);

                    break;
                case 2:

                System.out.println("Pls Enter course's ID:");
                id = input.nextInt();
                f = new Functions();
                f.addCourse(id);
                    break;

                case 3:
                f =  new Functions();
                f.DisplayStudents();
                break;

                case 4:
                    on = false;
            

                default:
                    break;
            }

            
        }




    }
}
