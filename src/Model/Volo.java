package Model;

import java.util.ArrayList;
import java.util.Date;

public class Volo {
    private int idVolo;
    private String compagniaAerea;
    private String aereportoDiOrigine;
    private String aereportoDiDestinazione;
    private Date data;
    private  Date orario;
    private Date inRitardo;
    private Boolean arrivo_Partenza;
    private StatoVolo stato;
    private Gate gate;
    ArrayList<Prenotazione> prenotazione = new ArrayList<>();


    public Volo(int idVolo, String compagniaAerea, String aereportoDiOrigine, String aereportoDiDestinazione, Date data, Date orario, Date inRitardo, Boolean arrivo_Partenza, StatoVolo stato, Gate gate, Prenotazione prenotazione) {
        this.idVolo = idVolo;
        this.compagniaAerea = compagniaAerea;
        this.aereportoDiOrigine = aereportoDiOrigine;
        this.aereportoDiDestinazione = aereportoDiDestinazione;
        this.data = data;
        this.orario = orario;
        this.inRitardo = inRitardo;
        this.arrivo_Partenza = arrivo_Partenza;
        this.stato = stato;
        this.gate = gate;
        this.prenotazione.add(prenotazione);
    }




    public void setStato(StatoVolo stato) {
        this.stato = stato;
    }
    public StatoVolo getStato() {
        return stato;
    }

    public String getCompagniaAerea() {
        return compagniaAerea;
    }

    public void setCompagniaAerea(String compagniaAerea) {
        this.compagniaAerea = compagniaAerea;
    }

    public int getIdVolo() {
        return idVolo;
    }

    public void setIdVolo(int idVolo) {
        this.idVolo = idVolo;
    }

    public String getAereportoDiOrigine() {
        return aereportoDiOrigine;
    }

    public void setAereportoDiOrigine(String aereportoDiOrigine) {
        this.aereportoDiOrigine = aereportoDiOrigine;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAereportoDiDestinazione() {
        return aereportoDiDestinazione;
    }

    public void setAereportoDiDestinazione(String aereportoDiDestinazione) {
        this.aereportoDiDestinazione = aereportoDiDestinazione;
    }

    public Date getOrario() {
        return orario;
    }

    public void setOrario(Date orario) {
        this.orario = orario;
    }

    public Date getInRitardo() {
        return inRitardo;
    }

    public void setInRitardo(Date inRitardo) {
        this.inRitardo = inRitardo;
    }

    public Boolean getArrivo_Partenza() {
        return arrivo_Partenza;
    }

    public void setArrivo_Partenza(Boolean arrivo_Partenza) {
        this.arrivo_Partenza = arrivo_Partenza;
    }
}
