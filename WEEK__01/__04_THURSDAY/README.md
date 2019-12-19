#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 01](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__01)
## Thursday, Dec. 19th 2019

---
## Strings
- are Objects
- are **immutable**.
- The String class **cannot** be subclassed (it is final).
- Inside each `String` is an `array` or chars.
- Strings are stored in the **String pool**.
- Each specific `String` value only appears in the Pool once.
  * This is so that String instances can be reused & save memory.
  
  ![String Constant Pool](string_constant_pool.png)

  ![Java String Pool](java_string_pool.png)

  ![Java Stack Heap StringPool](Java_Stack_Heap_StringPool.jpg)

  ![String_Object_Pool_hep_stack](String_Object_Pool_hep_stack.png)

---
## Arrays
- are Objects
- Each array is fixed-length and has a type
- Objects or primitives inside an array are stored sequentially for fast access

### Declaring Arrays
- Declare arrays using the `type` and `[]`
- We can specify length with `[n]`, where `n = [0,1,2,...,infinity]`
- Example: 
  * `int[10]`
  * `int[4] myArray = {3,2,1,4}`
- Use these for efficiency

![Array in Heap](array_in_heap.jpg)

---
## Enhanced `for loop`
- Works with Arrays and Iterables.
- Typical `fori`
  
  ```
  for (int i=0; i < myArray.length; i++) { ... }
  ```

- Enhanced `for`
  
  ```
  for (int v : myArray) { // do something with v }
  ```

---
## Interfaces and Abstract Classes
- Both enable abstraction (OOP) in Java
- **Neither can be instantiated.**
- Both can be parents, but
  * we **implement** Interfaces
  * and **extend** Abstract classes
- Both can (and mostly do) have abstract methods
  * (an abstract method doesn't have a body)
- A typical hierarchy includes both
- `I extends I`, `C implements I`, `C extends C`

**??? LOOKUP: Collections API**
- Collections API: { `Set`, `List`, `Map` } = interfaces
  * Set, List, Map --> all cannot be instantiated!
- Abstract classes with partial implementations
  * `AbstractList`
  * `Abstract Set`
- Concrete classes
  * `ArrayList`
  * `LinkedList`
  * `HashSet`

---
## Interfaces vs. Abstract Classes

| Interfaces | Abstract Classes |
|-|-|
| You can implement multiple Interfaces | You can only directly extend **one** Abstract class |
| Methods are abstract & public (unless we change them with modifiers) | Methods can be abstract or concrete |
| Fields must be **`static`** AND **`final`**(constants) | Can have fields |
| methods can be implemented using the default modifier | Has (and **always** needs) a Constructor |
|  | In sum, they are very similar to a class |

??? ** NOTE: Non-abstract classes **cannot** have abstract methods
