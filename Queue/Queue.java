package Queue;

public class Queue {
	
	    private int maxSize;
	    private int[] queueArray;
	    private int front;
	    private int rear;
	    private int currentSize;

	
	    public Queue(int size) {
	        this.maxSize = size;
	        this.queueArray = new int[maxSize];
	        this.front = 0;
	        this.rear = -1;
	        this.currentSize = 0;
	    }

	    
	    public void enqueue(int value) {
	        if (isFull()) {
	            System.out.println("Queue is full. Unable to enqueue " + value);
	            return;
	        }
	        if (rear == maxSize - 1) {
	            rear = -1;
	        }
	        queueArray[++rear] = value;
	        currentSize++;
	    }

	    
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Unable to dequeue.");
	            return -1; 
	        }
	        int frontValue = queueArray[front++];
	        if (front == maxSize) {
	            front = 0;
	        }
	        currentSize--;
	        return frontValue;
	    }

	   
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Unable to peek.");
	            return -1; 
	        }
	        return queueArray[front];
	    }

	
	    public boolean isEmpty() {
	        return (currentSize == 0);
	    }

	    
	    public boolean isFull() {
	        return (currentSize == maxSize);
	    }

	    
	    public int size() {
	        return currentSize;
	    }

	    
	    public static void main(String[] args) {
	        Queue queue = new Queue(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);

	        System.out.println("Front element is: " + queue.peek());

	        while (!queue.isEmpty()) {
	            System.out.println("Dequeued element: " + queue.dequeue());
	        }
	    }
	}



