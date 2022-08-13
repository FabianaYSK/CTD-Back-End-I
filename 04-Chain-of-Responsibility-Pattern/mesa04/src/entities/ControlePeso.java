package entities;

public class ControlePeso extends Controle{
    @Override
    public boolean verificarQualidade(Artigo artigo) {
        if (artigo.getPeso() >= 1200 && artigo.getPeso() <= 1300) {
            System.out.println("Artigo: " + artigo.getNome() + " - Peso: " + artigo.getPeso() + ".");
            System.out.println("O peso está dentro dos padrões de qualidade.");
            return true;
        } else {
            if (this.getControleQualidade() != null) {
                this.getControleQualidade().verificarQualidade(artigo);
                System.out.println("Artigo: " + artigo.getNome() + " - Peso: " + artigo.getPeso() + ".");
                System.out.println("O peso está fora dos padrões de qualidade.");
                return false;
            }
        }
        return false;
    }
}
