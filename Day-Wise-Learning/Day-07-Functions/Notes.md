# Java Functions / Methods

## Definition
- Reusable code block → takes input, performs operation, returns output.

---


# Syntax

```java
public static returnType functionName(parameters){
    // code
}
```

---

# Components

## `public static`
- Default keywords for functions inside main class.

## Return Type
- Defines returned value type: `int`, `float`, `String`, `boolean`, `void`.

- `void` → returns nothing.

## Function Name
Rules:
- Meaningful, descriptive, non-keyword.


- Multiple & different data types allowed.

---

# Camel Case

```java
printMyName()
calculateProduct()
```

Rules:
- First word lowercase.
- Next word initials uppercase.


---


# Function Call

```java
printMyName(name);
```

- Executes function, shifts control, returns after completion.

---

# Return Statement

```java
return sum;
```

- Ends execution & sends value back.

```java
if(n < 0){
    return;
}
```

- `return` can terminate function instantly.

---

# Variable Scope
- Variables inside function are local to that function only.

---

# Memory Concept

## Stack Memory
- Functions stored in stack form.
- Every function call creates a separate stack frame with separate variables.

```text
main() → function() → return → memory cleared
```

---

# Factorial

## Formula

```text
n! = n × (n-1) × (n-2) ... × 1
```

```text
0! = 1
1! = 1
5! = 120
```

- Negative numbers have no factorial.

---

# Factorial Function

```java
public static void printFactorial(int n){

    if(n < 0){
        System.out.println("Invalid Number");
        return;
    }

    int factorial = 1;

    for(int i = n; i >= 1; i--){
        factorial *= i;
    }

    System.out.println(factorial);
}
```

---

# Important Learnings
- Functions run only when called.
- Same function can execute multiple times.
- Functions reduce repeated code.
- `void` = no return value.
- `return` ends function.
- Loops can exist inside functions.
- Good naming improves readability.
- Functions use stack memory.

---

# Function vs Method

## Function
- Called directly.

## Method
- Called using object.

```java
object.method();
```

---

# Practice Problems
- Table printer
- Prime checker
- Sum/Product calculator
- Factorial
- Average calculator
- Even/Odd checker

---

# Final Notes
- Functions are core programming fundamentals.
- Strong function concepts improve logic building.
- Practice small reusable functions daily.
- Clean code = professional code.
