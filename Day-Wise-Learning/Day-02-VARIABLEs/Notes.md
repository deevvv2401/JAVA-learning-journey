# Day-02 : Variables & Data Types

## Introduction

In Java, programs work with data. To store and manipulate this data, we use **variables** and **data types**.

---

# Variables

A **variable** is a container used to store data in memory.

Each variable:

* stores a value
* has a unique name (identifier)
* can be updated during program execution

## Syntax

```java
dataType variableName = value;
```

## Example

```java
int age = 20;

```

---

# Rules for Naming Variables

✅ Valid:

```java
int age;
double totalMarks;
String studentName;
```

❌ Invalid:

```java
int 1age;
double total-marks;
String class;
```

### Important Rules

* Variable names cannot start with numbers
* Spaces are not allowed
* Special symbols are not allowed except `_` and `$`
* Java keywords cannot be used as variable names

---

# Data Types

A **data type** defines:

* what type of value a variable can store
* how much memory it occupies

Java has 2 types of data types:

1. Primitive Data Types
2. Non-Primitive Data Types

---

# Primitive Data Types

Primitive data types store simple values directly in memory.

These are fixed-size data types.

## Java Primitive Data Types Table

| Data Type | Size              | Range / Values                                              |
| --------- | ----------------- | ----------------------------------------------------------- |
| `byte`    | 1 byte (8 bits)   | -128 to 127                                                 |
| `short`   | 2 bytes (16 bits) | -32,768 to 32,767                                           |
| `int`     | 4 bytes (32 bits) | -2,147,483,648 to 2,147,483,647                             |
| `long`    | 8 bytes (64 bits) | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807     |
| `float`   | 4 bytes (32 bits) | Approximately ±3.4 × 10³⁸ (6–7 decimal digits precision)    |
| `double`  | 8 bytes (64 bits) | Approximately ±1.7 × 10³⁰⁸ (15–16 decimal digits precision) |
| `char`    | 2 bytes (16 bits) | Single Unicode character (`'\u0000'` to `'\uffff'`)         |
| `boolean` | JVM dependent     | `true` or `false`                                           |

---

# Primitive Data Type Examples

```java
byte age = 21;
short year = 2025;
int salary = 50000;
long population = 14000000000L;

float pi = 3.14f;
double price = 999.99;

char grade = 'A';

boolean isJavaFun = true;
```

---

# Non-Primitive Data Types

Non-Primitive Data Types are used to store complex data.

These are usually:

* created using objects
* variable in size
* declared using the `new` keyword (commonly)

## Java Non-Primitive Data Types Table

| Data Type   | Meaning                                                                |
| ----------- | ---------------------------------------------------------------------- |
| `String`    | Used to store a sequence of characters (text). Example: `"Hello"`      |
| `Array`     | Used to store multiple values of the same type in a single variable    |
| `Class`     | A blueprint/template used to create objects                            |
| `Object`    | An instance of a class that contains data and behavior                 |
| `Interface` | A structure that contains abstract methods which classes can implement |

---

# Non-Primitive Examples

## String Example

```java
String name = new String("Dev");
```

## Array Example

```java
int[] marks = new int[3];

marks[0] = 97;
marks[1] = 98;
marks[2] = 95;
```

---

<!-- # Constants in Java

A **constant** is a variable whose value cannot be changed after assignment.

In Java, constants are created using the `final` keyword.

## Syntax

```java
final dataType CONSTANT_NAME = value;
```

## Example

```java
final double PI = 3.14159;
```

Now `PI` cannot be changed later in the program.

--- -->

# Operators in Java

Operators are symbols used to perform operations on variables and values.

Examples:

* Addition
* Subtraction
* Comparison
* Logical operations

---

# Java Operators Hierarchy (Precedence) Table

| Operators                    | Meaning                                                         |   |            |
| ---------------------------- | --------------------------------------------------------------- | - | ---------- |
| `()`                         | Parentheses — highest priority, used to control execution order |   |            |
| `++` `--`                    | Increment / Decrement operators                                 |   |            |
| `+` `-` `!`                  | Unary operators (positive, negative, NOT)                       |   |            |
| `*` `/` `%`                  | Multiplication, Division, Modulus                               |   |            |
| `+` `-`                      | Addition, Subtraction                                           |   |            |
| `<` `>` `<=` `>=`            | Relational operators (comparison)                               |   |            |
| `==` `!=`                    | Equality operators                                              |   |            |
| `&&`                         | Logical AND                                                     |   |            |
| `                            |                                                                 | ` | Logical OR |
| `=` `+=` `-=` `*=` `/=` `%=` | Assignment operators                                            |   |            |

---

# Input in Java using Scanner

Java uses the `Scanner` class for taking user input.

## Example

```java
import java.util.Scanner;        

Scanner sc = new Scanner(System.in);

int number = sc.nextInt();
```

## Common Scanner Methods

| Method          | Meaning           |
| --------------- | ----------------- |
| `nextInt()`     | Reads integer     |
| `nextFloat()`   | Reads float       |
| `nextDouble()`  | Reads double      |
| `next()`        | Reads single word |
| `nextLine()`    | Reads full line   |
| `nextBoolean()` | Reads boolean     |

---

# Important Notes

* `float` values require `f`

```java
float pi = 3.14f;
```

* Decimal numbers are `double` by default in Java.

* `System.out.println()` is used for simple printing.

* `System.out.printf()` is used for formatted output.

Example:

```java
System.out.println("Area = %.2f%n" + area);
System.out.printf("Area = %.2f%n", area);
```

---

# Summary

In this lecture, I learned:

* What variables are
* Rules for naming variables
* Primitive and Non-Primitive Data Types
* Constants using `final`
* Operator precedence
* Taking user input using `Scanner`
* Basic formatted output using `printf()`

---

# Practice Programs

### Completed Homework Programs

* Circle Area Calculator
* Number Table Generator

---

# Author

**Dev Ruhela**
Java Learning Journey 🚀
