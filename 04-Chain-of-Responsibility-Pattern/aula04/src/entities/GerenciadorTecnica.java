package entities;

public class GerenciadorTecnica extends Gerenciador {

    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Técnica"))) {
            System.out.println("E-mail enviado para o Departamento Técnico.");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}
