
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

## 43. Constructor Chaining

Constructor chaining is the process where **one constructor calls another constructor**.

### Ways to Achieve:

* `this()` → Calls constructor of the same class
* `super()` → Calls constructor of the parent class

### Rules:

* Only **one constructor calling statement** (`this()` or `super()`) is allowed
* It must be the **first statement** in the constructor
* If a constructor contains `this()`, it **will not execute PLI and IIB**
* If a class has `n` constructors, we can use at most `n-1` `this()` calls
* **Constructor recursion is not allowed** (compile-time error)

---

## 44. Use of Constructor Overloading

Constructor overloading allows a class to have **multiple constructors with different parameter lists**.

### Advantages:

* Flexible object initialization
* Supports default and custom values
* Improves readability
* Allows object creation in different ways

---

## 45. Constructor Overloading vs Method Overloading

| Feature     | Constructor Overloading                         | Method Overloading                                       |
| ----------- | ----------------------------------------------- | -------------------------------------------------------- |
| Definition  | Multiple constructors with different parameters | Multiple methods with same name but different parameters |
| Purpose     | Initialize object in different ways             | Perform similar operations differently                   |
| Return Type | Not allowed                                     | Required (can be `void`)                                 |
| Invocation  | Implicit (`new`)                                | Explicit                                                 |
| Calling     | `this()`                                        | `this.method()`                                          |

---

## 46. Parameterized Constructor

A parameterized constructor is used to **initialize instance variables with user-defined values** at object creation time.

### Use:

* Set required fields
* Define initial object state
* Avoid default values

---

## 47. Copy Constructor

A copy constructor is a **user-defined constructor** used to create a new object by copying another object.

### Use:

* Avoid reference sharing
* Protect mutable data
* Controlled object duplication

---

## 48. OOPS (Object Oriented Programming System)

OOPS is a programming paradigm that maps **real-world entities into objects**.

### Pillars:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

**State → Variables**
**Behavior → Methods**

---

## 49. Encapsulation

Encapsulation is the process of **binding data and methods together** and restricting direct access.

### Achieves:

* Data hiding
* Controlled access

### How:

* Use `private` variables
* Provide access via **getter and setter methods**

---

## 50. Diamond Problem

The Diamond Problem occurs in **multiple inheritance** due to:

* Class loading confusion
* Object creation confusion
* Memory access ambiguity

➡️ Solved using **interfaces**

---

## 51. Upcasting and Downcasting

### Upcasting

* Subclass → Superclass reference
* Access only superclass members

### Downcasting

* Superclass → Subclass reference
* Access both superclass and subclass members
* Must be preceded by upcasting

⚠️ Else → `ClassCastException`

---

## 52. Polymorphism

Polymorphism means **one name, multiple behaviors**.

---

### 52.1 Compile-Time Polymorphism (Static Binding)

Binding happens at compile time.

Achieved using:

* Method overloading
* Constructor overloading
* Variable shadowing
* Method shadowing (static methods)

---

### 52.2 Runtime Polymorphism (Dynamic Binding)

Binding happens at runtime.

Achieved using:

* Method overriding
  Decision depends on **object creation**, not reference type.

---

## 53. Variable Shadowing

Variable shadowing occurs when **variables with the same name exist in different scopes**.

### Use:

* Reuse variable names
* Maintain scope clarity

### Used In:

* Constructors
* Methods
* Setters
* Blocks
* Loops
* Inheritance

---

## 54. Annotations

Annotations provide **extra validation at compile time**.

### Example:

* `@Override` ensures correct method overriding
  If signature mismatch → compile-time error

---

## 55. Abstraction

Abstraction means **showing essential features and hiding implementation details**.

### Achieved Using:

* Abstract classes
* Interfaces

---

## 56. Abstract Class

* Cannot be instantiated
* Can contain abstract and concrete methods
* Provides partial abstraction

---

## 57. Interface

* Used to achieve **100% abstraction**
* Supports multiple inheritance
* Cannot create objects
* Methods → `public abstract` by default
* Variables → `public static final` by default
* No constructor, static block, or instance block allowed
* Static methods accessed using interface name

### Inheritance Rules:

* Class → Class → `extends`
* Class → Interface → `implements`
* Interface → Interface → `extends`
* Class → Interface ❌ not allowed

---

## 58. Types of Interfaces

1. **Normal Interface**

   * Contains multiple abstract methods

