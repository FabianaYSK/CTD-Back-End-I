package dao.impl;

import dao.IDao;
import dao.config.ConfiguracaoJDBC;
import entities.Pacientes;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PacientesDaoH2 implements IDao<Pacientes> {
    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger LOGGER = Logger.getLogger(PacientesDaoH2.class);

    public PacientesDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Pacientes salvar(Pacientes pacientes) {
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;

        String queryInsert = String.format("INSERT INTO pacientes (nome, sobrenome, rg, datacadastro, endereco) VALUES ('%s', '%s', '%s', '%s', '%s')", pacientes.getNome(), pacientes.getSobrenome(), pacientes.getRg(), pacientes.getDatacadastro(), pacientes.getEndereco());

        try {
            statement = connection.createStatement();

            statement.executeUpdate(queryInsert, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = statement.getGeneratedKeys();

            while (rs.next()) {
                pacientes.setId(rs.getInt(1));
            }
            statement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return pacientes;
    }

}
