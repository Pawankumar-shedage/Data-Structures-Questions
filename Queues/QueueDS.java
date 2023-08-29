package Queues;

public class QueueDS {
	
	//Imolementing queue with  array.
	static class Queue{
		static int size;
		static int rear = -1;  	//front of queue is fixed at arr[0].
		static int arr[];
		
		Queue(int n)
		{
			this.size = n;
			arr = new int[n];
		}
		
		//empty?
		public static boolean isEmpty()
		{
			//short-hand
			return rear == -1;
		}
		
		//add  (Enqueue)
		public static void add(int data)
		{
			//check if queue is full
			if(rear == size-1)
			{
				System.out.println("Queue is full");
				return;
			}
			
			rear++;
			arr[rear] = data;
		}
		
		//delete (Dequeue)
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Queue is already empty");
				return -1;
			}
			
//			now elements are removed from front of the queue.
			int front = arr[0];
			//front always stays at 0th index, now we have to push all the elements to the left <- by one positon
			for(int i=0;  i<rear; i++)
			{
				arr[i] = arr[i+1]; //assignment is for var at left.
			}
			rear--;
			
			return front;
		}
		
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Empty Queue");
				return -1;
			}
			
			return arr[0];
		}
		
		
		
	
	
	public static void main(String[] args) {
		
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
//		q.remove();
//		q.remove();
		
		while(!q.isEmpty())
		{
			System.out.print(q.peek() + " ");
			q.remove();
		}
		
	}
	
	}
}
