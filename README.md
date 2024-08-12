

# Java Learning Guide By Urooj Islam 

## 1. Introduction to Java

### Definition
Java is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It is widely used for building platform-independent applications, from desktop software to web and mobile applications.

### Features
- **Object-Oriented**: Java uses objects and classes to model real-world entities.
- **Platform-Independent**: Java code is compiled into bytecode that runs on any platform with a Java Virtual Machine (JVM).
- **Simple**: Java’s syntax is designed to be easy to read and write.
- **Robust**: Java includes strong memory management and exception handling.
- **Secure**: Java provides a secure environment for executing code, particularly in networked environments.

## 2. Basic Syntax

### Structure of a Java Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
- **public class HelloWorld**: Declares a class named `HelloWorld`.
- **public static void main(String[] args)**: The main method where the program starts execution.
- **System.out.println()**: Prints text to the console.

### Comments
```java
// This is a single-line comment

/*
 This is a multi-line comment
*/
```

## 3. Data Types

### Primitive Data Types
- **byte**: 8-bit integer.
- **short**: 16-bit integer.
- **int**: 32-bit integer.
- **long**: 64-bit integer.
- **float**: Single-precision 32-bit floating-point.
- **double**: Double-precision 64-bit floating-point.
- **char**: Single 16-bit Unicode character.
- **boolean**: True or false value.

**Example**:
```java
int age = 25;
float salary = 2500.50f;
char initial = 'J';
boolean isJavaFun = true;
```

### Non-Primitive Data Types
- **String**: Represents a sequence of characters.
- **Array**: A collection of elements of the same type.

**Example**:
```java
String name = "Alice";
int[] numbers = {1, 2, 3, 4, 5};
```

## 4. Operators

### Arithmetic Operators
```java
int a = 10;
int b = 5;
int sum = a + b;        // Addition
int difference = a - b; // Subtraction
int product = a * b;    // Multiplication
int quotient = a / b;   // Division
int remainder = a % b;  // Modulus
```

### Comparison Operators
```java
boolean isEqual = (a == b);    // Equal to
boolean isNotEqual = (a != b); // Not equal to
boolean isGreater = (a > b);   // Greater than
boolean isLess = (a < b);      // Less than
boolean isGreaterOrEqual = (a >= b); // Greater than or equal to
boolean isLessOrEqual = (a <= b);    // Less than or equal to
```

### Logical Operators
```java
boolean result = (a > b) && (b < 10); // Logical AND
result = (a > b) || (b > 10);         // Logical OR
result = !(a > b);                    // Logical NOT
```

## 5. Control Structures

### Conditional Statements

#### If-Else
```java
int num = 10;
if (num > 0) {
    System.out.println("Positive number");
} else if (num < 0) {
    System.out.println("Negative number");
} else {
    System.out.println("Zero");
}
```

#### Switch
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Weekend");
}
```

### Loops

#### For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

#### While Loop
```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++;
}
```

#### Do-While Loop
```java
int number = 0;
do {
    System.out.println(number);
    number++;
} while (number < 5);
```

## 6. Arrays

### Declaration and Initialization
```java
int[] numbers = new int[5]; // Array of integers with size 5
numbers[0] = 1;
numbers[1] = 2;
```

### Array Operations
```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // Outputs: 1

// Iterate through an array
for (int num : numbers) {
    System.out.println(num);
}
```

## 7. Strings

### String Manipulation
```java
String str = "Hello, World!";
int length = str.length();                // Length of the string
String upper = str.toUpperCase();        // Convert to uppercase
String lower = str.toLowerCase();        // Convert to lowercase
String substring = str.substring(7, 12); // Extract substring
```

### String Methods
```java
String str = "Java Programming";
boolean contains = str.contains("Java"); // Check if substring is present
String replace = str.replace("Java", "C++"); // Replace substring
```

## 8. Classes and Objects

### Class Definition
```java
public class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
```

### Object Creation
```java
Person person1 = new Person("Alice", 30);
person1.introduce(); // Outputs: Hi, my name is Alice and I am 30 years old.
```

## 9. Inheritance

### Inheritance Basics
```java
// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
```

### Inheritance Example
```java
Dog dog = new Dog();
dog.eat(); // Inherited method
dog.bark(); // Derived method
```

## 10. Polymorphism

### Method Overloading
```java
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

### Method Overriding
```java
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
```

## 11. Interfaces

### Interface Definition
```java
interface Drawable {
    void draw(); // Abstract method
}
```

### Implementing Interface
```java
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
```

## 12. Exception Handling

### Try-Catch-Finally
```java
try {
    int result = 10 / 0; // This will throw ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Error: Division by zero.");
} finally {
    System.out.println("This block always executes.");
}
```

### Throwing Exceptions
```java
void checkAge(int age) {
    if (age < 18) {
        throw new ArithmeticException("Age is less than 18.");
    }
}
```

## 13. File Handling

### Reading from a File
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### Writing to a File
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello, World!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

## 14. Collections Framework

### List
```java
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new

 ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.get(0)); // Outputs: Apple
    }
}
```

### Map
```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println(map.get("Alice")); // Outputs: 25
    }
}
```

### Set
```java
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        System.out.println(set.contains("Red")); // Outputs: true
    }
}
```

## 15. Multithreading

### Creating a Thread
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
```

### Using Runnable Interface
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
```

## 16. Java Standard Libraries

### Commonly Used Packages
- **java.lang**: Fundamental classes (e.g., `String`, `Math`).
- **java.util**: Utility classes (e.g., `ArrayList`, `HashMap`).
- **java.io**: Input and output classes (e.g., `File`, `BufferedReader`).

### Example Usage
```java
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
    }
}
```
