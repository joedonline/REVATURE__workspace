#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 02](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__nn)
## Thursday, Dec. 26th 2019

---
# RDBMS: Relational Database Management System
- [Study Guide - Link](https://sites.google.com/revature.com/studyguide/databasesql)
- The most **common way to persist data** in an **enterprise application**

## "Relational"
- just means dealing with "relations", which is a fancy word for tables

<br><br>

## RDBMSs
- runs on their own server
- have their own I/O

  <br>

  ![RDBMSs](what_is_rdbms.jpg)

- **We persist data by communicating w/ the RDBMS using SQL** 

<br><br>

## SQL: Structured Query Language
- Used to **communicate** with RDBMSs

<br><br>

### SQL -- Split into different sublanguages for working with functionalities:
- [Study Guide - Link](https://sites.google.com/revature.com/studyguide/databasesql#h.p_O_Df70ohDyTa)
- **DML: Data Manipulation Language**
  * Used to work with actual items of data(records)
- **DDL: Data Definition Language**
  * Used to create / delete / alter *tables*
- **DCL: Data Control Language:**
  * Used to *manage users* and *permissions*
- **TCL: Transaction Control Language**
  * Used for controlling (start, stop, revert) transactions
  * **Transactions** are how we *modify* the DB
- **DQL(?): Data Query Language**
  * [REFERENCE 1](https://geekflare.com/what-is-dql/)
  * Documentum Query Language (DQL) is a language to query Documentum content management system. This, we use to create, manage, deliver, and archive all type of contents from text documents and spreadsheets to digital images, HTML, and XML components. (REFERENCE DEFINITION) <br><br>

### Transaction
- The *one word answer* to "why we use DB over file"
- Transactions with a RDMS satisfy 4 properties (ACID) <br><br>

### 4 Properties of Transactions (ACID)
 * Atomic Transactions
    - Transactions succeed or fail as one unbroken unit <br><br>
 * Consistent Transactions
    - Takes the DB from one valid state to another
    - Valid state means following one rule: *constraints* <br><br>
 * Isolated Transactions
    - Transactions takes place in parallel without interfering with each other <br><br>
 * Durable Transactions
    - Transactions persist even through catastrophe (??? ways to either complete or ROLLBACK the transaction) <br><br>

### Vendors and Dialects
- Multiple orgs have written RDBMSs, we call these "vendors"
- Each vendor has their own dialect of SQL, even though "all should" support base SQL. ???
- We'll be learning Postgres/PostgreSQL
- Other vendors: Oracle, MySQL, Server SQL, MariaDB, ...
- There are also many NoSQL database
