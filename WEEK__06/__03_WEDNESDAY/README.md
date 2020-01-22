#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
#### :house_with_garden: [REVATURE workspace, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house_with_garden:
---
# :calendar: [WEEK 06](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__06)
## Wednesday, Jan. 22nd 2020

---
## AWS To-Knows
- RDS (Relational Database Service)
- S3 (Simple Storage Services)
- EC2 (Elastic Compute Cloud)
- EBS (Elastic Block Store)
- AMI (Amazon Machine Image)
- Security Groups (protocol(TCP, etc.), port, ip, ?)
- Autoscaling / Autoscaling groups
  * Uses 'horizontal scaling'

### Ports To-Know
- 22 ----> `ssh`
- 80 ----> `http`
- 443 ---> `https`
- 5432 --> Postgres

### Horizontal Scaling vs. Vertical Scaling

---
## IaaS: Infrastructure as a Service
- EC2
- Replaces in-house servers/networks, move them to the cloud

## PaaS: Platform as a Service
- RDS
- **Managed platform:** 
  * Service provider configures
  * Ensures uptime
  * Applies software updates

## SaaS: Software as a Service
- Gmail, Google Voice
- Dropbox

<br>

---
## Git - Decentralized Source Control Management
- NOT GitHub <-- it's a remote repository for Git
- NOT Git Bash <-- it's a Bash clone for Windows that works with Git
- IS the tool we use when we type `git` on the command line
- Git saves our work as **commits** and stores the full version-controlled history of our code

### Git Branches
- Git allows you to have different versions of the codebase nad develop them in parallel

### Git Workflow
- **`master` <--> `dev` <--> `feature`** branches
  * `master` branch - is the "final", functional, stable version
  * `dev` branch - is the version under active development
  * `feature` branches - are where our new features are developed
    - They are created and destroyed as your app is built

### Merging
- Changes in one branch can be copied to another branch by *merging* them
- Copies all the commits
- Typically, we merge features into `dev` into the `master` branch
- If changes from different branches conflict, we have **merge conflicts** that we must resolve

#### Conventions
- `o` - commits
- `-` - branches

| `master` | `dev` | `comic-table` | `navbar` |
|-|-|-|-|
| `o` initial commit |  |  |  |
| `-` add `README.md` |  |  |  |
| `-` add `.gitignore` |  |  |  |
| `-` setup folder structure |  |  |  |
|  | branch-off |  |  |
|  |  | `-` add table |  |
|  |  | `-` bux fix |  |
|  | merge commit `-` |  |  |
|  |  | `x` close branch |  |
|  |  |  | `-` add new |
|  |  |  | `-` bug fix |
|  | merge |  |  |
| Version 1 merge commit `-` |  |  |  |

<br>

---
## CI - Continuous Integration
- **Part 1:** Integrate code within the team at least daily
- **Part 2:** Have a *pipeline* that automatically builds and tests the code
