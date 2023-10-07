package Repositorio;

import java.util.ArrayList;
import java.util.Scanner;

import Interface.InterfaceRepositorioProduto;
import Produto.Celular;
import Produto.TV;

public class RepositorioProduto implements InterfaceRepositorioProduto {

    static ArrayList<Celular> celulares = new ArrayList<>();
    static ArrayList<TV> televisores = new ArrayList<>();
    TV tv = new TV(0, null, null);
    Celular celular = new Celular(0, null, 0);

    {Celular celularTeste = new Celular(10, "Apple", 4000);
     celulares.add(celularTeste);
     TV tvTeste = new TV(54, "Samsung", "Remoto");
     televisores.add(tvTeste);}


    public static void cadastrarProduto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 para cadastro de TV\n2 para cadastro de celular");
        int escolha = entrada.nextInt();
        if (escolha==1){
            System.out.print("Digite o tamanho da tela:");
            int tamanhoTela = entrada.nextInt();
            limparBufferTeclado(entrada);
            System.out.print("\nDigite o fabricante:");
            String fabricante = entrada.nextLine();
            System.out.print("\nDigite o tipo de controle:");
            String tipoControle = entrada.nextLine();
            TV novaTV = new TV(tamanhoTela, fabricante, tipoControle);
            televisores.add(novaTV);
            System.out.println("\nTV cadastrada com sucesso!!!\n");
        } else if(escolha==2){
            System.out.print("Digite o tamanho da tela:");
            int tamanhoTela = entrada.nextInt();
            limparBufferTeclado(entrada);
            System.out.print("\nDigite o fabricante:");
            String fabricante = entrada.nextLine();
            System.out.print("\nDigite a capacidade da bateria:");
            int capacidadeBateria = entrada.nextInt();
            Celular novoCelular = new Celular(tamanhoTela, fabricante, capacidadeBateria);
            celulares.add(novoCelular);

            System.out.println("\nCelular cadastrado com sucesso!!!\n");
        }
        
    }

    public static void consultarProdutos() {
        System.out.println("---------TV's-----------");
        TV tvMostra;
        Celular celularMostra;
        for (int i = 0; i < televisores.size(); i++) {
            tvMostra = televisores.get(i);
            System.out.println("Tamanho da tela:" + tvMostra.getTamanhoTela()+"\nFabricante:" + tvMostra.getFabricante() + "\nTipo de controle:" + tvMostra.getTipoControle() + "\n---------------------------------");
        }
        System.out.println("----------CELULARES-----------");
        for (int j = 0; j < celulares.size(); j++) {
            celularMostra = celulares.get(j);
            System.out.println("Tamanho da tela:" + celularMostra.getTamanhoTela() + "\nFabricante:" + celularMostra.getFabricante()+"\nCapacidade da bateria: " + celularMostra.getCapacidadeBateria() + "\n---------------------------------");
        }

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
