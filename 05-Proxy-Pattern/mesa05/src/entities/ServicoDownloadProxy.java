package entities;

public class ServicoDownloadProxy implements Download {
    @Override
    public void baixarMusica(int id, String tipoUsuario) {
        if(tipoUsuario == "premium") {
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.baixarMusica(id, tipoUsuario);
            System.out.println("Usuário Premium.");
        } else {
            System.out.println("Usuário Free. Não foi possível baixar a música.");
        }
    }
}

