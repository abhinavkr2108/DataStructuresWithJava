package LinkedList.PracticeQuestions;


public class T1_NthNodeFromEnd {
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
        Node nthNodeFromEnd(int index){
            Node temp = head;
            int size = size();
            int sIdx = (size-index+1);
            for (int i=0; i<sIdx-1; i++){
                temp = temp.next;
            }
            return temp;
        }
        Node nthNodeFromEndOptimized(int index){
            Node fPoint = head;
            Node sPoint = head;
            for (int i=0; i<index; i++){
                fPoint = fPoint.next;
            }
            while (fPoint!=null){
                fPoint = fPoint.next;
                sPoint = sPoint.next;
            }
            return sPoint;
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.display();
        System.out.println();
        Node cnode = list.nthNodeFromEnd(4);
        System.out.println(cnode.data);
        Node snode = list.nthNodeFromEndOptimized(3);
        System.out.println(snode.data);
    }
}
