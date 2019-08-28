
/* for a MULTIPLE LINE COMMENT use the bracketed slash-star syntax
 * There is one CLASS per file
 */
public class Play1 {

	// When you invoke the JVM it looks in the class specified on the
	// command line for the public static void main(String[] args)
	// methold and starts execution from there.
	// Each APPLICATION must have one MAIN.  However not every class needs a main.
	// So if we typed the following at the command prompt it would run
	// the main program
	// javac Play1.class 
	// java Play1

	public static void main(String[] args) {
		// the DOUBLE SLASHES are a single line comment

		// each statement ends in a semicolon.
		// .prinln adds new line to string, .print doesn't.
		System.out.println("Hello World!");
		System.out.print("Hello!");		
		System.out.print(" World!\n");	// \n is explicit new line		
		
		int x; // VARIABLES  are DECLARED with a TYPE and NAME
			   // in this case the TYPE is int and the name is X
			   // The Java compiler can catch many type mismatches 
			   // like an attempt to divide two strings.  I
		String a = "a";
		String b = "b";
		int z;
		// z= a/b; this is invalid and compiler says / operator not defined 
		// for string type objects.  

		x = 1; 
		System.out.println("The variable x = " + x );		
		
		// While loop, must evaluate to a boolean condition
		// while (1) won't work.
		// comparison operators.  Boolean 5est must be in () for loop constructs.
		// <, <=, >, >= and == (not just =) 
		x=1;
		System.out.println("Before Loop: x = " + x);
		while (x<4) { // this should execute 3 times
			System.out.println("Looping: x = " + x + " of 3");
			x = x + 1;
		}
		
		
		// If statement 
		x = 7;
		if (x==7 || x==1) {
			System.out.println("seven come eleven!");
		}
		else if (x==2) {
			System.out.println("snake eyes!");			
		}
		else {
			System.out.println("craps!");				
		}
				
		

	}
	
	// A class can have multiple or no METHODS.
	// Methods must be declared within a class.
	public void doit() {
		System.out.println("I'm a method!");
	}
	
	
	public void doItToIt() {
		// methods do work by STATEMENTS.
		System.out.println("I'm another method!");
		System.out.println("I'm another method!");
	}

}
