package metodos.cadastro;

import atributos.AtributosEmpresa;
import atributos.AtributosPessoaFisica;
import metodos.cadastro.CadastroInterface;
import metodos.exibirDados.ExibirDados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cadatro implements CadastroInterface {
    public static ArrayList<AtributosPessoaFisica> pessoaafisica = new ArrayList<>();
    public static ArrayList<AtributosEmpresa> empresajuridica = new ArrayList<>();
    static Scanner scannerString = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    boolean a = true;
    boolean b = true;
    @Override
    public void cadastropessoa() throws ParseException {
        System.out.println("Cadastre-se!!");
        System.out.println();
        System.out.print("Nome: ");
        String nomeCadastro = scannerString.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenomeCadastro = scannerString.nextLine();
        System.out.print("Data de nascimento: ");
        String dataDeNascNova = scannerString.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(dataDeNascNova);
        String cpfCadastro = null;
        while (a) {
            System.out.print("Cpf: (11 números) -> ");
            cpfCadastro = scannerString.nextLine();
            if(cpfCadastro.length() == 11){
                a = false;
            }else {
                System.out.println();
                System.out.println("O CPF precisa ter 11 números!");
            }
        }
        String telefoneCadastro = null;
        while (b) {
            System.out.print("Telefone: (10 números ou 11 números) ->");
            telefoneCadastro = scannerString.nextLine();
            if(telefoneCadastro.length() == 10 || telefoneCadastro.length() == 11){
                b = false;
            }else {
                System.out.println();
                System.out.println("O Telefone precisa ter 10/11 números!");
            }
        }
        System.out.print("Seu saldo: R$" );
        double saldoCadastro = scanner.nextDouble();
        System.out.println();

        Date dataCadastro = new Date();

        AtributosPessoaFisica pessoa = new AtributosPessoaFisica();
        pessoa.setNome(nomeCadastro);
        pessoa.setSobrenome(sobrenomeCadastro);
        pessoa.setDatadenasc(dataDeNascNova);
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

        ExibirDados exibirDados = new ExibirDados();
        exibirDados.exibirDadosDeUsuarios();
    }

    @Override
    public void cadastroempresa() {
        System.out.println("Cadastre-se!!");
        System.out.println();
        System.out.print("Nome da empresa: ");
        String nomeCadastro = scannerString.nextLine();
        String cnpjCadastro = null;
        while (a) {
            System.out.print("CNPJ: (14 números) -> ");
            cnpjCadastro = scannerString.nextLine();
            if(cnpjCadastro.length() == 14){
                a = false;
            }else {
                System.out.println();
                System.out.println("O CNPJ precisa ter 14 números!");
            }
        }
        String telefoneCadastro = null;
        while (b) {
            System.out.print("Telefone: (10 números ou 11 números) ->");
            telefoneCadastro = scannerString.nextLine();
            if(telefoneCadastro.length() == 10 || telefoneCadastro.length() == 11){
                b = false;
            }else {
                System.out.println();
                System.out.println("O Telefone precisa ter 10/11 números!");
            }
        }
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