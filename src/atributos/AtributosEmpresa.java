package atributos;

public class AtributosEmpresa extends AtributosPessoaFisica{

    protected String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
