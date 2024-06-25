package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	// Método para atualizar um usuário no banco de dados
	public boolean atualizarUsuario(int idUsuario, String nome, String email, String senha, String tipoUsuario) {
		String query = "UPDATE modellogin SET nome = ?, email = ?, senha = ?, tipousuario = ? WHERE id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setString(1, nome);
			stmt.setString(2, email);
			stmt.setString(3, senha);
			stmt.setString(4, tipoUsuario);
			stmt.setInt(5, idUsuario);
			int linhasAfetadas = stmt.executeUpdate();
			return linhasAfetadas > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			// Trate a exceção apropriadamente de acordo com sua aplicação
			return false;
		}
	}
	
	// Método para atualizar um usuário no banco de dados
	public boolean atualizarUsuarioEspecifico(int idUsuario, String nome, String email, String senha) {
		String query = "UPDATE modellogin SET nome = ?, email = ?, senha = ?, WHERE id = ?";
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setString(1, nome);
			stmt.setString(2, email);
			stmt.setString(3, senha);
			stmt.setInt(4, idUsuario);
			int linhasAfetadas = stmt.executeUpdate();
			return linhasAfetadas > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			// Trate a exceção apropriadamente de acordo com sua aplicação
			return false;
		}
	}

	public long obterIdUsuario(ModelLogin modelLogin) throws Exception {
		long usuarioID = 0;
		String sql = "SELECT id FROM modellogin WHERE email = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, modelLogin.getEmail());
		ResultSet rs = preparedStatement.executeQuery();
		if (rs.next()) {
			usuarioID = rs.getLong("id");
		}
		return usuarioID;
	}
	
	public boolean emailExiste(String email) throws SQLException {
	    String sql = "SELECT COUNT(*) FROM modellogin WHERE email = ?";
	    try (PreparedStatement statement = connection.prepareStatement(sql)) {
	        statement.setString(1, email);
	        ResultSet resultSet = statement.executeQuery();
	        if (resultSet.next()) {
	            return resultSet.getInt(1) > 0;
	        }
	    }
	    return false;
	}

	public ModelLogin consultaUsuario(String email) throws Exception {

		ModelLogin modelLogin = new ModelLogin();

		String sql = "SELECT * FROM modellogin WHERE (UPPER(email) = UPPER(?))";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, email);

		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			modelLogin.setId(resultSet.getLong("id"));
			modelLogin.setEmail(resultSet.getString("email"));
			modelLogin.setNome(resultSet.getString("nome"));
			modelLogin.setSenha(resultSet.getString("senha"));
			modelLogin.setTipoUsuario(resultSet.getString("tipoUsuario"));
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
			modelLogin.setTipoUsuario(resultSet.getString("tipoUsuario"));
		}

		return modelLogin;
	}

	public List<ModelLogin> listarUsuarios() throws Exception {

		List<ModelLogin> retorno = new ArrayList<ModelLogin>();

		String sql = "select * from modellogin order by id";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {

			ModelLogin modelLogin = new ModelLogin();

			modelLogin.setId(rs.getLong("id"));
			modelLogin.setNome(rs.getString("nome"));
			modelLogin.setEmail(rs.getString("email"));
			modelLogin.setSenha(rs.getString("senha"));
			modelLogin.setTipoUsuario(rs.getString("tipoUsuario"));

			retorno.add(modelLogin);

		}

		return retorno;
	}

	public void deletePorId(Long id) throws Exception {

		String sql = "delete from modellogin where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setLong(1, id);

		preparedStatement.executeUpdate();

		connection.commit();
	}

}
