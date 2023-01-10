
public class Cliente {
	
	int codiceCliente;
	String nomeECognome;
	String email;
	String dataIscrizione;
	
	public Cliente(int codiceCliente, String nomeECognome, String email, String dataIscrizione) {
		this.codiceCliente = codiceCliente;
		this.nomeECognome = nomeECognome;
		this.email = email;
		this.dataIscrizione = dataIscrizione;
	}
	
	public void stampaCliente() {
		System.out.println( "Codice cliente: " + this.codiceCliente );
		System.out.println( "Nome e cognome: " + this.nomeECognome );
		System.out.println( "Email: " + this.email);
		System.out.println( "Data d'iscrizione: " + this.dataIscrizione );
	}
	
}
