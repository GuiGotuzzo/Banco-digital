package com.company;

import metodos.atualizacao.Atualizacao;
import metodos.cadastro.Cadatro;
import metodos.emprestimos.Emprestimos;
import metodos.exibirDados.ExibirDados;
import metodos.investimentos.Investimentos;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException{
        Scanner scanner = new Scanner(System.in);

        boolean c = true;

        boolean continuar = true;

        System.out.println("Bem-vindo ao nosso menu:");
        while (c) {
            while (continuar) {
            System.out.println();
            System.out.println("================================");
            System.out.println();
            System.out.print("Escolha uma das opções: 1 - Pessoa física; 2 - Empresa/Pessoa juridica; 0 - Sair -> ");
            String escolha = scanner.nextLine();
                if (escolha.equals("1")) {
                    continuar = true;
                    Cadatro cadastro = new Cadatro();
                    cadastro.cadastropessoa();

                    boolean a = true;
                    while (a) {
                        System.out.println();
                        System.out.println("Opções:");
                        System.out.print("1 - Empréstimo; 2 - Investimentos; 3 - Atualizar os seus dados; " +
                                "4 - Exibir seus dados ;0 - sair --> ");
                        String escolhaCase1 = scanner.nextLine();
                        System.out.println();

                        if (escolhaCase1.equals("1")) {
                            Emprestimos emprestimos = new Emprestimos();
                            emprestimos.emprestimoParaUsuario();
                        } else if (escolhaCase1.equals("2")) {
                            boolean d = true;
                            while (d) {
                                System.out.print("Você deseja investir: 1 - Poupança; 2 - Renda Fixa -> ");
                                String opcao = scanner.nextLine();
                                Investimentos investimentos = new Investimentos();
                                if (opcao.equals("1")) {
                                    investimentos.poupanca("1");
                                    d = false;
                                } else if (opcao.equals("2")) {
                                    investimentos.rendaFixa("1");
                                    d = false;
                                } else {
                                    System.out.println();
                                }
                            }
                        } else if (escolhaCase1.equals("3")) {
                            Atualizacao atualicacao = new Atualizacao();
                            atualicacao.atualizacaoDeUsuarios();
                        } else if (escolhaCase1.equals("4")) {
                            ExibirDados exibirDados = new ExibirDados();
                            exibirDados.exibirDadosDeUsuarios();
                        } else if (escolhaCase1.equals("0")) {
                            System.exit(0);
                        } else {
                            System.out.println();
                        }
                    }
                }
                else if (escolha.equals("2")) {
                    continuar = true;
                    Cadatro menu2 = new Cadatro();
                    menu2.cadastroempresa();
                    boolean b = true;
                    while (b == true) {
                        System.out.print("1 - Empréstimo; 2 - Investimentos; 3 - Atualizar os seus dados de usuário; " +
                                "4 - Exibir seus dados ;0 - sair --> ");
                        String escolhaCase2 = scanner.nextLine();

                        if (escolhaCase2.equals("1")) {
                            Emprestimos emprestimos = new Emprestimos();
                            emprestimos.emprestimoParaEmpresas();
                        } else if (escolhaCase2.equals("2")) {
                            boolean d = true;
                            while (d) {
                                System.out.print("Você deseja investir: 1 - Poupança; 2 - Renda Fixa -> ");
                                String opcao = scanner.nextLine();
                                Investimentos investimentos = new Investimentos();
                                if (opcao.equals("1")) {
                                    investimentos.poupanca("2");
                                    d = false;
                                } else if (opcao.equals("2")) {
                                    investimentos.rendaFixa("2");
                                    d = false;
                                } else {
                                    System.out.println();
                                }
                            }
                        } else if (escolhaCase2.equals("3")) {
                            Atualizacao atualizacao = new Atualizacao();
                            atualizacao.atualizacaoDeEmpresas();
                        } else if (escolhaCase2.equals("4")) {
                            ExibirDados exibirDados = new ExibirDados();
                            exibirDados.exibirDadosDeEmpresas();
                        }else if (escolhaCase2.equals("0")) {
                            System.exit(0);
                        } else {
                            System.out.println();
                        }
                    }
                }
                else if (escolha.equals("0")) {
                    continuar = true;
                    System.out.println();
                    System.out.println("""
                            Tchau!
                            Obrigado por usar nossos serviços!
                            """);
                    continuar = false;
                    c = false;
                }
            }
        }
    }
}