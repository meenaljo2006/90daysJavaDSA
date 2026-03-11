### 📅 Date - 10th March 2025

#### 1. Input Output
Input is handled using the Scanner class from java.util.
##### Common Scanner Methods
| Method        | Purpose                |
|---------------|------------------------|
| nextInt()     | Reads an integer       |
| nextLine()    | Reads a full line      |
| next()        | Reads a single word    |
| nextDouble()  | Reads a decimal number |

##### Output Methods
| Method | Description |
|------|-------------|
| System.out.print() | Prints text without a newline |
| System.out.println() | Prints text with a newline |

##### Example - 
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   // taking integer input
        System.out.println(num);

        sc.close();
    }
}
```

#### 2. Datatypes
Datatypes specify what kind of value a variable can store.
Java is a statically typed language, meaning the datatype must be declared before using a variable.

##### Common Primitive Datatypes
| Datatype | Size | Example |
|---------|------|--------|
| int | 4 bytes | `int age = 20;` |
| long | 8 bytes | `long population = 8000000000L;` |
| float | 4 bytes | `float price = 19.99f;` |
| boolean | true/false | `boolean isJavaFun = true;` |
| char | 2 bytes | `char grade = 'A';` |

#### 3. Conditional Statments - if else if else
Conditional statements allow a program to make decisions based on conditions.

```java
if(condition){
    // code
}
else if(condition){
    // code
}
else{
    // code
} 
```
##### Example -
``` java
int marks = 85;
if(marks >= 90){
    System.out.println("Excellent");
} else if(marks >= 70){
    System.out.println("Good");
} else{
    System.out.println("Needs Improvement");
}
```

#### 4. Switch Case
Switch case is used when multiple conditions depend on the same variable. It is often cleaner than many if-else statements.

```java
switch(variable){
    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

##### Example -
``` java
int day = 2;
switch(day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid Day");
}
```