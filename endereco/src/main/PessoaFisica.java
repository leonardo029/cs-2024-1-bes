package main;

import java.util.Date;
import java.util.List;

public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private List<Endereco> enderecos;

    public PessoaFisica(String nome, String sexo, Date dataNascimento, List<Endereco> enderecos) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.enderecos = enderecos;
    }
}
