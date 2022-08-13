package entities;

public class GerrenciadorGerencia extends Gerenciador {
    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Gerência"))) {
            System.out.println("E-mail enviado para o Departamento Gerencial.");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}