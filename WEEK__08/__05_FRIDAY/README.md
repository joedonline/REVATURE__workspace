#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
---
# :calendar: [WEEK 08](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__08)
## Friday, Feb. 7th 2020

---
## Spring Cloud Config
- Centralized and version-controlled configuration

<br>

### Spring Cloud Config: Two Parts
- reads a Git repo with config files and broadcasts configuration
- **Config Client:** 
  * receives configuration from config server instead of `src/main/resources/application.properties`

<br><br>

---
## SOAP: Simple Object Access Protocol
- A protocol for sending objects/messages using highly structured XML
- A messaging protocol not tied to any particular transfer protocol
  * anything that sends XML can send SOAP
- When we use SOAP to build web services, we "**expose**" and "**consume**" SOAP

<br>

### SOAP Format

```
Envelope              : Entire message
  Header (optional)   : Metadata
  Body                : Content
    Fault (optional)  : Problem
```

<br>

#### Example

```
<soap-env:envelope xmlns="...">

  <soap-env:header>
  </soap-env:header>

  <soap-env:body>
    <soap-env:fault>
    </soap-env:fault>
  </soap-env:body>

</soap-env:envelope>
```

<br><br>

### SOAP over HTTP
- Must use `POST`
- Must use `"text/xml"` as `Content-Type`
- All of SOAP envelope goes in request body
- Status codes: `200-299 success` <br>
  Status codes: `500-599 SOAP fault`

<br><br>

---
## WSDL: Web Services Definition Language
- "**The WSDL**" is a file written using WSDL
- The WSDL is a ***contract*** that specifies <u>precisely</u> how users can interact with a SOAP webservice.
- It makes extensive usage of custom XML namespaces and types

<br>

### Two approaches to writing a Webservice:
- **`Contract-first`:** write WSDL first, then generate Java code
- **`Contract-last`:** Write Java first, then generate WSDL

<br>

### JAXB: Java API for XML Binding
- Like Jackson, but for XML
- We use "**Marshalling**" and "**Unmarshalling**" to describe converting objects to/from XML

<br>

### Producing a SOAP web service
- [REFERENCE](https://spring.io/guides/gs/producing-web-service/)

<br><br>

---
# [REVIEW QUESTIONS](https://github.com/1912december19java/training-code/blob/master/week8/review_questions.md)
---
