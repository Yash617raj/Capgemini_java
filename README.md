
# ☕ Java Programming Notes

## 1. Language

A **language** is a medium used to communicate between living beings.
**Examples:** English, Hindi

## 2. Programming Language

A **programming language** is a medium used to communicate between living beings and non-living beings (computers).
**Examples:** C, C++, Java

## 3. Programming

1. Programming is basically a **verb**, representing an action to be performed.
2. The basic word of programming is a **Program**.

   * **Examples:** Reading, Writing

## 4. Software Application

A **software application** is a set of programs used to perform complex operations.
**Examples:** Calculator, Instagram

---

## 5. Criteria for a Good Programming Language

1. Readability
2. Understandability
3. Instructability

---

## 6. Levels of Technical Language

1. **Low Level Language** – Binary Language
2. **Medium Level Language** – Assembly Language
3. **High Level Language** – Programming Language

---

## 7. Java Programming Language

1. Java was invented by **James Gosling** in **1995** at **Sun Microsystems**
2. The current owner of Java is **Oracle Corporation**

---

## 8. Features of Java Programming Language

1. Object-Oriented
2. Platform Independent
3. Secure
4. Statically Typed
5. Case Sensitive

---

## 9. Software Requirements to Work with Java

1. **Software Development Environment:** Java Development Kit (JDK)
2. **Code Editor:** Sublime Text
3. **Integrated Development Environment (IDE):** Eclipse

---

## 10. Types of Software Applications

### Based on Platform (CPU + OS)

* Desktop
* Mobile

### Based on Internet Connection

* Standalone
* Web Applications

---

## 11. Language Execution Flow

### Assembly Language

```
Assembly Language → Assembler → CPU + OS
```

### Programming Language (Java)

```
Programming Language → Compiler → Virtual Machine → CPU + OS
```

---

## 12. Java Development Kit (JDK) Structure

```
JDK
 └── JRE (Java Runtime Environment)
      └── JVM, Javac, JIT
```

---

## 13. Java Standards

* According to IT standards, **one `main` method should be present in one class (1:1 ratio)**.
* Java is considered **secure** because it executes `.class` files (bytecode).
* Java is **platform independent**, but it **depends on JDK** for execution.

---

## 14. Compilation & Execution Commands

### Compilation

```bash
javac filename.java
```

### Execution

```bash
java ClassName
```

---

## 15. Java Structure

```
Module → Package → Class / Interface
```

---

## 16. Tokens in Java

A **token** is the smallest structural and functional unit of a program.

Types of Tokens:

1. Keyword
2. Identifier
3. Data Type
4. Variable
5. Literal
6. Comment
7. Separator
8. Operator

---

## 17. Compiler vs Interpreter

**Compiler**

* Compiles the entire code at once
* Generates bytecode
* Faster execution

**Interpreter**

* Executes code line by line
* Converts bytecode to binary
* Slower than compiler

---

## 18. Java Program: Area of a Square

**Question:** Print the area of a square with side `3.6`

```java
class Square {
    public static void main(String[] args) {
        double n = 3.6;
        double ans = n * n;
        System.out.println(ans);
    }
}
```

---

## 19. Java Operators

### Unary Operators

* Increment

  * Pre-increment: `++var`
  * Post-increment: `var++`
* Decrement

  * Pre-decrement: `--var`
  * Post-decrement: `var--`
* Logical NOT: `!`

### Binary Operators

* Arithmetic (`+ - * / %`)
* Relational (`< > <= >= == !=`)
* Logical AND (`&&`)
* Logical OR (`||`)

### Ternary Operator

* Conditional Operator: `condition ? trueValue : falseValue`

---

## 20. Pre-Increment vs Post-Increment

**Pre-Increment (`++var`)**

* Variable is incremented **before** it is used
* Returns the **updated value**

**Post-Increment (`var++`)**

* Variable is used **first**
* Increment happens **after**
* Returns the **original value**


