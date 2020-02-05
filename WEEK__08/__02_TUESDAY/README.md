#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 08](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__08)
## Tuesday, Feb. 4th 2020

---
# SOA: Service Oriented Architecture
- [REFERENCE - Source Book 1](https://www.opengroup.org/soa/source-book/soa/p1.htm)
- [REFERENCE - Source Book 2](https://www.opengroup.org/soa/source-book/msawp/p1.htm)
- [REFERENCE - Source Book 3](https://www.opengroup.org/soa/source-book/msawp/p2.htm)
- [REFERENCE - Source Book, see question 4](https://www.opengroup.org/soa/source-book/msawp/p3.htm)
- [REFERENCE - Microservices - Martin Fowler](https://martinfowler.com/articles/microservices.html)
- [REFERENCE - Martin Fowler](https://martinfowler.com/bliki/ServiceOrientedAmbiguity.html)

<br><br>

---
## Service Oriented Architecture
- #### Services
  * are programs that run independently, communicate over a network, and achieve some business logic.<br><br>
- #### SOA
  * is designing your application to function as a collection of services.<br><br>

<br>

---
# MSA: MicroServices Architecture
- is a *subset* of SOA, where services must satisfy more conditions
- **Microservices**
  * MUST follow <u>Single Responsibility Principle</u>
  * **cannot** be composed of other services
  * must achieve **scalability** and **resilience** through independence

<br><br>

---
## "Typical" Enterprise SOA vs. MSA

| Larger Services | Smaller Services (SRP) |
|-|-|
| Communicates with SOAP | Communicate with RESTful |
| &nbsp; &rarr; Communicate with rigid rules: each service's API follows a contract (the WSDL file) | &nbsp; &rarr; HTTP: |
| "Smart pipes" <br> (will come back here) | &nbsp;&nbsp;&nbsp; * RESTfull APIs act on HTTP verbs |
| Typically use a "Message Bus" to manage communication between services--every message is routed through the bus | &nbsp;&nbsp;&nbsp; * respond with Status codes |
|  | &nbsp;&nbsp;&nbsp; * JSON in body of req/resp |
|  | "Smart endpoints", "dumb pipes" <br> (will come back here) |
|  | Typically uses Service registry and discovery to enable direct communication |

<br><br>

---
## Benefits of MSA vs. Monoliths
- **Loosely coupled Services**
  <br>

- **(Enforced) modularity**
  <br>

- **Fault-tolerant**
  * no Single Point of Failure
    <br>

- **Scalable**
  * Independent services scale independently
    <br>

- **Implementation agnostic**
  * services can use different tech / languages
    <br>

- **Testable**
  <br>

- **Organizational benefit**
  * small teams working independently managing separate services     

<br><br>

## Drawbacks of MSA
- `(1)` **NETWORK LATENCY!!!**
  * "Chatty" microservices communicating too often
  <br><br>

- `(2)` **Distributed data storage**
  * we make tradeoffs and settle for eventual consistency
  <br><br>

- `(3)` **Monitoring and Logging**
  * are more difficult over a network
  <br><br>

- `(4)` **Deploying 100s of services**
  * can be difficult
  <br><br>

- `(5)` **Complexity/Refactoring**
  * changes in few services are easier
  * changes across many are harder

<br><br>

## Solutions / Mitigations of Drawbacks
- **For `(1)` -- Combine microservices that constantly communicate**
  * If they are too "chatty", combine them
    <br><br>

- **For `(1)` -- HTTP can be replaced by messaging queues where appropriate** *(using Publisher/Subscriber pattern)*
  * (Rabbit & Kafka MQs)
    <br><br>

- **For `(2)` -- Many ways to mitigate**
  * shard
  * dbs
  * use stored caches (Redis)
  * etc.
    <br><br>

- **For `(3)` -- Distributed logging and tracing tools**
  * Spring Cloud Sleuth
  * Zipkin
    <br><br>

- **For `(4)`**
  * Docker for containerization
  * Kubernetes for "container orchestration"
  * Cloud providers for hardware
    <br><br>

<br><br>

---
# Netflix OSS MSA Tools
<br>

### Eureka Server:
- Service Registry
<br><br>

### Eureka Client:
- Discovery Client
  * (registers with Eureka Server)
<br><br>

### Ribbon:
- Load Balancer
<br><br>

### Zuul:
- Gateway
<br><br>

### Feign:
- HTTP Client
  * (sends HTTP requests)
<br><br><br>

## Our Services

#### `dogdiscover`
#### `doggateway`
#### `dogeureka`
#### `doggetter`
#### `appdog` (2 instances)
