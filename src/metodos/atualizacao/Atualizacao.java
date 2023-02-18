package metodos.atualizacao;

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

        for(int i = 0; i < pessoaafisica.size(); i++){
            AtributosPessoaFisica percorre = pessoaafisica.get(i);
            System.out.println("[" + i + "]" + percorre.getNome() + " " + percorre.getSobrenome());
        }
        System.out.print("Digite seu id: ");
        int id = scanner.nextInt();
        System.out.print("Nome: ");
        String nomeNovo = scannerString.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenomeNovo = scannerString.nextLine();
        System.out.print("Cpf: ");
        String cpfNovo = scannerString.nextLine();
        System.out.print("Telefone: ");
        long novoTelefone = scanner.nextLong();

        Date dataAtualizacao = new Date();

        AtributosPessoaFisica pessoa = pessoaafisica.get(id);
        pessoa.setNome(nomeNovo);
        pessoa.setSobrenome(sobrenomeNovo);
        pessoa.setCpf(cpfNovo);
        pessoa.setTelefone(novoTelefone);
        pessoa.setDatadocadastro(String.valueOf(dataAtualizacao));

        ExibirDados exibirDados = new ExibirDados();
        exibirDados.exibirDadosDeUsuarios();
    }

    @Override
    public void atualizacaoDeEmpresas() {
        System.out.println("======================================================================");
        System.out.println("Atualização de Empresas/Pessoas júridicas");
        System.out.println();

        for(int i = 0; i < empresajuridica.size(); i++){
            AtributosPessoaFisica percorre = empresajuridica.get(i);
            System.out.println("[" + i + "]" + percorre.getNome() + " " + percorre.getSobrenome());
        }
        System.out.print("Digite seu id: ");
        int id = scanner.nextInt();

        System.out.print("Nome: ");
        String nomeString = scannerString.nextLine();
        System.out.print("Telefone: ");
        long novoTelefone = scanner.nextLong();
    }
}
