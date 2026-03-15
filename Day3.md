### 📅 Date - 12th March 2026

#### Build-up Logical Thinking
1. Rectangular Star Pattern - [RectangularStar.java](Patterns/RectangularStar.java)
``` java
*****
*****
*****
*****
*****
```
``` java
for(int i = 0; i < 5; i++){
   for(int j = 0; j < 5; j++){
      System.out.print("*");
   }
   System.out.println();
}
```
The outer loop (i) controls the number of rows.
The inner loop (j) controls the number of columns.

##### Time Complexity
```java
Outer Loop → N
Inner Loop → N
Total Operations → N × N
Time Complexity: O(N²)
```

##### Space Complexity
The program only uses two variables i and j and does not allocate extra memory that depends on input size.
```java
Input Space = 2
Auxiliary Space = 0
Space Complexity: O(1)
```
