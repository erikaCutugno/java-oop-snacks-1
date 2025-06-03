package org.lessons.java.oop.snacks;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // snack 1
        Studente luca = new Studente("Luca", "Bianchi", 18);
        System.out.println(luca.getInfoStudente());

        // snack 2
        ContoBancario contoLuca = new ContoBancario(12345 );
        contoLuca.deposito(new BigDecimal(1000));
        System.out.println(contoLuca.getSaldo());
       
        contoLuca.prelievo(new BigDecimal(200));
        System.out.println(contoLuca.getSaldo());
    }
}
