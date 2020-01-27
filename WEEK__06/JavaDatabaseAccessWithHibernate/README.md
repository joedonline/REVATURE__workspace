# Java Database Access with Hibernate

<br>

---
## 1. Hibernate Explained
- #### What is Hibernate?
  * an Object Relational Mapping tool
  * a framework that simplifies DB access
  * Data is represented as simple Java objects
  * a session manager is used to access these object

<br><br>

---
## 2. Hibernate Example
- #### Configuration File
  * is required to use Hibernate
  * is used to define required database properties
  * The file name is `hibernate.cfg.xml`

- #### Code example

```
package main.java;

import java.util.Iterator;
import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HelloWorldExample {

  private static SessionFactory factory;
  private static ServiceRegistry registry;

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    String m = "";
    m = in.nextLine();
    try {
      Configuration conf = new Configuration().configure();
      registry = new StandardServiceRegisteryBuilder().applySettings(
        conf.getProperties()).build();
      factory = conf.buildSessionFactory(registry);
    } catch (Throwable e) {
      System.err.println("Failed to create session factory object " + e);
      throw new ExceptionInInitializerError(e);
    }
    
    Session session = factory.openSession();
    Transaction tx = null;
    Short msgId = null;
    try {
      tx = session.beginTransaction();
      Message msg = new Message(m);
      msgId = (Short) session.save(msg);
      List messages = session.createQuery("FROM Message").list();
      for (Iterator iterator = message.iterator(); iterator.hasNext();) {
        Message message = (Message)iterator.next();
        System.out.println("message " + message.getMessage());
      }
      tx.commit();
    } catch (HibernateException e) {
      if (tx != null) tx.rollback();
      e.printStackTrace();
    } finally {
      session.close();
    }
    
    StandardServiceRegistryBuilder.destroy(registry);
    
  }

}
```

<br><br>

---
## 3. Hibernate Explained

### Data persistence
  * Hibernate works with existing Java object model
  * Required objects are marked as persistent
  * Only objects with instance variables can be stored
  * Objects can be in three states of persistence
  <br>

- ##### Transient State
  * Transient objects exist in memory
  * db has no knowledge of the object
  * To persist this type, we must ask the session to save
  * At this point, it is assigned an identifier
  <br>

- ##### Persistent State
  * Once it is saved, it becomes "persistent"
  * Objects exist in the db
  * Changes are reflected in the current transaction
  * Changes are reflected in the db
  <br>

- ##### Detached State
  * These object exist in the db but a connection is lost
  * A persistent object whose session has been closed
  * It can be reattached to a hibernate session when needed
  <br>

##### Sessions explained

- Core Hibernate classes are used for db connections
- Only open a connection when needed
- Each application should have one SessionFactory instance
- A configuration object is used to create a SessionFactory object
- The SessionFactory is a thread safe object
- Create the SessionFactory object at startup
- Separate SessionFactory objects are required for multiple db connections
<br>

##### Session Object
- Only create a session object when needed
- Destroy as soon as task is completed
- The session object wraps the JDBC resources
- Methods include: save, persist, get, create, read, openSession, etc.
<br>

##### Transaction Object
- A transaction is a unit of work
- Wrapping your work in a transaction restricts access from other users
- Trasactions can be started, commited, or rolled back
- Handled by transaction manager

<br><br>

### Mapping strategies
- Entities/classes refer to tables in a database
- An instance of a class refers to a row in the table
- Attributes/Properties of a class refer to columns in a table
- Class should follow the POJO or JavaBean programming model
- Hibernate uses configuration file for mapping data
- Relationships are included in the mapping file
- Acts as translator for Java and JDBC
- Reading and writing to the db is done by Hibernate
- Files must be saved with `classname.hbm.xml`
- The root element is `<hibernate-mapping>`
- All `<class>` elements are included in the root element
- `<meta>` tag is optional
- The `<id>` element maps the unique ID attribute
- `<generator>` tag is used to auto-generate primary keys
- `<property>` tag is used to map a class property to a column in the table

<br><br>

---
## 4. CRUD Operations

### Add objects
