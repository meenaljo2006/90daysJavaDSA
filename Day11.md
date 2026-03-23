### 📅 Date - 23rd March 2026

#### Java Collection Framework 
The JCF is part of the java.util package and provides a set of ready-to-use classes and interfaces for storing and manipulating groups of objects. Collections are dynamic — meaning they can grow or shrink in size and they come with built-in methods for common operations.
<br>
- Class : A class is a blueprint used to create objects. It contains both data (variables) and implementation (methods with logic). Defines how something works
  ``` java
  class Dog {
      void sound() {
          System.out.println("Bark");
      }
  }
  ```

- Interface : An interface is a blueprint that defines a set of rules (methods) that a class must follow. It does not provide full implementation (only method declarations). A class implements an interface using implements
  ```java
  interface Animal {
    void sound();
  }
  ```

  Implementation Example -
  ``` java
  class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
  }
  ```
  
##### Iterable Interface
- Allows objects to be looped through using the enhanced for-each loop.
- Why is Iterable at the top? Because all collections (List, Set, Queue) have one common task → iteration (looping). Iterable defines this basic functionality and Other interfaces (Collection, List, Set, Queue) come after it.
- It contains a method: iterator().

##### Collection Interface
- Collection is an interface in Java Collections Framework. It represents a group of objects (elements)
- It extends the Iterable interface. Iterable only provides looping (iteration). Collection adds more functionality like: adding elements, removing elements, checking size
- Common Methods are : 
  - add() → to add elements
  - remove() → to remove elements
  - size() → to get number of elements
  - clear() → to remove all elements
  - contains() → to check element
 - Collection is the root interface for List, Set, and Queue. It provides basic operations for handling data
 - Map is not part of Collection but is still part of the framework.

#### Basic Maths
1. Count all digits of a number [(Code - Brute + Optimized Approach)](BasicMath/countDigit.java)
2. Leetcode - Number of Digit One [(Problem Number : 233 - Brute Force Approach)](Leetocde/leet233.java)