#### :house: [REVATURE workspce, HOME (`github`)](https://github.com/joedonline/REVATURE__workspace) :house:
#### :house: [REVATURE workspce, HOME (`delta`)](https://github.com/deltachannel/REVATURE__workspace) :house:

---
# :calendar: WEEK 1
## Monday, Dec. 16th 2019

---
### DEV ENVIRONMENT
- Git
- Spring Tool Suite (Eclipse IDE)
- Java 8 SDK
- Apache Maven 3.6.1

---
### `App.java`

```
public class App {

	public static void main(String[] args) {
		System.out.println("Hello world!");
	}

}
```

#### Commandline commands:
- `javac App.java`
- `java App`
- `cat App.class`

[]()
[]()

---
### Assembly Language
- Low-Level Language
- Machine Language

---
### Why is Java a high-level language? (as opposed to Assembly Language)

---
### Why do we use Git?
- ... feature-based workflow

---
### What is the difference between `Integer` and `int`?
- **Integer** is a class
- **int** is a primitive type

---
### `CHECKPOINT`

```
package com.mavenproject.adventure.adventure;

import java.util.Scanner;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Integer userNumber = sc.nextInt();
		System.out.println("Here's you number: " + userNumber);
	}

}
```

---
### `CHECKPOINT`

```
package com.mavenproject.adventure.adventure;

import java.util.Scanner;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter an even number: ");
			Integer userNumber = sc.nextInt();
			if (userNumber % 2 == 0) {
				System.out.println("It works!!");
			} else {
				System.out.println("It didn't work.");
			}
		}
	}

} // END public class AdventureApp
```

---
### `==` vs. `Object.equals(something)`
- Use `==` to compare numbers
- Use `.equals(obj)` to compare objects

---
### `CHECKPOINT`

```
package com.mavenproject.adventure.adventure;

import java.util.Scanner;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Boolean hasGivenValidInput = false;

		while (!hasGivenValidInput) {
			System.out.println("Enter the text stringexample: ");
			String userString = sc.next();
			if (userString.equals("stringexample")) {
				System.out.println("It works!!");
				hasGivenValidInput = true;
			} else {
				System.out.println("It didn't work.");
			}
		}
	}

} // END public class AdventureApp
```

---
### `CHECKPOINT`

```
package com.mavenproject.adventure.adventure;

import java.util.Scanner;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Boolean hasGivenValidInput = false;

		while (!hasGivenValidInput) {
			System.out.println("Enter the text stringexample: ");
			String userString = sc.next();
			if (userString .equalsIgnoreCase("stringexample")) {
				System.out.println("It works!!");
				hasGivenValidInput = true;
			} else {
				System.out.println("It didn't work.");
			}
		}
	}

} // END public class AdventureApp
```

---
### `CHECKPOINT`

```
package com.mavenproject.adventure.adventure;

import java.util.Scanner;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Boolean hasGivenValidInput = false;

		while (!hasGivenValidInput) {
			System.out.println("Enter the text stringexample: ");
			String userString = sc.next();
			if (userString .equalsIgnoreCase("stringexample")) {
				System.out.println("It works!!");
				hasGivenValidInput = true;
			} else {
				System.out.println("It didn't work.");
			}
		}
	}

} // END public class AdventureApp
```

---
### `CHECKPOINT`

```
package com.mavenproject.adventure.adventure;

import java.util.Scanner;

public class AdventureApp {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Boolean hasGivenValidInput = false;

		while(!hasGivenValidInput) {

			System.out.println("You find yourself in a brightly lit hallway.  There are doors to the NORTH and the SOUTH.");
			String userString = sc.nextLine();

			if (userString.equalsIgnoreCase("south")) {
				System.out.println("This room is under construction.  Your adventure is over.");
				hasGivenValidInput = true;
			} else if (userString.equalsIgnoreCase("north")) {
				System.out.println("This room is full of spiders." +
						"Do you want to leave the adventure?");
				String leaveAdventureConfirmation = sc.nextLine();
				while(!leaveAdventureConfirmation.equalsIgnoreCase("yes")) {
					System.out.println("There are really a lot of spiders, are you sure?");
					leaveAdventureConfirmation = sc.nextLine();
				}
				hasGivenValidInput = true;
			} else {
				System.out.println("Invalid input");
			}
		}
	}

} // END public class AdventureApp
```
