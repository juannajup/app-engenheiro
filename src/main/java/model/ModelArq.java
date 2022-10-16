package model;

import java.io.Serializable;

public class ModelArq implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double espelho;
	private Double pisoPiso;
	private Double piso;
	private Double quantDegraus;

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

	public Double calcularPiso(Double espelho) {

		piso = 64 - 2 * espelho;

		return piso;
	}

	public Double calcularDegrau(Double pisoPiso, Double espelho) {

		quantDegraus = pisoPiso / espelho;

		return quantDegraus;
	}

}
