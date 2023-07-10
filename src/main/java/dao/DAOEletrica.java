package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.SingleConnectionBanco;
import model.ModelEletrica;
import model.ModelMecanica;

public class DAOEletrica {

	private Connection connection; 
	
	public DAOEletrica() {
		connection = SingleConnectionBanco.getConnection();
	}

	public List<ModelEletrica> listarEletricas() throws Exception {
		
		List<ModelEletrica> retorno = new ArrayList<ModelEletrica>();

		String sql = "select * from modeleletrica order by id desc";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {

			ModelEletrica modelEletrica = new ModelEletrica();

			modelEletrica.setId(rs.getLong("id"));
			modelEletrica.setTensao(rs.getInt("tensao"));
			modelEletrica.setCorrente(rs.getDouble("corrente"));
			modelEletrica.setPotencia(rs.getDouble("potencia"));
			modelEletrica.setFatorDePotencia(rs.getDouble("fatordepotencia"));
			modelEletrica.setVoltAmper(rs.getDouble("voltamper"));
			modelEletrica.setRede(rs.getString("rede"));
			modelEletrica.setComprimento(rs.getDouble("comprimento"));
			modelEletrica.setQuedaPermitida(rs.getDouble("quedapermitida"));
			modelEletrica.setQuedaCalculada(rs.getDouble("quedacalculada"));
			modelEletrica.setCaboTeste(rs.getDouble("caboteste"));
			modelEletrica.setCaboCalc(rs.getDouble("cabocalc"));
			modelEletrica.setCondutor(rs.getString("condutor"));
			modelEletrica.setCorrenteDisjuntor(rs.getDouble("correntedisjuntor"));
			modelEletrica.setCorrenteFatorDeAgrupamento(rs.getDouble("correntefatordeagrupamento"));

			retorno.add(modelEletrica);

		}

		return retorno;
	}
	
	public void deletePorId(Long id) throws Exception {

		String sql = "delete from modeleletrica where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setLong(1, id);

		preparedStatement.executeUpdate();

		connection.commit();
	}
	
	public void limparEletricas() throws Exception {

		String sql = "delete * from modeleletrica";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.executeQuery();

		connection.commit();
	}
	
	
}
