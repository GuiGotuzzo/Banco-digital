package metodos.investimentos;

import atributos.AtributosEmpresa;
import atributos.AtributosPessoaFisica;

import metodos.cadastro.Cadatro;

import java.util.Scanner;

public class Investimentos extends Cadatro implements InvestimentosInterface{
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;
    @Override
    public void poupanca(String op) {
        while (continuar) {
                System.out.println();
                System.out.println();
                System.out.println("""
                     Poupança -> Poupança ou aforro é a parcela da renda ou do patrimônio que não é gasto ou consumido 
                    no período em que é recebido e, por consequência, é guardado para ser utilizado em um momento futuro.
                    O conceito de poupança está intimamente relacionado com redução de despesas, em particular dos gastos recorrentes
                    """);
                System.out.println();
                System.out.println("""
                        Tabela de preços:
                                        
                        999 ou menos-> 6,17 % de rendimento ao ano
                        1000 - 9.999 -> 6,17 % + 0,4 % de rendimento ao ano
                        10.000 - 49.999 -> 6,17 % + 0,6 % de rendimento ao ano
                        50.000 - 99.999 -> 6,17 % + 0,8 % de rendimento ao ano
                        100.000 - 249.999 -> 6,17 % + 1 % de rendimento ao ano
                        250.000 - 499.999 -> 6,17 % + 1,2 % de rendimento ao ano
                        500.000 - 999.999 -> 6,17 % + 1,4 % de rendimento ao ano
                        1.000.000 ou mais -> 6,17 % + 2 % de rendimento ao ano
                                        
                        """);
                double resultado = 0;
                double resultado2 = 0;
                double taxa = 6.17;
                System.out.print("Digite o valor desejado: R$");
                double valor = scanner.nextDouble();
                if (valor <= 999) {
                    System.out.println();
                    System.out.println("Você digitou um valor fora da tabela!");
                    System.out.println();
                } else if (valor <= 9999) {
                    taxa += 0.4;
                    resultado = valor * taxa;
                    resultado = resultado / 100;
                    resultado2 = resultado + valor;
                } else if (valor <= 49999) {
                    taxa += 0.6;
                    resultado = valor * taxa;
                    resultado = resultado / 100;
                    resultado2 = resultado + valor;
                } else if (valor <= 99999) {
                    taxa += 0.8;
                    resultado = valor * taxa;
                    resultado = resultado / 100;
                    resultado2 = resultado + valor;
                } else if (valor <= 249999) {
                    taxa += 1;
                    resultado = valor * taxa;
                    resultado = resultado / 100;
                    resultado2 = resultado + valor;
                } else if (valor <= 499999) {
                    taxa += 1.2;
                    resultado = valor * taxa;
                    resultado = resultado / 100;
                    resultado2 = resultado + valor;
                } else if (valor <= 999999) {
                    taxa += 1.4;
                    resultado = valor * taxa;
                    resultado = resultado / 100;
                    resultado2 = resultado + valor;
                } else {
                    taxa += 2;
                    resultado = valor * taxa;
                    resultado = resultado / 100;
                    resultado2 = resultado + valor;
                }
                        if (op.equals("1")) {
                            AtributosPessoaFisica pessoa = pessoaafisica.get(0);
                            if (valor > pessoa.getSaldo()) {
                                System.out.println();
                            } else {
                                pessoa.setSaldo(pessoa.getSaldo() + resultado);

                                System.out.println();
                                System.out.println("Valor investido: " + valor);
                                System.out.println("Valor final ao ano: " + resultado2);
                                continuar = false;
                            }
                        } else if (op.equals("2")) {
                            AtributosEmpresa empresa = empresajuridica.get(0);

                            if (valor > empresa.getSaldo()) {
                                System.out.println();
                            } else {
                                empresa.setSaldo(empresa.getSaldo() + resultado);

                                System.out.println();
                                System.out.println("Valor investido: " + valor);
                                System.out.println("Valor final ao ano: " + resultado2);
                                continuar = false;
                            }
                        }
                }
            }

    @Override
    public void rendaFixa(String op) {
        boolean continuar = true;
        while (continuar) {
            System.out.println();
            System.out.println("Renda fixa é um termo que se refere a qualquer tipo de investimento que possui regras de remuneração definidas no momento da aplicação no título. " +
                    "Essas regras estipulam o prazo e a forma que a remuneração será calculada e paga ao investidor.");
            System.out.println();
            System.out.println("Valor - 13,51 % de rendimento ao ano");
            System.out.println();
            double taxa = 13.51;
            System.out.print("Digite o valor desejado: R$");
            double valor = scanner.nextDouble();

            double resultado = valor * taxa;
            resultado = resultado / 100;
            double resultado2 = valor + resultado;
            System.out.println("Valor investido: " + valor);
            System.out.println("Valor final ao ano: " + resultado2);

            if (op.equals("1")) {
                AtributosPessoaFisica pessoa = pessoaafisica.get(0);

                if (valor > pessoa.getSaldo()) {
                    System.out.println();
                } else {
                    pessoa.setSaldo(pessoa.getSaldo() + resultado);

                    System.out.println();
                    continuar = false;
                }
            }else if(op.equals("2")) {
                AtributosEmpresa empresa = empresajuridica.get(0);

                if (valor > empresa.getSaldo()) {
                    System.out.println("Você digitou um valor maior que seu saldo!");
                    System.out.println();
                } else {
                    empresa.setSaldo(empresa.getSaldo() + resultado);

                    System.out.println();
                    continuar = false;
                }
            }
        }
    }
}
