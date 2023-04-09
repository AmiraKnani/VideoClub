package video_club;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Videoclub {

	private List<Film> films;
    private List<Client> clients;
    private List<Location> locations;

    public Videoclub() {
        films = new ArrayList<>();
        clients = new ArrayList<>();
        locations = new ArrayList<>();
    }
    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public void ajouterFilm(Film film) {
        films.add(film);
    }

    public void ajouterLocation(Location location) {
        locations.add(location);
    }

    public Optional<Client> trouverClientParNumero(int numeroClient) {
        return clients.stream()
            .filter(client -> client.getNumeroClient() == numeroClient)
            .findFirst();
    }

    public Optional<Film> trouverFilmParTitre(String titre) {
        return films.stream()
            .filter(film -> film.getTitre().equalsIgnoreCase(titre))
            .findFirst();
    }

    public List<Film> listerFilmsParOrdreAlphabetique() {
        List<Film> filmsTries = new ArrayList<>(films);
        filmsTries.sort(Comparator.comparing(Film::getTitre));
        return filmsTries;
    }

    public List<Film> getFilms() {
        return films;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Location> getLocations() {
        return locations;
    }
}
