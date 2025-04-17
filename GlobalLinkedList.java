public class GlobalLinkedList {

    class Node{

    Object object;
    Node next;
    public Node(Object object) {
        this.object = object;
        this.next = null;
        }
}

    class Slinkedlist{

    Node head;

    public void Append(Object object)
    {
    Node n  =new Node(object);
    if (head==null)
        head=n;
    else {
        Node temp =head;
        while(temp.next!=null){ temp=temp.next; }
        temp.next=n; }
    } 
}

}
