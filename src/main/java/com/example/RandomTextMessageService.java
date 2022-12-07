package com.example;

import java.util.Random;

public class RandomTextMessageService implements MessageService{
    private String[] tablica = {"PierwszaWiadomosc","DrugaWiadomosc","TrzeciaWiadomosc",
            "CzwartaWiadomosc","PiataWiadomosc","SzostaWiadomosc","SiodmaWiadomosc",
            "OsmaWiadomosc","DziewiataWiadomosc","DziesiataWiadomosc"};
    @Override
    public String getMessage() {
        Random generator = new Random();
        int randomIndex = generator.nextInt(tablica.length);
        return tablica[randomIndex];
    }
}
