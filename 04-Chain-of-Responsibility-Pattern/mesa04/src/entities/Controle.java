package entities;

public abstract class Controle {
    protected Controle controleQualidade;

    public Controle getControleQualidade() {
        return controleQualidade;
    }

    public void setControleQualidade(Controle controleQualidade) {
        this.controleQualidade = controleQualidade;
    }

    public abstract boolean verificarQualidade(Artigo artigo);
}
