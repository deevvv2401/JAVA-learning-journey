# Lecture Summary — Reverse String & StringBuilder (Java)

# 1. Why `StringBuilder` Was Introduced

## Problem with `String`
- In Java, `String` objects are **immutable**.
- Immutable means:
```java
String values cannot be changed after creation.
```

---

## Example with Normal `String`

```java
String str = "hello";

str = str + " world";
```

### What Happens Internally?
1. `"hello"` object is created.
2. `"hello world"` is created as a **new object**.
3. Reference variable `str` now points to the new object.

---

## Memory Reference Concept

### Before Modification
```java
str  ----->  "hello"
```

### After Modification
```java
str  ----->  "hello world"
```

- Reference direction changes.
- Old object remains unused until garbage collection.

---

## Problems with Immutable Strings
- Extra memory consumption
- Performance overhead
- Multiple unnecessary objects created
- Frequent reference changes

---

# Solution → `StringBuilder`

`StringBuilder` was introduced to:
- Modify strings efficiently
- Reduce memory wastage
- Improve performance
- Avoid unnecessary object creation

---

## Main Advantage
```java
StringBuilder is mutable.
```

Meaning:
```java
Characters can be modified inside the same object.
```

---

## Memory Reference in `StringBuilder`

### Example
```java
StringBuilder sb = new StringBuilder("hello");

sb.append(" world");
```

### Memory Behavior
Before Append:
```java
sb  ----->  "hello"
```

After Append:
```java
sb  ----->  "hello world"
```

- Same object is modified.
- Reference direction does NOT change.
- No new object creation for every modification.

---

# 2. Reverse String Concept

- Reverse string means:
```java
Characters are rearranged from last to first.
```

## Example
```java
hello
```

After Reverse:
```java
olleh
```

---

# 3. Character Swapping Logic

- First character swaps with last character.
- Second character swaps with second-last character.
- Process continues until middle index.

---

## Example

Initial:
```java
h e l l o
```

Step 1:
```java
o e l l h
```

Step 2:
```java
o l l e h
```

Final:
```java
olleh
```

---

# 4. `StringBuilder` Syntax

```java
StringBuilder sb = new StringBuilder("hello");
```

---

# 5. Reverse String Algorithm

## Steps
1. Start pointer → beginning of string
2. End pointer → last index
3. Swap characters
4. Move pointers inward

---

# 6. Reverse String Code

```java
StringBuilder sb = new StringBuilder("hello");

for(int i = 0; i < sb.length()/2; i++) {

    int front = i;
    int back = sb.length() - 1 - i;

    char frontChar = sb.charAt(front);
    char backChar = sb.charAt(back);

    sb.setCharAt(front, backChar);
    sb.setCharAt(back, frontChar);
}

System.out.println(sb);
```

---

# 7. Important Methods

## `charAt(index)`
Returns character at a specific index.

### Example
```java
sb.charAt(0)
```

Output:
```java
h
```

---

## `setCharAt(index, char)`
Replaces character at a specific index.

### Example
```java
sb.setCharAt(0, 'o');
```

---

## `length()`
Returns total length of string.

### Example
```java
sb.length()
```

Output:
```java
5
```

---

# 8. Time Complexity

## Complexity
```java
O(n)
```

## Reason
- Loop runs from:
```java
0 → n/2
```

- Each iteration performs constant-time operations.
- Constant factors are ignored in Big-O notation.

---

# 9. Important Terminologies

| Term | Meaning |
|---|---|
| Immutable | Cannot be modified after creation |
| Mutable | Can be modified |
| Reference Variable | Variable storing object address |
| Reverse String | Reversing character order |
| Swap | Exchange positions of characters |
| Time Complexity | Execution cost of algorithm |
| `charAt()` | Access character |
| `setCharAt()` | Replace character |
| `length()` | Total size of string |

---

# 10. Key Learning Points

- `String` objects are immutable.
- `StringBuilder` is mutable and memory-efficient.
- Normal `String` creates new objects during modification.
- `StringBuilder` modifies the same object.
- Reverse string uses:
```java
Two-pointer approach
```

Pointers:
- Front pointer
- Back pointer

Final Complexity:
```java
O(n)
```