package modelo;

import modelo.Exceptions.AccionInvalidaEnFaseException;

public class SinFase implements Fase {


    @Override
    public Fase cambiarFase()  {
        return null;
    }

    @Override
    public void jugarCartaMonstruo() throws AccionInvalidaEnFaseException {

    }

    @Override
    public void jugarCartaDeUtilidad() throws AccionInvalidaEnFaseException {

    }

    @Override
    public void jugarCartaDeCampo() throws AccionInvalidaEnFaseException {

    }

    @Override
    public void atacar() throws AccionInvalidaEnFaseException {

    }

    @Override
    public void activarCartaMagica() throws AccionInvalidaEnFaseException {

    }
    
    @Override
	public String obtenerFase() {
		return null;
	}
}
