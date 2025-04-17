public class Functions {
    
    Student s;
    Course c;

    AllStudents AS = new AllStudents();
    AllCourses AC = new AllCourses();

    public void addStudent(int id){
        s = new Student(id);
        AS.AllStudentsLinkedList.Append(s);
    }

    public void addCourse(int id){
        c = new Course(id);
        AC.AllCoursesLinkedList.Append(c);
    }

    public void DisplayStudents(){
        AS.AllStudentsLinkedList.Display();
    }
}
