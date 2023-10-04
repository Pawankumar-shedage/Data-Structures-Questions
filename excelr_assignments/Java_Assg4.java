package excelr_assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

import java.util.concurrent.locks.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//4)Design a Java program that covers all thread-related topics, demonstrating various multithreading concepts in Java. The program should allow users to perform the following tasks:
//
//
//Create and start multiple threads.
//Synchronize threads to avoid race conditions and ensure data consistency.
//Use wait() and notify() to implement thread communication.
//Use sleep() to pause threads for a specified duration.
//Demonstrate thread interruption and thread termination.
//Use thread pools to manage a group of threads efficiently.
//Implement thread synchronization using locks and conditions.
//Demonstrate deadlock and ways to avoid it.
//Use thread-local variables to handle thread-specific data.
//Implement producer-consumer problem using thread synchronization.
//Use Executors and Callable to perform parallel computation and get results.
//Requirements:
//Implement exception handling to handle possible errors during multithreaded operations.
//Provide a user-friendly console interface for the user to interact with the program.


public class Java_Assg4 {
	
	public static void main(String[] args) {
		
	

		Scanner scanner = new Scanner(System.in);
	    while (true) {
	        System.out.println("\nWelcome to multithreading concepts Select a task to run: \n");
	        System.out.println("1. Create and start multiple threads");
	        System.out.println("2. Synchronize threads to avoid race conditions");
	        System.out.println("3. Use wait() and notify() to implement thread communication");
	        System.out.println("4. Use sleep() to pause threads for a specified duration");
	        System.out.println("5. Demonstrate thread interruption and thread termination");
	        System.out.println("6. Use thread pools to manage a group of threads efficiently");
	        System.out.println("7. Implement thread synchronization using locks and conditions");
	        System.out.println("8. Demonstrate deadlock and ways to avoid it");
	        System.out.println("9. Use thread-local variables to handle thread-specific data");
	        System.out.println("10. Implement producer-consumer problem using thread synchronization");
	        System.out.println("11. Use Executors and Callable to perform parallel computation");
	        System.out.println("12. Exit \n");
	
	
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character
	
	
	        if (choice == 12) {
	            System.out.println("Exiting the program.");
	            break;
	        }
	
	
	        switch (choice) {
	            case 1:
	                ThreadCreationDemo.threadCreation();
	                break;
	            case 2:
	                ThreadSynchronizationDemo.threadSynchronization();
	                break;
	            case 3:
	                ThreadCommunicationDemo.threadCommunication();
	                break;
	            case 4:
	                ThreadSleepDemo.threadSleep();
	                break;
	            case 5:
	                ThreadInterruptionDemo.threadInterruption();
	                break;
	            case 6:
	                ThreadPoolDemo.threadPool();
	                break;
	            case 7:
	                LockConditionDemo.lockCondition();
	                break;
	            case 8:
	                DeadlockDemo.deadlock();
	                break;
	            case 9:
	                ThreadLocalDemo.threadLocal();
	                break;
	            case 10:
	                ProducerConsumerDemo.producerConsumer();
	                break;
	            case 11:
	                ParallelComputationDemo.parallelComputation();
	                break;
	            default:
	                System.out.println("Invalid choice. Please enter a valid option.");
	        }
	    }
	
	
	    scanner.close();
	}
}
	
//Rest of the classes and code for tasks remain the same as in the previous response.
class ThreadCreationDemo {
 public static void threadCreation() {
     System.out.println("Task a) Create and start multiple threads:");
     Thread thread1 = new MyThread("Thread 1");
     Thread thread2 = new MyThread("Thread 2");


     thread1.start();
     thread2.start();
 }


 static class MyThread extends Thread {
     public MyThread(String name) {
         super(name);
     }


     @Override
     public void run() {
         System.out.println(getName() + " is running.");
     }
 }
}


class ThreadSynchronizationDemo {
 public static void threadSynchronization() {
     System.out.println("\nTask b) Synchronize threads to avoid race conditions and ensure data consistency:");
     SharedCounter counter = new SharedCounter();


     Thread thread1 = new IncrementThread(counter);
     Thread thread2 = new IncrementThread(counter);


     thread1.start();
     thread2.start();
 }


