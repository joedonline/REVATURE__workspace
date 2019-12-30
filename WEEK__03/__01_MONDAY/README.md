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
