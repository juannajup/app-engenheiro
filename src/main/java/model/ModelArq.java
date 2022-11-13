package model;

import java.io.Serializable;

public class ModelArq implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double espelho;
	private Double pisoPiso;
	private Double piso;
	private Double quantDegraus;

	private Double inclinacao;
	private Double comprimento;
	private Double altura;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Double getEspelho() {
		return espelho;
	}

	public Double getPisoPiso() {
		return pisoPiso;
	}

	public Double getPiso() {
		return piso;
	}

	public Double getQuantDegraus() {
		return quantDegraus;
	}

	public Double getInclinacao() {
		return inclinacao;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setEspelho(Double espelho) {
		this.espelho = espelho;
	}

	public void setPisoPiso(Double pisoPiso) {
		this.pisoPiso = pisoPiso;
	}

	public void setPiso(Double piso) {
		this.piso = piso;
	}

	public void setQuantDegraus(Double quantDegraus) {
		this.quantDegraus = quantDegraus;
	}

	public void setInclinacao(Double inclinacao) {
		this.inclinacao = inclinacao;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double calcularPiso(Double espelho) {

		piso = 64 - 2 * espelho;

		return piso;
	}

	public Double calcularDegrau(Double pisoPiso, Double espelho) {

		quantDegraus = pisoPiso / espelho;

		return quantDegraus;
	}

	public Double calcularInclinacaoRampa(Double comprimento, Double altura) {

		return inclinacao = (altura * 100) / comprimento;

	}

}