 static class SharedCounter {
     private int count = 0;
     private Object lock = new Object();


     public void increment() {
         synchronized (lock) {
             count++;
             System.out.println(Thread.currentThread().getName() + " - Count: " + count);
         }
     }
 }


 static class IncrementThread extends Thread {
     private SharedCounter counter;


     public IncrementThread(SharedCounter counter) {
         this.counter = counter;
     }


     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             counter.increment();
         }
     }
 }
}


class ThreadCommunicationDemo {
 public static void threadCommunication() {
     System.out.println("\nTask c) Use wait() and notify() to implement thread communication:");
     Message message = new Message();


     Thread senderThread = new Sender(message);
     Thread receiverThread = new Receiver(message);


     senderThread.start();
     receiverThread.start();
 }


 static class Message {
     private String message;
     private boolean messageSet = false;
     private final Object lock = new Object();


     public void setMessage(String message) {
         synchronized (lock) {
             while (messageSet) {
                 try {
                     lock.wait();
                 } catch (InterruptedException e) {
                     Thread.currentThread().interrupt();
                 }
             }
             this.message = message;
             messageSet = true;
             lock.notify();
         }
     }


     public String getMessage() {
         synchronized (lock) {
             while (!messageSet) {
                 try {
                     lock.wait();
                 } catch (InterruptedException e) {
                     Thread.currentThread().interrupt();
                 }
             }
             messageSet = false;
             lock.notify();
             return message;
         }
     }
 }


 static class Sender extends Thread {
     private Message message;


     public Sender(Message message) {
         this.message = message;
     }


     @Override
     public void run() {
         String[] messages = {"Hello", "How are you?", "Bye"};


         for (String msg : messages) {
             message.setMessage(msg);
             System.out.println("Sent: " + msg);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
     }
 }


 static class Receiver extends Thread {
     private Message message;


     public Receiver(Message message) {
         this.message = message;
     }


     @Override
     public void run() {
         for (int i = 0; i < 3; i++) {
             String receivedMessage = message.getMessage();
             System.out.println("Received: " + receivedMessage);
         }
     }
 }
}


class ThreadSleepDemo {
 public static void threadSleep() {
     System.out.println("\nTask d) Use sleep() to pause threads for a specified duration:");
     Thread thread1 = new SleepThread("Thread 1");
     Thread thread2 = new SleepThread("Thread 2");


     thread1.start();
     thread2.start();
 }


 static class SleepThread extends Thread {
     public SleepThread(String name) {
         super(name);
     }


     @Override
     public void run() {
         for (int i = 1; i <= 5; i++) {
             System.out.println(getName() + ": Count " + i);
             try {
                 Thread.sleep(1000); // Pause the thread for 1 second (1000 milliseconds)
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
                 return; // Terminate the thread if interrupted
             }
         }
     }
 }
}


class ThreadInterruptionDemo {
 public static void threadInterruption() {
     System.out.println("\nTask e) Demonstrate thread interruption and thread termination:");
     Thread interruptedThread = new InterruptedThread();
     Thread terminatedThread = new TerminatedThread();


     interruptedThread.start();
     terminatedThread.start();


     try {
         Thread.sleep(5000); // Wait for a while
     } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
     }


     interruptedThread.interrupt(); // Interrupt the first thread
     terminatedThread.interrupt(); // Interrupt the second thread
 }


 static class InterruptedThread extends Thread {
     @Override
     public void run() {
         while (!Thread.currentThread().isInterrupted()) {
             System.out.println("InterruptedThread is running.");
         }
         System.out.println("InterruptedThread is terminated.");
     }
 }


 static class TerminatedThread extends Thread {
     @Override
     public void run() {
         while (!Thread.currentThread().isInterrupted()) {
             System.out.println("TerminatedThread is running.");
         }
         System.out.println("TerminatedThread is terminated.");
     }
 }
}


