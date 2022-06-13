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
	
	
	
	public Double getDistanciaCaixas() {
		return distanciaCaixas;
	}

	public void setDistanciaCaixas(Double distanciaCaixas) {
		this.distanciaCaixas = distanciaCaixas;
	}

	public Double getInclinacaoTubo() {
		return inclinacaoTubo;
	}

	public void setInclinacaoTubo(Double inclinacaoTubo) {
		this.inclinacaoTubo = inclinacaoTubo;
	}

	public Double getCotaTopo1() {
		return cotaTopo1;
	}

	public void setCotaTopo1(Double cotaTopo1) {
		this.cotaTopo1 = cotaTopo1;
	}

	public Double getCotaTopo2() {
		return cotaTopo2;
	}

	public void setCotaTopo2(Double cotaTopo2) {
		this.cotaTopo2 = cotaTopo2;
	}

	public Double getCotaFundo1() {
		return cotaFundo1;
	}

	public void setCotaFundo1(Double cotaFundo1) {
		this.cotaFundo1 = cotaFundo1;
	}

	public Double getCotaFundo2() {
		return cotaFundo2;
	}

	public void setCotaFundo2(Double cotaFundo2) {
		this.cotaFundo2 = cotaFundo2;
	}

	public Double getAltura1() {
		return altura1;
	}

	public void setAltura1(Double altura1) {
		this.altura1 = altura1;
	}

	public Double getAltura2() {
		return altura2;
	}

	public void setAltura2(Double altura2) {
		this.altura2 = altura2;
	}

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
	
	
}
