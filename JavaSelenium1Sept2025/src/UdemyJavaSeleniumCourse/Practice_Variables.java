package UdemyJavaSeleniumCourse;

public class Practice_Variables {

	public static void main(String[] args) {
		String name = "John";
		int age = 10;

		// Arguments: the values you pass when calling the method (name, age in main).
		printName(name); // passing value in agrument
		printAge(age);

		//Names don’t need to match. Matching happens by position and type.
		//name (in main) → value is copied → becomes text (in printName).
		//Same idea for age → num.
	}

	// Parameters: the variables that receive the values inside the method (text,
	// num).
	public static void printName(String text) {
		System.out.println(text);
	}

	public static void printAge(int num) {
		System.out.println(num);
	}

}

/*
 * main()                          printName(String text)
-------                         ----------------------
name ──► "John"   ── passes ──►  text ──► "John"
age  ──► 10       ── passes ──►  num  ──► 10  (for printAge)
 */