2. **Marker Interface**

   * Contains no abstract methods

3. **Functional Interface**

   * Contains only one abstract method

---

## 59. Object Class

`Object` is the **supermost class** in Java (`java.lang` package).

### Non-static Methods:

* `toString()`
* `hashCode()`
* `equals(Object obj)`
* `finalize()`
* `getClass()`
* `clone()`
* `wait()`
* `wait(long)`
* `wait(long, int)`
* `notify()`
* `notifyAll()`

---

## 60. Why Override toString()

To **print object data** instead of memory address.

---

## 61. Why Override equals()

To **compare object data** instead of memory addresses.

---

## 62. Exception

An exception is a **runtime problem** that disrupts normal program flow.

---

## 63. Exception Hierarchy

### Error

* VirtualMachineError
* StackOverflowError
* OutOfMemoryError

### Exception

#### RuntimeException (Unchecked)

* ArithmeticException
* InputMismatchException
* NullPointerException
* ClassCastException
* IndexOutOfBoundsException

#### Checked Exception

* SQLException
* IOException
* FileNotFoundException
* CloneNotSupportedException
* InterruptedException
* ClassNotFoundException

---

## 64. What Happens When Exception Occurs

* Program flow stops
* Exception object is created
* JVM searches for handler
* If handled → program continues
* If not → program terminates

---

## 65. Exception Handling Types

* Try–Catch
* Try–Multiple Catch
* Try–Finally
* Try–Catch–Finally

---

## 66. Exception Keywords

### Try

Contains risky code

### Catch

Handles exception safely

### Finally

Always executes (cleanup)

### Throw

Manually throws exception

### Throws

Declares exception responsibility

---

## 67. Wrapper Classes

Wrapper classes convert **primitive types into objects**.

### Why Needed:

* Collections & Generics
* Utility methods
* Support `null`

### Mapping:

| Primitive | Wrapper   |
| --------- | --------- |
| byte      | Byte      |
| short     | Short     |
| int       | Integer   |
| long      | Long      |
| float     | Float     |
| double    | Double    |
| char      | Character |
| boolean   | Boolean   |

---

## 68. Boxing and Unboxing

* **Boxing** → Primitive → Wrapper
* **Unboxing** → Wrapper → Primitive

---

## 69. Collection Framework

The Collection Framework provides mechanisms to perform:

* CRUD operations
* Searching
* Sorting
  on a **group of objects**

---

## 70. Collection Framework – Overview

### Collection

A **collection** is a group of objects stored inside another object.

### Framework

A **framework** is a set of inbuilt **classes and interfaces** that provides ready-made functionality.

---

## 71. Collection Hierarchy

```
Iterable
 └── Collection
      ├── List
      │    ├── ArrayList
      │    ├── LinkedList
      │    ├── Vector
      │    │    └── Stack
      ├── Set
      │    ├── HashSet
      │    ├── LinkedHashSet
      │    └── TreeSet
      └── Queue
           ├── PriorityQueue
           └── LinkedQueue
```

---

## 72. List Interface

* `List` is an **interface**
* Sub-interface of `Collection`
* Present in `java.util` package
* Cannot create object of List (interface)
* Reference variable is allowed

### Properties:

* Can store **different types of objects** (Non-generic)
* **Dynamic** in size
* Maintains **insertion order**
* Allows **duplicate elements**
* Maintains **index** (starts from 0)
* Allows **null values**

---

## 73. Common List Methods

| Method                    | Description       | Return Type |
| ------------------------- | ----------------- | ----------- |
| `add(Object)`             | Add element       | boolean     |
| `size()`                  | List size         | int         |
| `get(int)`                | Get element       | Object      |
| `addAll(Collection)`      | Add collection    | boolean     |
| `addAll(int, Collection)` | Add at index      | boolean     |
| `remove(int)`             | Remove by index   | Object      |
| `remove(Object)`          | Remove object     | boolean     |
| `removeAll(Collection)`   | Remove collection | boolean     |
| `clear()`                 | Clear list        | void        |
| `contains(Object)`        | Search element    | boolean     |
| `containsAll(Collection)` | Search collection | boolean     |

📌 `toString()`, `hashCode()`, and `equals()` are already overridden in collection classes.

---

## 74. Types of Collection

### 1. Generic Collection

* Stores **same type of objects**
* Uses `< >` (angle brackets)

