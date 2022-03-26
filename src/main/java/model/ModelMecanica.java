package model;

public class ModelMecanica {

	private Double areaDoAmbiente;
	private Integer numeroDePessoas;
	private Double btuh;
	private String quantidadeDeSol;
	private Integer numeroDeEquipamentos;

	public Double getAreaDoAmbiente() {
		return areaDoAmbiente;
	}

	public void setAreaDoAmbiente(Double areaDoAmbiente) {
		this.areaDoAmbiente = areaDoAmbiente;
	}

	public Integer getNumeroDePessoas() {
		return numeroDePessoas;
	}

	public void setNumeroDePessoas(Integer numeroDePessoas) {
		this.numeroDePessoas = numeroDePessoas;
	}

	public Double getBtuh() {
		return btuh;
	}

	public void setBtuh(Double btuh) {
		this.btuh = btuh;
	}

	public String getQuantidadeDeSol() {
		return quantidadeDeSol;
	}

	public void setQuantidadeDeSol(String quantidadeDeSol) {
		this.quantidadeDeSol = quantidadeDeSol;
	}

	public Integer getNumeroDeEquipamentos() {
		return numeroDeEquipamentos;
	}

	public void setNumeroDeEquipamentos(Integer numeroDeEquipamentos) {
		this.numeroDeEquipamentos = numeroDeEquipamentos;
	}

	public Double calcularSplit(Double areaDoAmbiente, Integer numeroDePessoas, String quantidadeDeSol,
			Integer numeroDeEquipamentos) {

		if (this.quantidadeDeSol.equalsIgnoreCase("Sim")) {

			btuh = 800 * numeroDePessoas + 800 * areaDoAmbiente + 600 * numeroDeEquipamentos;

			return btuh;

		} else {

			btuh = 600 * numeroDePessoas + 600 * areaDoAmbiente + 600 * numeroDeEquipamentos;

			return btuh;
		}
	}

}
