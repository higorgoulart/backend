package org.example;

import org.example.enums.Status;
import org.example.models.Produto;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Produto produto = new Produto(
                10L, "Folha","Folha A4", 1500.00, 1200.00,
                LocalDate.of(2023, 01, 1), LocalDate.of(2023, 01, 15), Status.DISPONIVEL);
    }
}