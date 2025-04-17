public class Student {

    private int id;
    private GlobalLinkedList studentLinkedList; // To add courses' objects.
    static  int StudentsCounter = 0;

    public Student(int id){ 
        this.id = id;
        StudentsCounter++;
    }

    public int getID(){
        return id;
    }

    
}