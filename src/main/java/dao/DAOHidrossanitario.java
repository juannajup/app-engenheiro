package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.SingleConnectionBanco;
import model.ModelHidrossanitario;

public class DAOHidrossanitario {

	private Connection connection;

	public DAOHidrossanitario() {
		connection = SingleConnectionBanco.getConnection();
	}

	public List<ModelHidrossanitario> listarHidrossanitarios() throws Exception {

		List<ModelHidrossanitario> retorno = new ArrayList<ModelHidrossanitario>();

		String sql = "select * from modelhidrossanitario order by id desc";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {

			ModelHidrossanitario modelMecanica = new ModelHidrossanitario();

			modelMecanica.setId(rs.getLong("id"));
			modelMecanica.setAltura(rs.getDouble("altura"));
			modelMecanica.setAltura1(rs.getDouble("altura1"));
			modelMecanica.setAltura2(rs.getDouble("altura2"));
			modelMecanica.setAlturaTotalCilindrico(rs.getDouble("alturatotalcilindrico"));
			modelMecanica.setAlturaTotalPrismatico(rs.getDouble("alturatotalprismatico"));
			modelMecanica.setAreaMolhada(rs.getDouble("areamolhada"));
			modelMecanica.setCapacidadeCalha(rs.getDouble("capacidadecalha"));
			modelMecanica.setComprimentoPrismatico(rs.getDouble("comprimentoprismatico"));
			modelMecanica.setConsumoDiario(rs.getInt("consumodiario"));
			modelMecanica.setConsumoPerCapita(rs.getInt("consumopercapita"));
			modelMecanica.setContribuicao(rs.getDouble("contribuicao"));
			modelMecanica.setContribuicaoDiaria(rs.getDouble("contribuicaodiaria"));
			modelMecanica.setCotaFundo1(rs.getDouble("cotafundo1"));
			modelMecanica.setCotaFundo2(rs.getDouble("cotafundo2"));
			modelMecanica.setCotaTopo1(rs.getDouble("cotatopo1"));
			modelMecanica.setCotaTopo2(rs.getDouble("cotatopo2"));
			modelMecanica.setDeclividade(rs.getDouble("declividade"));
			modelMecanica.setDiasSemAgua(rs.getInt("diassemagua"));
			modelMecanica.setDistanciaCaixas(rs.getDouble("distanciacaixas"));
			modelMecanica.setInclinacaoTubo(rs.getDouble("inclinacaotubo"));
			modelMecanica.setIntensidadePluviometrica(rs.getDouble("intensidadepluviometrica"));
			modelMecanica.setLarguraCilindrico(rs.getDouble("larguracilindrico"));
			modelMecanica.setLarguraPrismatico(rs.getDouble("larguraprismatico"));
			modelMecanica.setLodoFresco(rs.getDouble("lodofresco"));
			modelMecanica.setNumeroDePavimentos(rs.getInt("numerodepavimentos"));
			modelMecanica.setNumeroDePessoas(rs.getInt("numerodepessoas"));
			modelMecanica.setPerimetroMolhado(rs.getDouble("perimetromolhado"));
			modelMecanica.setRugosidade(rs.getDouble("rugosidade"));
			modelMecanica.setTaxaAcumulacao(rs.getDouble("taxaacumulacao"));
			modelMecanica.setTempoDeDetencao(rs.getDouble("tempodedetencao"));
			modelMecanica.setVazaoDeProjeto(rs.getDouble("vazaodeprojeto"));
			modelMecanica.setVolumeReservatorio(rs.getInt("volumereservatorio"));
			modelMecanica.setVolumeReservatorioInferior(rs.getInt("volumereservatorioinferior"));
			modelMecanica.setVolumeReservatorioSuperior(rs.getInt("volumereservatoriosuperior"));
			modelMecanica.setVolumeTanqueSeptico(rs.getDouble("volumetanqueseptico"));

			retorno.add(modelMecanica);

		}

		return retorno;
	}

	public void deletePorId(Long id) throws Exception {

		String sql = "delete from modelhidrossanitario where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setLong(1, id);

		preparedStatement.executeUpdate();

		connection.commit();
	}

	public void limparHidrossanitarios() throws Exception {

		String sql = "delete * from modelhidrossanitario";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.executeQuery();

		connection.commit();
	}

}
