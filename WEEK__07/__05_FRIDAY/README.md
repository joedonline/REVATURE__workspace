#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 07](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__07)
## Friday, Jan. 31st 2020

---
# Spring Boot
- [REFERENCE, website](https://spring.io/projects/spring-boot)
- Makes creating Spring projects a lot easier

<br>

## `SpringInitializr`
- [REFERENCE, website](https://start.spring.io/)

<br>

#### Other settings
- mostly default

<br>

#### Dependencies
- Spring Web
- SB Actuator
- Spring Data JPA
- H2 Database

<br>

### Why am I getting Unknown error in line 1 if pom.xml?
- [Stack Overflow reference](https://stackoverflow.com/questions/56142369/why-am-i-getting-unknown-error-in-line-1-of-pom-xml)

---
## Local Spring Boot installation (appuser)

- #### `src/main/resources/`
  * `application.properties`

    ```
    server.port=9999

    #Actuator setting to see management info
    management.endpoints.web.exposure.include=*
    ```
<br>

- #### `src/main/java`
  * `com.revature.appuser`
    - `HelloController.java`

      ```
      package com.revature.appuser;

      import org.springframework.web.bind.annotation.GetMapping;
      import org.springframework.web.bind.annotation.RestController;

      @RestController
      public class HelloController {

        @GetMapping("/v2/hello")
        public String helloWorld() {
          return "Hi from Spring Boot!";
        }
        
      }
      ```

<br><br>

---
## ng bootstrap
- [REFERENCE, website](https://ng-bootstrap.github.io/#/home)

<br>

---
## ng material ui
- [REFERENCE, website](https://material.angular.io/)

<br><br>

---
# Setting Up a Pipeline, DevOps

<br>

### [EC2 - Jenkins - DevOps: README.md](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__07/EC2_Jenkins_DevOps/)

<br>
