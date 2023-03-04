package metodos.emprestimos;

import atributos.AtributosEmpresa;
import atributos.AtributosPessoaFisica;
import metodos.cadastro.Cadatro;

import java.util.Scanner;

public class Emprestimos extends Cadatro implements EmprestimosInterface{
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void emprestimoParaUsuario() {

        System.out.println("======================================================================");
        System.out.println("""
                Tabela dos valores de empréstimos: 
                
                50.000 - 99.999 => 4,75 %
                100.000 - 249.999 => 5,65 %
                250.500 - 399.999 => 6,35 %
                400.000 - 599.999 => 6,75 %
                600.000 - 799.999 => 7,35 %
                800.000 - 999.999 => 7,65 %
                1.000.000+ => 8 %
                """);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Valor do empréstimo que você dejesa: R$ ");
            double valor = scanner.nextDouble();
            double resultado = 0;
            double resultado2 = 0;

            if (valor <= 49999) {
                System.out.println("Você colocou um valor que não estava na tabela!");
                System.out.println();
            } else if (valor <= 99999) {
                resultado = valor * 4.75;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else if (valor <= 249999) {
                resultado = valor * 5.65;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else if (valor <= 399999) {
                resultado = valor * 6.35;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
                continuar = false;
            } else if (valor <= 599999) {
                resultado = valor * 6.75;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else if (valor <= 799999) {
                resultado = valor * 7.35;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else if (valor <= 999999) {
                resultado = valor * 7.65;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else {
                resultado = valor * 8;
                resultado = resultado / 100;
                resultado2 = valor + resultado;

                continuar = false;
            }
            System.out.println("Valor depositado: " + valor);
            System.out.println("Valor final: (por ano) ->" + resultado2);

            AtributosPessoaFisica pessoa = pessoaafisica.get(0);
            pessoa.setSaldo(pessoa.getSaldo() - resultado2);
            System.out.println();
            continuar = false;
        }
    }

    @Override
    public void emprestimoParaEmpresas() {
        System.out.println("""
                ==================================================================
                Tabela dos valores de empréstimos: ");
                        
                100.000 - 249.999 --> 4,75 %
                250.000 - 399.999 --> 5,65 %
                400.000 - 599.999 --> 6,35 %
                600.000 - 799.999 --> 6,75 %
                800.000 - 999.999 --> 7,35 %
                1.000.000 - 1.499.999 --> 7,65 %
                1.500.000+ --> 8 %
                """);
        System.out.println();

        System.out.print("Valor do empréstimo que você dejesa: R$ ");
        Double valor = scanner.nextDouble();
        double resultado = 0;
        double resultado2 = 0;

        boolean continuar = true;

        while (continuar == true) {
            if (valor < 100000) {
                System.out.println("Você colocou um valor que não estava na tabela!");
                System.out.println();
            } else if (valor <= 249999) {
                resultado = valor * 4.75;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else if (valor <= 399999) {
                resultado = valor * 5.65;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else if (valor <= 599999) {
                resultado = valor * 6.35;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else if (valor <= 799999) {
                resultado = valor * 6.75;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else if (valor <= 999999) {
                resultado = valor * 7.35;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else if (valor <= 1499999) {
                resultado = valor * 7.65;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
            } else {
                resultado = valor * 8;
                resultado = resultado / 100;
                resultado2 = valor + resultado;
                continuar = false;
            }
            System.out.println("Valor depositado: " + valor);
            System.out.println("Valor final: " + resultado2);

            AtributosEmpresa empresa = empresajuridica.get(0);
            empresa.setSaldo(empresa.getSaldo() - resultado);
            System.out.println();
            continuar = false;
        }
    }
}
