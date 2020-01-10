#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 04](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__04)
## Friday, Jan. 10th 2020

<br>

---
## Cross-origin stuff
- [REFERENCE @ Apache Tomcat, vesion 7](https://tomcat.apache.org/tomcat-7.0-doc/config/filter.html)
- [REFERENCE @ Apache Tomcat, vesion 8.5](https://tomcat.apache.org/tomcat-8.5-doc/api/org/apache/catalina/filters/CorsFilter.html)
- [SOLUTION 1, using <filter>, StackOverflow](https://stackoverflow.com/questions/56393675/how-to-enable-cors-tomcat-8-5-filter-to-access-static-files)

<br>

---
## Essential Pieces for Client(JS)-Server(Java) Communication

<br>

### Front-to-back
- `fetch`
  * at minimum, `fetch(url);`
  * where `url = http://localhost:8080/project/endpoint`

  <br>

- setup Servlet, listening for "url"
  * Create a `Servlet`
  * Override the Servlet by adding a <servlet> element to `web.xml`
  * Associate the registered Servlet with "url" using a <servlet-mapping> element in `web.xml`

  <br>

- The things that must match:
  * The `url` used for communication. Be careful because the listening url is built from pieces (project name, url-pattern)

  <br>

- The `HTTP` method and `do__()` method
  * If we send HTTP GET, `doGet()` must be overriden in our Servlet

  <br>

- The medium. Both Client and Server should use JSON or both Client and Server should use form params

<br>

---
## Static HTTP Servers
- Can serve static files, responding to HTTP requests with HTML, CSS, and JavaScript

<br>

---
## Dynamic Web Servers
- Can respond to HTTP requests programmatically
- This means they are much more flexible
- Enable **webapps**
  * A website is HTML, CSS, JS sent to client and no further communication
  * A webapp consists of HTML, CSS, JS sent to client that the client uses for a continuing conversation with the Server.
  * Often supports CRUD

<br>

---
## Tomcat
- Tomcat both serves static files and is a dynamic web server
- Dynamic behavior in Tomcat uses the `Java Servlet API` and is enabled by Catalina, the Web Container/Servlet container.
- Catalina has the `main()` method and is configured by `web.xml`
- Catalina instantiates Servlets, routes requests and responses to those Servlets

<br>

---
## Servlet Lifecycle
- Catalina is responsible for calling all lifecycle methods 
  * `init()` -- called once on startup
  * `service()` -- called many times, once for each request
  * `destroy()` -- called once before removing Servlet
- We can override these methods if necessary, but normally not necessary

<br>

---
## Servlet Config and ServletContext
- Both are places to store parameters your Servlets can access.
- `Config` is associated with a single Servlet (so each Servlet has its own)
  * Add a param by placing on `<init-param>` element inside a `<servlet>`
- Context is shared among all Servlets
  * Add a param by placing a `<context-param>` element inside your `<webapp>` element
- Each parameter is a key-value pair

<br>

**Example** (in `web.xml`)

```
<context-param>
  <param-name>fruit</param-name>
  <param-value>apple</param-value>
</context-param>
```

<br>

---
## Event Propagation Through the DOM

```
<html>
  <body>
    <div>
      <div>
        <button>Click</button>
      </div>
    </div>
  </body>
</html>
```

<br>

- `'click'` event on button:

  | capturing phase | element | bubbling phase |
  |:-:|-|:-:|
  | &darr; | `html` | &uarr; | 
  | &darr; | `body` | &uarr; | 
  | &darr; | `div` | &uarr; | 
  | &darr; | `div` | &uarr; | 
  | &darr; | `button` | &uarr; | 

  <br>

  * Each element has 2 chances to interact with event
  * An optional 3rd argument to `addEventListener` determines whether that listener listens during *capturing* or *bubbling*.
  * Bubbling is **default**, in general don't change
  * Events continue propagating regardless of listeners, unless we call `event.stopPropagation()` -- avoid this.

  ---
  ## Closures
  - How we do encapsulation in functional languages (JS included)
  
  <br>

  ### 3 Essential Pieces in a Closure
  - an outer function
  - a value to encapsulate (close over)
  - an inner function that modifies and/or returns the closed over value

  *** **in other words** a function that returns a function

<br>
