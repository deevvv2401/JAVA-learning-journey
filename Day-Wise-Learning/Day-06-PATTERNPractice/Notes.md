# Advanced Pattern Notes

## Core Idea
- Observe:
  - stars
  - spaces
  - row number

- Most formulas use:
```java
n - i
```

- Lower half:
```java
for(i=n;i>=1;i--)
```

---

# Butterfly Pattern

## Logic
```java
left stars  = i
spaces      = 2 * (n - i)
right stars = i
```

## Formula
```java
spaces = 2 * (n - i)
```

## Upper Half
```java
for(i=1;i<=n;i++)
```

## Lower Half
```java
for(i=n;i>=1;i--)
```

---

# Solid Rhombus

## Logic
```java
spaces = n - i
stars  = n
```

## Formula
```java
spaces = n - i
```

---

# Number Pyramid

## Logic
```java
spaces = n - i
print number i
print i times
```

## Important
```java
System.out.print(i + " ");
```

---

# Palindromic Pattern

## Spaces
```java
spaces = n - i
```

## First Half
```java
i -> 1
```

## Second Half
```java
2 -> i
```

---

# Diamond Pattern

## Logic
```java
spaces = n - i
stars  = (2 * i) - 1
```

## Formula
```java
stars = (2 * i) - 1
```

## Lower Half
```java
for(i=n;i>=1;i--)
```

---

# Common Structure

```java
for(rows)
{
    // spaces

    // stars / numbers

    System.out.println();
}
```

---

# Important Tips

- Advanced patterns = simple logic
- Small loop changes → new pattern
- Practice:
  - 10-15 patterns minimum

- Focus on:
  - relation
  - observation
  - loops

---

# Main Learning

```text
Pattern Questions =
Observation + Logic + Loops
```