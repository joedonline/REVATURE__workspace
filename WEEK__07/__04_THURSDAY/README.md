#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
---
# :calendar: [WEEK 07](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__07)
## Thursday, Jan. 30th 2020

<br>

---
## REST: REpresentational State Transfer
- A way of designing an API
- Representation = represents the resources
- Endpoints in your API correspond to "Resources"
  * Resources = they are **nouns**, not verbs <br><br>
- When using REST in HTTP, we use HTTP methods and status codes consistently
- We try to not have a documentation required, we do our best to setup REST API to be self-explanatory whenever someone hits your endpoint(s)

<br><br>

---
## AOP: Aspect Oriented Programming
- Complements OOP, provides another way to think about program structure
- AOP deals with **"cross-cutting concerns"**, aspects of your program necessary throughout many objects.
  * Logging
  * Security
  * DB Transactions
  * Serialization / Deserialization
  * File compression / decompression
  * Exception Handling (Generic)
- [Crosscut - definition, vocabulary](https://www.vocabulary.com/dictionary/crosscut)

<br>

### Aspect
- The modularization of a feature or concern that touches many parts of the program, but is not related to the program's primary function.

<br>

### Join Point
- Any point during the execution of your program which can cause an Aspect to apply its functionality. 
  * Concretely, method calls and exception handling.

<br>

### Advice
- The action taken by an Aspect at an associate Join Point.
- Advice can occur before, after, or "during" the join point

<br>

### Pointcut
- The set of Join Points associated with some Advice

<br>

### How Spring-AOP works:

- ##### Proxies and Runtime Weaving
  * Proxy is an Object that contains our objects. The Proxy and its contained Object together make an advised object that has functionality from Aspects and Objects both
  * The process of producing proxies is called **weaving**
  * Spring AOP weaves at runtime
  * AspectJ AOP weaves at compile time

<br><br>
