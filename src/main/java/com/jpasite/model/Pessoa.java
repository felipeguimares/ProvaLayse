package com.jpasite.model;

public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private int anoNascimento;
    private int diaNascimento;
    private String sexo;

    public void Cadastrar(String nome, String cpf, String rg, int anoNascimento, int diaNascimento, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.anoNascimento = anoNascimento;
        this.diaNascimento = diaNascimento;
        this.sexo = sexo;
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Dia: " + diaNascimento);
        System.out.println("Ano: " + anoNascimento);
        System.out.println("Sexo: " + sexo);
    }
}
