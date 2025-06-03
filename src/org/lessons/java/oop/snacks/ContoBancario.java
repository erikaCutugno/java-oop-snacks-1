package org.lessons.java.oop.snacks;

import java.math.BigDecimal;

public class ContoBancario {
private int numeroConto;
private BigDecimal saldo;

public ContoBancario(int numeroConto) {
    this.numeroConto = numeroConto;
    this.saldo = new BigDecimal(0);
}
// Getters e Setters
public int getNumeroConto() {
    return numeroConto;
}
public void setNumeroConto(int numeroConto) {
    this.numeroConto = numeroConto;
}

public BigDecimal getSaldo() {
    return this.saldo;
}
public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
}

public void deposito(BigDecimal importoDaDepositare) {
    if(importoDaDepositare.compareTo(new BigDecimal(0)) > 0) {
        this.saldo = saldo.add(importoDaDepositare);
    } 
}

public void prelievo(BigDecimal importoDaPrelevare) {
    if(importoDaPrelevare.compareTo(new BigDecimal(0)) > 0 && saldo.compareTo(importoDaPrelevare) >= 0) {
        this.saldo = saldo.subtract(importoDaPrelevare);
        
    }
}
}