package entities;

public class ControleEmbalagem extends Controle {
    @Override
    public boolean verificarQualidade(Artigo artigo) {
        if (artigo.getEmbalagem().equalsIgnoreCase("Saudável") || artigo.getEmbalagem().equalsIgnoreCase("Quase saudável")) {
            System.out.println("Artigo: " + artigo.getNome() + " - Embalagem: " + artigo.getEmbalagem() + ".");
            System.out.println("A embalagem está dentro dos padrões de qualidade.");
            return true;
        } else {
            if (this.getControleQualidade() != null) {
                this.getControleQualidade().verificarQualidade(artigo);
                System.out.println("Artigo: " + artigo.getNome() + " - Embalagem: " + artigo.getEmbalagem() + ".");
                System.out.println("A embalagem está fora dos padrões de qualidade.");
                return false;
            }
        }
        return false;
    }
}
