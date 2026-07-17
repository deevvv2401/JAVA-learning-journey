# Sorting Algorithms — Coding Variations & Interview Questions Notes

---

# Bubble Sort — Coding Variations

---

# 1. Sort Array in Descending Order

## Concept

Instead of pushing larger elements toward END,
push smaller elements toward END.

---

## Change Required

Ascending:

```java
if(arr[j] > arr[j+1])
```

Descending:

```java
if(arr[j] < arr[j+1])
```

---

# 2. Count Number of Swaps

# Question

```text
Count total swaps performed during Bubble Sort.
```

---

# Logic

Create counter variable:

```java
int swaps = 0;
```

Increase when swap happens.

---

# Important Concept

Used for:
- optimization
- checking array disorder
- interview logic questions

---

# 3. Optimized Bubble Sort

# Question

```text
Stop sorting early if array already sorted.
```

---

# Logic

Use:

```java
boolean swapped = false;
```

If no swapping occurs:
- array already sorted
- break loop

---

# Important Concept

Best case becomes:

```java
O(n)
```

instead of:

```java
O(n²)
```

---

# 4. Bubble Sort After One Pass

# Question

```text
What happens after first pass?
```

---

# Answer

```text
Largest element reaches END.
```

---

# 5. Sort Only First K Elements

# Question

```text
Sort only first K elements of array.
```

---

# Logic

Modify loop range.

Example:

```java
for(int i=0; i<k; i++)
```

---

# 6. Bubble Sort String Array

# Question

```text
Sort strings alphabetically using Bubble Sort.
```

---

# Logic

Use:

```java
compareTo()
```

instead of:

```java
>
<
```

---

# 7. Bubble Sort Characters

# Question

```text
Sort characters in ascending order.
```

Example:

```java
d c a b
```

Result:

```java
a b c d
```

---

# 8. Bubble Sort Stability Question

# Question

```text
Is Bubble Sort stable?
```

---

# Answer

```text
YES
```

Equal elements maintain order.

---

# Bubble Sort Important Interview Questions

| Question | Answer |
|---|---|
| Largest element after one pass? | Reaches END |
| Stable? | Yes |
| Best case complexity? | O(n) optimized |
| Main idea? | Adjacent swapping |

---

# Selection Sort — Coding Variations

---

# 1. Sort in Descending Order

# Logic

Instead of finding SMALLEST:
- find LARGEST

---

# Change

Ascending:

```java
if(arr[j] < arr[smallest])
```

Descending:

```java
if(arr[j] > arr[largest])
```

---

# 2. Find K-th Smallest Element

# Question

```text
Find 3rd smallest element.
```

---

# Logic

Run selection sort only:

```java
k times
```

because:
- every pass fixes one minimum element

---

# 3. Minimum Swaps Question

# Question

```text
Which sorting performs minimum swaps?
```

---

# Answer

```text
Selection Sort
```

because:
- only one swap per pass

---

# 4. Find Minimum Without Sorting

# Question

```text
Find smallest element using Selection Sort logic.
```

---

# Concept

Selection Sort teaches:

```text
minimum tracking
```

VERY useful in DSA.

---

# 5. Sort Partial Array

# Question

```text
Sort array from index 2 to 7 only.
```

---

# Logic

Modify:
- outer loop start
- inner loop start

---

# 6. Selection Sort Stability Question

# Question

```text
Is Selection Sort stable?
```

---

# Answer

```text
NO
```

because swapping may disturb equal elements.

---

# 7. Number of Comparisons

# Question

```text
How many comparisons happen in Selection Sort?
```

---

# Formula

```java
(n-1)+(n-2)+(n-3)+...+1
```

---

# Final Complexity

```java
O(n²)
```

---

# Selection Sort Important Interview Questions

| Question | Answer |
|---|---|
| Main idea? | Find minimum |
| Stable? | No |
| Minimum swaps? | Yes |
| Best case complexity? | O(n²) |

---

# Insertion Sort — Coding Variations

---

# 1. Sort in Descending Order

# Change

Ascending:

```java
current < arr[j]
```

Descending:

```java
current > arr[j]
```

---

# 2. Insert Element in Sorted Array

# Question

```text
Insert 25 into sorted array.
```

---

# Concept

DIRECT insertion sort logic.

---

# 3. Sort Nearly Sorted Array

# Question

```text
Best sorting algorithm for nearly sorted array?
```

---

# Answer

```text
Insertion Sort
```

because:
- fewer shifts needed

---

# 4. Shift Elements Instead of Swapping

# Important Concept

Insertion Sort teaches:

```text
shifting
```

instead of repeated swapping.

---

# 5. Online Sorting

# Question

```text
Which sorting can sort while receiving elements continuously?
```

---

# Answer

```text
Insertion Sort
```

because insertion happens dynamically.

---

# 6. Insert Current Element Correctly

# Most Important Concept

Insertion Sort always:
- creates space
- inserts current element

---

# 7. Insertion Sort Stability Question

# Question

```text
Is Insertion Sort stable?
```

---

# Answer

```text
YES
```

---

# 8. Count Number of Shifts

# Question

```text
Count shifts performed in insertion sort.
```

---

# Important Concept

Used in:
- optimization
- array movement analysis

---

# Insertion Sort Important Interview Questions

| Question | Answer |
|---|---|
| Main idea? | Shift + insert |
| Stable? | Yes |
| Best for nearly sorted arrays? | Yes |
| Best case complexity? | O(n) |

---

# Major Java Questions from Sorting

---

# 1. Why Arrays Start from 0?

Because:

```text
index represents offset from starting address
```

---

# 2. Difference Between Swap and Shift

# Swap

```text
Exchange two elements.
```

Used in:
- Bubble Sort
- Selection Sort

---

# Shift

```text
Move element one position.
```

Used in:
- Insertion Sort

---

# 3. Why ArrayIndexOutOfBoundsException Comes?

Because:
- accessing invalid index
- negative index
- index >= array length

---

# 4. Why Temporary Variable Needed?

To avoid data loss during swapping.

---

# 5. Difference Between `i++` and `++i`

# `i++`

Use first → increment later.

---

# `++i`

Increment first → use later.

---

# 6. Why Nested Loops Used in Sorting?

Because:
- every element compares with multiple elements

---

# 7. Why Time Complexity Becomes O(n²)?

Because nested loops approximately run:

```java
n × n
```

times.

---

# 8. Difference Between Stable and Unstable Sorting

# Stable

Equal elements maintain order.

Examples:
- Bubble Sort
- Insertion Sort

---

# Unstable

Equal elements may change order.

Example:
- Selection Sort

---

# 9. Difference Between Comparison and Swapping

# Comparison

```java
if(arr[j] > arr[j+1])
```

checks relation.

---

# Swapping

Actually exchanges elements.

---

# 10. Why Insertion Sort Feels Confusing?

Because:
- backward traversal
- shifting
- insertion
- while loop

happen together.

But actual idea is ONLY:

```text
Create correct position for current element.
```

---

# Most Important DSA Understanding

DO NOT memorize:
- full code
- every loop

Instead remember:

| Sorting | Core Logic |
|---|---|
| Bubble Sort | Adjacent swapping |
| Selection Sort | Find minimum |
| Insertion Sort | Shift + insert |

---

# Golden Rule for Interviews

If you understand:
- sorted part
- unsorted part
- loop ranges
- swapping
- shifting

then ANY sorting variation becomes solvable.

That is actual DSA understanding.