#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 02](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__02)
## Friday, Dec. 27th 2019

---
## RDS: Relational Database Service
- ???
<br><br>

---
## Relational Database Table Structure: Normalized Tables
- ???
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
- **`INNER`:** Do nothing else, only the join condition matters.
- **`LEFT OUTER`:** Add one record to the output for each record in the `LEFT` table that doesn't yet appear in the output.

  <br><br>

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

### INNER JOIN Syntax

```
Widgets INNER JOIN
Cars ON <join condition>
```

<br><br>

---
### PRACTICAL EXERCISE: Interactive SQL
- [SQLBolt - REFERENCE](https://sqlbolt.com/)
<br><br>
