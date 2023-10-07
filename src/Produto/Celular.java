package Produto;

public class Celular extends Produto {

    public int capacidadeBateria;

    public Celular(int tamamnhoTela, String fabricante, int capacidadeBateria) {
        super(tamamnhoTela, fabricante);
        this.capacidadeBateria = capacidadeBateria;

    }

    public int getCapacidadeBateria(){
        return capacidadeBateria;
    }
}
