package entities;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int id;
    private String tipoUsuario;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, int id, String tipoUsuario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.id = id;
        this.tipoUsuario = tipoUsuario;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", id=" + id +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}
