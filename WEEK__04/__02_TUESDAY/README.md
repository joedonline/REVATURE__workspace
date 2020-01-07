#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 04](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__04)
## Tuesday, Dec. 7th 2020

---
# JSON: JavaScript Object Notation
- A very common way of representing objects as strings
- Looks like:

```
// example 1
{
  "myString": "Hi",
  "myNumber": 33
}

// example 2
[
  {
    "myBool": true,
    "myNull": null
  },
  {
    "myEmptyArray": [],
    "myEmptyObject": {}
  }
]
```

<br>

### In JavaScript
- Use `JSON.parse()` and `JSON.stringify()`

<br>

### In Java
- use `Jackson`
- `Jackson` ???? uses an Object Mapper

<br>

---
## HTTP: HyperText Transfer Protocol
- Communication over the web with request-resonse cycle

<br>

### A Request
- Goes from client to server
- Has the following structure:
  * **request line:** `method/verb` `URI` `http version`
  * **headers:** key-value pairs of request metadata
    - examples: `Content-Type`, `Accept`, `Encoding`
  * **body:** actual content, often JSON or nothing

<br>

#### URI: Uniform Resource Identifier
- i.e. `www.google.com`

#### method/verb
- one of the list of HTTP methods
- [Reference: REST API Tutorial](https://www.restapitutorial.com/lessons/httpmethods.html)
- [Reference: Wikipedia](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol)
- `POST`, `GET`, `PUT`, `PATCH`, `DELETE`

#### http version
- specifies the version of protocol we're using (we don't specify this)

#### headers
- key-value pairs that specify request metadata

#### body
- actual content

<br>

### Quick HTTP Responses
- Sent from server to client after server receives request
- Have header and body like HTTP request
- Response line includes status code, doesn't have URI or method

<br>

### Status Codes
- `200 OK`
- `300` --> redirects
- `400 Bad Request`
- `404 Not Found`
- `500 Internal Server Error` 

#### Status codes
- `100s` -- informational
- `200s` -- success
- `300s` -- redirects
- `400s` -- client errors
- `500s` -- server errors
