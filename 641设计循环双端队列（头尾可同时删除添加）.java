class MyCircularDeque {
        private int capacity;
        private int front;
        private int rear;
        private int[] arr; 

    public MyCircularDeque(int k) {
        front = 0;
        rear = 0;
        arr = new int[capacity];
        capacity = k + 1;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        arr[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        front = (front + 1) % capacity;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(rear - 1 + capacity) % capacity];
    }
    
    public boolean isEmpty() {
        return front == rear;
    }
    
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
};
