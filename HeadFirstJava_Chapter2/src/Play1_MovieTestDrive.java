
public class Play1_MovieTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Play1_Movie movie1 = new Play1_Movie();  // create an object of type Play1_Movie
		
		movie1.title = "Evil Dead";  // set instance variables for our object
		movie1.genre = "Horror";	 // 
		movie1.playIt();			// Invoke the play method.


		Play1_Movie movie2 = new Play1_Movie();
		
		movie2.title = "Big Trouble in Little China";  // set instance variables
		movie2.genre = "Sci-fi";	 // 
		movie2.playIt();			// Invoke the play method.
		
	}

}
