
public class Netflix {

	public static void main(String[] args) {
		Movie movie1 = new Movie("Batman", 2);	
		Movie movie2 = new Movie("Spiderman", 5);
		Movie movie3 = new Movie("Ironman", 3);
		Movie movie4 = new Movie("Captain America", 1);
		Movie movie5 = new Movie("Wonder Woman", 4);
		
		movie1.getTicketPrice();
		
		NetflixQueue Superheroes = new NetflixQueue();
		
		Superheroes.addMovie(movie1);
		Superheroes.addMovie(movie2);
		Superheroes.addMovie(movie3);
		Superheroes.addMovie(movie3);
		Superheroes.addMovie(movie5);
		
		Superheroes.printMovies();
		
	Movie bestMovie =	Superheroes.getBestMovie();
	System.out.println("The best movie is " + bestMovie);
	 Superheroes.sortMoviesByRating();
	System.out.println("The second best movie is " + movie5);
		

	}
	
	
}
