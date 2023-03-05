package metodos.atualizacao;

import atributos.AtributosEmpresa;
import atributos.AtributosPessoaFisica;
import metodos.cadastro.Cadatro;
import metodos.exibirDados.ExibirDados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Atualizacao extends Cadatro implements AtualizacaoInterface {
    Scanner scanner = new Scanner(System.in);
    boolean a = true;
    boolean b = true;

    @Override
    public void atualizacaoDeUsuarios() throws ParseException {
        System.out.println("======================================================================");
        System.out.println("Atualização de Usuários");
        System.out.println();
        ExibirDados exibirDados = new ExibirDados();
        exibirDados.exibirDadosDeUsuarios();

        System.out.print("Nome: ");
        String nomeNovo = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenomeNovo = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        String dataDeNascNova = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(dataDeNascNova);
        String cpfNovo = null;
        while (a) {
            System.out.print("Cpf: (11 números) -> ");
            cpfNovo = scanner.nextLine();
            if(cpfNovo.length() == 11){
                a = false;
            }else {
                System.out.println();
                System.out.println("O CPF precisa ter 11 números!");
            }
        }
        String telefonenovo = null;
        while (b) {
            System.out.print("Telefone: (10 números ou 11 números) -> ");
            telefonenovo = scanner.nextLine();
            if(telefonenovo.length() == 10 || telefonenovo.length() == 11){
                b = false;
            }else {
                System.out.println();
                System.out.println("O Telefone precisa ter 10/11 números!");
            }
        }

        Date dataAtualizacao = new Date();

        AtributosPessoaFisica pessoa = pessoaafisica.get(0);
        pessoa.setNome(nomeNovo);
        pessoa.setSobrenome(sobrenomeNovo);
        pessoa.setDatadenasc(dataDeNascNova);
        pessoa.setCpf(cpfNovo);
        pessoa.setTelefone(telefonenovo);
        pessoa.setDatadocadastro(String.valueOf(dataAtualizacao));

        exibirDados.exibirDadosDeUsuarios();
    }

    @Override
    public void atualizacaoDeEmpresas() {
        System.out.println("======================================================================");
        System.out.println("Atualização de Empresas/Pessoas júridicas");
        System.out.println();

        ExibirDados exibirDados = new ExibirDados();
        exibirDados.exibirDadosDeEmpresas();

        System.out.print("Nome da empresa: ");
        String nomeNovo = scanner.nextLine();
        String cnpjNovo = null;
        while (a) {
            System.out.print("CNPJ: (14 números) -> ");
            cnpjNovo = scanner.nextLine();
            if(cnpjNovo.length() == 14){
                a = false;
            }else {
                System.out.println();
                System.out.println("O CNPJ precisa ter 14 números!");
            }
        }
        String telefoneNovo = null;
        while (b) {
            System.out.print("Telefone: (10 números ou 11 números) -> ");
            telefoneNovo = scanner.nextLine();
            if(telefoneNovo.length() == 10 || telefoneNovo.length() == 11){
                b = false;
            }else {
                System.out.println();
                System.out.println("O Telefone precisa ter 10/11 números!");
            }
        }

        Date dataAtualizacao = new Date();

        AtributosEmpresa empresa = empresajuridica.get(0);
        empresa.setNome(nomeNovo);
        empresa.setCnpj(cnpjNovo);
        empresa.setTelefone(telefoneNovo);
        empresa.setDatadocadastro(String.valueOf(dataAtualizacao));

        exibirDados.exibirDadosDeEmpresas();
    }
}
