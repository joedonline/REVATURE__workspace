#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
---
# :calendar: [WEEK 05](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__05)
## Tuesday, Jan. 14th 2020

---
## Forwarding vs. Redirecting
- From the backend, we can "navigate" clients using forwards or redirects.
- A forward takes the request and current response in our Servlet and passes them to another Servlet (or static file).
- A redirect sends a response to the client telling them to send another request elsewhere.
  * i.e. `302` status code

<br>

---
## Redirecting on the front end:
- `window.location.href = "https://url.com"`

<br>

---
## Exception Handling in Servlets
- Set up `<error-page>` elements in the `web.xml` that maps either Java Exceptions or HTTP Status Code to an error handling Servlet.

---
## SDLC Resources
- "Software Development Life Cycle"

<br>

### SDLC, read:
- [agilemanifesto.org](http://agilemanifesto.org/principles.html)
  * Manifesto
  * 12 principles
- [Scrum introduction](https://www.scrum.org/resources/what-is-scrum)
- [Scrum glossary](https://www.scrum.org/resources/scrum-glossary)
  * Sprint
  * Backlog
  * Burn-down Chart
  * Product Owner
  * Scrum Master
  * Standup
  * User Stories
  * Sprint Retrospective
- Optional Bonuses
  * [Martin Fowler's blog on agile](https://martinfowler.com/agile.html)
  * [Netflix's "culture deck" 1](https://igormroz.com/documents/netflix_culture.pdf)
  * [Netflix's "culture deck" 2](https://eatsleepworkrepeat.com/netflix/)

--- 
## SDLC

### SDLC: Planning
- Business planning, not thinking about code
- Who wants, who will do, rough timeframe

### SDLC: Definition
- Specifies about the what & why of purpose and use

### SDLC: Design
- Software design
- Big-picture architecture.
- i.e. technologies
- Not implementations yet

### SDLC: Building
- Develop

### SDLC: Testing
- Unit tests
- Integration tests
- End-to-end tests
- Stress/load testing
- UAT - User-acceptance testing

### SDLC: Deployment
- Hosting
- Deliver app to client

<br>

---
## Waterfall Development
- Complete each step entirely before moving on: "Build the whole app/major version in one cycle"
- Long dev cycle; response to change is slow
- Good when specification is essential

<br>

---
## Agile Development
- Short development cycles with less separation in between
- Focus on response to change, both from clients and from development process
- Good when iteration, experimentation and occasional failure are acceptable
- This is true on the web almost all the time
- **Scrum** is an implementation of Agile

<br><br>

---
## Modern Web Development

<br>

### Dev process & tools needs to solve these problems
1. Big teams
1. Big projects
1. It must work on **all** platforms
    * OS, browsers, etc.
1. A lot of dependencies to work with

<br>

### Tooling
- TypeScript: JavaScript w/ static-typing
- (1), (2)
- Must be transpiled to JS to run
- TS is a superset of JS

<br>

### Babel
- (3)
- Converts ES6+ JS code to ES5 for compatibility

<br>

### Webpack
- (2), (3), (4)
- Minifies files and collapses dependencies
- Ideally entire js part of project ends up in `bundle.js`
- Minify the short version and remove white space 
- Collapse dependencies: reduces the number of files

<br>

### NPM: Node Package Manager
- (2), (4)
- install and manage dependencies

<br>

### Angular
- (1), (2), (3), (4)
- Front-end framework
- Makes modern web development easy
- includes all tooling to the left
- Everything just works provided we follow - "The Angular Way" (withing framework, we follow their rules even if we don't like them)

<br>

### Angular Benefits
- Modularity / DRY (Don't Repeat Yourself)
- Angular components can be reused across your site
- Functionality that needs to occur in multiple parts of the site can be shared via **services**

<br>

### SPA: Single Page Application
- Angular projects never navigate away from the initial `index.html` -- only the content changes
- Faster, looks better
- Only reload parts of the page that must change

<br>

### Support
- Angular was originally build by Google
- There is ongoing support
- Documentation and tutorials on [Angular.io](https://angular.io)
  * Tour of Heroes
  * Reference Docs

<br><br>

### Angular Basics
- #### Components
  * parts of a webpage
  * reusable
  * can be parameterized
  * consist of an HTML template, styling in CSS, and a `class` in a TypeScript file
  * Angular projects/sites are built of many nested components
- #### Services
  * Shared functionality and state across components
  * Consist of a `class` and a `.ts` file
  * Example: Use a Service to send HTTP, or state global logged-in user state in a service

### Routing
- Display different components based on URL without ever redirecting
