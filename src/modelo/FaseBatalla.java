package modelo;

import modelo.Exceptions.AccionInvalidaEnFaseException;

public class FaseBatalla implements Fase {

    private Jugador jugador;
    private Juego juego;
    private String nombreFase;

    public FaseBatalla(Jugador unJugador, Juego elJuego){
        juego = elJuego;
        jugador = unJugador;
        this.nombreFase = "Fase de Batalla";
    }


    @Override
    public Fase cambiarFase(){
        return new FaseFinal(jugador,juego);
    }

    @Override
    public void jugarCartaMonstruo() throws AccionInvalidaEnFaseException {
        throw new AccionInvalidaEnFaseException();

    }

    @Override
    public void jugarCartaDeUtilidad() throws AccionInvalidaEnFaseException {
        throw new AccionInvalidaEnFaseException();

    }

    @Override
    public void jugarCartaDeCampo() throws AccionInvalidaEnFaseException {
        throw new AccionInvalidaEnFaseException();

    }


    @Override
    public void atacar() throws AccionInvalidaEnFaseException {

    }

    @Override
    public void activarCartaMagica() throws AccionInvalidaEnFaseException {
        throw new AccionInvalidaEnFaseException();

    }


	@Override
	public String obtenerFase() {
		return this.nombreFase;
	}



}
