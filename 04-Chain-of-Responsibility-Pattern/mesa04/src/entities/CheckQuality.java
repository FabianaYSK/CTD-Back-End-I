package entities;

public class CheckQuality {
    Controle inicial;

    public CheckQuality() {
        this.inicial = new ControleLote();
        Controle peso = new ControlePeso();
        Controle embalagem = new ControleEmbalagem();

        inicial.setControleQualidade(peso);
        peso.setControleQualidade(embalagem);
    }

    public void verificarCheck(Artigo artigo) {
        if (inicial.verificarQualidade(artigo)) {
            System.out.println("Artigo " + artigo.getNome() + " aceito!");
        } else {
            System.out.println("Artigo " + artigo.getNome() + " rejeitado!");
        }
    }

}



