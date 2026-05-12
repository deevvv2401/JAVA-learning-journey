# Java Pattern Printing 🚀

> Focus: Nested Loops + Logic Building

---

# 📌 Core Concept

| Loop | Purpose |
|---|---|
| Outer Loop | Rows |
| Inner Loop | Columns |

```java
for(int i=1;i<=rows;i++){
    for(int j=1;j<=cols;j++){

    }
}
```

---

# ⭐ 1. Solid Rectangle

```text
*****
*****
*****
*****
```


---

# ⭐ 2. Hollow Rectangle

```text
*****
*   *
*   *
*****
```

## Boundary Condition

```java
i==1 || j==1 || i==rows || j==cols
```



---

# 🔺 3. Half Pyramid

```text
*
**
***
****
```


---

# 🔻 4. Inverted Half Pyramid

```text
****
***
**
*
```



---

# 🔄 5. Rotated Half Pyramid

```text
   *
  **
 ***
****
```

## Logic

- Spaces → `n-i`
- Stars → `i`


---

# 🔢 6. Number Pyramid

```text
1
12
123
1234
```


---

# 🔽 7. Inverted Number Pyramid

```text
1234
123
12
1
```



---

# 🔺 8. Floyd's Triangle

```text
1
2 3
4 5 6
7 8 9 10
```


---

# ⚫⚪ 9. 0-1 Triangle

```text
1
0 1
1 0 1
0 1 0 1
```

## Logic

```java
(i+j)%2==0 → 1
else → 0
```


---

# 🧠 Pattern Solving Formula

1. Count Rows & Columns  
2. Find relation with Row Number  
3. Build Outer + Inner Loop  
4. Add Conditions  

---

# 🚀 Concepts Learned

- Nested Loops
- Matrix Thinking
- Boundary Logic
- Space Handling
- Number Patterns
- Modulus Logic

---