package fr.imie.calculette.vue;

import fr.imie.calculette.controler.Calcul;

public class Launcher {

    public static void main(String[] args) {
        Vue vue = new Vue();
        Calcul controller = new Calcul(vue);
    }
}
