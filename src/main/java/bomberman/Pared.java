package bomberman;

public class Pared extends Contenido {

    public Boolean esCaminable() {
        return false;
    }

    public Contenido explotar() {
        return new ContenidoVacio();
    }



}