class ThreadPoolDemo {
 public static void threadPool() {
     System.out.println("\nTask f) Use thread pools to manage a group of threads efficiently:");
     int numTasks = 5;
     ExecutorService executorService = Executors.newFixedThreadPool(numTasks);


     for (int i = 0; i < numTasks; i++) {
         Runnable task = new ThreadPoolTask(i);
         executorService.submit(task);
     }


     executorService.shutdown();
 }


 static class ThreadPoolTask implements Runnable {
     private int taskId;


     public ThreadPoolTask(int taskId) {
         this.taskId = taskId;
     }


     @Override
     public void run() {
         System.out.println("Task " + taskId + " is running on Thread " + Thread.currentThread().getName());
         try {
             Thread.sleep(1000); // Simulate some work
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
         System.out.println("Task " + taskId + " is completed on Thread " + Thread.currentThread().getName());
     }
 }
}


class LockConditionDemo {
 public static void lockCondition() {
     System.out.println("\nTask g) Implement thread synchronization using locks and conditions:");
     SharedResource resource = new SharedResource();


     Thread producerThread = new Producer(resource);
     Thread consumerThread = new Consumer(resource);


     producerThread.start();
     consumerThread.start();
 }


 static class SharedResource {
     private Lock lock = new ReentrantLock();
     private Condition producerCondition = lock.newCondition();
     private Condition consumerCondition = lock.newCondition();
     private int data;
     private boolean produced = false;


     public void produce(int value) {
         lock.lock();
         try {
             while (produced) {
                 try {
                     producerCondition.await();
                 } catch (InterruptedException e) {
                     Thread.currentThread().interrupt();
                     return;
                 }
             }


             data = value;
             System.out.println("Produced: " + data);
             produced = true;
             consumerCondition.signal();
         } finally {
             lock.unlock();
         }
     }


     public void consume() {
         lock.lock();
         try {
             while (!produced) {
                 try {
                     consumerCondition.await();
                 } catch (InterruptedException e) {
                     Thread.currentThread().interrupt();
                     return;
                 }
             }


             System.out.println("Consumed: " + data);
             produced = false;
             producerCondition.signal();
         } finally {
             lock.unlock();
         }
     }
 }


 static class Producer extends Thread {
     private SharedResource resource;


     public Producer(SharedResource resource) {
         this.resource = resource;
     }


     @Override
     public void run() {
         for (int i = 1; i <= 5; i++) {
             resource.produce(i);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
                 return;
             }
         }
     }
 }


 static class Consumer extends Thread {
     private SharedResource resource;


     public Consumer(SharedResource resource) {
         this.resource = resource;
     }


     @Override
     public void run() {
         for (int i = 1; i <= 5; i++) {
             resource.consume();
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
                 return;
             }
         }
     }
 }
}


class DeadlockDemo {
 public static void deadlock() {
     System.out.println("\nTask h) Demonstrate deadlock and ways to avoid it:");
     ResourceA resourceA = new ResourceA();
     ResourceB resourceB = new ResourceB();


     Thread thread1 = new Thread(() -> {
         resourceA.methodA();
     });


     Thread thread2 = new Thread(() -> {
         resourceB.methodB();
     });


     thread1.start();
     thread2.start();
 }


 static class ResourceA {
     private Lock lockA = new ReentrantLock();


     public void methodA() {
         System.out.println("Thread 1: Trying to acquire lock A...");
         lockA.lock();
         System.out.println("Thread 1: Acquired lock A.");
         try {
             Thread.sleep(1000); // Simulate some work
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }


         System.out.println("Thread 1: Waiting for lock B...");
         ResourceB resourceB = new ResourceB();
         resourceB.methodB();
         lockA.unlock();
         System.out.println("Thread 1: Released lock A.");
     }
 }


 static class ResourceB {
     private Lock lockB = new ReentrantLock();


     public void methodB() {
         System.out.println("Thread 2: Trying to acquire lock B...");
         lockB.lock();
         System.out.println("Thread 2: Acquired lock B.");
         try {
             Thread.sleep(1000); // Simulate some work
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }


         System.out.println("Thread 2: Waiting for lock A...");
         ResourceA resourceA = new ResourceA();
         resourceA.methodA();
         lockB.unlock();
         System.out.println("Thread 2: Released lock B.");
     }
 }
}


