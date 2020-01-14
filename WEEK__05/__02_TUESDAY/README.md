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
