package metodos.exibirDados;

import atributos.AtributosEmpresa;
import atributos.AtributosPessoaFisica;
import metodos.cadastro.Cadatro;

public class ExibirDados extends Cadatro implements ExibirDadosInterface{
    @Override
    public void exibirDadosDeUsuarios() {

        for(int i = 0; i < pessoaafisica.size(); i++){
            AtributosPessoaFisica percorre = pessoaafisica.get(i);
            System.out.println();
            System.out.println();
            System.out.println("Nome: " + pessoaafisica.get(i).getNome() + " " + pessoaafisica.get(i).getSobrenome());
            System.out.println("CPF: " + pessoaafisica.get(i).getCpf());
            System.out.println("Telefone: " + pessoaafisica.get(i).getTelefone());
            System.out.println("Saldo: " + pessoaafisica.get(i).getSaldo());
            System.out.println();
            System.out.println("Data do cadastro: " + pessoaafisica.get(i).getDatadecadastro());
            System.out.println();
        }
    }

    @Override
    public void exibirDadosDeEmpresas() {
        for (int i = 0; i < empresajuridica.size(); i++) {
            AtributosEmpresa percorre = empresajuridica.get(i);
            System.out.println("Nome da empresa: " + empresajuridica.get(i).getNome());
            System.out.println("Cnpj: " + empresajuridica.get(i).getCnpj());
            System.out.println("Telefone: " + empresajuridica.get(i).getTelefone());
            System.out.println("Saldo: " + empresajuridica.get(i).getSaldo());
            System.out.println();
            System.out.println("Data do cadastro: " + empresajuridica.get(i).getDatadecadastro());;
            System.out.println();
        }
    }
}
