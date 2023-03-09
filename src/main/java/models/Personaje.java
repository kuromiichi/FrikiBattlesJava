package models;

import javafx.util.Pair;

public abstract class Personaje {
    String nombre;
    int vida;
    int ataque;
    int mana = 100;
    Equipo equipo;
    boolean isBot;

    enum Equipo {AVENTURAS, CORRIENTES}

    public boolean estaVivo() {
        return vida > 0;
    }

    public void atacar(Personaje personaje, int ataque) {
        personaje.recibirAtaque(ataque);
    }

    public void ataqueNormal(Personaje personaje) {
        atacar(personaje, this.ataque);
    }

    public void recibirAtaque(int ataque) {
        this.vida -= ataque;
    }

    abstract public void habilidadEspecial(Personaje personaje);
}