class ThreadLocalDemo {
 public static void threadLocal() {
     System.out.println("\nTask i) Use thread-local variables to handle thread-specific data:");
     ThreadLocal<Integer> threadLocalVariable = ThreadLocal.withInitial(() -> 0);


     Thread thread1 = new Thread(() -> {
         threadLocalVariable.set(1);
         System.out.println("Thread 1 - ThreadLocal Variable: " + threadLocalVariable.get());
     });


     Thread thread2 = new Thread(() -> {
         threadLocalVariable.set(2);
         System.out.println("Thread 2 - ThreadLocal Variable: " + threadLocalVariable.get());
     });


     thread1.start();
     thread2.start();
 }
}


class ProducerConsumerDemo {
 public static void producerConsumer() {
     System.out.println("\nTask j) Implement producer-consumer problem using thread synchronization:");
     Queue<Integer> buffer = new LinkedList<>();
     int maxSize = 5; // Maximum buffer size


     Thread producerThread = new Thread(new Producer(buffer, maxSize));
     Thread consumerThread = new Thread(new Consumer(buffer));


     producerThread.start();
     consumerThread.start();
 }


 static class Producer implements Runnable {
     private Queue<Integer> buffer;
     private int maxSize;


     public Producer(Queue<Integer> buffer, int maxSize) {
         this.buffer = buffer;
         this.maxSize = maxSize;
     }


     @Override
     public void run() {
         while (true) {
             synchronized (buffer) {
                 while (buffer.size() == maxSize) {
                     try {
                         System.out.println("Buffer is full. Producer is waiting...");
                         buffer.wait();
                     } catch (InterruptedException e) {
                         Thread.currentThread().interrupt();
                     }
                 }


                 Random random = new Random();
                 int data = random.nextInt(100);
                 buffer.offer(data);
                 System.out.println("Produced: " + data);
                 buffer.notifyAll(); // Notify waiting consumers
             }


             try {
                 Thread.sleep(1000); // Sleep to simulate variable production time
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
     }
 }


 static class Consumer implements Runnable {
     private Queue<Integer> buffer;


     public Consumer(Queue<Integer> buffer) {
         this.buffer = buffer;
     }


     @Override
     public void run() {
         while (true) {
             synchronized (buffer) {
                 while (buffer.isEmpty()) {
                     try {
                         System.out.println("Buffer is empty. Consumer is waiting...");
                         buffer.wait();
                     } catch (InterruptedException e) {
                         Thread.currentThread().interrupt();
                     }
                 }


                 int data = buffer.poll();
                 System.out.println("Consumed: " + data);
                 buffer.notifyAll(); // Notify waiting producers
             }


             try {
                 Thread.sleep(1000); // Sleep to simulate variable consumption time
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
     }
 }
}


class ParallelComputationDemo {
 public static void parallelComputation() {
     System.out.println("\nTask k) Use Executors and Callable to perform parallel computation and get results:");
     int numTasks = 5;


     ExecutorService executorService = Executors.newFixedThreadPool(numTasks);


     List<Future<Integer>> futures = new ArrayList<>();


     for (int i = 0; i < numTasks; i++) {
         Callable<Integer> task = new MyTask(i);
         Future<Integer> future = executorService.submit(task);
         futures.add(future);
     }


     for (Future<Integer> future : futures) {
         try {
             int result = future.get();
             System.out.println("Task result: " + result);
         } catch (InterruptedException | ExecutionException e) {
             e.printStackTrace();
         }
     }


     executorService.shutdown();
 }


 static class MyTask implements Callable<Integer> {
     private int taskId;


     public MyTask(int taskId) {
         this.taskId = taskId;
     }


     @Override
     public Integer call() {
         try {
             Thread.sleep(1000); // Simulate some computation
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }


         return taskId * 2; // Return a result
     }
 }
}

