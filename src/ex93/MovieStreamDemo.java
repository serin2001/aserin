package ex93;

import java.util.Comparator;
import java.util.List;

public class MovieStreamDemo {
	static class Movie {
		String title;
		double rating;
		int year;

		Movie(String title, double rating, int year) {
			this.title = title;
			this.rating = rating;
			this.year = year;
		}

		public String getTitle() {
			return title;
		}

		public double getRating() {
			return rating;
		}

		public int getYear() {
			return year;
		}

		@Override
		public String toString() {
			return title + " (" + year + ") - Rating: " + rating;
		}
	}

	public static void main(String args[]) {
        List<Movie> movies = List.of(
                new Movie("Inception", 8.8, 2010),
                new Movie("The Godfather", 9.2, 1972),
                new Movie("The Room", 3.7, 2003),
                new Movie("Interstellar", 8.6, 2014),
                new Movie("Joker", 8.4, 2019),
                new Movie("Guardians of the Galaxy", 8.0, 2014), // New movie
                new Movie("The Lego Movie", 7.8, 2014) // New movie
            );

		movies.stream()
			.filter(m -> m.getRating() >= 7.5)
			.sorted(Comparator.comparing(Movie::getYear)
			.thenComparing(Comparator.comparing(Movie::getRating).reversed()))
			.forEach(System.out::println);
	}
}
