package model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ModelEletrica implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer tensao;
	private Double corrente;
	private Double potencia;
	private Double fatorDePotencia;
	private Double voltAmper;
	private String rede;
	private Double comprimento;
	private Double quedaPermitida;
	private Double quedaCalculada;
	private Double caboTeste;
	private Double caboCalc;
	private String condutor;

	public String getCondutor() {
		return condutor;
	}

	public void setCondutor(String condutor) {
		this.condutor = condutor;
	}

	public void setTensao(Integer tensao) {
		this.tensao = tensao;
	}

	public String getRede() {
		return rede;
	}

	public void setRede(String rede) {
		this.rede = rede;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public Double getCorrente() {
		return corrente;
	}

	public void setCorrente(Double corrente) {
		this.corrente = corrente;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	public Double getFatorDePotencia() {
		return fatorDePotencia;
	}

	public void setFatorDePotencia(Double fatorDePotencia) {
		this.fatorDePotencia = fatorDePotencia;
	}

	public double getVoltAmper() {
		return voltAmper;
	}

	public void setVoltAmper(Double voltAmper) {
		this.voltAmper = voltAmper;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public Double getQuedaPermitida() {
		return quedaPermitida;
	}

	public void setQuedaPermitida(Double quedaPermitida) {
		this.quedaPermitida = quedaPermitida;
	}

	public Double getQuedaCalculada() {
		return quedaCalculada;
	}

	public void setQuedaCalculada(Double quedaCalculada) {
		this.quedaCalculada = quedaCalculada;
	}

	public Double getCaboTeste() {
		return caboTeste;
	}

	public void setCaboTeste(Double caboTeste) {
		this.caboTeste = caboTeste;
	}

	public Double getCaboCalc() {
		return caboCalc;
	}

	public void setCaboCalc(Double caboCalc) {
		this.caboCalc = caboCalc;
	}

	public void setVoltAmper(double voltAmper) {
		this.voltAmper = voltAmper;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Double calcularCorrenteMonofasica(Integer tensao, Double potencia, Double fatorDePotencia) {

		voltAmper = (potencia / fatorDePotencia);

		corrente = (voltAmper / tensao);

		return corrente;
	}

	public String calcularCorrenteTrifasica(int tensao, Double potencia, Double fatorDePotencia) {

		voltAmper = (potencia / fatorDePotencia);

		corrente = (voltAmper / (tensao * 1.73));

		DecimalFormat valorFormatado = new DecimalFormat("0.##");
		return valorFormatado.format(corrente);

	}

	public Double calcularQuedaDeTensao(Double corrente, Double comprimento, Double caboTeste, String condutor) {

		if (tensao.equals(110) || tensao.equals(220)) {

			if (condutor.equalsIgnoreCase("aluminio")) {

				// quando o cabo é de aluminio
				quedaCalculada = (200 * 0.0282 * comprimento * corrente) / (caboTeste * tensao);
				return quedaCalculada;

			} else {

				// quando o cabo é de cobre
				quedaCalculada = (200 * 0.0172 * comprimento * corrente) / (caboTeste * tensao);
				return quedaCalculada;

			}

		} else if (tensao.equals(380)) {

			if (condutor.equalsIgnoreCase("aluminio")) {

				// quando o cabo é de aluminio
				quedaCalculada = (173.2 * 0.0282 * comprimento * corrente) / (caboTeste * tensao);
				return quedaCalculada;

			} else {

				// quando o cabo é de cobre
				quedaCalculada = (173.2 * 0.0172 * comprimento * corrente) / (caboTeste * tensao);
				return quedaCalculada;

			}

		} else {

			return null;
		}

	}

}
