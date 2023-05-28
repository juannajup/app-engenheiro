package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnectionBanco;
import model.ModelLogin;

public class DAOLoginRepository {

	private Connection connection;

	public DAOLoginRepository() {
		connection = SingleConnectionBanco.getConnection();
	}

	public boolean validarAutenticacao(ModelLogin modelLogin) throws Exception {

		String sql = "select * from modellogin where upper(email) = upper(?) and upper(senha) = upper(?) ";

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setString(1, modelLogin.getEmail());
		statement.setString(2, modelLogin.getSenha());

		ResultSet resultSet = statement.executeQuery();

		if (resultSet.next()) {
			return true;/* autenticado */
		}

		return false; /* nao autenticado */
	}

	public ModelLogin consultaUsuario(String email) throws Exception {

		ModelLogin modelLogin = new ModelLogin();

		String sql = "select * from modellogin where (upper)email = (upper)('" + email + "') ";

		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			modelLogin.setId(resultSet.getLong("id"));
			modelLogin.setEmail(resultSet.getString("email"));
			modelLogin.setNome(resultSet.getString("nome"));
			modelLogin.setSenha(resultSet.getString("senha"));
		}

		return modelLogin;
	}
	
	public ModelLogin consultaUsuarioID(String id) throws Exception {

		ModelLogin modelLogin = new ModelLogin();

		String sql = "select * from modellogin where id = ? ";

		PreparedStatement statement = connection.prepareStatement(sql);

		statement.setLong(1, Long.parseLong(id));

		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			modelLogin.setId(resultSet.getLong("id"));
			modelLogin.setEmail(resultSet.getString("email"));
			modelLogin.setNome(resultSet.getString("nome"));
			modelLogin.setSenha(resultSet.getString("senha"));
		}

		return modelLogin;
	}

}
