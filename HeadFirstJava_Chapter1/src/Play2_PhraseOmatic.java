
public class Play2_PhraseOmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is a class.  
		// [] creates an array of what preceded it
		// we can assign a value to a variable when it is declared.
		String[] wordListOne = {"24/7","B-to-B","multitier","30,000 foot",
				"win-win","pervasive"};
		String[] wordListTwo = {"empowered","oriented","value added"};
		String[] wordListThree = {"process","portal"};		

		// the lenght property gives the length of an array.
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// Math.random generatate a random number.
		// (int) casts the result as an integer. 
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
	
		// the + operator CONCATENATES strings.
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2]  +  " " + 
				wordListThree[rand3];
		System.out.println("What we need is a " + phrase);
		
		
		// Java ARRAYS ARE ZERO INDEXED
		System.out.println("First word of wordListOne = " + wordListOne[0]);		
		
		// casting int truncates the value
		System.out.println("(int) 1.1 = " + (int) (1.1) );
		System.out.println("(int) 1.5 = " + (int) (1.5) );
		System.out.println("(int) 1.6 = " + (int) (1.6) );
	}

}
