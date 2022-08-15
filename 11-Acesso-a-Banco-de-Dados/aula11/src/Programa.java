import java.sql.*;

public class Programa {
    // Antes do método main, criar as instruções (scripts) SQL para executar dentro do bloco Try / Catch

    // static = acesso direto, sem instanciar a variável
    // final = constante, não muda
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS animal; CREATE TABLE animal (id INT PRIMARY KEY, nome VARCHAR(64), tipo VARCHAR(32))";

    // Aspas duplas para a instrução
    // Aspas simples para String
    private static final String sqlInsert1 = "INSERT INTO animal (id, nome, tipo) VALUES (1, 'Bidu', 'Cachorro')";

    private static final String sqlInsert2 = "INSERT INTO animal (id, nome, tipo) VALUES (2, 'Mingau', 'Gato')";

    private static final String sqlInsert3 = "INSERT INTO animal (id, nome, tipo) VALUES (3, 'Giselda', 'Galinha')";

    private static final String sqlInsert4 = "INSERT INTO animal (id, nome, tipo) VALUES (4, 'Floquinho', 'Cachorro')";

    private static final String sqlInsert5 = "INSERT INTO animal (id, nome, tipo) VALUES (5, 'Chovinista', 'Porco')";

    private static final String sqlDelete = "DELETE FROM animal WHERE id=2";

    // null = evitar lixo de memória
    public static void main(String[] args) throws SQLException {

        // inicializar uma variavel tipo connection (classe do JAVA)
        Connection conexao = null;

        try {
            conexao = conectarBD();
            // System.out.println("Conexão efetuada com sucesso!");

            // preparação para receber os scripts
            Statement preparacaoInstrucoes = conexao.createStatement();
            preparacaoInstrucoes.execute(sqlCreateTable);
            preparacaoInstrucoes.execute(sqlInsert1);
            preparacaoInstrucoes.execute(sqlInsert2);
            preparacaoInstrucoes.execute(sqlInsert3);
            preparacaoInstrucoes.execute(sqlInsert4);
            preparacaoInstrucoes.execute(sqlInsert5);
            listarTodos(conexao);

            preparacaoInstrucoes.execute(sqlDelete);
            listarTodos(conexao);
        }

        // catch = quando o try dá errado
        catch (Exception e){
            // imprimir o erro
            e.printStackTrace();
        }

        // finally é executado de qualquer forma
        finally {
            System.out.println("Programa finalizado!");
            conexao.close();
        }
    }

    // Método para CONECTAR o banco de dados H2 (fora do método main)
    // senha padrão é vazia
    public static Connection conectarBD() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/bd-aula11", "sa", "");
    }

    // Método para criar um método para CONSULTAR os registros do banco de dados H2
    public static void listarTodos (Connection conexao) throws SQLException {
        String sqlQuery = "SELECT * FROM animal";
        Statement preparacaoQuery = conexao.createStatement();

        // Retorno do banco de dados
        ResultSet rs = preparacaoQuery.executeQuery(sqlQuery);

        // Enquanto estiver no registro...
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt(1) + " - " + "Nome: " + rs.getString(2) + " - " + "Tipo: " + rs.getString(3));
        }
    }
}
