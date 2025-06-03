package org.lessons.java.oop.snacks;

public class Studente {
private String nome;
private String cognome;
private int età;

public Studente (String nome, String cognome, int età){
    this.nome = nome;
    this.cognome = cognome;
    this.età = età;
}

// Getters e Setters

public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getCognome(){
    return cognome; 
}

public void setCognome(String cognome){
    this.cognome = cognome;
}
public int getEtà(){
    return età;
}   
public void setEtà(int età){
    this.età = età;
}

public  String getInfoStudente(){
    return nome + " " + cognome + ", " + età + " anni";
}
}
