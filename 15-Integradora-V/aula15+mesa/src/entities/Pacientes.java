package entities;

import java.sql.Date;
import java.time.LocalDate;

public class Pacientes {
    private int id;
    private String nome;
    private String sobrenome;
    private String rg;
    private LocalDate datacadastro;
    private String endereco;

    public Pacientes() {
    }

    public Pacientes(int id, String nome, String sobrenome, String rg, LocalDate datacadastro, String endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.datacadastro = datacadastro;
        this.endereco = endereco;
    }

    public Pacientes(String nome, String sobrenome, String rg, LocalDate datacadastro, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.datacadastro = datacadastro;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDate datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", rg='" + rg + '\'' +
                ", datacadastro=" + datacadastro +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
