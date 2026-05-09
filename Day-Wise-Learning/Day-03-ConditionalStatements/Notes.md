# Day-03 : Conditional Statements

## Introduction

Conditional statements are used to make decisions in Java programs.

They allow the program to execute different blocks of code depending on whether a condition is `true` or `false`.

---

# Conditional Statements

Conditional statements help in decision making.

Java mainly provides:

* `if`
* `if-else`
* `else-if`
* `switch`

---

# if Statement

The `if` statement executes a block of code only when the condition becomes `true`.

## Syntax

```java
if(condition){
    // code
}
```



---

# if-else Statement

The `if-else` statement executes one block if the condition is true and another block if the condition is false.

## Syntax

```java
if(condition){
    // true block
}
else{
    // false block
}
```



---

# else-if Ladder

Used when multiple conditions need to be checked.

## Syntax

```java
if(condition1){
    // code
}
else if(condition2){
    // code
}
else{
    // code
}
```



---

# Comparison Operators

Comparison operators are used to compare values.

| Operator | Meaning                  |
| -------- | ------------------------ |
| `==`     | Equal to                 |
| `!=`     | Not equal to             |
| `>`      | Greater than             |
| `<`      | Less than                |
| `>=`     | Greater than or equal to |
| `<=`     | Less than or equal to    |

---

# Logical Operators

Logical operators are used to combine conditions.

| Operator | Meaning     |
| -------- | ----------- |
| `&&`     | Logical AND |
| `||`     | Logical OR  |
| `!`      | Logical NOT |

---

# Modulo Operator (`%`)

The modulo operator returns the remainder after division.

## Syntax

```java
a % b
```
### if a < b

If a < b, then b cannot divide a even once.

So the remainder stays a.

---



# Nested if Statement

An `if` statement inside another `if` statement is called nested `if`.


---

# switch Statement

The `switch` statement is used as an alternative to multiple `if-else` statements.

It makes code cleaner and easier to read.

## Syntax

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

---



# break Statement

The `break` statement is used to stop execution inside a `switch`.

Without `break`, execution continues to the next cases.

---


# Important Notes

* `if` executes code only when the condition is true
* `else` executes when the condition becomes false
* `else-if` is useful for multiple conditions
* `%` operator is commonly used for odd/even logic
* `switch` improves readability for multiple choices
* `break` prevents execution from continuing into other cases

---

# Summary

In this lecture, I learned:

* Conditional Statements
* `if`, `if-else`, and `else-if`
* Comparison Operators
* Logical Operators
* Modulo Operator
* Odd / Even Logic
* Nested `if`
* `switch` Statement
* `break` Keyword
* Building a Calculator using `switch`

---

# Practice Programs

### Completed Homework Programs

* Calculator using `switch`
* Printing month by number input using `switch`

---

# Author

**Dev Ruhela**  
Java Learning Journey 🚀