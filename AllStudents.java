public class AllStudents {
    
    Student studentObject;
    Students_Single_LL AllStudentsLinkedList;

    public AllStudents(){
    this.AllStudentsLinkedList = new Students_Single_LL();
    }

            // ========================================================= //

    public class Node{   // This is a Single Linked list related only to students.
        Student student;
        Node next;

        Node(Student student){
            this.student = student;
            this.next = null;
        }
    }
    public class Students_Single_LL{

        private Node head;

        public void Append(Student student){

            Node n = new Node(student);

            if(head == null){head = n;}
            else{
                Node temp = head;
                while (temp.next != null) { temp = temp.next; }
                temp.next = n;
            }
        }

        public void Display(){
            Node temp = head;
            System.out.println("All students' ID:");
            while (temp != null) {
                System.out.print("[");
                System.out.print(temp.student.getID());
                System.out.print("]");
                System.out.print(" -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
        // ========================================================== //

}
