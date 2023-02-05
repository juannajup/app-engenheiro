package model;

import java.io.Serializable;

public class ModelHidrossanitario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numeroDePessoas;
	private Integer consumoPerCapita;
	private Integer consumoDiario;
	private Integer volumeReservatorioSuperior;
	private Integer volumeReservatorioInferior;
	private Integer volumeReservatorio;
	private Integer numeroDePavimentos;
	private Integer diasSemAgua;
	private Double cotaTopo1;
	private Double cotaTopo2;
	private Double cotaFundo1;
	private Double cotaFundo2;
	private Double altura1;
	private Double altura2;
	private Double distanciaCaixas;
	private Double inclinacaoTubo;
	private Double areaMolhada;
	private Double intensidadePluviometrica;
	private Double vazaoDeProjeto;
	private Double capacidadeCalha;
	private Double declividade;
	private Double rugosidade;
	private Double perimetroMolhado;
	private Double contribuicao;
	private Double contribuicaoDiaria;
	private Double altura;
	private Double taxaAcumulacao;
	private Double lodoFresco;
	private Double larguraPrismatico;
	private Double larguraCilindrico;
	private Double comprimentoPrismatico;
	private Double alturaTotalPrismatico;
	private Double alturaTotalCilindrico;
	private Double volumeTanqueSeptico;
	private Double tempoDeDetencao;

	public Double getLarguraCilindrico() {
		return larguraCilindrico;
	}

	public void setLarguraCilindrico(Double larguraCilindrico) {
		this.larguraCilindrico = larguraCilindrico;
	}

	public Double getTempoDeDetencao() {
		return tempoDeDetencao;
	}

	public void setTempoDeDetencao(Double tempoDeDetencao) {
		this.tempoDeDetencao = tempoDeDetencao;
	}

	public Double getContribuicao() {
		return contribuicao;
	}

	public Double getContribuicaoDiaria() {
		return contribuicaoDiaria;
	}

	public Double getAltura() {
		return altura;
	}

	public Double getTaxaAcumulacao() {
		return taxaAcumulacao;
	}

	public Double getLodoFresco() {
		return lodoFresco;
	}

	public Double getLarguraPrismatico() {
		return larguraPrismatico;
	}

	public Double getComprimentoPrismatico() {
		return comprimentoPrismatico;
	}

	public Double getAlturaTotalPrismatico() {
		return alturaTotalPrismatico;
	}

	public Double getAlturaTotalCilindrico() {
		return alturaTotalCilindrico;
	}

	public void setContribuicao(Double contribuicao) {
		this.contribuicao = contribuicao;
	}

	public void setContribuicaoDiaria(Double contribuicaoDiaria) {
		this.contribuicaoDiaria = contribuicaoDiaria;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public void setTaxaAcumulacao(Double taxaAcumulacao) {
		this.taxaAcumulacao = taxaAcumulacao;
	}

	public void setLodoFresco(Double lodoFresco) {
		this.lodoFresco = lodoFresco;
	}

	public void setLarguraPrismatico(Double larguraPrismatico) {
		this.larguraPrismatico = larguraPrismatico;
	}

	public void setComprimentoPrismatico(Double comprimentoPrismatico) {
		this.comprimentoPrismatico = comprimentoPrismatico;
	}

	public void setAlturaTotalPrismatico(Double alturaTotalPrismatico) {
		this.alturaTotalPrismatico = alturaTotalPrismatico;
	}

	public void setAlturaTotalCilindrico(Double alturaTotalCilindrico) {
		this.alturaTotalCilindrico = alturaTotalCilindrico;
	}

	public Integer getNumeroDePessoas() {
		return numeroDePessoas;
	}

	public Integer getConsumoPerCapita() {
		return consumoPerCapita;
	}

	public Integer getConsumoDiario() {
		return consumoDiario;
	}

	public Integer getVolumeReservatorioSuperior() {
		return volumeReservatorioSuperior;
	}

	public Integer getVolumeReservatorioInferior() {
		return volumeReservatorioInferior;
	}

	public Integer getVolumeReservatorio() {
		return volumeReservatorio;
	}

	public Integer getNumeroDePavimentos() {
		return numeroDePavimentos;
	}

	public Integer getDiasSemAgua() {
		return diasSemAgua;
	}

	public Double getCotaTopo1() {
		return cotaTopo1;
	}

	public Double getCotaTopo2() {
		return cotaTopo2;
	}

	public Double getCotaFundo1() {
		return cotaFundo1;
	}

	public Double getCotaFundo2() {
		return cotaFundo2;
	}

	public Double getAltura1() {
		return altura1;
	}

	public Double getAltura2() {
		return altura2;
	}

	public Double getDistanciaCaixas() {
		return distanciaCaixas;
	}

	public Double getInclinacaoTubo() {
		return inclinacaoTubo;
	}

	public Double getAreaMolhada() {
		return areaMolhada;
	}

	public Double getIntensidadePluviometrica() {
		return intensidadePluviometrica;
	}

	public Double getVazaoDeProjeto() {
		return vazaoDeProjeto;
	}

	public Double getCapacidadeCalha() {
		return capacidadeCalha;
	}

	public Double getDeclividade() {
		return declividade;
	}

	public Double getRugosidade() {
		return rugosidade;
	}

	public Double getPerimetroMolhado() {
		return perimetroMolhado;
	}

	public void setNumeroDePessoas(Integer numeroDePessoas) {
		this.numeroDePessoas = numeroDePessoas;
	}

	public void setConsumoPerCapita(Integer consumoPerCapita) {
		this.consumoPerCapita = consumoPerCapita;
	}

	public void setConsumoDiario(Integer consumoDiario) {
		this.consumoDiario = consumoDiario;
	}

	public void setVolumeReservatorioSuperior(Integer volumeReservatorioSuperior) {
		this.volumeReservatorioSuperior = volumeReservatorioSuperior;
	}

	public void setVolumeReservatorioInferior(Integer volumeReservatorioInferior) {
		this.volumeReservatorioInferior = volumeReservatorioInferior;
	}

	public void setVolumeReservatorio(Integer volumeReservatorio) {
		this.volumeReservatorio = volumeReservatorio;
	}

	public void setNumeroDePavimentos(Integer numeroDePavimentos) {
		this.numeroDePavimentos = numeroDePavimentos;
	}

	public void setDiasSemAgua(Integer diasSemAgua) {
		this.diasSemAgua = diasSemAgua;
	}

	public void setCotaTopo1(Double cotaTopo1) {
		this.cotaTopo1 = cotaTopo1;
	}

	public void setCotaTopo2(Double cotaTopo2) {
		this.cotaTopo2 = cotaTopo2;
	}

	public void setCotaFundo1(Double cotaFundo1) {
		this.cotaFundo1 = cotaFundo1;
	}

	public void setCotaFundo2(Double cotaFundo2) {
		this.cotaFundo2 = cotaFundo2;
	}

	public void setAltura1(Double altura1) {
		this.altura1 = altura1;
	}

	public void setAltura2(Double altura2) {
		this.altura2 = altura2;
	}

	public void setDistanciaCaixas(Double distanciaCaixas) {
		this.distanciaCaixas = distanciaCaixas;
	}

	public void setInclinacaoTubo(Double inclinacaoTubo) {
		this.inclinacaoTubo = inclinacaoTubo;
	}

	public void setAreaMolhada(Double areaMolhada) {
		this.areaMolhada = areaMolhada;
	}

	public void setIntensidadePluviometrica(Double intensidadePluviometrica) {
		this.intensidadePluviometrica = intensidadePluviometrica;
	}

	public void setVazaoDeProjeto(Double vazaoDeProjeto) {
		this.vazaoDeProjeto = vazaoDeProjeto;
	}

	public void setCapacidadeCalha(Double capacidadeCalha) {
		this.capacidadeCalha = capacidadeCalha;
	}

	public void setDeclividade(Double declividade) {
		this.declividade = declividade;
	}

	public void setRugosidade(Double rugosidade) {
		this.rugosidade = rugosidade;
	}

	public void setPerimetroMolhado(Double perimetroMolhado) {
		this.perimetroMolhado = perimetroMolhado;
	}

	public Double getVolumeTanqueSeptico() {
		return volumeTanqueSeptico;
	}

	public void setVolumeTanqueSeptico(Double volumeTanqueSeptico) {
		this.volumeTanqueSeptico = volumeTanqueSeptico;
	}

	/*
	 * 
	 * 
	 * 
	 * */

	public Integer calcularReservatorio(Integer numeroDePessoas, Integer consumoPerCapita, Integer diasSemAgua) {

		consumoDiario = numeroDePessoas * consumoPerCapita;

		volumeReservatorio = consumoDiario * diasSemAgua;

		return volumeReservatorio;

	}

	public Integer calcularReservatorioSuperior(Integer numeroDePessoas, Integer consumoPerCapita,
			Integer diasSemAgua) {

		consumoDiario = numeroDePessoas * consumoPerCapita;

		volumeReservatorioSuperior = (int) (consumoDiario * diasSemAgua * 0.4);

		return volumeReservatorioSuperior;

	}

	public Integer calcularReservatorioInferior(Integer numeroDePessoas, Integer consumoPerCapita,
			Integer diasSemAgua) {

		consumoDiario = numeroDePessoas * consumoPerCapita;

		volumeReservatorioInferior = (int) (consumoDiario * diasSemAgua * 0.6);

		return volumeReservatorioInferior;

	}

	public Double alturaCaixaInsp1(Double cotaTopo1, Double cotaFundo1) {

		altura1 = cotaTopo1 - cotaFundo1;

		return altura1;
	}

	public Double calcularCotaCaixaInsp(Double cotaFundo1, Double distanciaCaixas, Double inclinacaoTubo) {

		cotaFundo2 = cotaFundo1 - distanciaCaixas * (inclinacaoTubo / 100);

		return cotaFundo2;
	}

	public Double alturaCaixaInsp2(Double cotaTopo2) {

		altura2 = cotaTopo2 - calcularCotaCaixaInsp(cotaFundo1, distanciaCaixas, inclinacaoTubo);

		return altura2;
	}

	public Double calcularVazao(Double areaMolhada, Double intensidadePluviometrica) {

		return vazaoDeProjeto = (areaMolhada * intensidadePluviometrica) / 60;

	}

	public Double calcularCapacidadeDeCalha(Double areaMolhada, Double perimetroMolhado, Double rugosidade,
			Double declividade) {

		Double raioHidraulico = areaMolhada / perimetroMolhado;
		Double percentual = declividade / 100;

		capacidadeCalha = (60000 * areaMolhada * Math.pow(raioHidraulico, 0.66666667) * Math.pow(percentual, 0.5))
				/ rugosidade;

		return capacidadeCalha;
	}

	public Double calcularContribuicaoDiaria(Integer numeroDePessoas, Double contribuicao) {
		return contribuicaoDiaria = contribuicao * numeroDePessoas;
	}

	public Double volumeTanqueSeptico(Double taxaAcumulacao, Double lodoFresco) {

		if (contribuicaoDiaria <= 1500) {
			tempoDeDetencao = 1.00;
		} else if (contribuicaoDiaria >= 1501 || contribuicaoDiaria <= 3000) {
			tempoDeDetencao = 0.92;
		} else if (contribuicaoDiaria >= 3001 || contribuicaoDiaria <= 4500) {
			tempoDeDetencao = 0.83;
		} else if (contribuicaoDiaria >= 4501 || contribuicaoDiaria <= 6000) {
			tempoDeDetencao = 0.75;
		} else if (contribuicaoDiaria >= 6001 || contribuicaoDiaria <= 7500) {
			tempoDeDetencao = 0.67;
		} else if (contribuicaoDiaria >= 7501 || contribuicaoDiaria <= 9000) {
			tempoDeDetencao = 0.58;
		} else {
			tempoDeDetencao = 0.50;
		}

		volumeTanqueSeptico = (1000 + numeroDePessoas * (contribuicao * tempoDeDetencao + lodoFresco * taxaAcumulacao))
				/ 1000;

		return volumeTanqueSeptico;
	}

	public Double calcularLarguraTanquePrismatico(Double altura) {

		Double raiz = volumeTanqueSeptico / (2 * altura);

		return larguraPrismatico = Math.sqrt(raiz);
	}

	public Double calcularComprimentoTanquePrismatico() {

		return comprimentoPrismatico = larguraPrismatico * 2;
	}

	public Double calcularAlturaTotalTanquePrismatico() {

		return alturaTotalPrismatico = altura + 0.25;
	}

	public Double calcularLarguraTanqueCilindrico() {

		Double raiz = (volumeTanqueSeptico * 4) / (Math.PI * altura);

		return larguraCilindrico = Math.sqrt(raiz);
	}

	public Double calcularAlturaTotalTanqueCilindrico() {
		alturaTotalCilindrico = altura + 0.25;
		return alturaTotalCilindrico;
	}
}
