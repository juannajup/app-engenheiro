package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.SingleConnectionBanco;
import model.ModelLum;

public class DAOLum {

	private Connection connection;

	public DAOLum() {
		connection = SingleConnectionBanco.getConnection();
	}

	public List<ModelLum> listarLum() throws Exception {

		List<ModelLum> retorno = new ArrayList<ModelLum>();

		String sql = "select * from modellum order by id desc";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {

			ModelLum modelLum = new ModelLum();

			modelLum.setId(rs.getLong("id"));
			modelLum.setComprimento(rs.getDouble("comprimento"));
			modelLum.setLargura(rs.getDouble("largura"));
			modelLum.setAlturaInstalacao(rs.getDouble("alturainstalacao"));
			modelLum.setIndiceK(rs.getDouble("indicek"));
			modelLum.setFluxoLuminosoTotal(rs.getDouble("fluxoluminosototal"));
			modelLum.setFluxoLuminoso(rs.getDouble("fluxoluminoso"));
			modelLum.setNivelLuminancia(rs.getDouble("nivelluminancia"));
			modelLum.setDepreciacao(rs.getDouble("depreciacao"));
			modelLum.setFatorUtilizacao(rs.getDouble("fatorutilizacao"));
			modelLum.setNumeroDeLuminarias(rs.getDouble("numerodeluminarias"));

			retorno.add(modelLum);

		}

		return retorno;
	}

	public void deletePorId(Long id) throws Exception {

		String sql = "delete from modellum where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setLong(1, id);

		preparedStatement.executeUpdate();

		connection.commit();
	}

	public void limparLum() throws Exception {

		String sql = "delete * from modellum";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.executeQuery();

		connection.commit();
	}

}
