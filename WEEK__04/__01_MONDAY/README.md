#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 04](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__04)
## Monday, Jan. 6th 2020

---
# JavaScript
- Implementation of the EcmaScript standard (ES6)
- Programming language
- Provides the bulk of logic on websites & is **the** language on the web.

<br>

### JS References/sources
- [w3schools](https://www.w3schools.com/js/default.asp)
- [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript)

<br>

### JavaScript vs. Java
- JS: scripting language, looser rules, often easier to "just get it done"
- JS: "object-based" - has objects and classes
- JS: dynamic weak typing ("weak" - type adjusts dynamically)
  * No typed vars
  * type changes implicitly

<br>

### JS is Functional
- functions are "first-class citizens"
- functions can take functions as arguments
- functions can return functions
- functions can be stored in variables and data structures

<br>

---
## Functional Programming
- Programming paradigm like OOP
- Deals with **Pure Functions**
- Avoids most state
- States are mostly immutable

<br>

### Pure Functions
- Does not modify input
- Changes nothing (no side-effects)
- Return output
- **given some inputs, always do the same thing**

<br>

### Hallmarks of Functional Programming
- Callback functions (pass function into another function to be called later)
- `.map()`, `.reduce()`, `.filter()`
  * functions to work on streams or data structure
- *Closures*

<br>

---
## Data Types
- Object
  * functions are objects
  * as are arrays

<br>

- Primitives
  * None-object types
  * `bigint` - [BigInt MDN reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt)
  * `number`
  * `string`
  * `boolean`
  * `null` - isn't there / doesn't exist
  * `undefined` - not defined
  * `symbol`

<br>

---
## Equality in JS
- `==` - compares value, coerces type, NEVER USE
- `===` - compares value & type, ALWAYS USE

<br>

---
## Truthy and Falsy Values
- **Truthy:** Non-boolean types can be evaluated to `true`
- **Falsy:** Non-boolean types can be evaluated to `false`

<br>

---
## Terms
- string interpolation --> ` ${...} ` (backticks)
- arrow functions --> `() => return n`;
- `function numFunc() { ... }`
- anonymous functions --> `function() {...}`
- **arrow functions use the `this` keyword differently

<br>

---
## Scopes (ES6)
- #### 3 Scopes in JS
  * **global:** defined everywhere (on window in JS)
  * **function:** defined inside a function, including parameters
  * **block:** defined inside a block `{...}`

<br>

- #### `let`, `const`, `var`
  * `var` - only uses `global` and `function` scopes
  * `let` & `const` - allows all 3 scopes
    - `const` - immutable, should be your default declaration

      ```
      const x = 3; // best for immutability
      let x = 3; // when values would need to change
      var x = 3; // never use
      ```

<br>

---
## DOM - Document Object Model
- Exist in memory in your browser
- Created by the browser through `html`
- Changes to the DOM will reflect on the webpage (they'll change the document the user actually sees)
- We can manipulate the DOM in JavaScript to create dynamic web pages
- The DOM is a special object "document" in browser JS
- The DOM has a tree structure, with elements as nodes
- We use methods on document to navigate the DOM and methods/fields on elements to manipulate the DOM

<br>

---
## Events & Listeners
- Events are objects in JS that represent some *user interaction* (or other occurence)
- We set up event listeners that wait for events and run a **callback function** when the event occurs
- We can set up event listeners on any element in the DOM with 
  `myElement.addEventListeners( event, callback );`
