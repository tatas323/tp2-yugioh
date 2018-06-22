package modelo.Cartas;

import modelo.CartaMonstruo;

public class Exodia extends CartaMonstruo {

    private static String nombre = "Exodia";
    private static int defensa = 1000;
    private static int ataque = 1000;
    private static int estrellas = 3;

    public Exodia() {
        super(nombre, defensa, ataque, estrellas);
    }

}