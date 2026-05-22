# 2D Arrays (Two Dimensional Arrays) — Quick Revision Notes

Based on lecture transcript. :contentReference[oaicite:0]{index=0}

---

# ⭐ MOST IMPORTANT TOPICS

---

# 1. What is a 2D Array?

A 2D Array stores data in:
- rows
- columns

It looks like a matrix/table.

---

# Example

```text
1 2 3
4 5 6
7 8 9
```

---

# Important Understanding

1D Array:
```text
1 2 3 4
```

2D Array:
```text
1 2 3
4 5 6
```

---

# Real Life Examples

- Excel sheet
- Chess board
- Matrix
- Game board

---

# 2. Rows and Columns

Example:

```text
1 2 3
4 5 6
```

Rows:
```text
2
```

Columns:
```text
3
```

---

# Formula

```text
Total elements = rows × columns
```

---

# 3. Indexing in 2D Arrays ⭐

Java indexing starts from:

```text
0
```

NOT from 1.

---

# Example

```text
1 2 3
4 5 6
```

Indexes:

```text
(0,0) (0,1) (0,2)
(1,0) (1,1) (1,2)
```

---

# Access Formula

```java
arr[row][column]
```

---

# Example

```java
arr[1][2]
```

Value:
```text
6
```

---

# MOST COMMON BEGINNER MISTAKE

Thinking indexing starts from 1 ❌

Correct:
```text
0-based indexing
```

---

# 4. Declaration of 2D Array ⭐

## Syntax

```java
datatype[][] arrayName = new datatype[rows][columns];
```

---

# Example

```java
int[][] arr = new int[3][4];
```

Means:
- 3 rows
- 4 columns

---

# Visualization

```text
_ _ _ _
_ _ _ _
_ _ _ _
```

---

# 5. Memory Representation

Each small box is called a:

```text
Cell
```

---

# Memory Formula

```text
rows × columns × datatype size
```

---

# Example

```java
int[][] arr = new int[3][4];
```

Integer size:
```text
4 bytes
```

Memory:
```text
3 × 4 × 4 = 48 bytes
```

---

# Datatype Sizes

| Datatype | Size |
|---|---|
| int | 4 bytes |
| boolean | 1 byte |
| char | 2 bytes |

---

# 6. Accessing Elements ⭐

## Syntax

```java
arr[i][j]
```

where:
- i → row
- j → column

---

# Example

```text
5 8 1
2 7 4
```

```java
arr[1][2]
```

Value:
```text
4
```

---

# 7. Nested Loops ⭐⭐⭐

MOST IMPORTANT CONCEPT.

---

# What is Nested Loop?

Loop inside another loop.

---

# Syntax

```java
for(int i=0;i<rows;i++){

    for(int j=0;j<cols;j++){

    }

}
```

---

# Golden Rule

Outer loop:
```text
controls rows
```

Inner loop:
```text
controls columns
```

---

# Why Needed?

Because 2D Arrays have:
- rows
- columns

So we must travel in both directions.

---

# Visualization

```text
1 2 3
4 5 6
```

Traversal:

```text
1 → 2 → 3
↓
4 → 5 → 6
```

---

# 8. Input in 2D Arrays ⭐

## Syntax

```java
for(int i=0;i<rows;i++){

    for(int j=0;j<cols;j++){

        arr[i][j] = sc.nextInt();

    }

}
```

---

# Understanding

Outer loop:
```text
changes row
```

Inner loop:
```text
fills columns
```

---

# Example Input

```text
1 2 3
4 5 6
```

Stored as:

```text
arr[0][0] = 1
arr[0][1] = 2
arr[0][2] = 3
arr[1][0] = 4
```

---

# 9. Output in 2D Arrays ⭐

## Syntax

```java
for(int i=0;i<rows;i++){

    for(int j=0;j<cols;j++){

        System.out.print(arr[i][j] + " ");

    }

    System.out.println();

}
```

---

# 10. Traversing a 2D Array ⭐

## Meaning

Visiting every element one-by-one.

---

# Traversal Pattern

```java
for(int i=0;i<rows;i++){

    for(int j=0;j<cols;j++){

        // visit arr[i][j]

    }

}
```

---

# Used In

- Searching
- Matrix problems
- Dynamic Programming
- Graphs

---

# 11. Searching in 2D Arrays ⭐⭐⭐

MOST IMPORTANT PROBLEM TYPE.

---

# Logic

Visit every cell.

Compare with target.

---

# Search Logic

```java
if(arr[i][j] == target)
```

then:
```text
element found
```

---

# Full Idea

```java
for(int i=0;i<rows;i++){

    for(int j=0;j<cols;j++){

        if(arr[i][j] == target){

            System.out.println("Found");

        }

    }

}
```

---

# Time Complexity

```text
O(rows × columns)
```

because every cell may need checking.

---

# ⭐ IMPORTANT TOPICS

---

# 12. Why 2D Arrays are Important?

Used in:
- Dynamic Programming
- Graphs
- Games
- Chess boards
- Image processing
- Competitive programming

---

# 13. Relation with Matrices

2D Arrays are programming version of matrices.

---

# 14. Scanner Basics

## Creating Scanner

```java
Scanner sc = new Scanner(System.in);
```

---

# Taking Integer Input

```java
int x = sc.nextInt();
```

---

# 15. Dry Run Thinking ⭐

Always track:
- i value
- j value
- current cell

---

# Example

```java
for(int i=0;i<2;i++)
```

means:

```text
i = 0
i = 1
```

---


# Recommended Practice Problems

1. Input 2D Array
2. Output 2D Array
3. Sum of all elements
4. Find maximum
5. Search element
6. Row sum
7. Column sum

---

# ⭐ FINAL QUICK REVISION

| Topic | Key Point |
|---|---|
| 2D Array | rows + columns |
| Indexing | starts from 0 |
| Access | arr[i][j] |
| Outer loop | rows |
| Inner loop | columns |
| Input | nested loops |
| Output | nested loops |
| Traversal | visit every cell |
| Search | compare every element |
| Memory | rows × cols × datatype |
