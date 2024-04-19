package main;

public class Estado {
    private String sigla;
    public String nome;
    private Pais pais;

    public Estado(String sigla, String nome, Pais pais) {
        this.sigla = sigla;
        this.nome = nome;
        this.pais = pais;
    }
}
