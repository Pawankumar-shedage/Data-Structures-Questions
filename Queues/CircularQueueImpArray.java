package Queues;

public class CircularQueueImpArray {
	

	static class Queue{
		static int size;
		static int rear = -1;  	//front of queue is fixed at arr[0].
		static int arr[];
		static int front = -1;
		
		Queue(int n)
		{
			this.size = n;
			arr = new int[n];
		}
		
		public static boolean isEmpty()
		{
			return rear == -1 && front == -1;
		}
		
		
		public static boolean isFull() {
			return (rear + 1)%size == front;
		}
		
		public static void add(int data)
		{
			
			if(isFull()) 
			{
				System.out.println("Queue is full");
				return;
			}
			//1st element , def pos of front
			if(front == -1) {
				front = 0;
			}
			rear = (rear+1)%size;
			arr[rear] = data;
		}
		

		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Queue is already empty");
				return -1;
			}
			

			int res = arr[front];
			//single element condition
			if(rear == front)
			{
				rear = front = -1;
			}else {
				front = (front + 1)%size;  //for normal inc_+1 and cond will work when front is at last index of arr[].
			}
			
			
			return res;
		}
		
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			
			return arr[front];
		}
		
}
		
		public static void main(String[] args) {
			
			Queue q = new Queue(5);
			
			q.add(3);
			q.add(4);
			q.add(5);
			q.add(6); 
			q.add(7);
			System.out.println(q.remove());
			q.add(8);
			System.out.println(q.remove());
			q.add(9);
			
			while(!q.isEmpty())
			{
				System.out.print(q.peek() + " ");
				q.remove();
			}
		}
		
		
}
