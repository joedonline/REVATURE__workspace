# WEEK 1
### Tuesday, Dec. 17th 2019

---
## Java:
- Object-Oriented
- Pass by value
- Strictly typed
- Verbose

---
## Why Java?
- Widespread enterprise use
- W.O.R.A. -- Write once, run anywhere (JVM)
- "Simple"
- C-based syntax
- Automatic memory management (garbage collection)

---
## JDK: Java Development Kit
- includes `javac` compiler
  * java --> `.class`
  * Java --> Bytecode
- includes `JRE`: Java Runtime Environment
  * core classes & files
    - `java.lang`
    - `java.util`
    - etc.
- JVM: Java Virtual Machines ("Adapter")
  * Compiler: `.class` --> machine code (JIT - Just In Time) ((Kaizen??))
  * Class Loader / Linker ([Oracle, Java Reference](https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-5.html))
  * Garbage collector

---
## OOP: Object-Oriented Programming

- A **programming paradigm** where objects are built from classes & have ***state*** & ***behavior***
  
#### 4 Pillars of OOP
- ##### ABSTRACTION
  * Take away details
  * Hiding intermediate (lower-level) steps
  * Design via interface, not implementation

- ##### POLYMORPHISM (Objects that takes "many forms")
  * "Being"
  * **Object Polymorphism**
    - The "`Is-a`" rule
    - "A Dog is an Animal"
  * **Method Polymorphism** 
    - The same method name can have different functionality based on its class(overriding, runtime) or arguments(overloading, compile-time)
- ##### INHERITANCE
  * Share **state** & **behavior** (lines of code) from Parent to Child
- ##### ENCAPSULATION = Access
  * `public`, `private`
  * Objects **control** access to their **state** & **behavior**

---
## Practical OOP in Java
- Inheritance: Class `extends` other Class
- Encapsulation: Access modifiers
  * `private` :: default :: `protected` :: `public`
- Polymorphhism:
  * Object Poly: Class `extends` SuperClass --> Class "is-a" SuperClass
  * Methtod Poly: Class `implements` Interface --> Class "is-a" Interface
- Abstraction: Interfaces, Abstract Classes, Abstract Methods

---
### Naming Conventions
- Classes --> in `UpperCamelCase`
- "members" (fields, methods) --> `lowerCamelCase`
- Interfaces --> `UpperCamelCase`
- Constants --> `SCREAMING_SNAKE_CASE`
