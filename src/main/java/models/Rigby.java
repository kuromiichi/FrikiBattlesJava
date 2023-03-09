package models;

import javafx.util.Pair;

public class Rigby extends Personaje{
    public Rigby(boolean isBot) {
        this.nombre = "Rigby";
        this.vida = 30;
        this.ataque = 3;
        this.equipo = Personaje.Equipo.CORRIENTES;
        this.isBot = isBot;
    }

    @Override
    public void habilidadEspecial(Personaje personaje) {
        this.vida += 7;
        if (this.vida >= 30) this.vida = 30;
        this.mana -= 40;
    }
}
