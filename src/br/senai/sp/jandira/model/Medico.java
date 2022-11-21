package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    private static int contador = 99;
    private Integer codigo;
    private String nome;
    private Especialidade[] especialidades;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;

    public Medico(String crm, String nome, String telefone, Integer codigo) {
        this.codigo = codigo;
        this.contador = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Medico(String crm, String nome, String telefone, String email,
            LocalDate dataDeNascimento, Especialidade[] especialidades) {
        this.codigo = codigo;
        this.contador = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.especialidades = especialidades;
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setdataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getdataDeNascimento() {
        return dataDeNascimento;
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" + this.crm + ";" + this.nome
                + ";" + this.telefone + ";" + this.email + ";"
                + this.especialidades + ";" + this.dataDeNascimento;
    }

}
