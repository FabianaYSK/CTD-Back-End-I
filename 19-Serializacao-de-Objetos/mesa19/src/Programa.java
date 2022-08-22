import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        Contato c1 = new Contato("Isabela", "isabela@email.com", "12345-6789");
        Contato c2 = new Contato("Karina", "karina@email.com", "98765-4321");
        Contato c3 = new Contato("Sylvia", "sylvia@email.com", "19283-7465");
        Contato c4 = new Contato("Victor", "victor@email.com", "91823-7654");
        Contato c5 = new Contato("Thiago", "thiago@email.com", "45678-9123");


        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);
        contatos.add(c4);
        contatos.add(c5);

        // Salvar a coleção em um arquivo .txt
        // Passar de lista para objeto
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("saida.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(contatos);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Recuperar a coleção de um arquivo .txt
        // Passar de objeto para lista
        List<Contato> recuperaContatos = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("saida.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperaContatos = (ArrayList)ois.readObject();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        for (Contato contato : recuperaContatos) {
            System.out.println("NOME: " + contato.getNome() + " | E-MAIL: " + contato.getEmail() + " | TELEFONE: " + contato.getTelefone());
        }
    }
}

