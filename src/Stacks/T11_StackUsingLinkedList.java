package Stacks;

public class T11_StackUsingLinkedList {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    private static class LStack{
        Node head=null;
        int size=0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head=temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Error: Stack Underflow");
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }
        int peek(){
            if(head==null){
                System.out.println("Error: Stack Underflow");
                return -1;
            }
            return head.data;
        }
        void displayRev(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+"-> ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayRec(Node h){
            if(h==null){
                return;
            }
            displayRec(h.next);
            System.out.print(h.data + " ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        LStack stack = new LStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Current Stack");
        stack.display();
        stack.push(4);
        stack.display();
        System.out.println("Topmost Element");
        System.out.println(stack.peek());
        System.out.println("Removing Topmost Element");
        System.out.println(stack.pop());
        System.out.println("Current Stack");
        stack.display();

        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
    }
}
