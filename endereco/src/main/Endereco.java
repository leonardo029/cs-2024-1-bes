package main;

public class Endereco {
    private Integer numero;
    private String complemento;
    private Integer cep;
    private Bairro bairro;
    private TipoEndereco tipoEndereco;
    private Logradouro logradouro;

    public Endereco(Integer numero, String complemento, Integer cep) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }
}
