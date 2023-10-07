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


    private static void limparBufferTeclado(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }}


    public static void removerProdutos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 para remover uma TV\n2 para remover um celular");
        int escolha = entrada.nextInt();
        if(escolha==1){
            TV tvExcluir;
            for (int i = 0; i < televisores.size(); i++) {
                tvExcluir = televisores.get(i);
                System.out.println(i + " Tamanho da tela:" + tvExcluir.getTamanhoTela() + "  ||  " + "Fabricante:" + tvExcluir.getFabricante() + "  ||  " + "Tipo de controle:" + tvExcluir.getTipoControle());
            }
            System.out.print("Digite o número referente a TV que você deseja remover:");
            int remover = entrada.nextInt();
            televisores.remove(remover);
            System.out.println("\nTV removida com sucesso!!!\n");
        } else if(escolha==2){
            Celular celularExcluir;
            for (int i = 0; i < celulares.size(); i++) {
                celularExcluir = celulares.get(i);
                System.out.println(i + " - Tamanho da tela:" + celularExcluir.getTamanhoTela() + "  ||  " + "Fabricante:" + celularExcluir.getFabricante() + "  ||  " + "Capacidade da bateria:" + celularExcluir.getCapacidadeBateria());
            }
            System.out.print("Digite o número referente ao celular que você quer remover:");
            int remover = entrada.nextInt();
            celulares.remove(remover);
            System.out.println("\nCelular removida com sucesso!!!\n");
        }

    }
    
}
