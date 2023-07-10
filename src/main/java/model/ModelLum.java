package model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modellum")
public class ModelLum implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	// com equals e hashcode
	// criar construtor vazio

	private Double comprimento;
	private Double largura;
	private Double alturaInstalacao;
	private Double indiceK;

	private Double fluxoLuminosoTotal;
	private Double fluxoLuminoso;
	private Double nivelLuminancia;
	private Double depreciacao;
	private Double fatorUtilizacao;
	private Double numeroDeLuminarias;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public Double getLargura() {
		return largura;
	}

	public Double getAlturaInstalacao() {
		return alturaInstalacao;
	}

	public Double getIndiceK() {
		return indiceK;
	}

	public Double getFluxoLuminosoTotal() {
		return fluxoLuminosoTotal;
	}

	public Double getFluxoLuminoso() {
		return fluxoLuminoso;
	}

	public Double getNivelLuminancia() {
		return nivelLuminancia;
	}

	public Double getDepreciacao() {
		return depreciacao;
	}

	public Double getFatorUtilizacao() {
		return fatorUtilizacao;
	}

	public Double getNumeroDeLuminarias() {
		return numeroDeLuminarias;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public void setAlturaInstalacao(Double alturaInstalacao) {
		this.alturaInstalacao = alturaInstalacao;
	}

	public void setIndiceK(Double indiceK) {
		this.indiceK = indiceK;
	}

	public void setFluxoLuminosoTotal(Double fluxoLuminosoTotal) {
		this.fluxoLuminosoTotal = fluxoLuminosoTotal;
	}

	public void setFluxoLuminoso(Double fluxoLuminoso) {
		this.fluxoLuminoso = fluxoLuminoso;
	}

	public void setNivelLuminancia(Double nivelLuminancia) {
		this.nivelLuminancia = nivelLuminancia;
	}

	public void setDepreciacao(Double depreciacao) {
		this.depreciacao = depreciacao;
	}

	public void setFatorUtilizacao(Double fatorUtilizacao) {
		this.fatorUtilizacao = fatorUtilizacao;
	}

	public void setNumeroDeLuminarias(Double numeroDeLuminarias) {
		this.numeroDeLuminarias = numeroDeLuminarias;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelLum other = (ModelLum) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*
	 * 
	 * Calculos
	 * 
	 */

	public Double calcularIndiceK(Double comprimento, Double largura, Double alturaInstalacao) {

		return indiceK = (comprimento * largura) / (alturaInstalacao * (comprimento + 1));

	}

	public Double calcularFluxoLuminosoTotal(Double comprimento, Double largura, Double nivelIluminancia,
			Double depreciacao, Double fatorUtilizacao) {

		fluxoLuminosoTotal = (comprimento * largura * nivelIluminancia) / (depreciacao * fatorUtilizacao);

		return fluxoLuminosoTotal;
	}

	public Double calcularNumeroDeLuminarias(Double fluxoLuminosoTotal, Double fluxoLuminoso) {

		return numeroDeLuminarias = fluxoLuminosoTotal / fluxoLuminoso;

	}

	public Double mostrarIndiceK(Double indiceK) {

		return indiceK = this.indiceK;

	}
}
