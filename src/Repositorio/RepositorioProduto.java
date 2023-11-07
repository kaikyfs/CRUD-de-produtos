package Repositorio;

import java.util.ArrayList;
import java.util.Scanner;

import Interface.InterfaceRepositorioProduto;
import Produto.Celular;
import Produto.TV;

public class RepositorioProduto implements InterfaceRepositorioProduto {

    public static ArrayList<Celular> celulares = new ArrayList<>();
    public static ArrayList<TV> televisores = new ArrayList<>();
    TV tv = new TV(0, null, null);
    Celular celular = new Celular(0, null, 0);

    static {Celular celularTeste = new Celular(10, "Apple", 4000);
     celulares.add(celularTeste);
     TV tvTeste = new TV(54, "Samsung", "Remoto");
     televisores.add(tvTeste);}


    public static void cadastrarTV(TV novaTV) {
            televisores.add(novaTV);
    }

    public static void cadastrarCelular(Celular novoCelular){
        celulares.add(novoCelular);
    }


    public static void removerTV (int remover) {
               televisores.remove(remover);
    }

    public static void removerCelular (int remover){
        celulares.remove(remover);
    }
    
}
