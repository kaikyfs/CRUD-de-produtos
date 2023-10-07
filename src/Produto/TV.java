package Produto;

public class TV extends Produto{

    public String tipoControle;

    public TV(int tamamnhoTela, String fabricante, String tipoControle) {
        super(tamamnhoTela, fabricante);
        this.tipoControle = tipoControle;
    }

    public String getTipoControle(){
        return tipoControle;
    }
    
}
