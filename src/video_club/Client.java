package video_club;

public class Client {
	 private int numeroClient;
	    private String motDePasse;
	    private String numeroCarteCredit;

	    public Client(int numeroClient, String motDePasse, String numeroCarteCredit) {
	        this.numeroClient = numeroClient;
	        this.motDePasse = motDePasse;
	        this.numeroCarteCredit = numeroCarteCredit;
	    }

		public int getNumeroClient() {
			return numeroClient;
		}

		public void setNumeroClient(int numeroClient) {
			this.numeroClient = numeroClient;
		}

		public String getMotDePasse() {
			return motDePasse;
		}

		public void setMotDePasse(String motDePasse) {
			this.motDePasse = motDePasse;
		}

		public String getNumeroCarteCredit() {
			return numeroCarteCredit;
		}

		public void setNumeroCarteCredit(String numeroCarteCredit) {
			this.numeroCarteCredit = numeroCarteCredit;
		}
	    

}
