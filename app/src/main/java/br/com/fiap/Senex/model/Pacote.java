package br.com.fiap.senex.model;

public class Pacote {

    private final String nome;
    private final String horario;
    private final String receita;
    private final String quantidade;
    private final String descricao;

    public Pacote(String nome, String horario, String receita, String quantidade, String descricao){
        this.nome = nome;
        this.horario = horario;
        this.receita = receita;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public String getNome(){
        return nome;
    }

    public String getHorario(){
        return horario;
    }

    public String getReceita(){
        return receita;
    }

    public String getQuantidade() {return quantidade;}

    public String getDescricao(){
        return descricao;
    }

}
