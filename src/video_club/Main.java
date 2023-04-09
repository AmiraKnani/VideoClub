package video_club;
import java.util.Scanner;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FilmFactory filmFactory = new SimpleFilmFactory();

        Film film1 = filmFactory.createFilm("Indiana Jones", LocalDate.of(2001, 2, 7), "Thriller");
        Film film2 = filmFactory.createFilm("Star Wars", LocalDate.of(2012, 2, 10), "Comedy");
        Film film3 = filmFactory.createFilm("Titanic", LocalDate.of(2021, 9, 15), "Horror");

        Client client1 = new Client(1, "1234", "123456789");
        Client client2 = new Client(2, "0000", "234567890");
        Client client3 = new Client(3, "4321", "345678901");

        Location location1 = new Location(film1, client1, LocalDate.now(), LocalDate.now().plusDays(1));
        Location location2 = new Location(film2, client2, LocalDate.now(), LocalDate.now().plusDays(1));
        Location location3 = new Location(film3, client3, LocalDate.now(), LocalDate.now().plusDays(1));

        Videoclub videoclub = new Videoclub();

        videoclub.getFilms().add(film1);
        videoclub.getFilms().add(film2);
        videoclub.getFilms().add(film3);
        videoclub.getClients().add(client1);
        videoclub.getClients().add(client2);
        videoclub.getClients().add(client3);
        videoclub.getLocations().add(location1);
        videoclub.getLocations().add(location2);
        videoclub.getLocations().add(location3);
        
        gererVideoclub(videoclub);
       
    }
    public static void afficherMenu() {
        System.out.println("Menu :");
        System.out.println("1. Afficher les films disponibles");
        System.out.println("2. Louer un film");
        System.out.println("3. Rendre un film");
        System.out.println("4. Quitter");
    }

    public static void gererVideoclub(Videoclub videoclub) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            afficherMenu();
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Films disponibles :");
                    videoclub.listerFilmsParOrdreAlphabetique().forEach(film -> System.out.println(film.getTitre()));
                    break;
                case 2:  
                    System.out.print("Entrez le numéro de client : ");
                    int numeroClient = scanner.nextInt();
                    System.out.print("Entrez le titre du film : ");
                    scanner.nextLine();
                    String titreFilm = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Entrez le numéro de client : ");
                    int numClient = scanner.nextInt();
                    System.out.print("Entrez le titre du film à rendre : ");
                    scanner.nextLine();
                    String titre = scanner.nextLine();
                    break;
                case 4:
                    continuer = false;
                    break;
                default:
                    System.out.println("Option non valide. Veuillez choisir une option valide.");
            }
        }

        scanner.close();
    }
}