### 2. Non-Generic Collection

* Stores **different types of objects**

---

## 75. Collection Operations

### Add Operations

* `add(Object)`
* `addAll(Collection)`
* `add(int, Object)`
* `addAll(int, Collection)`

### Remove Operations

* `remove(Object)`
* `remove(int)`
* `removeAll(Collection)`
* `clear()`

### Search Operations

* `contains(Object)`
* `containsAll(Collection)`

### Access Operations

* `get(int)`
* `iterator()`
* `listIterator()`
* For-each loop

---

## 76. For Loop vs For-Each Loop

### For Loop

* Three parts: initialization; condition; increment/decrement
* Full control over index
* Can stop using condition or `break`

### For-Each Loop

* Syntax: `element : collection`
* No index control
* Cannot modify condition
* Can stop only using `break`

---

## 77. Iterator

Iterator is a **cursor interface** used to traverse collections.

### Methods:

* `hasNext()` → checks next element (boolean)
* `next()` → returns next element (Object)
* `remove()` → removes last accessed element (void)

⚠️ Calling `remove()` before `next()` causes `IllegalStateException`
➡️ Iterator supports **forward traversal only**

---

## 78. Vector

* Implementation class of `List`
* Present in `java.util`
* Legacy class (since JDK 1.0)
* Dynamic data structure
* Stores objects in **continuous memory**
* Methods are **synchronized**

---

## 79. ArrayList vs Vector

| Feature         | ArrayList        | Vector       |
| --------------- | ---------------- | ------------ |
| Synchronization | Not synchronized | Synchronized |
| Performance     | Faster           | Slower       |
| Thread Safety   | Not thread-safe  | Thread-safe  |
| Usage           | Preferred        | Legacy       |

---

## 80. Stack

* Subclass of `Vector`
* Follows **LIFO / FILO**
* Legacy class
* Used for stack operations

### Stack Methods:

| Method         | Description         |
| -------------- | ------------------- |
| `push(Object)` | Add element         |
| `pop()`        | Remove & return top |
| `peek()`       | View top element    |
| `isEmpty()`    | Check empty         |

⚠️ `pop()` or `peek()` on empty stack → `EmptyStackException`

---

## 81. LinkedList

* Implements `List` and `Queue`
* Introduced in JDK 1.2
* Uses **Doubly Linked List**
* Best for insertion & deletion
* Uses `ListIterator` for traversal

### Types of Linked Lists:

* **Singly Linked List** → One-direction
* **Doubly Linked List** → Two-direction
* **Circular Doubly Linked List** → Continuous looping

---

## 82. PriorityQueue

* Implementation of `Queue`
* Introduced in JDK 1.5
* Follows **priority order**, not insertion order
* Default: **Min-Heap**
* No null values
* Allows duplicates
* Same type objects only
* Implemented using **Heap**

---

## 83. Heap Data Structure

* Non-linear structure
* Follows **Complete Binary Tree**

### Types:

* **Min Heap** → Parent ≤ Child
* **Max Heap** → Parent ≥ Child

---

## 84. HashSet

* Implementation of `Set`
* Introduced in JDK 1.2
* No insertion order
* No sorting order
* No duplicates
* Allows **one null**
* Uses **HashTable**
* Fast performance

---

## 85. LinkedHashSet

* Maintains **insertion order**
* No duplicates
* Allows one null
* Uses **HashTable + Doubly Linked List**
* Slightly slower than HashSet

---

## 86. TreeSet

* Implements `NavigableSet`
* Introduced in JDK 1.2
* Maintains **sorted order**
* No duplicates
* No null allowed
* Same type objects only
* Used when **sorted + unique** data is required

---

## 87. Map Interface

* `Map` is an **interface**
* Present in `java.util` package
* Stores data in **key–value pairs**
* One key–value pair is called an **Entry**
* **Keys must be unique**
* **Values can be duplicated**
* Map is **not part of Collection** (because it stores key–value pairs)

### Implementing Classes:

* HashMap
* LinkedHashMap
* TreeMap

---

## 88. Common Map Methods

| Method                 | Description            | Return Type |
| ---------------------- | ---------------------- | ----------- |
| `put(key, value)`      | Add entry              | Object      |
| `remove(key)`          | Remove entry           | Object      |
| `containsKey(key)`     | Check key              | boolean     |
| `containsValue(value)` | Check value            | boolean     |
| `get(key)`             | Get value              | Object      |
| `entrySet()`           | Convert entries to Set | Set         |
| `keySet()`             | Get all keys           | Set         |
| `values()`             | Get all values         | Collection  |

