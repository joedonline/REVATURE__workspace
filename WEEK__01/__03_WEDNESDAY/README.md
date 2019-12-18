#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 01](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__01)
## Wednesday, Dec. 18th 2019

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
## 
