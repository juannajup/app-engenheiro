package model;

import java.io.Serializable;

public class ModelHidrossanitario implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDePessoas;
	private Integer consumoPerCapita;
	private Integer consumoDiario;
	private Integer volumeReservatorioSuperior;
	private Integer volumeReservatorioInferior;
	private Integer volumeReservatorio;
	private Integer numeroDePavimentos;
	private Integer diasSemAgua;
	
	public Integer getDiasSemAgua() {
		return diasSemAgua;
	}

	public void setDiasSemAgua(Integer diasSemAgua) {
		this.diasSemAgua = diasSemAgua;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getNumeroDePessoas() {
		return numeroDePessoas;
	}

	public void setNumeroDePessoas(Integer numeroDePessoas) {
		this.numeroDePessoas = numeroDePessoas;
	}

	public Integer getConsumoPerCapita() {
		return consumoPerCapita;
	}

	public void setConsumoPerCapita(Integer consumoPerCapita) {
		this.consumoPerCapita = consumoPerCapita;
	}

	public Integer getConsumoDiario() {
		return consumoDiario;
	}

	public void setConsumoDiario(Integer consumoDiario) {
		this.consumoDiario = consumoDiario;
	}

	public Integer getVolumeReservatorioSuperior() {
		return volumeReservatorioSuperior;
	}

	public void setVolumeReservatorioSuperior(Integer volumeReservatorioSuperior) {
		this.volumeReservatorioSuperior = volumeReservatorioSuperior;
	}

	public Integer getVolumeReservatorioInferior() {
		return volumeReservatorioInferior;
	}

	public void setVolumeReservatorioInferior(Integer volumeReservatorioInferior) {
		this.volumeReservatorioInferior = volumeReservatorioInferior;
	}

	public Integer getVolumeReservatorio() {
		return volumeReservatorio;
	}

	public void setVolumeReservatorio(Integer volumeReservatorio) {
		this.volumeReservatorio = volumeReservatorio;
	}

	public Integer getNumeroDePavimentos() {
		return numeroDePavimentos;
	}

	public void setNumeroDePavimentos(Integer numeroDePavimentos) {
		this.numeroDePavimentos = numeroDePavimentos;
	}
	
	@Override
	public String toString() {
		return "ModelHidrossanitario [numeroDePessoas=" + numeroDePessoas + ", consumoPerCapita=" + consumoPerCapita
				+ ", consumoDiario=" + consumoDiario + ", volumeReservatorioSuperior=" + volumeReservatorioSuperior
				+ ", volumeReservatorioInferior=" + volumeReservatorioInferior + ", volumeReservatorio="
				+ volumeReservatorio + ", numeroDePavimentos=" + numeroDePavimentos + "]";
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
	
	public Integer calcularReservatorioSuperior(Integer numeroDePessoas, Integer consumoPerCapita, Integer diasSemAgua) {

		consumoDiario = numeroDePessoas * consumoPerCapita;

		volumeReservatorioSuperior = (int) (consumoDiario * diasSemAgua * 0.4);	
		
		return volumeReservatorioSuperior;

}
	
	public Integer calcularReservatorioInferior(Integer numeroDePessoas, Integer consumoPerCapita, Integer diasSemAgua) {
		
		consumoDiario = numeroDePessoas * consumoPerCapita;
		
		volumeReservatorioInferior = (int) (consumoDiario * diasSemAgua * 0.6);
		
		return volumeReservatorioInferior;
		
	}


}
