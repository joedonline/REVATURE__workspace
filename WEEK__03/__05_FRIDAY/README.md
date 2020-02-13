#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
---
# :calendar: [WEEK 05](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__nn)
## Friday, Jan. 3rd 2020

---
# Class, IDs, & Attributes
- Both are used to mark elements and apply styles
- **class:** can be semantic, or can just apply style
- **id:** can only have one `id` on an element, and `id` should be unique in the document

---
## CSS: Cascading Style Sheets
- Used to provide style to HTML documents
- "Cascade" because style can be applied in multiple places 
- Can be overwritten

### CSS Selectors
- CSS consist of **selectors** that identify elements in your document and **rulesets** w/ **rules** that actually specify style

#### Basic Selectors
- `<element>`: selects all elements of type element
- `.<class>`: selects all elements with class `<class>`
- `#<id>`: selects all elements with id `<id>`

##### Rules
- `<key>: "<value>";` pairs that specify style

#### Basic CSS Precedence
1. Things marked `!important` (NEVER USE)
2. inline style specified on an element as an attribute (NEVER USE)
3. linked stylesheets & <style> elements, in order (USE LINKED STYLESHEETS), overrides less-specific selectors

---
### CSS Box Model
- Elements displayed on the screen have content (their actual content, elements on text) surrounded by `padding`, `border`, and `margin`
- We can format the layout of our page by modifying the size of the content & padding, border, margin

---
## Bootstrap (CSS)
- Framework in HTML, CSS, JS, but will just make use of CSS
- We get `.css` files from Bootstrap's CDN & use them in our projects
- Use Bootstrap classes to apply styling to elements

### Why Bootstrap?
- Bootstrap provides responsive design - the page layout responds to your screen sizes/resolution
- We organize our page using the **Bootstrap Grid System**
- Grid System has 12-cols and as many rows as we like
- We specify the columns we want our elements to use
- In additionm, we specify at what screen size we want our columns to start stacking for responsive design

---
## CSS Combinators
- combines selectors to make more precise selectors:
  * **OR** combinator is a `,`
  * **AND** combinator is just concatenation
    - ex: `div.class` is div elements with `class="class"`
    - ex: important uderlined selects elements with `class="important-underlined"`
  * **Parent-child** CSS combinator uses `>`
    - ex: `ol > li`
    - ex: `.navbar > button` selects button elements that are direct children of `.navbar`
  * **Ancestor-Descendent** combinator uses ` ` (a space)
    - ex: `body div p`

