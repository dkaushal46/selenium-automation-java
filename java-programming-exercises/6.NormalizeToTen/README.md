## NormalizeToTen-Java

## ❓ Problem Statement

Write a Java program that normalizes each element of an integer array to the value **10** and records how much was added or subtracted for each element.

---

## 📥 Input

Example:
```java
int[] Array = {0, 8, 22, 6, 2, 10, -11};
📤 Output Example

Adjustment list:

+10
+2
-12
+4
+8
+0
+21


Final normalized array:

10
10
10
10
10
10
10

🎯 Task

Traverse the array from start to end.

For each element:

If the value is less than or equal to 10:

Add the required value to make it 10

Store the adjustment as +value

If the value is greater than 10:

Subtract the required value to make it 10

Store the adjustment as -value

Store adjustments in a String[].

Update the original array so that all elements become 10.

Do not use an extra array for numbers.

Print:

Adjustment list

Final updated array