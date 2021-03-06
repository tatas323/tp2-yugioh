package vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import modelo.*;
import modelo.Cartas.MonstruoNulo;
import modelo.Cartas.UtilidadNula;
import vista.BotonesTablero.*;

import java.util.List;

public class Tablero extends GridPane {


    private  JuegoScene juegoScene;
    private Datos datos;
    private Jugador jugadorActual;
    private Jugador enemigoActual;
    private HBox monstruosJugadorActual;
    private HBox utilidadJugadorActual;
    private HBox monstruosEnemigoActual;
    private HBox utilidadjEnemigoActual;
    private Button cartaCampo;
    private Button mazo;
    private Pane mazoFusion;



    public Tablero(Jugador juan, Jugador carlos, Jugador actual, Datos datos, JuegoScene juegoScene) {

        this.setMinSize(1000,800);
        this.setPadding(new Insets(10, 10, 10, 10));
        this.setVgap(5);
        this.setHgap(5);
        this.setAlignment(Pos.CENTER);
        this.datos = datos;
        this.juegoScene = juegoScene;
        jugadorActual = actual;
        if (actual == juan)
            enemigoActual = carlos;
        else enemigoActual = juan;
        actualizarTablero();



    }



    public void actualizarLadoDeJugadorActual(){
        List<CartaMonstruo> cartas = jugadorActual.getCartasMonstruos();
        monstruosJugadorActual.getChildren().clear();
        for (CartaMonstruo i : cartas){
            Button cartaMonstruo = new BotonCartaMonstruo(jugadorActual, i, datos, this,juegoScene);
            monstruosJugadorActual.getChildren().add(cartaMonstruo);
        }
        for (int i = cartas.size() ; i < 5 ; i++){
            Button cartaMonstruo = new BotonCartaMonstruo(jugadorActual,new MonstruoNulo(),datos,this,juegoScene);
            cartaMonstruo.setId("cartaMonstruo-propia");
            monstruosJugadorActual.getChildren().add(cartaMonstruo);
        }
        List<CartaDeUtilidad> cartaDeUtilidads = jugadorActual.getCartasDeUtilidad();
        utilidadJugadorActual.getChildren().clear();
        for (CartaDeUtilidad i : cartaDeUtilidads){
            Button carta = new BotonCartaDeUtilidad(jugadorActual,i,datos,this,juegoScene);
            utilidadJugadorActual.getChildren().add(carta);
        }
        for (int i = cartaDeUtilidads.size() ; i < 5 ; i++){
            Button carta = new BotonCartaDeUtilidad(jugadorActual,new UtilidadNula(),datos, this,juegoScene);
            carta.setId("cartaDeUtilidad-propia");
            utilidadJugadorActual.getChildren().add(carta);

        }
        monstruosJugadorActual.setSpacing(10);
        utilidadJugadorActual.setSpacing(10);
        this.add(monstruosJugadorActual,2,4);
        this.add(utilidadJugadorActual,2,5);

    }

    public void actualizarLadoDeEnemigoActual() {
        List<CartaMonstruo> cartas = enemigoActual.getCartasMonstruos();
        monstruosEnemigoActual.getChildren().clear();
        for (CartaMonstruo i : cartas) {
            Button cartaMonstruo = new BotonCartaMonstruoEnemiga(enemigoActual, i, datos);
            monstruosEnemigoActual.getChildren().add(cartaMonstruo);
        }
        for (int i = cartas.size(); i < 5; i++) {
            Button cartaMonstruo = new BotonCartaMonstruoEnemiga(enemigoActual, new MonstruoNulo(), datos);
            cartaMonstruo.setId("carta");
            monstruosEnemigoActual.getChildren().add(cartaMonstruo);
        }
        List<CartaDeUtilidad> cartaDeUtilidads = enemigoActual.getCartasDeUtilidad();
        utilidadjEnemigoActual.getChildren().clear();
        for (CartaDeUtilidad i : cartaDeUtilidads) {
            Button carta = new BotonCartaDeUtilidadEnemiga(enemigoActual, i, datos);
            utilidadjEnemigoActual.getChildren().add(carta);
        }
        for (int i = cartaDeUtilidads.size(); i < 5; i++) {
            Button carta = new BotonCartaDeUtilidadEnemiga(enemigoActual, new UtilidadNula(), datos);
            carta.setId("carta");
            utilidadjEnemigoActual.getChildren().add(carta);
        }
        monstruosEnemigoActual.setSpacing(10);
        utilidadjEnemigoActual.setSpacing(10);
        this.add(monstruosEnemigoActual,2,2);
        this.add(utilidadjEnemigoActual,2,1);
    }

    public void actualizarCartaDeCampo(){
        cartaCampo = new BotonCarta(jugadorActual,jugadorActual.getCartaDeCampo(),datos);
        cartaCampo.setId("carta-campo-propia");
        this.add(cartaCampo,1,4);
    }

    public void actualizarMazo(){
        mazo = new BotonMazo(jugadorActual,jugadorActual.getMazo(),juegoScene);
        mazo.setId("mazo-propio");
        this.add(mazo,3,5);
    }

    public void actualizarMazoDeFusiones(){
        mazoFusion = new StackPane();
        mazoFusion.setId("mazo-fusion-propio");
        this.add(mazoFusion,1,5);
    }


    public void actualizarTablero() {
        getChildren().clear();
        monstruosJugadorActual = new HBox();
        monstruosEnemigoActual = new HBox();
        utilidadJugadorActual = new HBox();
        utilidadjEnemigoActual = new HBox();

        actualizarLadoDeJugadorActual();
        actualizarLadoDeEnemigoActual();
        actualizarMazoDeFusiones();
        actualizarMazo();
        actualizarCartaDeCampo();
    }
}
