#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 07](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__07)
## Tuesday, Jan. 28th 2020

---
## Spring Framework

![Spring Diagram](Spring-Diagram.png)

- A framework written in and for Java
- In some ways similar to Angular for TypeScript
- A lightweight solution and one-stop-shop for building <u>enterprise applications</u>
- It is **modular**
  * We can include any of about *20 different modules* in our apps
- It is built around an [**IoC** - Inversion of Control](https://www.journaldev.com/2461/spring-ioc-bean-example-tutorial)
  * This container makes use of Dependency Injection for all Spring-managed objects.

<br>

### IoC: Inversion of Control
- a more abstract term for Dependency Injection

<br>

### Bean
- any object managed by Spring
- can just be POJOs
- these objects in Spring, can be called Spring Beans

<br>

### Spring "core"
- It consists of 3 modules
-  **spring-core**
-  **spring-beans**
-  **spring-context**
- Consist of the IoC container and Spring Beans
- We will see these in the POM

<br>

### IoC Container
- The goal of the IoC Container is to ***decouple*** execution from configuration, making a more modular codebase
- It is responsible for:
  * instantiating
  * configuring
  * assembling beans
- It accomplishes this using **Configuration** metadata

<br>

### Configuration
- Happens via 3 different methods:
  * "Classic" XML Configuration <br><br>
  * Java Configuration with:
    - `@Configuration`
    - `@Bean` <br>
  * #### Annotation-based configuration with:
    - `@Component`
    - `@Repository` 
      * [REFERENCE: JournalDev](https://www.journaldev.com/21460/spring-repository-annotation)
    - etc. <br><br>
- **Configuration** specifies Beans and their dependency relationships
- Many modules and projects include their own preconfigured beans
