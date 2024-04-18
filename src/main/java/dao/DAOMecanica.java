package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.SingleConnectionBanco;
import model.ModelMecanica;

public class DAOMecanica {

	private Connection connection; 
	
	public DAOMecanica() {
		connection = SingleConnectionBanco.getConnection();
	}

	public List<ModelMecanica> listarSplitPorUsuario(long usuarioID) throws Exception {
		List<ModelMecanica> retorno = new ArrayList<>();
		
		String sql = "SELECT * FROM modelmecanica WHERE usuario_id = ? AND areadoambiente IS NOT NULL ORDER BY id DESC";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setLong(1, usuarioID);
		
		ResultSet rs = preparedStatement.executeQuery();
		
		while (rs.next()) {
			ModelMecanica modelMecanica = new ModelMecanica();
			modelMecanica.setId(rs.getLong("id"));
			modelMecanica.setAreaDoAmbiente(rs.getDouble("areadoambiente"));
			modelMecanica.setNumeroDePessoas(rs.getInt("numerodepessoas"));
			modelMecanica.setBtuh(rs.getDouble("btuh"));
			modelMecanica.setQuantidadeDeSol(rs.getString("quantidadedesol"));
			modelMecanica.setNumeroDeEquipamentos(rs.getInt("numerodeequipamentos"));
			modelMecanica.setAlturaDuto(rs.getDouble("alturaduto"));
			modelMecanica.setLarguraDuto(rs.getDouble("larguraduto"));
			modelMecanica.setComprimentoDuto(rs.getDouble("comprimentoduto"));
			modelMecanica.setAreaChapa(rs.getDouble("areachapa"));
			modelMecanica.setPesoChapa(rs.getDouble("pesochapa"));
			modelMecanica.setChapaSelecionada(rs.getString("chapaselecionada"));
			
			retorno.add(modelMecanica);
		}
		
		return retorno;
	}
	
	public List<ModelMecanica> listarMecanicasPorUsuario(long usuarioID) throws Exception {
	    List<ModelMecanica> retorno = new ArrayList<>();

	    String sql = "SELECT * FROM modelmecanica WHERE usuario_id = ? ORDER BY id DESC";
	    PreparedStatement preparedStatement = connection.prepareStatement(sql);
	    preparedStatement.setLong(1, usuarioID);

	    ResultSet rs = preparedStatement.executeQuery();

	    while (rs.next()) {
	        ModelMecanica modelMecanica = new ModelMecanica();
	        modelMecanica.setId(rs.getLong("id"));
	        modelMecanica.setAreaDoAmbiente(rs.getDouble("areadoambiente"));
	        modelMecanica.setNumeroDePessoas(rs.getInt("numerodepessoas"));
	        modelMecanica.setBtuh(rs.getDouble("btuh"));
	        modelMecanica.setQuantidadeDeSol(rs.getString("quantidadedesol"));
	        modelMecanica.setNumeroDeEquipamentos(rs.getInt("numerodeequipamentos"));
	        modelMecanica.setAlturaDuto(rs.getDouble("alturaduto"));
	        modelMecanica.setLarguraDuto(rs.getDouble("larguraduto"));
	        modelMecanica.setComprimentoDuto(rs.getDouble("comprimentoduto"));
	        modelMecanica.setAreaChapa(rs.getDouble("areachapa"));
	        modelMecanica.setPesoChapa(rs.getDouble("pesochapa"));
	        modelMecanica.setChapaSelecionada(rs.getString("chapaselecionada"));

	        retorno.add(modelMecanica);
	    }

	    return retorno;
	}
	
	public List<ModelMecanica> listarMecanicas() throws Exception {
		
		List<ModelMecanica> retorno = new ArrayList<ModelMecanica>();

		String sql = "select * from modelmecanica order by id desc";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {

			ModelMecanica modelMecanica = new ModelMecanica();

			modelMecanica.setId(rs.getLong("id"));
			modelMecanica.setAreaDoAmbiente(rs.getDouble("areadoambiente"));
			modelMecanica.setNumeroDePessoas(rs.getInt("numerodepessoas"));
			modelMecanica.setBtuh(rs.getDouble("btuh"));
			modelMecanica.setQuantidadeDeSol(rs.getString("quantidadedesol"));
			modelMecanica.setNumeroDeEquipamentos(rs.getInt("numerodeequipamentos"));
			modelMecanica.setAlturaDuto(rs.getDouble("alturaduto"));
			modelMecanica.setLarguraDuto(rs.getDouble("larguraduto"));
			modelMecanica.setComprimentoDuto(rs.getDouble("comprimentoduto"));
			modelMecanica.setAreaChapa(rs.getDouble("areachapa"));
			modelMecanica.setPesoChapa(rs.getDouble("pesochapa"));
			modelMecanica.setChapaSelecionada(rs.getString("chapaselecionada"));

			retorno.add(modelMecanica);

		}

		return retorno;
	}
	
	public void deletePorId(Long id) throws Exception {

		String sql = "delete from modelmecanica where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setLong(1, id);

		preparedStatement.executeUpdate();

		connection.commit();
	}
	
	public void limparMecanicas() throws Exception {

		String sql = "delete * from modelmecanica";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.executeQuery();

		connection.commit();
	}
	
	
}
