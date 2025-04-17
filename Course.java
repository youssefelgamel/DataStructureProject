public class Course {
    
    private int id;
    private GlobalLinkedList  courseLinkedList; // To add students' objects.
    static int CoursesCounter = 0;

    public Course(int id){ 
        this.id = id;
        CoursesCounter++;
    }

    public int getID(){
        return id;
    }



}
