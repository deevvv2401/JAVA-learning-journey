# JAVA Operators + Binary Number System + Bitwise Shift Operators Notes

## Topics Covered

- Arithmetic Operators
- Unary Operators
- Pre Increment / Post Increment
- Pre Decrement / Post Decrement
- Relational Operators
- Logical Operators
- Binary Number System
- Decimal ↔ Binary Conversion
- Bitwise Operators
- Left Shift (`<<`)
- Right Shift (`>>`)
- Assignment Operators

---

# MOST IMPORTANT QUESTIONS 🔥🔥🔥

---

# 1. Why Does `x << n = x × 2ⁿ` Work?

## Formula

```java
x << n = x × 2^n
```

## Explanation

Left shift moves every bit toward a HIGHER power of 2.

Example:

```java
5 << 1
```

Binary:

```java
101
```

Shift left:

```java
1010
```

Decimal values:

| Binary | Decimal |
|---|---|
| `101` | 5 |
| `1010` | 10 |

So:

```java
5 << 1 = 10
```

because every bit moved one power higher.

---

# 2. Does Leftmost Bit Always Survive?

## NO ❌

It survives ONLY if enough storage exists.

---

## Example (Unlimited Storage)

```java
101 << 1
```

Result:

```java
1010
```

Nothing deleted.

---

## Example (Fixed 4-bit Storage)

```java
1111 << 1
```

Actual shift:

```java
11110
```

But only 4 bits allowed.

So leftmost extra bit gets removed:

```java
1110
```

---

# IMPORTANT UNDERSTANDING

Bit shifting itself NEVER deletes bits.

Bits are deleted ONLY because storage size is fixed.

---

# 3. Does Formula Fail During Overflow?

## YES ✅

The formula:

```java
x << n = x × 2^n
```

works ONLY when overflow does not happen.

---

## Example Where Formula Works

```java
0011 << 1
```

Result:

```java
0110
```

Decimal:

```java
3 × 2 = 6
```

Correct ✅

---

## Example Where Formula Fails

Fixed 4-bit storage:

```java
1111 << 1
```

Expected mathematically:

```java
15 × 2 = 30
```

Binary of 30:

```java
11110
```

But 4-bit storage stores only:

```java
1110
```

Which is:

```java
14
```

So formula fails because overflow happened.

---

# 4. Why Can Leading Zero Be Ignored But Leading One Cannot?

## Example

```java
010
```

and

```java
10
```

represent SAME value.

Because:

```java
0 × 2² = 0
```

Leading zero contributes nothing.

---

## But

```java
101
```

cannot become:

```java
01
```

because leftmost `1` contributes value.

---

# Example

```java
101
```

means:

```java
1×2² + 0×2¹ + 1×2⁰
= 4 + 0 + 1
= 5
```

---

# 5. Why Does Right Shift Divide By Powers of 2?

## Formula

```java
x >> n = x / 2^n
```

---

## Explanation

Right shift moves bits toward LOWER powers of 2.

Example:

```java
1000
```

Decimal:

```java
8
```

Shift right by 1:

```java
0100
```

Decimal:

```java
4
```

So:

```java
8 >> 1 = 4
```

---

# 6. Difference Between Left Shift And Right Shift

| Left Shift `<<` | Right Shift `>>` |
|---|---|
| Moves bits LEFT | Moves bits RIGHT |
| Adds zeros on RIGHT | Removes bits from RIGHT |
| Multiplies by powers of 2 | Divides by powers of 2 |
| Overflow may happen on LEFT | Bits disappear from RIGHT |

---

# 7. Understanding Fixed Storage

Computers store data in fixed memory sizes like:
- 4 bits
- 8 bits
- 16 bits
- 32 bits

---

## Example

4-bit storage:

```java
1111 << 1
```

Actual shift:

```java
11110
```

But only 4 bits allowed:

```java
1110
```

Extra bit gets discarded.

---

# IMPORTANT QUESTIONS 🔥

---

# 1. Difference Between Pre Increment And Post Increment

## Post Increment

```java
a++
```

Meaning:

```java
Use value first
Then increment
```

---

## Pre Increment

```java
++a
```

Meaning:

```java
Increment first
Then use value
```

---

## Example

```java
int a = 5;

int b = a++ + ++a;
```

Step-by-step:

| Expression | Value Used | New Value of `a` |
|---|---|---|
| `a++` | 5 | 6 |
| `++a` | 7 | 7 |

Final:

```java
b = 12
a = 7
```

---

# 2. Decimal To Binary Conversion

## Method

Repeatedly divide by 2.

---

## Example

Convert:

```java
5
```

Process:

```java
5 ÷ 2 = 2 remainder 1
2 ÷ 2 = 1 remainder 0
1 ÷ 2 = 0 remainder 1
```

Read from bottom to top:

```java
101
```

So:

```java
5(decimal) = 101(binary)
```

---

# 3. Binary To Decimal Conversion

## Example

```java
101
```

Calculation:

```java
1×2² + 0×2¹ + 1×2⁰
```

```java
4 + 0 + 1
```

```java
= 5
```

---

# 4. Difference Between Logical AND (`&&`) And Bitwise AND (`&`)

| Logical AND `&&` | Bitwise AND `&` |
|---|---|
| Works on boolean conditions | Works on bits |
| Returns true/false | Returns binary result |
| Used in conditions | Used in bit manipulation |

---

## Example

### Logical AND

```java
(5 > 2) && (10 > 3)
```

Result:

```java
true
```

---

### Bitwise AND

```java
0101 & 0110
```

Result:

```java
0100
```

---

# 5. Left Shift Visualization

## Example

```java
0101 << 1
```

Move every bit left:

```java
1010
```

A zero is added on right side.

---

# 6. Right Shift Visualization

## Example

```java
1010 >> 1
```

Move every bit right:

```java
0101
```

Rightmost bit disappears.

---

# GOLDEN RULES 🔥

| Concept | Rule |
|---|---|
| `x << n` | Multiply by `2^n` |
| `x >> n` | Divide by `2^n` |
| Pre Increment | Change first, use later |
| Post Increment | Use first, change later |
| Left Shift | Bits move LEFT |
| Right Shift | Bits move RIGHT |
| Overflow | Happens in fixed storage |
| Leading Zero | Usually ignorable |
| Leading One | Carries value |

---

# QUICK REVISION

## Unary Operators

```java
++
--
```

Works on single operand.

---

## Arithmetic Operators

```java
+
-
*
/
%
```

---

## Relational Operators

```java
==
!=
<
>
<=
>=
```

Returns boolean values.

---

## Logical Operators

```java
&&
||
!
```

Used for conditions.

---

## Bitwise Operators

```java
&
|
^
~
<<
>>
```

Works directly on bits.

---

# FINAL UNDERSTANDING 🔥

Bitwise operators do NOT work on decimal numbers directly.

Computers first convert numbers into binary internally.

Then:
- shifting
- AND
- OR
- XOR
- complement

operations happen on bits.

That is why understanding binary system is VERY IMPORTANT for bit manipulation.