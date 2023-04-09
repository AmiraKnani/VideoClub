package video_club;

import java.time.LocalDate;

public class Location {
	private Film film;
    private Client client;
    private LocalDate dateLocation;
    private LocalDate dateRetour;

    public Location(Film film, Client client, LocalDate dateLocation, LocalDate dateRetour) {
        this.film = film;
        this.client = client;
        this.dateLocation = dateLocation;
        this.dateRetour = dateRetour;
    }

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDate getDateLocation() {
		return dateLocation;
	}

	public void setDateLocation(LocalDate dateLocation) {
		this.dateLocation = dateLocation;
	}

	public LocalDate getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}
    
    
}
