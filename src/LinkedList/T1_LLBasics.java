package LinkedList;

public class T1_LLBasics {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static void displayList(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void displayListUsingRecursion(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");

        displayListUsingRecursion(head.next);
    }
    public static void displayReverseList(Node head){
        if(head==null){
            return;
        }
        displayReverseList(head.next);
        System.out.print(head.data + " ");
    }
    public static int listLength(Node head){
        int count =0;
        while (head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
    public static int listLengthUsingRecursion(Node head){
        if (head==null){
            return 0;
        }
        int count = listLengthUsingRecursion(head.next)+1;
        return count;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;

        //Printing the list
        System.out.println(n1.data);
        System.out.println(n1.next.data);
        System.out.println(n1.next.next.data);

        //Printing using for-loop
        Node temp = n1;
        for (int i = 0; i < 3; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        // Printing Linked List using a function
        displayList(n1);
        System.out.println();

        displayListUsingRecursion(n1);
        System.out.println();
        displayReverseList(n1);
        System.out.println();
        int length = listLength(n1);
        System.out.println("Linked List Length: " + length);
        int length2 = listLengthUsingRecursion(n1);
        System.out.println("Linked List Length: " + length2);

    }
}
