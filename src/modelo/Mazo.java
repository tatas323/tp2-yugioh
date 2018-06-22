package modelo;

import java.util.Collections;
import java.util.Stack;

public class Mazo {

    protected Stack<Carta> cartasEnMazo;

    public Mazo () {
        this.cartasEnMazo = new Stack<>();
    }

    public void agregarCarta(Carta carta) {
    	this.cartasEnMazo.add(carta);
    }

    public Carta extraerCarta(){
        if(cartasEnMazo.empty())
        	throw new ElMazoEstaVacioException();
        return cartasEnMazo.pop();
    }

    public int cantidadDeCartas(){
        return this.cartasEnMazo.size();
    }

    public void armarMazo(Stack<Carta> cartas) {
	int cantidad = cartas.size();
        for (int i = 0; i < cantidad; i++)
            cartasEnMazo.add(cartas.pop());

        Collections.shuffle(this.cartasEnMazo);
    }

}