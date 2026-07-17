# Complete Sorting Revision Notes

---

# What is Sorting?

Sorting means arranging elements in a specific order.

Types:
- Ascending Order → Small to Large
- Descending Order → Large to Small

Examples:

Ascending:
```java
1 2 3 4 5
```

Descending:
```java
5 4 3 2 1
```

---

# Why Sorting is Important?

Sorting is used in:
- Amazon → Price low to high
- Flight tickets
- Rankings
- Search results
- Student marks
- Databases

---

# Three Basic Sorting Algorithms

1. Bubble Sort
2. Selection Sort
3. Insertion Sort

---

# Bubble Sort

# Definition

Bubble Sort is a sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.

Largest elements gradually move toward the end.

---

# Why is it called Bubble Sort?

Because larger elements “bubble up” toward the end of the array just like bubbles rise upward in water.

---

# Main Idea

```text
Compare adjacent elements.
If left element is bigger,
swap them.
```

Largest elements move toward END.

---

# Bubble Sort Example

Input:

```java
7 8 3 1 2
```

---

## Pass 1

- 7 & 8 → correct
- 8 & 3 → swap
- 8 & 1 → swap
- 8 & 2 → swap

Result:

```java
7 3 1 2 8
```

Largest element fixed at END.

---

## Pass 2

- 7 & 3 → swap
- 7 & 1 → swap
- 7 & 2 → swap

Result:

```java
3 1 2 7 8
```

---

## Pass 3

- 3 & 1 → swap
- 3 & 2 → swap

Result:

```java
1 2 3 7 8
```

---

# Bubble Sort Code

```java
for(int i=0; i<arr.length-1; i++) {

    for(int j=0; j<arr.length-1-i; j++) {

        if(arr[j] > arr[j+1]) {

            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
```

---

# Bubble Sort Loop Logic

# Outer Loop

```java
for(int i=0; i<arr.length-1; i++)
```

## Why starts from 0 ?

Because:
- initially no elements are sorted
- first pass starts immediately

`i` represents:

```text
number of sorted elements at END
```

---

## Why till `arr.length - 1` ?

If array size is:

```java
n
```

then only:

```java
n-1
```

passes are needed.

Because after fixing:
- `n-1` elements
- last element automatically becomes sorted

---

# Inner Loop

```java
for(int j=0; j<arr.length-1-i; j++)
```

---

## Why starts from 0 ?

Because adjacent comparison starts from first element.

We compare:

```java
arr[j] and arr[j+1]
```

---

## Why till `arr.length - 1 - i` ?

After every pass:
- largest element reaches END
- END part becomes sorted

So:
- no need to compare sorted END part again

---

# Bubble Sort Time Complexity

Comparisons:

```java
(n-1)+(n-2)+(n-3)+...+1
```

Formula:

```java
n(n-1)/2
```

Big O:

```java
O(n²)
```

---

# Bubble Sort Complexities

| Case | Complexity |
|---|---|
| Best Case | O(n) |
| Average Case | O(n²) |
| Worst Case | O(n²) |

---

# Bubble Sort Space Complexity

```java
O(1)
```

---

# Bubble Sort Memory Trick

```text
Bubble Sort pushes largest elements to END.
```

OR

```text
Adjacent comparison + swapping
```

---

# Selection Sort

# Definition

Selection Sort repeatedly selects the smallest element from the unsorted part and places it at the correct position.

---

# Main Idea

```text
Find smallest element
Place it at FRONT
Repeat
```

---

# Selection Sort Example

Input:

```java
7 8 3 1 2
```

---

## Pass 1

Smallest = 1

Swap with 7

```java
1 8 3 7 2
```

---

## Pass 2

Smallest = 2

Swap with 8

```java
1 2 3 7 8
```

---

# Selection Sort Code

```java
for(int i=0; i<arr.length-1; i++) {

    int smallest = i;

    for(int j=i+1; j<arr.length; j++) {

        if(arr[j] < arr[smallest]) {
            smallest = j;
        }
    }

    int temp = arr[smallest];
    arr[smallest] = arr[i];
    arr[i] = temp;
}
```

---

# Selection Sort Loop Logic

# Outer Loop

```java
for(int i=0; i<arr.length-1; i++)
```

---

## Why starts from 0 ?

Because:
- first position should first receive smallest element

Initially:
- no positions fixed

---

## Why till `arr.length - 1` ?

Only:

```java
n-1
```

positions need fixing.

Last element automatically becomes correct.

---

# Inner Loop

```java
for(int j=i+1; j<arr.length; j++)
```

---

## Why starts from `i+1` ?

Because:
- current position already assumed smallest

```java
int smallest = i;
```

So searching begins from NEXT element.

---

## Why till `arr.length` ?

