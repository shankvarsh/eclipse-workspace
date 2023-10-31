package sem2;
import java.util.Scanner;

public class Stack {
    int size;
    int top=-1;
    int[] arr ;
    Stack(int s){
        size=s;
        arr=new int[size];
    }

    boolean isEmpty(){
        if(this.top==-1)
            return true;
        else
            return false;
    }

    boolean isFull(){
        if(this.top>=this.size){
            return true;
        }
        else 
            return false;
    }

    void push(int k){
        ++top;
        if(isFull()){
            System.out.println("Stack overflow!! Element cannot be inerted into the stock.");
            top--;
            return;
        }
        else{
            arr[top]=k;
            System.out.println("The element'" +k+"' is inserted into the Stack");
        }
    }

    void pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty!!");
        }else{
            System.out.println("Poped element is'" +arr[top]+"' from the Stack");
            --top;
        }
    }
    void displayStack(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }else{
            System.out.println("elements in the stack: ");
            for(int i=top;i>=0;i--){
                System.out.println("\t"+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of stack: ");
        int S=sc.nextInt(),choice;
        Stack s=new Stack(S);
        do{
            System.out.println("Enter Operarions To Be Performed --- \n\t 1 Push \n\t 2 pop \n\t 3 Display \n\t 4 Exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                        System.out.println("Enter the integer to be inserted into the stack: ");
                        s.push(sc.nextInt());
                        System.out.println("------------------------------------");
                        break;
                case 2:
                            s.pop();
                            System.out.println("-------------------------------------");
                        break;
                case 3: 
                       s.displayStack();
                        break;
                case 4:
                        System.exit(0);
            }
            
        }while(true);
        
    }

}


