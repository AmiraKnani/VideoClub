package video_club;

import java.time.LocalDate;

public interface FilmFactory {
	Film createFilm(String titre, LocalDate dateSortie, String type);
}
