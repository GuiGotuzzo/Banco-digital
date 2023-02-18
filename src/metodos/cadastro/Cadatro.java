package metodos.cadastro;

import atributos.AtributosEmpresa;
import atributos.AtributosPessoaFisica;
import metodos.cadastro.CadastroInterface;
import metodos.exibirDados.ExibirDados;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cadatro implements CadastroInterface {
    public static ArrayList<AtributosPessoaFisica> pessoaafisica = new ArrayList<>();
    public static ArrayList<AtributosEmpresa> empresajuridica = new ArrayList<>();
    static Scanner scannerString = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    boolean a = true;
    @Override
    public void cadastropessoa() throws ParseException {
        System.out.println("Cadastre-se!!");
        System.out.println();
        System.out.print("Nome: ");
        String nomeCadastro = scannerString.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenomeCadastro = scannerString.nextLine();
        System.out.print("Cpf: ");
        String cpfCadastro = scannerString.nextLine();
        System.out.print("Telefone: ");
        long telefoneCadastro = scanner.nextLong();
        System.out.print("Seu saldo: R$" );
        double saldoCadastro = scanner.nextDouble();
        System.out.println();

        Date dataCadastro = new Date();

        AtributosPessoaFisica pessoa = new AtributosPessoaFisica();
        pessoa.setNome(nomeCadastro);
        pessoa.setSobrenome(sobrenomeCadastro);
        pessoa.setCpf(cpfCadastro);
        pessoa.setTelefone(telefoneCadastro);
        pessoa.setSaldo(saldoCadastro);
        pessoa.setDatadocadastro(String.valueOf(dataCadastro));

        pessoaafisica.add(pessoa);

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("Seus dados:");
        System.out.println();
        /*
        for (int i = 0; i < pessoaafisica.size(); i++) {
            AtributosPessoaFisica percorre = pessoaafisica.get(i);
            System.out.println("Nome: " + pessoaafisica.get(i).getNome() + pessoaafisica.get(i).getSobrenome());
            System.out.println("CPF: " + pessoaafisica.get(i).getCpf());
            System.out.println("Telefone: " + pessoaafisica.get(i).getTelefone());
            System.out.println("Saldo: " + pessoaafisica.get(i).getSaldo());

            System.out.println("Data do cadastro: " + pessoaafisica.get(i).getDatadecadastro());
            System.out.println();
        }
         */
        ExibirDados exibirDados = new ExibirDados();
        exibirDados.exibirDadosDeUsuarios();
    }

    @Override
    public void cadastroempresa() {
        System.out.println("Cadastre-se!!");
        System.out.println();
        System.out.print("Nome da empresa: ");
        String nomeCadastro = scannerString.nextLine();
        System.out.print("CNPJ: ");
        String cnpjCadastro = scannerString.nextLine();
        System.out.print("Telefone: ");
        long telefoneCadastro = scanner.nextLong();
        System.out.print("Saldo: R$ ");
        double saldoCadastro = scanner.nextDouble();
        System.out.println();

        Date dataCadastro = new Date();

        AtributosEmpresa empresa = new AtributosEmpresa();
        empresa.setNome(nomeCadastro);
        empresa.setCnpj(cnpjCadastro);
        empresa.setTelefone(telefoneCadastro);
        empresa.setSaldo(saldoCadastro);
        empresa.setDatadocadastro(String.valueOf(dataCadastro));

        empresajuridica.add(empresa);

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("Seus dados:");
        System.out.println();

        ExibirDados exibirDados = new ExibirDados();
        exibirDados.exibirDadosDeEmpresas();
    }
}