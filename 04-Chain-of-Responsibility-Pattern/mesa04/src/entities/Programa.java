package entities;

public class Programa {
    public static void main(String[] args) {
        CheckQuality verificaQualidade = new CheckQuality();

        verificaQualidade.verificarCheck(new Artigo("livro", 1500, 1250, "saudável"));

    }

}
