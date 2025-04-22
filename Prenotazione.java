package Model;

public class Prenotazione {
    private String  nome;
    private String cognome;
    private String codFiscale;
    private int numBiglietto;
    private String postoAssegnato;
    private StatoPrenotazione stato;
    private Volo volo;

    public Prenotazione(String nome, String cognome, int numBiglietto, String postoAssegnato, String codFiscale, StatoPrenotazione stato, Volo volo) {
        this.nome = nome;
        this.cognome = cognome;
        this.numBiglietto = numBiglietto;
        this.postoAssegnato = postoAssegnato;
        this.codFiscale = codFiscale;
        this.stato = stato;
        this.volo = volo;
    }

    public StatoPrenotazione getStato() {
        return stato;
    }

    public void setStato(StatoPrenotazione stato) {
        this.stato = stato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodFiscale() {
        return codFiscale;
    }

    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
    }

    public int getNumBiglietto() {
        return numBiglietto;
    }

    public void setNumBiglietto(int numBiglietto) {
        this.numBiglietto = numBiglietto;
    }

    public String getPostoAssegnato() {
        return postoAssegnato;
    }

    public void setPostoAssegnato(String postoAssegnato) {
        this.postoAssegnato = postoAssegnato;
    }

    public Prenotazione cercaEModifica(String nomePasseggero, int numeroVolo){

    }

    public Prenotazione cercaEModifica(String nomePasseggero){

    }

    public Prenotazione cercaEModifica(int numeroVolo){

    }
}
