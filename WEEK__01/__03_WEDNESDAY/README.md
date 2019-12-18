#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 01](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__01)
## Wednesday, Dec. 18th 2019

---
#### OTHER REFERENCES / SOURCES
- **[Java Memory Management, Lynda](#tbd)
- **[Java Programming Masterclass for Software Developers](#tbd)
- [Checked vs. Unchecked](https://codeahoy.com/java/2016/04/02/checked-vs-unchecked-exceptions-in-java/)
- [Java Heap Space vs. Stack](https://www.journaldev.com/4098/java-heap-space-vs-stack-memory)

---
## Wrapper Classes

|||
|-|-|
| `int` | `Integer` |
| `boolean` | `Boolean` |
| `long` | `Long` |

### Autoboxing
- Java will convert primitives to wrappers automatically (and the reverse).
- *** NOTE: 
  * Java will not do __2(??)__ automatic conversions at once
  * i.e.
   
    ``` 
    long el = 3i; // YES
    Long el = 3Li; // YES
    Long el = 3i; // NO
    ```

---
### Operators
- Arithmetic / String: 
  * `+`, `-`, `*`, `/`
  * `%`, `++`, `--`
  * `+=`, `-=`, `*=`, `/=`, `%=`

- Relational:
  * `==`, `!=`, `>`, `<`, `>=`, `<=`
    - *** NOTE: **`==`** --> *compares the references*

- Logical:
  * `&` (and), `|` (or), `!` (not)
  * Short Circuit Operators --> `&&`, `||`
  
  #### ???
    ```
    int i = 5i // i = 6

    boolean b = (i++ > 7 && i++ > 8)i 
    // i = 6, b = false

    boolean b = (i++ > 6 && i++ > 7)i 
    // i = 5, b = false

    // What is i?

    // What is b?
    ```

  * Ternary (shortened `if-else`)
    ```
    <boolean expression> ? return if `true` : return if `false`
    ```
---
## Scope
- In what parts of your code a method, object, variable, field, etc... "exists" to be used.
  
  `Truck.tow()` vs. `Car.tow()` ==> `.tow()` **does not exist in `Car`**

### 4(3) Scopes 
- **class scope:** static members of a class (stored in Heap) ([reference](https://www.journaldev.com/4098/java-heap-space-vs-stack-memory))
- **object scope:** non-static members of classes (stored in Heap) ([reference](https://www.journaldev.com/4098/java-heap-space-vs-stack-memory))
- **method scope:** the scope of a stack frame`i` includes arguments & variables declared in a method.
- **block scope:** like method scope, but not in a method.
  * uses `{ }` to denote a block

---
## Access Modifiers
- In what parts of your code you are *permitted* to access a method, field, or other member of a class or object?

[](#linebreak)
[](#linebreak)

### 4 Levels / Modifiers 
| Level | Modifier | Scope |
|-|-|-|
| 1 | `private` | only accessible inside `class` |
| 2 | (default) | `private`, plus accessible inside package (sometimes called: `packageprivate`) |
| 3 | `protected` | `packageprivate`, plus accessible inside subclasses |
| 4 | `public` | accessible anywhere |

### Typical Use
- Model classes have private fields and public getter and setter methods.

---
## Garbage Collection
- Automatic memory management in Java
- Deals exclusively with objects on the *heap*.
- `GC` deallocates ("frees up") unused objects, so that their memory can be used elsewhere.
- Objects are eligible for gabage collection once there are **no more references** point to them.
- We can't make the garbage collector run.
- We can only suggest it to run with `System.gc()`
- The garbage collector should call `finalize()` on objects **but there are no guarantees**, so *don't use it!*.
- ([REFERENCE 1](https://www.dynatrace.com/resources/ebooks/javabook/how-garbage-collection-works/))
- ([REFERENCE 2](https://docs.oracle.com/cd/E13150_01/jrockit_jvm/jrockit/geninfo/diagnos/garbage_collect.html))
- ([REFERENCE 3](https://stackify.com/what-is-java-garbage-collection/))

---
## Exceptions
- [REFERENCE](https://codeahoy.com/java/2016/04/02/checked-vs-unchecked-exceptions-in-java/)

### Four Different Things That Can AND Will Go Wrong
- Compilation Errors: 
  * We wrote bad Java code and it won't compile
  * **Only happens when converting text to byte code**

- Errors and Exceptions in Java (from the JVM)
  * Things that the JVM `throws`
  * **Only happens when trying to run byte code**
  * There are **Three Categories**
    - where each is a Class 
      * ???(what are the classes?)

  * `java.lang.Error`
    - these are thrown by the JVM when something has gone wrong with the JVM
    - Normally, these are not fixable
    - Examples: `OutOfMemoryError`, `StackOverflowError`
  
  * `java.lang.Exception`
    - these are *thrown* when a program is functioning "exceptionally badly" -- where something unexpected has occured
    - ** often, but not always, these are fixable
    - Example: `FileNotFoundException`
    - ** Exceptions are subclassed from `java.lang.Exception` are **checked exceptions**
  * `java.lang.RuntimeException`
    - these are a subclass of `java.lang.Exception` and they serve a similar purpose
    - however, they are **unchecked exceptions**
    - Examples: `ArrayIndexOutOfBoundsException`, `ArithmeticException`

### Checked vs. Unchecked Exceptions
- [See Lynda videos](#tbd)
- Checked Exceptions
  * are exceptions we can anticipate
  * because we know they are coming, the compiler will force you to **explicitly handle them**
- Unchecked Exceptions
  * Can't be reasonably anticipated, so the compiler will not force you to handle them
  * You **can** still handle them if you want (it's a good idea to do so).
