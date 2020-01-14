#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
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
  * Project Owner
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
