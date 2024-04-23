package LinkedList;

public class T2_AddAtEnd {
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

        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
        }
        void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){
            int count = 0;

            Node temp = head;
            while (temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LinkList ll1 = new LinkList();
        ll1.insertAtEnd(5);
        ll1.insertAtEnd(3);
        ll1.insertAtEnd(7);

        System.out.println("Display List");
        ll1.display();
        System.out.println();
        System.out.println("List Size");
        System.out.println(ll1.size());
    }
}
