\# ZeroMover-Java



\## ❓ Problem Statement



Write a Java program that moves all `0` (zero) values in an integer array to the \*\*end of the array\*\* while maintaining the \*\*original order of non-zero elements\*\*.



---



\## 📥 Input



Example:

```java

int\[] Array = {0, 0, 1, 3, 4, 2, 1, 4, 9, 0, 5, 6, 0, 0};





\##📤 Output Example
\[1,3,4,2,1,4,9,5,6,0,0,0,0,0]




🎯 Task

Traverse the array from start to end.

Whenever a 0 is found:

Shift all elements to the left.

Place the 0 at the last position.

Reduce the effective size after placing each zero

Maintain the order of non-zero elements.

Do not use an extra array.

