package com.company;

import metodos.atualizacao.Atualizacao;
import metodos.cadastro.Cadatro;
import metodos.emprestimos.Emprestimos;
import metodos.exibirDados.ExibirDados;
import metodos.investimentos.Investimentos;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao nosso menu:");
        System.out.println();
        System.out.println("================================");
        System.out.println();
        System.out.print("Escolha uma das opções: 1 - Pessoa física; 2 - Empresa/Pessoa juridica; 0 - Sair -> ");
        String escolha = scanner.nextLine();

        boolean continuar = true;
        while(continuar){
            switch (escolha) {
                case "1":
                    Cadatro cadastro = new Cadatro();
                    cadastro.cadastropessoa();

                    boolean a = true;
                    while (a) {

                        System.out.println();
                        System.out.println("Opções:");
                        System.out.print("1 - Empréstimo; 2 - Investimentos; 3 - Atualizar os seus dados; " +
                                "4 - Exibir seus dados ;0 - sair --> ");
                        int escolhaCase1 = scanner.nextInt();

                        if (escolhaCase1 == 1) {
                            Emprestimos emprestimos = new Emprestimos();
                            emprestimos.emprestimoParaUsuario();
                        } else if (escolhaCase1 == 2) {
                            Investimentos investimentos = new Investimentos();
                            investimentos.poupanca();
                        }else if(escolhaCase1 == 3){
                            Atualizacao atualicacao = new Atualizacao();
                            atualicacao.atualizacaoDeUsuarios();
                        }else if(escolhaCase1 == 4){
                            ExibirDados exibirDados = new ExibirDados();
                            exibirDados.exibirDadosDeUsuarios();
                        }
                        else if (escolhaCase1 == 0) {
                            System.exit(0);
                        }
                    }
                    continuar = false;
                    break;
                case "2":

                    Cadatro menu2 = new Cadatro();
                    menu2.cadastroempresa();
                    boolean b = true;
                    while (b == true) {
                        System.out.print("1 - Empréstimo; 2 - Investimentos; 3 - Atualizar os seus dados de usuário; " +
                                "4 - Exibir seus dados ;0 - sair --> ");
                        int escolhaCase2 = scanner.nextInt();
                        if (escolhaCase2 == 1) {
                            Emprestimos emprestimos = new Emprestimos();
                            emprestimos.emprestimoParaEmpresas();
                        }else if (escolhaCase2 == 2) {
                            Investimentos investimentos = new Investimentos();
                            investimentos.poupanca();
                        }else if(escolhaCase2== 3){
                            Atualizacao atualicacao = new Atualizacao();
                        }
                        else if (escolhaCase2 == 0) {
                            System.exit(0);
                        }
                    }
                    continuar = false;
                    break;

                case "0":
                    System.out.println();
                    System.out.println("""
                            Tchau!
                            Obrigado por usar nossos serviços!
                            """);

                    continuar = false;
                    break;
            }
        }
    }
}
