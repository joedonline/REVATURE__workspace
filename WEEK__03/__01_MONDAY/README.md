#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 03](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__03)
## Monday, Dec. 30th 2019

---
# DATABASE REVIEW for quiz/assessments

#### Why Databases

#### AWS RDS

#### SQL Sublanguages and keywords

#### SELECT Clauses

#### `LIKE`
- Checks whether a string matches a pattern

  ```
  WHERE <name> LIKE 'Name %';
  ```

##### Wildcards
- `%` matches any number of characters
- `_` a single character

#### Aggregate Functions
- `COUNT`, `SUM`, `AVG`, `MIN`, `MAX`

#### Scalar Functions
- `UPPER`, `LOWER`, `CHAR_LENGTH`, `TRIM`, `CAST`

#### `EXTRACT` - ????

<br>

#### `JOIN`s - ????

<br>

#### ACID Transactions:
- **Atomic** --> Indivisible, entire transaction succeeds or fail altogether
- **Consistent** --> db remains in a valid state, goes from one valid state to another
- **Isolated** --> Transactions in progress don't interfere with each other
- **Durable** --> Hard to break, work in case of catastrophe

<br>

#### Candidate Keys
- potential unique identifier
- can be 1 or more columns

#### Primary Keys
- 1 column
- uniquely identifies a record (or entity)

#### Foreign Keys
- primary key of another table referenced in another table

#### Normalization

#### Multiplicity and how to represent
- digrams ????