📌 If a key already exists, `put()` **overwrites the old value**
📌 If key is new, `put()` returns `null`

---

## 89. HashMap

* Implementation class of `Map`
* Introduced in **JDK 1.2**
* Does **not maintain insertion order**
* Does **not maintain sorting order**
* No duplicate keys
* Allows duplicate values
* Allows **one null key**
* Allows **multiple null values**
* Internally uses **HashTable (Hashing)**
* **Not synchronized**
* Very fast performance

### Use Case:

* When **fast access** is required
* Order is **not important**

---

## 90. LinkedHashMap

* Implementation class of `Map`
* Introduced in **JDK 1.4**
* Maintains **insertion order**
* No sorting order
* No duplicate keys
* Allows duplicate values
* Allows one null key
* Allows multiple null values
* Uses **HashTable + Doubly Linked List**
* Slightly slower than HashMap
* Not synchronized

### Use Case:

* When **unique keys + insertion order** is required

---

## 91. TreeMap

* Implementation class of `NavigableMap`
* Introduced in **JDK 1.2**
* Maintains **sorted order of keys**
* No insertion order
* No duplicate keys
* Allows duplicate values
* ❌ Does not allow null keys
* Allows multiple null values
* Stores data in **sorted structure**

### Use Case:

* When **sorted key–value pairs** are required

---

## 92. Comparable Interface

* Present in `java.lang` package
* Introduced in **JDK 1.2**
* Used to define **natural sorting order**
* Contains only one method:

  * `compareTo(Object o)`
* Sorting logic written in **same class**
* Allows **only one sorting sequence**
* Modifies original class

### Used With:

* `Collections.sort()`
* `TreeSet`
* `TreeMap`

📌 Classes like `String`, `Integer`, `Float` already implement Comparable

---

## 93. Comparator Interface

* Present in `java.util` package
* Introduced in **JDK 1.2**
* Used to define **custom sorting**
* Methods:

  * `compare(Object o1, Object o2)`
  * `equals(Object obj)`
* Sorting logic written in **separate class**
* Allows **multiple sorting sequences**
* Does not modify original class

### Used When:

* Class source code cannot be changed
* Sorting based on multiple fields

---

## 94. Comparable vs Comparator

| Feature        | Comparable  | Comparator     |
| -------------- | ----------- | -------------- |
| Package        | java.lang   | java.util      |
| Method         | compareTo() | compare()      |
| Sorting Logic  | Same class  | Separate class |
| Sorting Types  | One         | Multiple       |
| Modifies Class | Yes         | No             |

---

## 95. Enum (Enumeration)

* Enum is a **special data type**
* Introduced in **JDK 1.5**
* `enum` is a keyword
* Enum constants are **public static final**
* Enum constants are **objects**
* Cannot be instantiated using `new`

### Uses:

* Restrict values
* Improve readability
* Avoid invalid data
* Replace multiple constants
* Provide type safety

### Enum Methods:

* `values()` → All constants
* `valueOf()` → String to enum
* `ordinal()` → Index position
* `name()` → Constant name

---

## 96. Functional Programming

Functional Programming is a programming style where programs are written using **functions without modifying data**.

📌 Java 8 introduced Functional Programming to make Java:

* Shorter
* Cleaner
* Faster
* More modern

---

## 97. Functional Interface

* Contains **exactly one abstract method**
* Can have multiple default or static methods
* Required for **lambda expressions**
* `@FunctionalInterface` annotation is optional but recommended

---

## 98. Predefined Functional Interfaces

| Interface  | Method      | Use            |
| ---------- | ----------- | -------------- |
| Runnable   | run()       | Threads        |
| Comparable | compareTo() | Sorting        |
| Comparator | compare()   | Custom sorting |

---

## 99. Anonymous Class

* Class without a name
* Created and used **in one step**
* Used when class is needed **only once**

### Used For:

* Overriding methods
* Implementing interfaces temporarily

---

## 100. Lambda Expressions

* Anonymous function
* Provides implementation of functional interface
* Reduces boilerplate code

### Syntax:

```
(parameter) -> expression
```

OR

```
(parameter) -> {
    // multiple statements
}
```

---




