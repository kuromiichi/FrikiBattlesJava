package models;

import javafx.util.Pair;

public class Mordecai extends Personaje {
    boolean fullCounter = false;

    public Mordecai(boolean isBot) {
        this.nombre = "Mordecai";
        this.vida = 30;
        this.ataque = 3;
        this.equipo = Equipo.CORRIENTES;
        this.isBot = isBot;
    }

    public void habilidadEspecial(Personaje personaje) {
        atacar(personaje, this.ataque + 3);
        fullCounter = true;
        this.mana -= 50;
    }

    @Override
    public void recibirAtaque(int ataque) {
        if (this.fullCounter) {
            this.vida -= ataque - 4;
            this.fullCounter = false;
        } else this.vida -= ataque;
    }
}
