package org.lessons.java.oop.snacks;

public class RegistroStudenti {
private Studente[] registro;

public RegistroStudenti() {
    this.registro = new Studente[0];
}

public Studente[] getRegistro() {
    return registro;
}
public void setRegistro(Studente[] registro) {
    this.registro = registro;
}

public void aggiungiStudente(Studente studente) {
    Studente[] nuovoRegistro = new Studente[registro.length + 1];
    for (int i = 0; i < registro.length; i++) {
        nuovoRegistro[i] = registro[i];
    }
    nuovoRegistro[nuovoRegistro.length - 1] = studente;
    this.registro = nuovoRegistro;
}

public String getRegistroTotale(){
    String Totale = "Registro studenti: ";
    for (Studente studente : registro) {
        Totale += studente.getInfoStudente() + "; ";
    }
    return Totale;
}
}
