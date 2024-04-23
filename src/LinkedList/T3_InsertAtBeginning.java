package LinkedList;

public class T3_InsertAtBeginning {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    public static class LinkList{
        Node head = null;
        Node tail = null;

        void insertAtBeg(int data){
            Node temp = new Node(data);
            if (head==null){
                head = temp;
                tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
        }
        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtBeg(5);
        list.insertAtBeg(3);
        list.insertAtBeg(2);
        list.display();
    }
}
