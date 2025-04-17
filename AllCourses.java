public class AllCourses {
    
    Course courseObject;
    Courses_Single_LL AllCoursesLinkedList = new Courses_Single_LL();

    public AllCourses(){}

            // ========================================================= //

    class Node{   // This is a Single Linked list related only to courses.
        Course course;
        Node next;
        
        Node(Course course){
            this.course = course;
            next = null;
        }
    }
    class Courses_Single_LL{

        Node head;

        public void Append(Course course){

            Node n = new Node(course);

            if(head == null){head = n;}
            else{
                Node temp = head;
                while (temp.next != null) { temp = temp.next; }
                temp.next = n;
            }
        }
    }
        // ========================================================== //

}
