package StackAndQueues;

public class _232_ImplementQueueUsingStacks {
    class MyQueue {
        int[] data = new int[100];
        int front = 0;
        int rear = -1;
        int size = 0;

        public MyQueue() {

        }

        public void push(int x) {
            rear = (rear + 1) % data.length;
            data[rear] = x;
            size++;
        }

        public int pop() {
            int removed = data[front];
            front = (front + 1) % data.length;
            size--;
            return removed;
        }

        public int peek() {
            return data[front];
        }

        public boolean empty() {
            if (size == 0) {
                return true;
            }
            return false;
        }
    }
}
