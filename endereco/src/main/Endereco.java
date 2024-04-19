package main;

public class Endereco {
    private Integer numero;
    private String complemento;
    private Integer cep;
    private Bairro bairro;
    private TipoEndereco tipoEndereco;
    private Logradouro logradouro;

    public Endereco(Integer numero, String complemento, Integer cep, Bairro bairro, TipoEndereco tipoEndereco, Logradouro logradouro) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.tipoEndereco = tipoEndereco;
        this.logradouro = logradouro;
    }
}
