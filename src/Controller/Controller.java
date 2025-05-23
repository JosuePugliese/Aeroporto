package Controller;
import Model.*;

public class Controller {
    Utente utente;
    Prenotazione prenotazione;

    public Controller(Utente utente, Prenotazione prenotazione) {
        this.utente = new Utente("Mario", "Rossi");
        this.prenotazione = new Prenotazione("Mario", "Rossi", 43545, "3B", "DJFFD43", null, null);
    }



    public int loginUtente(String username, String password) {
    if(this.utente.getUsername().equals(username) && this.utente.getPassword().equals(password)) {
            return 1;
        }
    return 0;
    }


    public int prenotaVolo(Volo volo){

    }


    public int modificaVolo(Volo volo){

    }

    public int aggiungiVolo(Volo volo){
        prenotaVolo(volo);
    }
}
