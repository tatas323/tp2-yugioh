package modelo;

import modelo.Exceptions.CartaMuertaNoPuedeAtacarException;

public class Muerto implements VidaDeCarta {
    @Override
    public boolean estaMuerta() {
        return true;
    }

    @Override
    public void atacar() throws CartaMuertaNoPuedeAtacarException {
        throw new CartaMuertaNoPuedeAtacarException();

    }
}
