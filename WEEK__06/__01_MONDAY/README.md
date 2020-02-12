#### :house: [REVATURE workspace, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace)  :house:
---
# :calendar: [WEEK 06](https://github.com/joedonline/REVATURE__workspace/tree/master/WEEK__06)
## Monday, Jan. 21st 2020

---
## Unix-like Command Line Commands (SSH)

| command | description |
|:-:|-|
| `man` | Manual (doesn't work in Git Bash) |
| `pwd` | Print working directory |
| `ls` | List contents of current/working director |
| `cd` | Change directory |
| `touch` | Create file |
| `nano` | Command line text editor |
| `mv` | Move (also used to rename) |
| `cp` | Copy files and directories(with `-r` flag) |
| `rm` | Remove files and directories(with `-r|-R`) |
| `rmdir` | Remove an empty directory |
| `cat` | Get contents of file |
| `printenv` | Display a list of environment variables |
| `printenv | less` | Display a list of environment variables, one page at a time |
| `printenv | more` | Display a list of environment variables, one page at a time; displays "More" at bottom of screen |
| `yum` | (Yellowdog Updater Modified) An interactive, rpm based, package manager. |
| `grep` | Globally Search for Regular Expression and Print Out. ( [REFERENCE: geeksforgeeks](https://www.geeksforgeeks.org/grep-command-in-unixlinux/) ) |

<br>

---
## Bonus
- **`ssh`:** 
  * Secure shell
  * Used for interacting with the command line on a remote machine
- **`scp`:** 
  * Secure copy protocol
  * Used for transferring files to a remote machine (why we learn Unix command line tools)

<br>

---
## VM - Virtual Machine
- When we setup a VM, our *host* computer **emulates** a **guest** computer.
- The host provides virtual resources (disk, RAM, processes) to the guest, and the "guest" runs just as it would on real hardware.

<br>

---
## EC2 - Elastic Compute Cloud
- A server you control in the cloud
- Amazon provides a VM with dedicated resources not a very *tiny* actual computer
- The resources used can expand and contract based on need, thus "Elastic".
  * One way this happens is via ***auto-scaling groups***
  * AWS will create multiple identical VMs to meet <u>demand</u>

<br>

---
## EC2 Launch Instance Steps
- #### Step 1: Choose an Amazon Machine Image (AMI)
  * `Amazon Linux 2 AMI (HVM), SSD Volume Type`
- #### Step 2: Choose an Instance Type
  * **Family:** `General Purpose`
  * **Type:** `t2.micro`
- #### Step 3: Configure Instance Details
  * default settings
  * *NOTE:* T2/T3 Unlimited [UNCHECKED] Enable
    - or you will be charged
- #### Step 4: Add Storage
  * default settings
- #### Step 5: Add Tags
  * default settings
- #### Step 6: Configure Security Group
  * **Security group name:** `ssh-open-everywhere`
  * **Description** only rule is ssh open to all IPs
- #### Review and Launch
  * just check everything here
- #### Select an existing key pair or create a new key pair
  * ***Create a new key pair***
  * <u>*IMPORTANT:* make sure you write this down somewhere you won't lose or forget about</u>
  * **Your key pair name:** `delta-channel-ec2-k-v-pair`

<br>

### Login to your EC2 ssh
- `ssh -i /path/to/*.pem ec2-user@ec2-52-90-203-44.compute-1.amazonaws.com`
- #### First-time logging in to EC2 ssh
  * `sudo yum update`
- #### Other commands
  * `ls -l -a`
  * `ls -la`
- #### Other info
  * **home folder:** `~` ==> `/home/ec2-user/.ssh`
