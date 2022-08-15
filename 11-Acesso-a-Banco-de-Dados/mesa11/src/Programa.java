import java.sql.*;

public class Programa {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS figura; CREATE TABLE figura (id INT PRIMARY KEY, tipo VARCHAR(64), cor VARCHAR(32))";

    private static final String sqlInsert1 = "INSERT INTO figura (id, tipo, cor) VALUES (1, 'Círculo', 'Vermelho')";

    private static final String sqlInsert2 = "INSERT INTO figura (id, tipo, cor) VALUES (2, 'Círculo', 'Verde')";

    private static final String sqlInsert3 = "INSERT INTO figura (id, tipo, cor) VALUES (3, 'Quadrado', 'Azul')";

    private static final String sqlInsert4 = "INSERT INTO figura (id, tipo, cor) VALUES (4, 'Quadrado', 'Laranja')";

    private static final String sqlInsert5 = "INSERT INTO figura (id, tipo, cor) VALUES (5, 'Quadrado', 'Amarelo')";

    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        try {
            conexao = conectarBD();
            Statement preparacaoInstrucoes = conexao.createStatement();

            // Criar uma tabela no banco de dados
            preparacaoInstrucoes.execute(sqlCreateTable);

            // Inserir 2 círculos e 3 quadrados de diferentes cores
            preparacaoInstrucoes.execute(sqlInsert1);
            preparacaoInstrucoes.execute(sqlInsert2);
            preparacaoInstrucoes.execute(sqlInsert3);
            preparacaoInstrucoes.execute(sqlInsert4);
            preparacaoInstrucoes.execute(sqlInsert5);

            listarCirculosVermelhos(conexao);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Programa finalizado!");
            conexao.close();
        }
    }

    public static Connection conectarBD() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/bd-mesa11", "sa", "");
    }

    // Criar uma consulta (query) para visualizar os círculos de cor vermelha;
    public static void listarCirculosVermelhos (Connection conexao) throws SQLException {
        String sqlQuery = "SELECT * FROM figura WHERE tipo='Círculo' AND cor='Vermelho'";
        Statement preparacaoQuery = conexao.createStatement();

        // Exibir as figuras na tela utilizando um ResultSet e um System.out.println.
        ResultSet rs = preparacaoQuery.executeQuery(sqlQuery);
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt(1) + " - " + "Tipo: " + rs.getString(2) + " - " + "Cor: " + rs.getString(3));
        }
    }
}
