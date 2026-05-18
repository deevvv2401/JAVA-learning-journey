# Java - Time & Space Complexity
> Lecture 8 • Quick Revision Notes

---

# 1. Time Complexity

Measures:
```text
Time taken by algorithm w.r.t input size
```

Input size:
```text
n
```

Used to compare efficiency of algorithms.

---

# 2. Asymptotic Notations

Used to represent algorithm performance.

---

## Big-O Notation `O()`

Represents:
```text
Worst Case
```

Meaning:
```text
Maximum time algorithm may take
```

Example:
```text
O(n), O(n²)
```

---

## Omega Notation `Ω()`

Represents:
```text
Best Case
```

Meaning:
```text
Minimum time algorithm may take
```

---

## Theta Notation `Θ()`

Represents:
```text
Average Case
```

Meaning:
```text
Average running time
```

---

# 3. Common Time Complexities

| Complexity | Meaning |
|---|---|
| `O(1)` | Constant |
| `O(log n)` | Logarithmic |
| `O(n)` | Linear |
| `O(n log n)` | Linearithmic |
| `O(n²)` | Quadratic |
| `O(n³)` | Cubic |
| `O(n!)` | Factorial |

---

# 4. Linear Time Complexity

## `O(n)`

Execution grows linearly with input.

Example:
```java
for(int i=0; i<n; i++)
{
    System.out.println(i);
}
```

Flow:
```text
n increases
    ↓
Iterations increase
    ↓
Execution time increases
```

---

# 5. Time Complexity Order

Worst → Best

```text
O(n^n)
 > O(n!)
 > O(n³)
 > O(n²)
 > O(n log n)
 > O(n log(log n))
 > O(n)
 > O(√n)
 > O(log n)
 > O(1)
```

---

# 6. Performance Rule

```text
Lower Time Complexity
        ↓
Better Performance
        ↓
More Efficient Program
```

Best:
```text
O(1)
```

Worst:
```text
O(n^n)
```

---

# 7. Space Complexity

Measures:
```text
Memory used by program during execution
```

Depends on:
- Variables
- Arrays
- Objects
- Data Structures

---

# 8. Space Complexity Flow

```text
More Variables/Data
        ↓
More Memory Usage
        ↓
Higher Space Complexity
```

---

# 9. Example

```java
int a;
```

`int` consumes:
```text
4 bytes
```

---

# 10. Important Difference

| Type | Measures |
|---|---|
| Time Complexity | Execution Time |
| Space Complexity | Memory Usage |

---

# 11. Core Understanding

```text
Good Program =
Low Time Complexity
        +
Low Space Complexity
```

---

# Final Summary

```text
Time Complexity  → Speed
Space Complexity → Memory
```