#### log4j
- ????
- [Lynda reference](https://www.lynda.com/Spring-tutorials/Spring-Spring-MVC/2804074-2.html)

#### JDBC
- ????

#### SQL Injection
- ????

#### DAO
- ????

#### Design Patterns
- Gang of Four
- ????

<br>

---
## LOGGING - `log4j`
- [log4j properties - in Java](log4j.properties)

<br>

### Logging
- Keep a record of program function
- We should keep record progress, steps, problems, errors, etc.
- To differentiate log messages, we have logging levels

<br>

#### Logging Levels:
- **OFF** - no logging (don't log to this, just a setting)
- **FATAL** - log fatal problems here
- **ERROR** - exceptions, errors, problems that occur
- **WARN** - state that may cause error/exception
- **INFO** - broad information about state and function
- **DEBUG** - finer-grained infomation, useful for debugging
- **TRACE** - very detailed trace of program function
- **ALL** - all levels (don't log to this, just a setting)

---
## Other Topics

#### Subqueries

#### pl/pgsql

#### Triggers
- [Lynda reference](https://www.lynda.com/SQL-tutorials/SQL-Essential-Training/2825374-2.html)

#### Functions

#### Cursors

#### Stored Procedures
- [Lynda reference](https://www.lynda.com/Java-tutorials/Calling-stored-procedures/110284/117316-4.html)

#### Indices

#### Views

#### Transaction Isolation levels

#### Set ops

---
## Subqueries
- Use a query inside a query

  ```
  SELECT * FROM ( 
    SELECT col1, col2 FROM <a_table> 
  );
  ```

- Can be more readable
- Can use the results of queries in conditions (`WHERE` or `HAVING` clauses)

**Quick example:**

```
S * F myT W myC = (S MAX(myC) F myT);
```

<br>

---
## SET operations
- Combine records from multiple ResultSets
- The columns must align or match (datatype, number)

### Combine using:
- `UNION` - all records from both
- `INTERSECT` - all records that appear in both A and B`
- `EXCEPT` - all records in A except those that appear in B

<br>

**Example:**

Set A

| myC1 | myC2 |
|-|-|
| 1 | 'A' |
| 2 | 'B' |
| 4 | 'C' |

<br>

Set B

| myC1 | myC2 |
|-|-|
| 1 | 'A' |
| 3 | 'B' |
| 4 | 'D' |

  ```
  (SELECT * FROM A)
  UNION
  (SELECT * FROM B);
  ```

**`UNION` output:**

|||
|-|-|
| 1 | `A` |
| 2 | `B` |
| 3 | `B` |
| 4 | `C` |
| 4 | `D` |

<br>

**`INTERSECT` output**

|||
|-|-|
| 1 | `A`

<br>

**`EXCEPT` output**

|||
|-|-|
| 2 | `B` |
| 4 | `C` |

<br>

---
## Functions (many are Postgres-specific)
- [***know this***] Take optional input do things, return optional output
- [***know this***] Can pass in and return values, records, sets, and more
- Can return **SETs** and **CURSORs**
- Functions are strings to be run using a specified language.
- We use `IN`, `OUT`, and similar to let SQL know how the function works

<br>

**Why Functions**
- Abstraction
- Convenience

<br>

### Mark Parameters
- as `IN`, `OUT`, and `INOUT` to take arguments and return multiple values
- Can also specify a return with `RETURNING`

<br>

---
## Triggers 
- ???? - [REFERENCE to read](https://www.essentialsql.com/what-is-a-database-trigger/)
- Automatic behavior on `INSERT`/`UPDATE`/`DELETE`
- Specify using a function that `RETURNs` trigger
- We have access to `NEW` and `OLD` to interact with the prior record and the new record

**Good examples**
- `Last_updated` column
- Prevent deletion of important records

```
RAISE 'Some Problem'
```

**These are like Exceptions in Java

<br>

---
## Cursors
- Declared with `refcursor`
- [***know this***] A pointer to a `ResultSet`, can "scroll" forward through records
- [***know this***] Used for results that won't fit in memory
- In Postgres, `pl/pgsql` uses cursors and loops, they are however mostly unnecessary
- Can also be used for parallel processing

<br>

---
## Stored Procedures
- [Lynda reference](https://www.lynda.com/Java-tutorials/Calling-stored-procedures/110284/117316-4.html)
- In Postgres, like a function that can use TCL

<br>

---
## Indices
- If database is acting slow, start looking here (through indices)
- Indeces on **unique** columns are automatically created. These are called **clustered indices**.
- Indices that we manually create are **unclustered**.
- Since `PRIMARY KEY = UNIQUE NOT NULL`, every table has an index on its Primary Key.

<br>

### Index
- An index on some column(s) serves like an index in a book
- It allows your queries to quickly find any indexed value
- Will speed up queries that condition on indexed columns.
- If `I` index "size" then `S * F myT W size > 30;` will be much faster.
- **Downside**: Will slowdown writes
  * updates index and rewrites table under the hood
  * 2 tasks performed at a given time
- Only make indices for columns often used in queries

<br>

**Indeces under the hood**
- at least in Postgres, uses B-trees
- [B-trees reference](https://www.cs.cornell.edu/courses/cs3110/2012sp/recitations/rec25-B-trees/rec25.html)

<br>

---
## Views
- A `VIEW` is just a saved query with a name

<br>

### A `MATERIALIZED VIEW`
- [Lynda reference](https://www.lynda.com/SQL-tutorials/Advanced-SQL-Query-Tuning-Performance-Optimization/774911-2.html)
- is a saved `ResultSet`
- It must be `REFRESH`'d to get updated values

<br>

**Example `VIEW` query**

  ```
  CREATE VIEW myView AS SELECT * FROM myTable;

  SELECT * FROM myView;

  REFRESH MATERIALIZED VIEW myView;
  ```

---
## Chinook Database

### SAMPLE SQL

```
CREATE DATABASE chinook;

SELECT * FROM chinook;

SELECT * FROM actors;

DROP DATABASE chinook;

SELECT * FROM tracks;

SELECT tracks.name AS "Track",
	albums.title AS "Album",
	artists.name AS "Artist",
	genres.name AS "Genre",
	tracks.composer AS "Composer"
FROM tracks
INNER JOIN albums ON tracks.album_id = albums.id;
INNER JOIN artists ON albums.artist_id = albums.id;
INNER JOIN genres ON tracks.genre_id = genres.id;
	
	
SELECT *
FROM tracks
INNER JOIN albums ON tracks.album_id = albums.id;
INNER JOIN artists ON albums.artist_id = albums.id;
INNER JOIN genres ON tracks.genre_id = genres.id;


SELECT * FROM musicview;


SELECT SUBSTRING(first_name FROM 1 FOR 1) || SUBSTRING(last_name FROM 1 FOR 1) 
	AS "Initials", first_name, last_name
FROM customers;


-- Function for initials
CREATE OR REPLACE FUNCTION get_customer_initials(id INTEGER) RETURNS VARCHAR(2);
AS

$body$ -- just fancy string delimiters
SELECT SUBSTRING(first_name FROM 1 FOR 1) || SUBSTRING(last_name FROM 1 FOR 1) 
	AS "Initials", first_name, last_name
FROM customers
WHERE customers.id = id;
$body$ LANGUAGE SQL;

-- Function for employees before 1965
CREATE OR REPLACE FUNCTION get_employees_before_1965() RETURNS SETOF employees
AS
$$
SELECT * FROM employees
WHERE EXTRACT(YEAR FROM birth_date) < 1965 -- EXTRACT to pull things out of timestamp
$$ LANGUAGE SQL;

SELECT * FROM get_employees_before_1965();


-- Using UNION, INTERSECT
SELECT * FROM get_employees_before_1965();
UNION
SELECT * FROM employees;

SELECT * FROM get_employees_before_1965();
INTERSECT
SELECT * FROM employees;

SELECT * FROM get_employees_before_1965();
EXCEPT
SELECT * FROM employees;


-- Triggers require a function, we'll use plgpgsql
CREATE OR REPLACE FUNCTION stop_invoice_delete_over_10() RETURNS TRIGGER
AS
$$
BEGIN 
	RAISE 'Cannot delete invoice, too expensive';
END
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_delete_expensive_invoice
BEFORE DELETE
ON invoices
FOR EACH ROW -- this option is FOR EACH STATEMENT
-- Here is where we have OLD and NEW for the old row and the new row
WHEN (OLD.total > 10)
EXECUTE PROCEDURE stop_invoice_delete_over_10();

SELECT * FROM invoices WHERE id = 5;
DELETE FROM invoices WHERE id = 5;
```

---
## Transaction Isolation Levels
???
- [Lynda reference](https://www.lynda.com/SQL-Server-tutorials/Transaction-isolation/688526/735504-4.html)
- **Level 1: Read Uncommitted** - anarchy, read values/changes before transactions commit them. Allows all problems.
- **Level 2: Read Committed** - read values/changes as soon as a transaction commits them. Prevents only dirty read.
- **Level 3: Repeatable Read** - read new values as soon as a transaction commits them, but don't read changes.
- **Level 4: Serializable** - don't read changes or new values for the duration of the transaction. Prevents phantom reads. Transactions are evaluated *as if* they took place in sequence.

**Level 1 is fastest**
**Level 4 is the default**

<br>

**Transaction A**

```
BEGIN;
S * F <some_table> W id = 1;

U + S val = 3 W id = 1;

I INTO <some_table> V (5, 50);

COMMIT;
```

**`+`**

| id | val |
|-|-|
| 1 | 0 |
| 2 | 10 |
| 3 | 20 |
| 4 | 40 |
| 5 | 50 |


<br>

**Transaction B**

```
BEGIN;
S * F <some_table> W id = 1;

S * F <some_table> W id = 1;


S * F <some_table> W id = 1;

S * F <some_table> i;
COMMIT;
```

<br>

### Concurrency Problems
- **Dirty read** - reading uncommited data
- **Nonrepeatable read** - reading committed data whose value has changed during your transaction
- **Phantom read** - reading newly inserted records that were committed by another transaction

<br>
