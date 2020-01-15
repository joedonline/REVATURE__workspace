#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 05](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__nn)
## Wednesday, Jan. 15th 2020

---
## TypeScript
- JavaScript with types! We have static typing and access modifiers
- While JS has classes and objects, OOP is better supported in TS and more widely used
 
  <br>

    **Declare** type with `var <name>: <type>;`

    Examples:

    ```
    let x: number = 3;
    let myString: String;
    let myBool: boolean = true;
    ```

  <br>

- Once type is declared, it is enforced at compile-time

<br>

## Types in JS
- JS types..with these, always use the lowercase, primitive version:

  | do this &nbsp; :heavy_check_mark: | don't do this &nbsp; :x: |
  |-|-|
  | `x: string` | `x: String` |

- `any` - This means any type, but doesn't really do static typing
- `void` - This is for functions that return nothing
- `tuple` - These are a series of types in square brackets. They provide typing for **fixed-length** arrays

  **Tuple Example**

  `let x : [string, number, string] = ["hi", 3, "hi"];`
  `let x[2] = "hello";`
  `let x[1] = 70;`

- `enum` - Enumerations provide a number of fixed choices. Prefer *enums* to *magic strings*. [REFERENCE from TypeScript website](https://www.typescriptlang.org/docs/handbook/enums.html)

  **Enum Example**

  ```
  enum Mode { A, B, C };

  let x: Mode;
  x = Mode.A;
  x = Mode.B;
  x = Mode.C;
  ```  

<br><br>

### Access Modifiers
- `public` - everywhere. This is the default.
- `protected` - in-class and subclasses
- `private` - only in class

<br>

### Classes
- Similar to Java
- Declare with `class`
- Can have: *fields*, *methods*
- You specify a `constructor() { ... }`
- Use the keyword `this` to refer to the object itself
- Can extend other classes, similar to Java

<br>

### Angular Lifecycle Hooks
- [REFERENCE](https://angular.io/guide/lifecycle-hooks)

### Angular Glossary
- [REFERENCE](https://angular.io/guide/glossary)

<br>

---
## Routing needs
- Routing module
  * A route in routes in the routing module

    **Example**

    ```
    routes: Route[] = [
      {
        path: "example",
        component: ExampleComponent, // must be imported
      }
    ];
    ```

  * A `<router-outlet>` in `app.component.html`
  * Then, create tags with *routerLink* attributes
