package excelr_assignments;

/* 
1)Write a program to cover all Java OOPS concepts. Topics need to cover: 

Class and Object
Class constructor
Polymorphism
Method overloading
Method overriding
Inheritance
Interface
Abstract class
Abstraction and Encapsulation
Composition and Aggregation
Generalization and Specialization

 */

//Class
class ClassEG{
 //constructor
 ClassEG(String name){
     System.out.println("Class Constructor here");
     System.out.println("Name: "+name);
 }
}

//Person Class
class Person{
 String name;

 void talk(){
     System.out.println(name +" is Talking");
 }
 void read(){
     System.out.println(name +" is Reading");
 }

 void add(int a){
     int sum = a + 10;
     System.out.println(a+" + 10 = "+ sum);
 }
}

class Person2{
 Person2(String occupation){
     System.out.println("My occupation: "+ occupation);
 }
}


//polimorphism and method overriding
class Student extends Person{

 Student(String name){
     this.name = name;

 }

 // method overriding
 void read(){
     System.out.println("Inside overridden method ()");
     System.out.println(name + " is not reading anymore");
 }

}

//method overloading
class Calculator{
 int add(int a, int b){
     return a + b;
 }
 double add(double a, double b){
     return a + b;
 }
}

//inheritance
class Teacher extends Person2{
 Teacher(String work){
     super(work);
 }
}

//interface
interface Drawable{
 void draw();
}
class Circle implements Drawable {
 public void draw() {
     System.out.println("Drawing a circle.");
 }
}

//Abstract class
abstract class Shape {
 abstract double area();
}

class Triangle extends Shape {
 double base;
 double height;

 Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 double area() {
     return 0.5 * base * height;
 }
}

//Abstraction and Encapsulation
class BankAccount {
 private double balance;

 void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 double getBalance() {
     return balance;
 }
}

//Composition and Aggregation
class Engine {
 void start() {
     System.out.println("Engine started successfully.");
 }
}

class Car {
 private Engine engine;

 Car() {
     engine = new Engine();
 }

 void startCar() {
     engine.start();
     System.out.println("Car started.");
 }
}

//Generalization and Specialization
class Vehicle {
 void drive() {
     System.out.println("Vehicle is in motion.");
 }
}

class Car2 extends Vehicle {
 void drive() {
     System.out.println("Car is in motion.");
 }
}
public class Java_Assg1 {
	
	public static void main(String[] args) {
		
		System.out.println("JAVA A1 \n");
		
		// Class and Object
        ClassEG nameObj = new ClassEG("Pawankumar Shedage");

        // Polymorphism
        Person p1 = new Student("Pawankumar"); 
        p1.talk();

        // method overriding
        p1.read();

        // method overloading
        System.out.println("Method () overloading");
        Calculator c1 = new Calculator();
        System.out.println("First result = " + c1.add(5,3));
        System.out.println("Second result = " + c1.add(7.5,8.5));

        // inheritance
        Teacher p2 = new Teacher("Teaching");

        // interface
        Circle circle = new Circle();
        circle.draw();

        // abstract shape class
        Shape triangle = new Triangle(5,4);
        System.out.println("Triangle Area -> " + triangle.area());

        // abstraction and encapsulation
        BankAccount acc = new BankAccount();
        acc.deposit(63000);
        acc.getBalance();

        // composition and aggregation
        Car honda = new Car();
        honda.startCar();

        // generalization and specialization
        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        Car2 car2 = new Car2();
        car2.drive();
	}
}
