package entities;

public class ControleLote extends Controle {
    @Override
    public boolean verificarQualidade(Artigo artigo) {
        if (artigo.getLote() >= 1000 && artigo.getLote() <= 2000) {
            System.out.println("Artigo: " + artigo.getNome() + " - Lote: " + artigo.getLote() + ".");
            System.out.println("O lote está dentro dos padrões de qualidade.");
            return true;
        } else {
            if (this.getControleQualidade() != null) {
                this.getControleQualidade().verificarQualidade(artigo);
                System.out.println("Artigo: " + artigo.getNome() + " - Lote: " + artigo.getLote() + ".");
                System.out.println("O lote está fora dos padrões de qualidade.");
                return false;
            }
        }
        return false;
    }
}
