package metodos.investimentos;

import java.util.Scanner;

public class Investimentos implements InvestimentosInterface{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void poupanca() {
        System.out.println();
        System.out.println("  Poupança ou aforro é a parcela da renda ou do patrimônio que não é gasto ou consumido ");
        System.out.println("no período em que é recebido e, por consequência, é guardado para ser utilizado em um momento futuro.");
        System.out.println("  O conceito de poupança está intimamente relacionado com redução de despesas, em particular dos gastos recorrentes.");
        System.out.println();
        System.out.println("""
                Tabela de preços:
                
                999 ou menos -> 6,17 de rendimento ao ano
                1000 - 9.999 -> 6,17 + 0,4 de rendimento ao ano
                10.000 - 49.999 -> 6,17 + 0,6 de rendimento ao ano
                50.000 - 99.999 -> 6,17 + 0,8 de rendimento ao ano
                100.000 - 249.999 -> 6,17 + 1 de rendimento ao ano
                250.000 - 499.999 -> 6,17 + 1,2 de rendimento ao ano
                500.000 - 999.999 -> 6,17 + 1,4 de rendimento ao ano
                1.000.000 ou mais -> 6,17 + 2 de rendimento ao ano
                
                """);

        double taxa = 6.17;
        System.out.print("Digite o valor desejado: R$");
        double valor = scanner.nextDouble();
        if(valor <= 999){
            double resultado = valor * taxa;
            resultado = resultado / 100;
            resultado = resultado + valor;

            System.out.println("Valor investido: " + valor);
            System.out.println("Valor final ao ano: " + resultado);
        }else if(valor <= 9999){
            taxa += 0.4;
            double resultado = valor * taxa;
            resultado = resultado / 100;
            resultado = resultado + valor;

            System.out.println("Valor investido: " + valor);
            System.out.println("Valor final ao ano: " + resultado);
        }else if(valor <= 49999){
            taxa += 0.6;
            double resultado = valor * taxa;
            resultado = resultado / 100;
            resultado = resultado + valor;

            System.out.println("Valor investido: " + valor);
            System.out.println("Valor final ao ano: " + resultado);
            resultado = resultado / 100;
        }else if(valor <= 99999){
            taxa += 0.8;
            double resultado = valor * taxa;
            resultado = resultado / 100;
            resultado = resultado + valor;

            System.out.println("Valor investido: " + valor);
            System.out.println("Valor final ao ano: " + resultado);
        }else if(valor <= 249999){
            taxa += 1;
            double resultado = valor * taxa;
            resultado = resultado / 100;
            resultado = resultado + valor;

            System.out.println("Valor investido: " + valor);
            System.out.println("Valor final ao ano: " + resultado);
        }else if(valor <= 499999){
            taxa += 1.2;
            double resultado = valor * taxa;
            resultado = resultado / 100;
            resultado = resultado + valor;

            System.out.println("Valor investido: " + valor);
            System.out.println("Valor final ao ano: " + resultado);
        }else if(valor <= 999999){
            taxa += 1.4;
            double resultado = valor * taxa;
            resultado = resultado / 100;
            resultado = resultado + valor;

            System.out.println("Valor investido: " + valor);
            System.out.println("Valor final ao ano: " + resultado);
        }else {
            taxa += 2;
            double resultado = valor * taxa;
            resultado = resultado / 100;
            resultado = resultado + valor;

            System.out.println("Valor investido: " + valor);
            System.out.println("Valor final ao ano: " + resultado);
        }
    }
    @Override
    public void rendaFixa() {
        System.out.println();
        System.out.println("""
                 S2
                """);
    }

}
