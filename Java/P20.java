package in.pkgclass.assignment;
import java.util.*;


public class InClassAssignment {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("The initial size of the queue is " + queue.getSize());
        
        for(int i = 1; i <= 20; i++){
            queue.enqueue(i);
        }
        
        System.out.println("The size of the queue after adding 20 elements is: " + queue.getSize());
        
        queue.dequeue();
        queue.enqueue(100);
        
        System.out.println("The elements in the queue are: ");
        while(!queue.empty()){
            System.out.print(queue.dequeue() + " ");
        }
        
        System.out.println("\nThe size of the queue after the dequeue operation is: " + queue.getSize());
        
    }
}


class Queue{
    int[] elements;
    int size;
    int front;
    int back;
    
    Queue(){
        elements = new int[8];
    }


    int getIncrease(int i){
        i+= 1;
        if(i == elements.length){
            i = 0;
        }
        
        return i;
    }
    
    void enqueue(int v){
        if(size == elements.length){
            int[] temp = new int[elements.length*2];
            
            for(int i = 0; i < size; i++){
                temp[i] = elements[front];
                front = getIncrease(front);
            }
            
            front = 0;
            back = size;
            elements = temp;
            enqueue(v);
        } else{
            elements[back] = v;
            back = getIncrease(back);
            size++;
        }
    }
    
    int dequeue(){
        if(!empty()){
            int temp = elements[front];
            elements[front] = 0;
            size--;
            front = getIncrease(front);
            return temp;
        }
        else{
            System.out.println("No elements in queue. Returning 0.");
            return 0;
        }
    }
    
    boolean empty(){
        return (size == 0);
    }
    
    int getSize(){
        return size;
    }
}


