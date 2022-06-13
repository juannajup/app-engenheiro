package model;

import java.io.Serializable;

public class ModelObra implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double fck;
	private Double desvioPadrao;
	private Double fcj;
	private Double fatorAguaCimento;
	private Double massaEspCimento;
	private Double massaEspAreia;
	private Double massaUniAreia;
	private Double massaEspBrita;
	private Double massaUniBrita;
	private Double consumoDeAgua;
	private Double consumoDeCimento;
	private Double volumeDeBrita;
	private Double consumoDeBrita;
	private Double consumoDeAreia;
	private Double volumeDeAreia;
	private Double tracoAreia;
	private Double tracoBrita;
	private Double tracoAgua;

	public Double getFck() {
		return fck;
	}

	public void setFck(Double fck) {
		this.fck = fck;
	}

	public Double getDesvioPadrao() {
		return desvioPadrao;
	}

	public void setDesvioPadrao(Double desvioPadrao) {
		this.desvioPadrao = desvioPadrao;
	}

	public Double getFcj() {
		return fcj;
	}

	public void setFcj(Double fcj) {
		this.fcj = fcj;
	}

	public Double getFatorAguaCimento() {
		return fatorAguaCimento;
	}

	public void setFatorAguaCimento(Double fatorAguaCimento) {
		this.fatorAguaCimento = fatorAguaCimento;
	}

	public Double getMassaEspCimento() {
		return massaEspCimento;
	}

	public void setMassaEspCimento(Double massaEspCimento) {
		this.massaEspCimento = massaEspCimento;
	}

	public Double getMassaEspAreia() {
		return massaEspAreia;
	}

	public void setMassaEspAreia(Double massaEspAreia) {
		this.massaEspAreia = massaEspAreia;
	}

	public Double getMassaUniAreia() {
		return massaUniAreia;
	}

	public void setMassaUniAreia(Double massaUniAreia) {
		this.massaUniAreia = massaUniAreia;
	}

	public Double getMassaEspBrita() {
		return massaEspBrita;
	}

	public void setMassaEspBrita(Double massaEspBrita) {
		this.massaEspBrita = massaEspBrita;
	}

	public Double getMassaUniBrita() {
		return massaUniBrita;
	}

	public void setMassaUniBrita(Double massaUniBrita) {
		this.massaUniBrita = massaUniBrita;
	}

	public Double getConsumoDeAgua() {
		return consumoDeAgua;
	}

	public void setConsumoDeAgua(Double consumoDeAgua) {
		this.consumoDeAgua = consumoDeAgua;
	}

	public Double getConsumoDeCimento() {
		return consumoDeCimento;
	}

	public void setConsumoDeCimento(Double consumoDeCimento) {
		this.consumoDeCimento = consumoDeCimento;
	}

	public Double getVolumeDeBrita() {
		return volumeDeBrita;
	}

	public void setVolumeDeBrita(Double volumeDeBrita) {
		this.volumeDeBrita = volumeDeBrita;
	}

	public Double getConsumoDeBrita() {
		return consumoDeBrita;
	}

	public void setConsumoDeBrita(Double consumoDeBrita) {
		this.consumoDeBrita = consumoDeBrita;
	}

	public Double getConsumoDeAreia() {
		return consumoDeAreia;
	}

	public void setConsumoDeAreia(Double consumoDeAreia) {
		this.consumoDeAreia = consumoDeAreia;
	}

	public Double getVolumeDeAreia() {
		return volumeDeAreia;
	}

	public void setVolumeDeAreia(Double volumeDeAreia) {
		this.volumeDeAreia = volumeDeAreia;
	}

	public Double getTracoAreia() {
		return tracoAreia;
	}

	public void setTracoAreia(Double tracoAreia) {
		this.tracoAreia = tracoAreia;
	}

	public Double getTracoBrita() {
		return tracoBrita;
	}

	public void setTracoBrita(Double tracoBrita) {
		this.tracoBrita = tracoBrita;
	}

	public Double getTracoAgua() {
		return tracoAgua;
	}

	public void setTracoAgua(Double tracoAgua) {
		this.tracoAgua = tracoAgua;
	}
	

	/*
	 * 
	 * 
	 * 
	 */

	public Double calcularFcj(Double fck, Double desvioPadrao) {

		fcj = fck + 1.65 * desvioPadrao;

		return fcj;
	}

	public Double calcularConsumoCimento(Double consumoDeAgua, Double fatorAguaCimento) {

		consumoDeCimento = consumoDeAgua / fatorAguaCimento;

		return consumoDeCimento;
	}

	public Double calcularConsumoBrita(Double volumeDeBrita, Double massaUniBrita) {

		consumoDeBrita = volumeDeBrita * massaUniBrita;

		return consumoDeBrita;
	}

	public Double calcularVolumeAreia(Double consumoDeAgua, Double volumeDeBrita, Double massaUniBrita, Double massaEspBrita,
			Double fatorAguaCimento, Double massaEspCimento) {

		volumeDeAreia = 1 - ((consumoDeAgua / fatorAguaCimento / massaEspCimento) + 
				(volumeDeBrita * massaUniBrita / massaEspBrita) + (consumoDeAgua / 1000));


		return volumeDeAreia;

	}

	
	public Double calcularConsumoAreia(Double consumoDeAgua, Double volumeDeBrita, Double massaUniBrita, Double massaEspBrita,
			Double fatorAguaCimento, Double massaEspCimento, Double massaEspAreia) {

		volumeDeAreia = 1 - ((consumoDeAgua / fatorAguaCimento / massaEspCimento) + 
				(volumeDeBrita * massaUniBrita / massaEspBrita) + (consumoDeAgua / 1000));

		consumoDeAreia = volumeDeAreia * massaEspAreia;

		return consumoDeAreia;

	}

	public Double tracoAreia() {

		tracoAreia = calcularConsumoAreia( consumoDeAgua, volumeDeBrita, massaUniBrita, massaEspBrita, fatorAguaCimento, massaEspCimento,
				massaEspAreia) / calcularConsumoCimento(consumoDeAgua, fatorAguaCimento);

		return tracoAreia;
	}

	public Double tracoBrita() {

		tracoBrita = calcularConsumoBrita(volumeDeBrita, massaUniBrita) / calcularConsumoCimento(consumoDeAgua, fatorAguaCimento);

		return tracoBrita;
	}

	public Double tracoAgua(Double consumoDeAgua) {

		tracoAgua = consumoDeAgua / calcularConsumoCimento(consumoDeAgua, fatorAguaCimento);

		return tracoAgua;
	}

}
