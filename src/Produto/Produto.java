package Produto;

abstract class Produto {
    private int tamamnhoTela;
    private String fabricante;

    public Produto(int tamamnhoTela, String fabricante){
        this.tamamnhoTela = tamamnhoTela;
        this.fabricante = fabricante;
    }


    public int getTamanhoTela(){
        return tamamnhoTela;
    }

    public void setTamanhoTela(int tamamnhoTela){
        this.tamamnhoTela = tamamnhoTela;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
}
