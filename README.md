# Array-of-Objects-Java-
Overview  This project demonstrates how to create and use an array of objects in Java. It explains how object references are stored inside arrays and how to properly initialize and access them.
* Purpose
The goal of this project is to:
Understand how arrays work with objects in Java.
Learn how to create, initialize, and access an array of objects.
Understand the difference between declaring an array and initializing its objects.

* Key Concept
In Java, when you create an array of objects like this:
ClassName[] objects = new ClassName[3];
You are only creating an array that can hold object references.
The objects themselves are not created yet.
Each element must be initialized separately:
objects[0] = new ClassName();
objects[1] = new ClassName();
objects[2] = new ClassName();
Otherwise, accessing them will cause a NullPointerException.

* Technologies Used
Java (Core Java)
Arrays
Object-Oriented Programming Concepts

* What This Example Includes
A simple class with attributes
Creating an array of objects
Initializing each object inside the array
Accessing and printing object data
Demonstrating common mistakes (like uninitialized elements)

* Learning Outcome
After completing this example, you should understand:
How arrays store object references
The correct way to initialize an array of objects
Common errors related to null references
