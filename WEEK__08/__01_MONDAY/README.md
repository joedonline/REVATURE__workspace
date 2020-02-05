#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 08](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__08)
## Monday, Feb. 4th 2020

<br><br>

---
## REST: REpresentational State Transfer

<br>

### 6 Traits:
- **Client-Server Architecture**
  * Client sends requests to server
  * Server responds
    <br><br>

- **Stateless**
  * The Server stores no information about clients between the requests
    <br><br>

- **Cacheable**
  * Clients and Servers should have the option to cache responses, and all communication should be marked as cacheable or not
  * ***Cache Control Header***
    - [REFERENCE 1, imperva](https://www.imperva.com/learn/performance/cache-control/)
    - [REFERENCE 2, MDN](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Cache-Control)
    <br><br>

- **Layered Architecture**
  * Clients should not be able to tell whether it is hitting the end-server or an intermediate layer
    <br><br>

- **Uniform Interface**
  * Servers should expose a uniform API to Clients
  * In practice, this means use HTTP conventions and design API as resources
    <br><br>

- **Code on Demand** (Optional)
  * Servers can send code to extend client functionality
  * References:
    - [REFERENCE 1, YouTube](https://www.youtube.com/watch?v=0CKRkvFN7jg)
    - [REFERENCE 2, restcookbook](http://restcookbook.com/Basics/codeondemand/)
    - [REFERENCE 3, wikipedia](https://en.wikipedia.org/wiki/Code_on_demand)

<br><br><br>

## HATEOAS: Hypermedia As The Engine Of Application State
- Part of "Uniform Interface"
- Representations should include, in addition to data: 
  * links (Hypermedia) to related resources
  * actions that can be taken
- References:
  * [restfulapi website](https://restfulapi.net/hateoas/)
  * [Wikipedia](https://en.wikipedia.org/wiki/HATEOAS)
  * [Spring HATEOAS](https://spring.io/projects/spring-hateoas)

<br><br>

## HTTP V erbs: Safe, Idempotent, Cacheable
- ### Safe
  * This method won't make changes on the Server
    - `GET`
    - `HEAD`
    - `OPTIONS`
    - `TRACE`
      <br><br>

- ### Idempotent
  * Sending multiple identical requests will act the same as sending one
    - All **Safe** Methods ^
    - `PUT`
    - `DELETE`
      <br><br>

- ### Cacheable
  * Cacheable by default
    - `GET`
    - `HEAD`
    - `POST`

<br><br><br>

## Richardson Maturity Model
- A way to "approach" REST
- Goes from "Level 0" (Remote Procedure Calls) to "Level 3" (HATEOAS)
- REST itself is beyond Level 3
- References:
  * [Martin Fowler website](https://martinfowler.com/articles/richardsonMaturityModel.html)

<br><br><br>
