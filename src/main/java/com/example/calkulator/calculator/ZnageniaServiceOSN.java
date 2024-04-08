package com.example.calkulator.calculator;


public class ZnageniaServiceOSN {

    public double revenueR(Znagenia znagenia) {
        znagenia.revenue = znagenia.getProdaja() - znagenia.getZakupka();
        return znagenia.revenue;
    }

    public double NDSObshay(Znagenia znagenia) {
        znagenia.ndsObshay = ((znagenia.getProdaja() - (znagenia.getZakupka())) * 20) / 120.0;
        return znagenia.ndsObshay;
    }

    public double NDFL(Znagenia znagenia) {
        znagenia.ndfl = (znagenia.getProdaja() - znagenia.getZakupka()) * 0.13;
        return znagenia.ndfl;
    }

    public double iNCOME(Znagenia znagenia) {
        znagenia.income = revenueR(znagenia) - NDSObshay(znagenia) - NDFL(znagenia);
        return znagenia.income;
    }
}
