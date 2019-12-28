#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 02](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__02)
## Friday, Dec. 27th 2019

---
## RDS: Relational Database Service
- The Amazon Relational Database Service (RDS) enables developers to create and manage relational databases in the cloud.
- [REFERENCE - sumologic.com](https://www.sumologic.com/insight/what-is-amazon-rds/)

<br><br>

---
## Relational Databases

<br>

  ![Relational Database Structure](Relational-Database-Structure-Example-2.png)

<br><br>

## Relational Database Table Structure: Normalized Tables

### What is Normalization?
- Normalization is a database design technique which organizes tables in a manner that reduces redundancy and dependency of data.
- It divides larger tables to smaller tables and links them using relationships.
- [REFERENCE - guru99](https://www.guru99.com/database-normalization.html)

<br>

  ![DB Normalization in SQL Server](db_normalization_sql_server.png)

<br>

  ![Normalized vs. Denormalized](pre_joining_tables_1x.png)

<br><br>

#### Without Normalization

  ![Normalization Table 1](NormalizationTable1.png)

<br><br>

## Database Normal Forms

### 1NF (First Normal Form) Rules
- Each table cell should contain a single value.
- Each record needs to be unique.

<br>

  Example

  ![1NF example](1NF.png)

<br><br>

#### What is a KEY?
- A KEY is a value used to identify a record in a table uniquely.
- A KEY could be a single column or combination of multiple columns

<br>

##### ** Note: Columns in a table that are NOT used to identify a record uniquely are called non-key columns.

<br><br>

#### What is a Primary Key?
- A primary key is a single column value used to identify a database record uniquely.

<br>

**It has following attributes:**
- A primary key cannot be NULL
- A primary key value must be unique
- The primary key values should rarely be changed
- The primary key must be given a value when a new record is inserted.

<br><br>

#### What is Composite Key?
- A composite key is a primary key composed of multiple columns used to identify a record uniquely

<br>

  ![Composite Key](composite_key_needed.png)

<br><br>

### 2NF (Second Normal Form) Rules
- Rule 1- Be in 1NF
- Rule 2- Single Column Primary Key

<br>

  ![2NF](2NF.png)

<br>

#### Database - Foreign Key

- Foreign Key references the primary key of another Table! 
- It helps connect your Tables

<br>

**What a Foreign Key does**
- A foreign key can have a different name from its primary key
- It ensures that rows in one table have corresponding rows in another
- Unlike the Primary key, they do not have to be unique. Most often they aren't
- Foreign keys can be null even though primary keys can not

<br>

  ![Foreign Key demonstrated](foreign_key_demonstrated.png)

<br>

#### Why do you need a foreign key?

  ![Why a Foreign Key?](why_do_you_need_a_foreign_key.png)

<br>

#### What are transitive functional dependencies?
- A transitive functional dependency is when changing a non-key column, might cause any of the other non-key columns to change.

<br>

  ![Transitive Functional Dependencies](transitive_functional_dependencies.png)

<br><br>

### 3NF (Third Normal Form) Rules
- Rule 1- Be in 2NF
- Rule 2- Has no transitive functional dependencies

<br>

**3NF Example**

  ![3NF Example](3NF_example.png)

<br>

- We have again divided our tables and created a new table which stores Salutations. 
- There are no transitive functional dependencies, and hence our table is in 3NF
- In Table 3 Salutation ID is primary key, and in Table 1 Salutation ID is foreign to primary key in Table 3

<br><br>

## Other Database Normal Forms

### Boyce-Codd Normal Form (BCNF)
- Even when a database is in 3rd Normal Form, still there would be anomalies resulted if it has more than one Candidate Key.
- Sometimes is BCNF is also referred as 3.5 Normal Form.

<br>

### 4NF (Fourth Normal Form) Rules
- If no database table instance contains two or more, independent and multivalued data describing the relevant entity, then it is in 4th Normal Form.

<br>

### 5NF (Fifth Normal Form) Rules
- A table is in 5th Normal Form only if it is in 4NF and it cannot be decomposed into any number of smaller tables without loss of data.

<br>

### 6NF (Sixth Normal Form) Proposed
- 6th Normal Form is not standardized yet. However, it is being discussed by database experts for some time. Hopefully, we would have a clear & standardized definition for 6th Normal Form in the near future...

<br><br>

### Why Normalize? Anomalies
- *Anomalies are things we try to avoid*
- **Update anomaly:** a piece of data is updated in one location and not another.

  | Movie | Actor/Actress |
  |-|-|
  | Gone With The Wind | Vivian Leigh |
  | Waterloo Bridge | Vivian Leigh |
  
  <br><br>

- **Deletion anomaly:** a piece of data cannot be deleted without also deleting other data.

  | Movie | Actor/Actress | Height |
  |-|-|-|
  | ~~Gone With The Wind~~ | ~~Vivian Leigh~~ | ~~6~~ |
  | ~~Waterloo Bridge~~ | ~~Vivian Leigh~~ | ~~6~~ |
  | Gladiator | Russell Crowe | 7 |


  <br><br>

- **Creation anomaly:** a piece of data cannot be added without also providing other (potentially `NULL`) data

  | Movie | Actor/Actress | Height |
  |-|-|-|
  | ~~Gone With The Wind~~ | ~~Vivian Leigh~~ | ~~6~~ |
  | ~~Waterloo Bridge~~ | ~~Vivian Leigh~~ | ~~6~~ |
  | Gladiator | Russell Crowe | 7 |
  | Forrest Gump | Tom Hanks | `NULL` |

  <br><br>

### Functional Dependence:
- A relationship between two pieces of data.
- One of which is dependent on the other.
- *also things we should try to avoid*

  `X depends on Y` --> If we know `Y`, then we know `X`
  <br><br>

### Candidate Key:
- Any column of combination of columns that uniquely identifies all records in a table.
- All other columns functionally depend on the Candidate key.
- There may be more than one Candidate key.
- Must a minimal combo ??? column(s)

  | Course Num | Dept. | Prof. |
  |-|-|-|
  | HUM 303 | Humanities | Smith |
  | PHIL 500 | Philosophy | Jones |
  | LIT 102 | Literature | Jones |

  * What is a good Candidate key for the above table? 
    - ans: `Course Num`
  <br><br>

  | Topic | Course Num | Dept. | Prof. |
  |-|-|-|-|
  | Books | HUM 303 | Humanities | Smith |
  | Pamphlets | PHIL 500 | Philosophy | Jones |
  | Other Books | LIT 102 | Literature | Jones |
  | Articles | PHIL 500 | Philosophy | Smith |

  * What is a good Candidate key for the above table? 
    - ans: `Topic` --> since it contains **unique** values
  <br><br>

### Primary Key:
- A Candidate Key that we decide to actually use to represent/identify each record in the table
- **In practice**, we use an `id` column generated to be a PK
<br><br>

### Composite Key
- A candidate key made of multiple columns
<br><br>

### Normalization
- Solves our anomalies (C, U, D)
- Tolerant of changes to the data model
- Reduces redundancy
- Comes in multiple "levels", we say *forms*
<br><br>


#### 1st Normal Form
- [Memory Marker] "The key"
- Each record must be unique
- There must be a Candidate Key
- **Values must be atomic**
  * A phone number is ok
  * A list of phone numbers is not
  <br><br>

#### 2nd Normal Form
- [Memory Marker] "The whole key"
- All non-Candidate-key columns must depend on the **entirety** of every candidate key.
- If there are no composite keys:
  
  1st Normal Form --> 2nd Normal Form
<br><br>

#### 3rd Normal Form
- [Memory Marker] "..and nothing but the key"
- No non-Candidate-key column depends on any other non-Candidate-key column

  | `CityId` | `City` | `State` | `Over200Target` | `Sales` |
  |-|-|-|-|-|
  | 1 | Savannah | GA | No | 200 |
  | 2 | Springfield | IL | Yes | 500 |
  | 3 | Louisville | KY | Yes | 300 |
  | 4 | NYC | NY | No | 199 |

  <br><br>

  **Non-3rd Form** ???
  
  | id | title | mediatype | price |
  |-|-|-|-|
  | 1 | Mulan OST | Casette | 0.50 |
  | 2 | Paint In Black | Casette | 0.50 |
  | 3 | Up | DVD | 2.00 |
  | 4 | GWTW | DVD | 2.00 |

  <br><br>

### Foreign Key
- A reference to the Primary Key of another table, used to link records together in a `JOIN`
  <br><br>

---
### EXAMPLES

| `City Id` | `City` | `State` | `Region` | `Sales` |
|-|-|-|-|-|
| 1 | Savannah | GA | South | 200 |
| 2 | Springfield | IL | Midwest | 500 |
| 3 | Louisville | KY | Midwest | 300 |
| 4 | NYC | NY | NorthEast | 199 |

- Primary Key: City Id
- Candidate Key(s): City, State, City Id
<br><br>

---
## Joins
- Joins combine records from 2+ tables.
- The result of a Join will have columns from all involved tables.

<br><br>

### To specify a Join:
- We need a **Join condition** and the **Join type**.
- There may/will be multiple ways to achieve the same result

<br><br>

### Join Condition
- Boolean expression (`true` or `false`)
- Typically makes use of information from one record in `Table A` and one in `Table B`
- When the Join Condition is `true`, the two records are combined and included in the output

<br><br>

### Join Types
- **`INNER`** 
  * Do nothing else, only the join condition matters. <br><br>
- **`LEFT OUTER`** 
  * Add one record to the output for each record in the `LEFT` table that doesn't yet appear in the output. <br><br>
- **`RIGHT OUTER`**
  * Replace `LEFT` with `RIGHT` above <br><br>
- **`FULL OUTER`**
  * Both a `RIGHT` and `LEFT OUTER JOIN` <br><br>

  ![Join](join_tables.png)

  <br><br>

**Widgets**

| widget_id | widget_size | car_id |
|-|-|-|
| 100 | 20 | 2 |
| 200 | 20 | 1 |
| 300 | 40 | 3 |

<br>

**Cars**

| car_id | model |
|-|-|
| 1 | Jetta |
| 2 | Prius |
| 3 | F150 |

<br>

| condition | type |
|-|-|
| `widgets.car_id = cars.car_id` | `INNER` |
| `widget_size <= 20` | `INNER` |
| `widget_size <= 20` | `LEFT OUTER` |
| `widget_size <= 20` | `RIGHT OUTER` |
| `(2 + 3) > 6` | `RIGHT OUTER` |

<br>

### Output of above `JOIN`

`INNER` @ `widgets.car_id = cars.car_id`

| widget_id | widget_size | widgets.car_id | cars.car_id | model |
|-|-|-|-|-|
| 100 | 20 | 2 | 2 | Prius |
| 200 | 20 | 1 | 1 | Jetta |
| 300 | 40 | 3 | 3 | F150 |

<br><br>

`INNER` @ `widget_size <= 20`

| widget_id | widget_size | widgets.car_id | cars.car_id | model |
|-|-|-|-|-|
| 100 | 20 | 2 | 1 | Jetta |
| 100 | 20 | 2 | 2 | Prius |
| 100 | 20 | 2 | 3 | F150 |
| 200 | 20 | 1 | 1 | Jetta |
| 200 | 20 | 1 | 2 | Prius |
| 200 | 20 | 1 | 3 | F150 |

<br><br>

`LEFT OUTER` @ `widget_size <= 20`

| widget_id | widget_size | widgets.car_id | cars.car_id | model |
|-|-|-|-|-|
| 100 | 20 | 2 | 1 | Jetta |
| 100 | 20 | 2 | 2 | Prius |
| 100 | 20 | 2 | 3 | F150 |
| 200 | 20 | 1 | 1 | Jetta |
| 200 | 20 | 1 | 2 | Prius |
| 200 | 20 | NULL | NULL | F150 |

<br><br>

`RIGHT OUTER` @ `widget_size <= 20`

| widget_id | widget_size | widgets.car_id | cars.car_id | model |
|-|-|-|-|-|
| 100 | 20 | 2 | 1 | Jetta |
| 100 | 20 | 2 | 2 | Prius |
| 100 | 20 | 2 | 3 | F150 |
| 200 | 20 | 1 | 1 | Jetta |
| 200 | 20 | 1 | 2 | Prius |
| 200 | 20 | 1 | 3 | F150 |

<br><br>

`RIGHT OUTER` @ `(2 + 3) > 6`

| widget_id | widget_size | widgets.car_id | cars.car_id | model |
|-|-|-|-|-|
| NULL | NULL | NULL | 1 | Jetta |
| NULL | NULL | NULL | 2 | Prius |
| NULL | NULL | NULL | 3 | F150 |
| 100 | 20 | 2 | NULL | NULL |
| 200 | 20 | 1 | NULL | NULL |
| 300 | 40 | 3 | NULL | NULL |

<br><br>

### INNER JOIN Syntax

```
Widgets INNER JOIN
Cars ON <join condition>
```

<br><br>

---
## Multiplicity
- Refers to the cardinality

### Multiplicities
- One-to-many
- Many-to-one
- Many-to-many
- One-to-one

  <br>

| Multiplicities | Table & Foreign Key Setup |
|-|-|
| 1 to 1 | Can be same table |
| 1 to n | Two tables, Foreign Key on many side |
| n to n | Three tables (one **junction** table); two Foreign Keys on junction table |

<br><br>

  ![Multiplicity Example](MultiplicityExample.png)

  ![Multiplicity Example 2](MultiplicityExample2.png)

<br><br>

  #### MULTIPLICITY EXAMPLE

  **Playlists**

  | id | name |
  |-|-|
  | 1 | Mixtape '06 |
  | 2 | Jamz |

  <br>

  **Tracks**

  | id | name |
  |-|-|
  | 1 | trouble |
  | 2 | problems |
  | 3 | sorrows |

  <br>

  **`Playlist_Track`**

  | `p_id` | `t_id` |
  |-|-|
  | 1 | 1 |
  | 1 | 3 |
  | 2 | 2 |
  | 2 | 3 |

<br><br>

---
### `ALTER TABLE` ????


---
### PRACTICAL EXERCISE: Interactive SQL
- [SQLBolt - REFERENCE](https://sqlbolt.com/)
<br><br>

---
## ( [To Watch: Programming Foundations: Databases](https://www.lynda.com/SQL-tutorials/Programming-Foundations-Databases/784293-2.html) )
