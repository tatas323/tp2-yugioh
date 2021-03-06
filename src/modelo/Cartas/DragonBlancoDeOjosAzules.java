package modelo.Cartas;

import javafx.scene.image.Image;
import javafx.scene.text.Text;
import modelo.Exceptions.CantidadDeSacrificiosIncorrectaException;
import modelo.CartaMonstruo;

public class DragonBlancoDeOjosAzules extends CartaMonstruo {

    private static String nombre = "Dragon Blanco De Ojos Azules";
    private static int defensa = 2500;
    private static int ataque = 3000;
    private static int estrellas = 8;
    private Image imagen = new Image(getClass().getResourceAsStream("Dragon_Blanco_De_Ojos_Azules.jpg"));
    //private static Image imagen = new Image( "file:src/modelo/Cartas/");
    private static Text datos = new Text("Nombre: Dragon Blanco\n" + " De Ojos Azules\n" +
            "Ataque: 3000\n" +
            "Defensa: 2500\n" +
            "Estrellas: 8");

    @Override
    public Image getImagen(){
        return imagen;
    }

    @Override
    public Text getDatos(){
        return datos;
    }



    public DragonBlancoDeOjosAzules() {
        super(nombre, defensa, ataque, estrellas);
    }

    @Override
    public void verificarCantidadDeSacrificios(int cantidad) throws CantidadDeSacrificiosIncorrectaException {
        if (cantidad != 2)
            throw new CantidadDeSacrificiosIncorrectaException();

    }
}
