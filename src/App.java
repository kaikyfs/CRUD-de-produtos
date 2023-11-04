import java.util.Scanner;

import Interface.InterfaceRepositorioProduto;
import Produto.Celular;
import Produto.TV;
import Repositorio.RepositorioProduto;

import static Interface.InterfaceRepositorioProduto.limparBufferTeclado;
import static Repositorio.RepositorioProduto.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("1.Cadastrar produto\n2.Consultar produto\n3.Remover produto\n4.Atualizar produto\n0.Sair do sistema");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("1 para cadastro de TV\n2 para cadastro de celular");
                    int escolha = entrada.nextInt();
                    if (escolha==1) {
                        System.out.print("Digite o tamanho da tela:");
                        int tamanhoTela = entrada.nextInt();
                        limparBufferTeclado(entrada);
                        System.out.print("\nDigite o fabricante:");
                        String fabricante = entrada.nextLine();
                        System.out.print("\nDigite o tipo de controle:");
                        String tipoControle = entrada.nextLine();
                        TV novaTV = new TV(tamanhoTela, fabricante, tipoControle);
                        RepositorioProduto.cadastrarTV(novaTV);
                        System.out.println("\nTV cadastrada com sucesso!!!\n");
                    }else if(escolha==2) {
                        System.out.print("Digite o tamanho da tela:");
                        int tamanhoTela = entrada.nextInt();
                        limparBufferTeclado(entrada);
                        System.out.print("\nDigite o fabricante:");
                        String fabricante = entrada.nextLine();
                        System.out.print("\nDigite a capacidade da bateria:");
                        int capacidadeBateria = entrada.nextInt();
                        Celular novoCelular = new Celular(tamanhoTela, fabricante, capacidadeBateria);
                        RepositorioProduto.cadastrarCelular(novoCelular);
                    }

                break;

                case 2:
                    System.out.println("---------TV's-----------");
                    TV tvMostra;
                    Celular celularMostra;
                    for (TV televisore : televisores) {
                        tvMostra = televisore;
                        System.out.println("Tamanho da tela:" + tvMostra.getTamanhoTela() + "\nFabricante:" + tvMostra.getFabricante() + "\nTipo de controle:" + tvMostra.getTipoControle() + "\n---------------------------------");
                    }
                    System.out.println("----------CELULARES-----------");
                    for (Celular celulare : celulares) {
                        celularMostra = celulare;
                        System.out.println("Tamanho da tela:" + celularMostra.getTamanhoTela() + "\nFabricante:" + celularMostra.getFabricante() + "\nCapacidade da bateria: " + celularMostra.getCapacidadeBateria() + "\n---------------------------------");
                    }
                break;

                case 3:
                    Scanner entradaRemover = new Scanner((System.in));
                    System.out.println("1 - Remover TV\n2 - Remover Celular\n");
                    int escolhaRemover = entradaRemover.nextInt();
                    TV tvRemover;
                    Celular celularRemover;
                    if (escolhaRemover == 1){
                        for (int i = 0; i < televisores.size(); i++) {
                            tvRemover = televisores.get(i);
                            System.out.println(i + " - Tamanho da tela:" + tvRemover.getTamanhoTela() + "\nFabricante:" + tvRemover.getFabricante() + "\nTipo de controle: " + tvRemover.getTipoControle() + "\n---------------------------------");
                        }
                        System.out.print("Digite o número referente a TV que você deseja remover: ");
                        int remover = entradaRemover.nextInt();
                        removerTV(remover);
                        System.out.println("TV removida com sucesso");
                    }
                    else if (escolhaRemover == 2){
                        for (int i= 0; i <celulares.size(); i++){
                            celularRemover = celulares.get(i);
                            System.out.println(i + " - Tamanho da tela:" + celularRemover.getTamanhoTela() + "\nFabricante:" + celularRemover.getFabricante() + "\nCapacidade da bateria: " + celularRemover.getCapacidadeBateria() + "\n---------------------------------");
                        }
                        System.out.println("Digite o número referente a TV que você deseja remover: ");
                        int remover = entradaRemover.nextInt();
                        removerCelular(remover);
                        System.out.println("Celular removido com sucesso");
                    }

                break;
                case 4:
                break;

                case 0:
                System.out.println("Obrigado por usar nosso sistema, até mais!");

                default:
                System.out.println("Opção inválida");
                break;
            }
        }while(opcao!=0);

    }


}
