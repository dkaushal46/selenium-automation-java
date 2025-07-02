# 🔠 Character Extraction Based on String and Array Index

## ❓ Problem Statement

Write a Java program to process an array of strings based on their **array index** and the **length of each string**.

The program should follow these rules:

1. For each string in the array:
   - If the **index of the string in the array is even**:
     - If the string's length is **even**, print the character at the **second last index** (`length - 2`), which is an even index.
     - If the string's length is **odd**, print the character at the **last index** (`length - 1`).

   - If the **index of the string in the array is odd**:
     - If the string's length is **even**, print the character at the **last index** (`length - 1`).
     - If the string's length is **odd**, print the character at the **second last index** (`length - 2`), which is an even index.

2. Apply this rule to each string in the array and print the selected character for each string on a new line.

---

## 📥 Example Input

```java
String[] st = {"fhf", "uda", "fsaf", "fdsfa", "tsffa"};

Output= f d a f a
