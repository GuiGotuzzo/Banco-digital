package metodos.atualizacao;

import atributos.AtributosEmpresa;
import atributos.AtributosPessoaFisica;
import metodos.cadastro.Cadatro;
import metodos.exibirDados.ExibirDados;

import java.util.Date;
import java.util.Scanner;

public class Atualizacao extends Cadatro implements AtualizacaoInterface {
    Scanner scanner = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);

    @Override
    public void atualizacaoDeUsuarios() {
        System.out.println("======================================================================");
        System.out.println("Atualização de Usuários");
        System.out.println();
        ExibirDados exibirDados = new ExibirDados();
        exibirDados.exibirDadosDeUsuarios();

        System.out.print("Nome: ");
        String nomeNovo = scannerString.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenomeNovo = scannerString.nextLine();
        System.out.print("Cpf: ");
        String cpfNovo = scannerString.nextLine();
        System.out.print("Telefone: ");
        long novoTelefone = scanner.nextLong();

        Date dataAtualizacao = new Date();

        AtributosPessoaFisica pessoa = pessoaafisica.get(0);
        pessoa.setNome(nomeNovo);
        pessoa.setSobrenome(sobrenomeNovo);
        pessoa.setCpf(cpfNovo);
        pessoa.setTelefone(novoTelefone);
        pessoa.setDatadocadastro(String.valueOf(dataAtualizacao));

        ExibirDados exibirDados1 = new ExibirDados();
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
        String nomeNovo = scannerString.nextLine();
        System.out.print("CNPJ: ");
        String cnpjNovo = scannerString.nextLine();
        System.out.print("Telefone: ");
        long telefoneNovo = scanner.nextLong();

        Date dataAtualizacao = new Date();

        AtributosEmpresa empresa = empresajuridica.get(0);
        empresa.setNome(nomeNovo);
        empresa.setCnpj(cnpjNovo);
        empresa.setTelefone(telefoneNovo);
        empresa.setDatadocadastro(String.valueOf(dataAtualizacao));

        ExibirDados exibirDados2 = new ExibirDados();
        exibirDados.exibirDadosDeEmpresas();
    }
}
