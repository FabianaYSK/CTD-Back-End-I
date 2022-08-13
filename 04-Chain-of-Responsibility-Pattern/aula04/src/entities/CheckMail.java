package entities;

public class CheckMail {
    Gerenciador inicial;

    // Construtor para fazer a chamada dos objetos
    public CheckMail() {
        this.inicial = new GerrenciadorGerencia();
        Gerenciador comercial = new GerrenciadorComercial();
        Gerenciador tecnica = new GerenciadorTecnica();
        Gerenciador spam = new GerenciadorSpam();

        // Chamada dos próximos
        inicial.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnica);
        tecnica.setGerenciadorSeguinte(spam);
    }

    public void verificarCheck(Mail email) {
        inicial.verificar(email);
    }
}
