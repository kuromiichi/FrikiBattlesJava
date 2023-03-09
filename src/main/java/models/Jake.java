package models;

public class Jake extends Personaje {
    public Jake(boolean isBot) {
        this.nombre = "Jake el Perro";
        this.vida = 21;
        this.ataque = 5;
        this.equipo = Equipo.AVENTURAS;
        this.isBot = isBot;
    }

    @Override
    public void habilidadEspecial(Personaje personaje) {
        atacar(personaje, 8);
        this.mana -= 50;
    }
}
