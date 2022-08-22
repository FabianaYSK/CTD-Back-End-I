import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro c1 = new Cachorro("Bidu", "Schnauzer", 7, "Casa do Franjinha - Bairro do Limoeiro");
        Cachorro c2 = new Cachorro("Floquinho", "Lhasa Apso", 3, "Casa do Cebolinha - Bairro do Limoeiro");

        cachorros.add(c1);
        cachorros.add(c2);

        // Salvar a coleção em um arquivo .txt
        // Passar de lista para objeto
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("saida.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(cachorros);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Recuperar a coleção de um arquivo .txt
        // Passar de objeto para lista
        List<Cachorro> recuperaCachorros = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("saida.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperaCachorros = (ArrayList)ois.readObject();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        for (Cachorro cachorro : recuperaCachorros) {
            System.out.println("NOME: " + cachorro.getNome() + " | RAÇA: " + cachorro.getRaca() + " | IDADE: " + cachorro.getIdade() + " | ENDEREÇO: " + cachorro.getEndereco());
        }
    }
}
