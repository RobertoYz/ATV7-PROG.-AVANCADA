package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Produto> mapa = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do{
        System.out.println("----- MENU -----\n\n" + "1 - Cadastrar produto\n" +
                "2 - Buscar produto por código\n" +
                "3 - Sair\n" + "Opção: ");;
                opcao = scanner.nextInt();
                scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome do produto: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o código do produto: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                Produto produto = new Produto(codigo, nome, preco);
                mapa.put(codigo, produto);
                System.out.println("PRODUTO CADASTRADO!");
                break;
            case 2:
                System.out.print("Digite o código do produto: ");
                int codigoBusca = scanner.nextInt();
                scanner.nextLine();

                Produto produtoEncontrado = mapa.get(codigoBusca);
                if (produtoEncontrado != null){
                    System.out.println("Produto encontrado:");
                    System.out.println(produtoEncontrado.toString());
                } else {
                    System.out.println("Produto com código " + codigoBusca + " não encontrado.");
                }
                break;
            case 3:
                System.out.println("SAINDO...");
            default:
                System.out.println("Opção inválida!");
        }
        }while(opcao != 3);
    }
}