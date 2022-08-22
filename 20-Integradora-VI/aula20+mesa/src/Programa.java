import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new Funcionario("Juliana", "Santos", "000.000.000-00", 18.000, "00.000.000/0000-00", "Empresa X");
        Funcionario f2 = new Funcionario("Maria", "Castro", "000.000.000-00", 25.000, "00.000.000/0000-00", "Empresa X");
        Funcionario f3 = new Funcionario("Fernanda", "Silva", "000.000.000-00", 36.000, "00.000.000/0000-00", "Empresa X");
        Funcionario f4 = new Funcionario("Laura", "Martinez", "000.000.000-00", 42.000, "00.000.000/0000-00", "Empresa X");

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);

        // Salvar a coleção em um arquivo .txt
        // Passar de lista para objeto
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("saida.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(funcionarios);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Recuperar a coleção de um arquivo .txt
        // Passar de objeto para lista
        List<Funcionario> recuperaFuncionarios = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("saida.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            recuperaFuncionarios = (ArrayList)ois.readObject();
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        for (Funcionario funcionario : recuperaFuncionarios) {
            System.out.println("NOME: " + funcionario.getNome() + " | SOBRENOME: " + funcionario.getSobrenome() + " | CPF: " + funcionario.getCpf() + " | SALARIO: " + funcionario.getSalario());
        }
    }
}
