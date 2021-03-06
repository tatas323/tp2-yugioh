package modelo;

import modelo.Exceptions.AccionInvalidaEnFaseException;

public class FaseIncial implements Fase {

    private Jugador jugador;
    private Juego juego;
    private String nombreFase;

    public FaseIncial(Jugador unJugador, Juego elJuego){
        juego = elJuego;
        jugador = unJugador;
        this.nombreFase = "Fase Inicial";
        jugador.asignarFase(this);
        if(jugador.cantidadDeCartasEnMazo() == 0){
            juego.perdio(jugador);
            juego.terminarJuego();
        }
        else jugador.extraerCartasDelMazo();

        if(jugador.tieneExodiaEnMano()) {
            juego.gano(jugador);
            juego.terminarJuego();
        }
    }


    @Override
    public Fase cambiarFase(){
        return new FasePrincipal(jugador,juego);
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
        throw new AccionInvalidaEnFaseException();
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
