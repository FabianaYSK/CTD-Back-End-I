package entities;

public class ServicoDownload implements Download {

    @Override
    public void baixarMusica(int id, String tipoUsuario) {
        System.out.println("Usuário(a) " + id + " baixou a música com sucesso para ouvir offline.");
    }
}
