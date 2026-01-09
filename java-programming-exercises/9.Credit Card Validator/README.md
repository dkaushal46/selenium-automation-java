## 💳 Credit Card Validator – Java 💳

## ❓ Problem Statement  

Write a **Java program** that checks whether a **credit card number** entered by the user is **valid or invalid** using a checksum logic (similar to the **Luhn Algorithm**).  
The program should process each digit, apply calculations, and finally decide the validity of the card number.

---

## 📥 Input  

1️⃣ User enters a **credit card number** as a **String**  
- The card number must contain **exactly 16 digits**

---

## 📤 Output  

The program should display:  

✔ "Card is Valid" if the credit card number passes the validation  
❌ "Card is not Valid" if the validation fails  
⚠ "Card number is inValid" if the length is not 16 digits  

It should also print the **total checksum value**.

---

## 🎯 Task  

- Take user input using `Scanner`  
- Split the credit card number into individual digits  
- Convert digits from `String` to `int`  
- For digits at **even positions**:
  - Multiply by 2  
  - If the result is greater than 9, split and add the digits  
- For digits at **odd positions**, add them directly  
- Calculate the total sum of all processed digits  
- Check:
  - If `total % 10 == 0` → Card is **Valid**  
  - Otherwise → Card is **Invalid**

---

## 🧠 Rules to Follow  

- Credit card number must be **exactly 16 digits**  
- Use **arrays** to store digits  
- Use **loops and conditional statements**  
- Handle invalid input gracefully  
- Keep the program **simple and beginner-friendly**

---

## ✅ Goal  

Build a **Java program** that helps understand:

✔ Arrays  
✔ Loops  
✔ Conditional logic  
✔ String-to-integer conversion  
✔ Real-world validation logic  

💡 This program simulates how **credit card verification systems** work in real applications! 🚀