Because:
- smallest element can exist anywhere in remaining unsorted array

So entire remaining array must be checked.

---

# Selection Sort Time Complexity

Comparisons:

```java
(n-1)+(n-2)+(n-3)+...+1
```

Formula:

```java
n(n-1)/2
```

Big O:

```java
O(n²)
```

---

# Selection Sort Complexities

| Case | Complexity |
|---|---|
| Best Case | O(n²) |
| Average Case | O(n²) |
| Worst Case | O(n²) |

---

# Selection Sort Space Complexity

```java
O(1)
```

---

# Selection Sort Memory Trick

```text
Selection Sort SELECTS smallest element.
```

OR

```text
Find minimum → swap once
```

---

# Insertion Sort

# Definition

Insertion Sort picks one element from the unsorted part and inserts it into its correct position in the sorted part.

---

# Main Idea

```text
Take one element
Shift larger elements right
Insert element correctly
```

---

# Insertion Sort Example

Input:

```java
7 8 3 1 2
```

Initially:

```java
[7 | 8 3 1 2]
```

Left side sorted.

---

## Insert 8

Already greater than 7.

```java
7 8 | 3 1 2
```

---

## Insert 3

Shift:
- 8
- 7

Insert 3.

```java
3 7 8 | 1 2
```

---

## Insert 1

Shift:
- 8
- 7
- 3

Insert 1.

```java
1 3 7 8 | 2
```

---

## Insert 2

Shift:
- 8
- 7
- 3

Insert after 1.

```java
1 2 3 7 8
```

---

# Insertion Sort Code

```java
for(int i=1; i<arr.length; i++) {

    int current = arr[i];
    int j = i-1;

    while(j >= 0 && current < arr[j]) {

        arr[j+1] = arr[j];
        j--;
    }

    arr[j+1] = current;
}
```

---

# Insertion Sort Loop Logic

# Outer Loop

```java
for(int i=1; i<arr.length; i++)
```

---

## Why starts from 1 ?

Because:
- first element already considered sorted

So insertion starts from second element.

---

## Why till `arr.length` ?

Because every remaining element must be inserted correctly.

---

# While Loop

```java
while(j >= 0 && current < arr[j])
```

---

## Why `j = i-1` ?

Because:
- insertion happens in sorted LEFT part

So comparison starts from:
- immediate previous element

---

## Why `j >= 0` ?

To avoid:
```text
ArrayIndexOutOfBoundsException
```

because insertion sort moves backward.

---

## Why `current < arr[j]` ?

Because:
- larger elements should shift right
- space should be created for current element

---

# Most Important Line

```java
arr[j+1] = current;
```

This is actual INSERTION step.

That is why called:

```text
Insertion Sort
```

---

# Insertion Sort Time Complexity

Worst Case:

```java
O(n²)
```

Best Case:

```java
O(n)
```

Average Case:

```java
O(n²)
```

---

# Insertion Sort Space Complexity

```java
O(1)
```

---

# Insertion Sort Memory Trick

```text
Insert element into correct place.
```

OR

```text
Shift larger elements right.
```

---

# Difference Between All Sorting Algorithms

| Bubble Sort | Selection Sort | Insertion Sort |
|---|---|---|
| Swaps adjacent elements | Selects minimum | Inserts correctly |
| Pushes largest to END | Places smallest at FRONT | Builds sorted part |
| Many swaps | One swap/pass | Shifting occurs |

---

# Ascending vs Descending Sorting

# Ascending

```java
if(arr[j] > arr[j+1])
```

OR

```java
current < arr[j]
```

---

# Descending

```java
if(arr[j] < arr[j+1])
```

OR

```java
current > arr[j]
```


# Easy Memory Tricks

# Bubble Sort

```text
Bubble → Bigger bubbles rise upward
Largest goes END
```

---

# Selection Sort

```text
SELECT smallest
Place FRONT
```

---

# Insertion Sort

```text
Like arranging cards in hand
Insert at correct place
```

---

# Final Time Complexity Table

| Sorting | Best | Average | Worst |
|---|---|---|---|
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Selection Sort | O(n²) | O(n²) | O(n²) |
| Insertion Sort | O(n) | O(n²) | O(n²) |

---

# Final Lecture Summary

- Sorting arranges elements
- Bubble Sort pushes largest elements backward
- Selection Sort selects minimum element
- Insertion Sort inserts elements correctly
- Bubble Sort uses adjacent swapping
- Selection Sort uses minimum searching
- Insertion Sort uses shifting
- Bubble & Selection → O(n²)
- Insertion best case → O(n)
- Loop limits depend on:
  - sorted area
  - unsorted area
  - comparison range
- Understanding loops is more important than memorizing them
- These algorithms are foundational for DSA and interviews