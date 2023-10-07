package Interface;

import Produto.Celular;
import Produto.TV;

import java.util.Scanner;

public interface InterfaceRepositorioProduto{
    public static void cadastrarTV(TV novaTV){}

    public static void cadastrarCelular(Celular novoCelular){};

    public static void removerProdutos(){};

    public static void limparBufferTeclado(Scanner entrada){};
}