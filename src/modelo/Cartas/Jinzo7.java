package modelo.Cartas;

import modelo.CartaMonstruo;
import modelo.Fusion;
import modelo.Jugador;
import modelo.Mazo;

import java.util.List;

public class Jinzo7 extends CartaMonstruo {
    private static String nombre = "Jinzo #7";
    private static int defensa = 400;
    private static int ataque = 500;
    private static int estrellas = 2;

    public Jinzo7() {
        super(nombre, defensa, ataque, estrellas);
    }

    @Override
    public void activarEfecto(List<CartaMonstruo> monstruosAliados, List<CartaMonstruo> monstruosEnemigos, Mazo mazo, Jugador jugador, Fusion fusion) {
        atacarA(jugador);

    }
}
