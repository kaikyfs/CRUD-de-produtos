import java.util.Scanner;

import Interface.InterfaceRepositorioProduto;
import Repositorio.RepositorioProduto;


public class App {
    public static void main(String[] args) throws Exception {
        InterfaceRepositorioProduto interfaceRepositorioProduto = new RepositorioProduto();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("1.Cadastrar produto\n2.Consultar produto\n3.Remover produto\n0.Sair do sistema");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                RepositorioProduto.cadastrarProduto();
                break;

                case 2:
                RepositorioProduto.consultarProdutos();
                break;

                case 3:
                RepositorioProduto.removerProdutos();
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
