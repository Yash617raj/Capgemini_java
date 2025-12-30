
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

---

## 21. Decision Making Statements

Decision-making statements are used to control the flow of execution based on conditions.

### Types of Decision Making Statements

1. **`if`**

   * Executes a block of code when the condition is `true`.

2. **`if-else`**

   * Executes one block if the condition is `true`, otherwise executes another block.

3. **`if-else-if ladder`**

   * Used to check multiple conditions sequentially.

4. **`switch`**

   * Executes different cases based on a single expression value.

---

## 22. Java `switch` Statement – Key Points

* **Input Data Types**

  * The `switch` statement **cannot accept**:

    * `long`, `float`, `double`, `boolean`
  * Allowed types:

    * `byte`, `short`, `char`, `int`, `String`, `enum`

* **Controlling Execution Flow**

  * `break` is a **control transfer statement**
  * Required to exit the switch block and avoid *fall-through*

* **`default` Case**

  * Optional (not mandatory)
  * Can be placed **anywhere** inside the switch block

---

## 23. Loops in Java

Loops are used to execute the same set of statements multiple times.

### ICU Concept

* **Initialization**
* **Condition**
* **Updation**

---

### While Loop

```java
Initialization;
while(condition) {
    // statements
    updation;
}
```

---

### Do-While Loop

```java
Initialization;
do {
    // statements
    updation;
} while(condition);
```

---

### For Loop

```java
for(Initialization; condition; updation) {
    // statements
}
```

---

## 24. When to Use Which Loop?

* **For Loop**

  * Used when the number of iterations or final condition is known beforehand.

* **While Loop**

  * Used when the number of iterations is not known initially.

* **Do-While Loop**

  * Used when the loop body must execute **at least once**, regardless of the condition.

---

## 25. Difference Between `if-else-if ladder` and `switch`

| Feature        | if-else-if Ladder            | switch                  |
| -------------- | ---------------------------- | ----------------------- |
| Condition Type | Complex expressions & ranges | Single expression       |
| Execution      | Sequential checking          | Direct value matching   |
| Performance    | Slower for many conditions   | Faster for fixed values |
| Fall-through   | Not applicable               | Happens without `break` |

---

## 26. Methods in Java

A **method** is a block of statements used to perform a specific task.

### Method Structure

* Access Modifier / Specifier
* Return Type
* Method Name
  Example:

```java
public static void main(String[] args)
```

### Key Points

* Methods can be created **only inside the class (global area)**
* One class can have **multiple methods**
* A method executes **only when it is called**
* A method can be called **any number of times**

---

## 27. Types of Methods

### 1. No-Argument Method

* A method with **no formal arguments**

### 2. Parameterized Method

* A method with **formal arguments**

---

## 28. Method Overloading

* Multiple methods with the **same name** in the same class
* Must differ in:

  * Number of arguments
  * Data types
  * Order (sequence)

**Purpose:**
Used when performing the **same task with different inputs**

---

## 29. Typecasting in Java

Typecasting is the conversion of one data type into another.

---

### 29.1 Primitive Typecasting

#### Widening (Implicit)

* Smaller data type → Bigger data type
* No data loss

**Flow:**

```
byte → short → int → long → float → double
char → int → long → float → double
```

---

#### Narrowing (Explicit)

* Bigger data type → Smaller data type
* **May cause data loss**

---

### 29.2 Non-Primitive Typecasting

* Conversion between object references

#### Upcasting

* Subclass → Superclass

#### Downcasting

* Superclass → Subclass

---

## 30. Arrays in Java

An array is a **contiguous memory block** used to store **homogeneous data**.

### Array Creation

#### Using Array Literal

```java
datatype[] arr = {v1, v2, v3};
```

#### Using `new` Keyword

```java
datatype[] arr = new datatype[size];
```

---

## 31. Global Members in Java

Global members are declared inside the class but outside methods.

### Types of Global Members

#### Static Members

* Static variable
* Static method
* Static block (Static Initializer Block)

#### Non-Static Members

* Non-static variable
* Non-static method
* Non-static block (Instance Initializer Block)
* Constructor

---

## 32. Static Members

### Static Variable

* Declared using `static` keyword
* Stored in **class static area**
* Automatically initialized with default values
* Shared among all objects
* Accessible from both static and non-static contexts

---

### Static Block

* Used to initialize static members
* Executes **once** when the class is loaded

```java
static {
    System.out.println("Class Loaded");
}
```

---

## 33. Difference Between Global and Local Variables

| Feature        | Local Variable         | Global Variable           |
| -------------- | ---------------------- | ------------------------- |
| Scope          | Inside method/block    | Entire class              |
| Lifetime       | During block execution | Program / object lifetime |
| Initialization | Mandatory              | Default values assigned   |

---

## 34. JVM Memory Areas

* **Class Static Area**

  * Stores static members
  * Named after the class

* **Stack Area**

  * Used for method execution

* **Heap Area**

  * Stores objects

**Note:** JVM first calls the `main()` method for execution.

---

## 35. Static Variable vs Static Block

| Feature    | Static Variable         | Static Block               |
| ---------- | ----------------------- | -------------------------- |
| Purpose    | Stores class-level data | Initializes static members |
| Execution  | During class loading    | During class loading       |
| Invocation | Accessed via class name | Executes automatically     |
| Count      | Multiple allowed        | Multiple allowed           |

---

## 36. Object Creation

* Non-static members require **object creation**
* Object is created using `new` keyword
* `new` returns the **memory address**
* `ClassName` is a **non-primitive data type** that stores object reference

---

## 37. Static Variable vs Non-Static Variable

### Static Variable

* One copy shared by all objects
* Exists till class is loaded
* Accessed using class name

### Non-Static Variable

* Separate copy per object
* Exists till object exists
* Accessed using object reference

---

## 38. Non-Static Block (Instance Initializer Block)

* Declared without `static` keyword
* Executes **every time an object is created**
* Used for instance-level initialization
* Has no access modifier, return type, or name

---

## 39. Constructor in Java

* Special non-static member
* Name same as class name
* No return type
* Used to initialize objects

### Constructor Execution Order

1. **PLI** – Pre Loading Instruction (`super()`)
2. **IIB** – Instance Initializer Block
3. **UWS** – User Written Statements

---

## 40. Types of Constructors

1. **Default Constructor**

   * Provided by JVM if no constructor is written

2. **Parameterized Constructor**

   * Accepts arguments
   * Used to initialize instance variables

3. **Copy Constructor**

   * Creates object using another object

4. **Private Constructor**

   * Prevents object creation from outside class

---

## 41. Static Block vs Non-Static Block

| Feature   | Static Block              | Non-Static Block        |
| --------- | ------------------------- | ----------------------- |
| Execution | Once during class loading | Every object creation   |
| Purpose   | Static initialization     | Instance initialization |
| Access    | Static members only       | Static + Non-static     |

---

## 42. Constructor vs Method

| Feature     | Constructor       | Method          |
| ----------- | ----------------- | --------------- |
| Purpose     | Initialize object | Define behavior |
| Name        | Same as class     | Any valid name  |
| Return Type | None              | Required        |
| Invocation  | Automatic         | Manual          |

---




