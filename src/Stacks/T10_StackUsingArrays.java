package Stacks;

public class T10_StackUsingArrays {
    public static void main(String[] args) {
        class AStack{
            private int[] arr = new int[10];
            int idx=0;

            void push(int x){
                if(idx== arr.length){
                    System.out.println("Error: Stack Overflow");
                    return;
                }
                arr[idx]= x;
                idx++;
            }
            int pop(){
                if (idx==0){
                    System.out.println("Error: Stack Underflow");
                    return -1;
                }
                idx--;
                int top = arr[idx];
                arr[idx]=0;
                return top;
            }
            int peek(){
                if (idx==0){
                    System.out.println("Error: Stack Underflow");
                    return -1;
                }
                return arr[idx-1];
            }
            void display(){
                for(int i=0;i<idx;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            int size(){
                return idx;
            }
            int capacity(){
                return arr.length;
            }
        }
        AStack stack = new AStack();
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
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Current Stack");
        stack.display();
    }

}
