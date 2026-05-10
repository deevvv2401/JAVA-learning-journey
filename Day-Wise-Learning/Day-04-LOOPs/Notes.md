# Day-04 : Loops in Java

## Introduction

Loops are used to execute a block of code repeatedly without writing the same code again and again.

They help reduce code repetition and make programs shorter, cleaner, and more efficient.

---

# Types of Loops

Java mainly provides:

* `for loop`
* `while loop`
* `do-while loop`

---

# for Loop

The `for loop` is used when we know how many times we want to repeat a task.

## Syntax

```java
for(initialization; condition; update){
    // code
}
```

---


# Infinite Loop

If the condition never becomes false, the loop runs forever.

## Example

```java
for( ; ; ){
    System.out.println("Infinite Loop");
}
```

---

# while Loop

The `while loop` executes code while the condition remains `true`.

## Syntax

```java
int created beforehand !!
while(condition){
    // code
}
```

---


# Important Point

In `while loop`, the condition is checked first.

If the condition is `false`, the loop will not execute even once.

---

# do-while Loop

The `do-while loop` executes the code first and checks the condition later.

## Syntax

```java
int created beforehand !!
do{
    // code
}while(condition);
```

---



# Difference Between while and do-while

| while Loop | do-while Loop |
|---|---|
| Checks condition first | Executes first |
| May run 0 times | Runs at least once |

---




# Scanner Class

`Scanner` class is used to take input from the user.

## Import Statement

```java
import java.util.Scanner;
```

## Creating Object

```java
Scanner sc = new Scanner(System.in);
```

---

# Key Learnings

* Loops are used for repetition.
* `for loop` is best when the number of iterations is known.
* `while loop` checks condition before execution.
* `do-while loop` executes at least once.
* Infinite loops should be avoided.
* `i++` is shorthand for incrementing by `1`.
* Loops help write shorter and cleaner code.

---

# Conclusion

In this lecture, I learned how loops work in Java and how they help automate repetitive tasks.

I practiced:

* `for loop`
* `while loop`
* `do-while loop`
* Infinite loops
* Printing patterns and tables
* Taking user input using `Scanner`

These concepts are very important for solving programming problems efficiently.


# Author

**Dev Ruhela**  
Java Learning Journey 🚀