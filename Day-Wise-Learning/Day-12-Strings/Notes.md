# Java Strings — Quick Revision Notes

Based on lecture transcript :contentReference[oaicite:0]{index=0}

---

# 1. Introduction to Strings

- `String` = Non-Primitive Data Type
- Used to store:
  - Words
  - Sentences
  - Characters
  - Large text

```java
String name = "Tony";
String fullName = "Tony Stark";
String sentence = "My name is Tony Stark";
```

## Important

- `String` starts with capital `S`
- `String` is a predefined Java class

---

# 2. Taking String Input

## Import

```java
import java.util.*;
```

## Create Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

---

## next()

- Takes only one word
- Stops at space

```java
String name = sc.next();
```

### Example

Input:
```text
Tony Stark
```

Output:
```text
Tony
```

---

## nextLine()

- Takes complete sentence
- Includes spaces

```java
String name = sc.nextLine();
```

### Example

Input:
```text
Tony Stark
```

Output:
```text
Tony Stark
```

---

# 3. String Concatenation

## Using `+`

```java
String firstName = "Tony";
String lastName = "Stark";

String fullName = firstName + " " + lastName;
```

Output:
```text
Tony Stark
```

## Key Point

- `+` joins strings
- We can directly add symbols/spaces

Example:

```java
String fullName = firstName + "@" + lastName;
```

Output:
```text
Tony@Stark
```

---

# 4. String Length

## length()

Returns total number of characters.

```java
String name = "Tony";

System.out.println(name.length());
```

Output:
```text
4
```

## Note

- Spaces and symbols are also counted

---

# 5. Access Characters

## charAt(index)

Returns character at given index.

```java
String name = "Tony";

System.out.println(name.charAt(0));
```

Output:
```text
T
```

---

## Print All Characters

```java
String name = "Tony";

for(int i = 0; i < name.length(); i++) {
    System.out.println(name.charAt(i));
}
```

---

# 6. String Comparison

## compareTo()

```java
str1.compareTo(str2);
```

## Return Values

| Condition | Return |
|---|---|
| `str1 > str2` | Positive |
| `str1 == str2` | `0` |
| `str1 < str2` | Negative |

---

## Example

```java
String a = "Tony";
String b = "Tony";

if(a.compareTo(b) == 0) {
    System.out.println("Equal");
}
```

---

## Comparison Logic

Comparison happens character by character.

Example:

```text
hello > bello
```

Because:

```text
h > b
```

---

# 7. Why NOT use `==` for Strings

## Wrong

```java
if(str1 == str2)
```

## Reason

- Strings are objects
- `==` compares memory references
- Not actual content

---

## Correct Way

```java
if(str1.compareTo(str2) == 0)
```

---

# 8. Substring

## substring(beginIndex, endIndex)

Used to extract part of string.

```java
String sentence = "My name is Tony";

String name = sentence.substring(11, sentence.length());
```

Output:
```text
Tony
```

---

## Important

- `beginIndex` = Inclusive
- `endIndex` = Exclusive

Example:

```java
String str = "Tony Stark";

System.out.println(str.substring(0, 4));
```

Output:
```text
Tony
```

---

## Single Parameter Version

```java
System.out.println(str.substring(5));
```

Output:
```text
Stark
```

---

# 9. Strings are Immutable

## Meaning

- Strings cannot be changed
- Any modification creates new string

❌ Cannot:
- Edit
- Delete
- Modify existing string

✅ Java creates new string instead

---

# 10. Important Interview Point

```text
Strings are Immutable in Java
```

Very commonly asked in:
- Interviews
- Placement tests
- MCQs

---

# Quick Revision Table

| Function | Work |
|---|---|
| `next()` | Single word input |
| `nextLine()` | Full line input |
| `+` | Concatenate strings |
| `length()` | Total characters |
| `charAt()` | Character at index |
| `compareTo()` | Compare strings |
| `substring()` | Extract part of string |

---

# Most Important Concepts

- `String` is non-primitive
- `String` starts with capital `S`
- `next()` vs `nextLine()`
- `compareTo()` preferred over `==`
- `substring()` end index is exclusive
- Strings are immutable
