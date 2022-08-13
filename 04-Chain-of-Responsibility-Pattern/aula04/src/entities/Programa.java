package entities;

public class Programa {
    public static void main(String[] args) {
        CheckMail verificaMail = new CheckMail();
        verificaMail.verificarCheck(new Mail("email@email.com", "tecnica@dh.com.br", "Aulas"));

        verificaMail.verificarCheck(new Mail("email@email.com", "sds@dh.com.br", "Gerência"));
    }
}
