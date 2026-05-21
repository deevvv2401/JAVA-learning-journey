# Java Arrays Notes

## Arrays
- Stores multiple values of same data type.
- Non-Primitive Data Type.

---

# Syntax

```java
datatype[] arr = new datatype[size];
```

Example:
```java
int[] arr = new int[5];
```

---

# Indexing
- Arrays are Zero Indexed.
- First index = `0`

---

# Store Values

```java
arr[0] = 10;
arr[1] = 20;
```

---

# Access Values

```java
System.out.println(arr[0]);
```

---

# Traversing Array

```java
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

---

# Direct Initialization

```java
int[] arr = {1, 2, 3, 4};
```

---

# Alternate Syntax

```java
int arr[] = new int[5];
```

---

# Default Values

| Type | Default |
|---|---|
| int | 0 |
| float | 0.0 |
| boolean | false |
| String/Object | null |

---

# Array Length

```java
arr.length
```

---

# Taking Input

```java
Scanner sc = new Scanner(System.in);

int size = sc.nextInt();

int[] arr = new int[size];

for(int i = 0; i < size; i++) {
    arr[i] = sc.nextInt();
}
```

---

# Linear Search

```java
for(int i = 0; i < arr.length; i++) {

    if(arr[i] == x) {
        System.out.println(i);
    }
}
```

---

# Important Points

- Same data type only
- Index starts from `0`
- `.length` gives size
- Use loops for traversal
- Arrays use contiguous memory
- Java initializes default values automatically
