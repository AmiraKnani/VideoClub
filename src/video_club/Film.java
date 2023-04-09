package video_club;

import java.time.LocalDate;

public class Film {
	private String titre;
    private LocalDate dateSortie;
    private String type;

    public Film(String titre, LocalDate dateSortie, String type) {
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.type = type;
    }

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
}
