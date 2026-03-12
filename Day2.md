### 📅 Date - 11th March 2025

#### 1. What are arrays ?
An **array** is a **linear data structure** used to store multiple values of the **same type** in a single variable.
- Elements in an array are stored in **contiguous memory locations** (one after another).
- Each element can be accessed using an **index value**.
- Arrays allow **random access**, meaning we can directly access any element using its index.

#### Why are Arrays 0 Indexed?
**1. Index shows offset (distance) from the starting memory location**
   
Arrays are stored in continuous memory locations. The computer knows the address of the first element, which is called the base address.

The index tells how many steps to move from the starting address. First element is 0 step away, second element one step away and so on.

**2. Simple address calculation**
The computer calculates the address using a simple formula: 
``` java
Address of arr[i] = Base Address + (i × Size of element)

Example - if int = 4 bytes :
arr[0] → Base + (0 × 4) = Base
arr[1] → Base + (1 × 4) = Base + 4
arr[2] → Base + (2 × 4) = Base + 8
```
If arrays started at index 1 then computer would need an extra subtraction every time:
```java
Address = Base Address + ((i − 1) × Size)
arr[1] → Base + ((1−1) × 4)
arr[2] → Base + ((2−1) × 4)
```
This makes the calculation slightly more complex.

#### Creating an Array

To create an array, we need to follow three steps:

1. Assign a **name** to the array.
2. Specify the **datatype** of elements.
3. Define the **size** of the array.

##### Syntax
```java
DataType arrayName[arraySize];
arrayName.length - To get the length of the array
```

#### Finding an Element in an array
You have three options to find an element in an array:
- If we know where the element is located,We can use the index values to access it.
- If you don’t know where it’s located, you can use algorithms to optimize your search, such as Linear, Binary Search.
- If you need faster repeated lookups, you can store the array elements in a hash-based data structure (like a hash set or hash map).

#### 2. What are strings ?

**Strings** are like a series of characters stored in a specific order. They are immutable i.e. can't modify. Each character in a string is assigned an index, starting from 0. 
```java
String s = "striver";
String str1 = new String("xyz");

Input - Using Scanner class
String name = sc.next() - word
String fullName = nextLine() - sentence

Output - System.out.println(name);
```
Finding the Length of a String 
```java 
name.length();
```
Concatenation
```java
String firstName = "Meenal";
String lastName = "Joshi";
String fullName = firstName+" "+lastName;
```
Concatenation can also be done using StringBuilder. Stringbuilder is the mutable sequence of characters.
```java
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append("World");

Convert stringbuilder to string using sb.toString();
To convert from any object to string we use .toString().
For Eg. -
Integer a = 10;
a.toString(); ---> a = "10"
```
Accessing Individual Characters - using charAt() Method
```java
fullName.charAt(0) ----> M
fullName.charAt(1) ----> E
```

String Comparison - using .equals()
```java
a = "hello";
b = "hello";
a.equals(b); ----> return true if same else false if different
```
#### 3. For Loop
A for loop is a control structure in programming that allows you to execute a specific block of code repeatedly. It's especially useful when you want to perform the same task multiple times without duplicating your code.

Syntax
```java
for(initialization; condition; update){
    // code to execute
}
```
- Initialization: You declare and initialize a variable that serves as a counter. This step only happens once at the beginning.
- Condition: You specify a condition that determines when the loop should stop executing.
- Increment/Decrement: You define how the counter variable changes after each iteration.

#### 4. While Loop
A while loop is a control structure in programming that repeatedly executes a block of code as long as a specified condition remains true. A "while" loop will not execute the code at all if the initial condition is false. It is used when the number of iterations is not fixed.

Syntax
```java
while(condition){
    // code to execute
}

int i = 0; ----> Initialization
while(i < 5){  ------> condition
    System.out.println(i);
    i++; --------------------> updation
}
```
#### 5. Functions 
A **function** or method in Java is a block of code that performs a specific task and can be reused multiple times in a program.

Syntax - 
```java
returnType functionName(parameters){
    // code
    return value;
}
```
Example -
```java
public class Main {
    public static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        int result = add(5, 3);
        System.out.println(result);
    }
}
```
<br>

Pass By value - When a variable is passed by value, a copy of the variable is made. The function works on that copy, and the original variable remains unchanged.
Example -
```java
public class Main {
    static void changeValue(int x){
        x = 50;
        System.out.println("Inside function: " + x);
    }
    public static void main(String[] args){
        int a = 10;
        changeValue(a);
        System.out.println("Outside function: " + a);
    }
}
```
<br>

Pass by Reference - When a variable is passed by reference, the function receives the actual variable (not a copy). Any changes made inside the function will reflect on the original as the function receives the reference (address) of the variable.
Example - 
```java
public class Main {
    static void changeArray(int arr[]){
        arr[0] = 100;   // modifying array element
    }
    public static void main(String[] args){
        int arr[] = {10, 20, 30};
        changeArray(arr);
        System.out.println(arr[0]);
    }
}
Before function call → [10, 20, 30]
After function call  → [100, 20, 30]
```
#### 6. Time and Space Complexity

**Time Complexity**
 - It doesnot refer to the time taken by the machine to execute a particular code.
 - If we run the same code in a low-end machine(e.g. old windows machine) and in a high-end machine(e.g. Latest MacBook), we will observe that two different machines take different amounts of time for the same code. The high-end machine will take lesser time as compared to the low-end machine.
 - The rate at which the time, required to run a code, changes with respect to the input size, is considered the time complexity. Basically, the time complexity of a particular code depends on the given input size, not on the machine used to run the code.

**Space Complexity**
- Space complexity generally represents the summation of auxiliary space and the input space.
- Auxiliary space refers to the space that we use additionally to solve a problem.
- Input space refers to the space that we use to store the inputs.

In an interview, we must be careful that we will not manipulate the given data even if the space complexity becomes 2N instead of N. If the interviewer specifically instructs us to manipulate, then only we should attempt this method because  company may use the same data for different purposes.
