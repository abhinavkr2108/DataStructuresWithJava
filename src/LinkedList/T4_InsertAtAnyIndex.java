package LinkedList;

public class T4_InsertAtAnyIndex {
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
        int size=0;
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
            size++;
        }
        void insertAt(int index, int data){
            Node t = new Node(data);
            Node temp = head;
            for(int i=0; i<=index-2; i++){
                temp=temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
        int getAt(int index){
            Node temp = head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int index){

            Node temp = head;
            if (index==0){
                head=head.next;
            }

            for(int i=0; i<index-1; i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            if (index==size-1){
                tail=temp;
            }
            size--;
        }
    }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtEnd(5);
        list.insertAtEnd(7);
        list.insertAtEnd(9);
        list.insertAtEnd(3);
        list.display();
        list.insertAt(2,4);
        list.display();
        int ele = list.getAt(0);
        System.out.println(ele);
        list.deleteAt(0);
        list.display();
        System.out.println(list.tail.data);

    }
}
