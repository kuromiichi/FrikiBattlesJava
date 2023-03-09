package models;

public class Finn extends Personaje {
    public Finn(boolean isBot) {
        this.nombre = "Finn el Humano";
        this.vida = 21;
        this.ataque = 5;
        this.equipo = Equipo.AVENTURAS;
        this.isBot = isBot;
    }

    @Override
    public void habilidadEspecial(Personaje personaje) {
        if (personaje.vida <= (int) (0.4 * 30)) personaje.vida = 0;
        this.mana = 0;
    }
}
