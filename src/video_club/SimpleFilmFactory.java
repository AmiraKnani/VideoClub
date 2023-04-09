package video_club;

import java.time.LocalDate;

public class SimpleFilmFactory implements FilmFactory{

	@Override
	public Film createFilm(String titre, LocalDate dateSortie, String type) {
		return new Film(titre, dateSortie, type);
	}
	
}
