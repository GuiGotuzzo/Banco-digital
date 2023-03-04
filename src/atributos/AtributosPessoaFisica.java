package atributos;

public class AtributosPessoaFisica {
    protected String nome;
    protected String sobrenome;
    protected String cpf;
    protected long telefone;
    protected String datadenasc;
    protected String datadocadastro;
    protected double saldo;
    protected double saldoNovo;

    public String getDatadecadastro() {
        return datadocadastro;
    }

    public void setDatadocadastro(String datadecadastro) {
        this.datadocadastro = datadecadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getDatadenasc() {
        return datadenasc;
    }

    public void setDatadenasc(String datadenasc) {
        this.datadenasc = datadenasc;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoNovo() {
        return saldoNovo;
    }

    public void setSaldoNovo(double saldoNovo) {
        this.saldoNovo = saldoNovo;
    }
}
