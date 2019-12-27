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

### Normalization
- Solves our anomalies (C, U, D)
- Tolerant of changes to the data model
- Reduces redundancy
- Comes in multiple "levels", we say *forms*
<br><br>

#### 1st Normal Form
- Each record must be unique
- There must be a Candidate Key
- **Values must be atomic**
  * A phone number is ok
  * A list of phone numbers is not
