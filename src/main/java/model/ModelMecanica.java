package model;

import java.sql.Date;

public class ModelMecanica {

	private Double areaDoAmbiente;
	private Integer numeroDePessoas;
	private Double btuh;
	private String quantidadeDeSol;
	private Integer numeroDeEquipamentos;
	private String nomeDoAmbiente;
	private Date dataCalculo;
	private Double alturaDuto;
	private Double larguraDuto;
	private Double comprimentoDuto;
	private Double areaChapa;
	private Double pesoChapa;
	private String chapaSelecionada;
	
	public String getChapaSelecionada() {
		return chapaSelecionada;
	}

	public void setChapaSelecionada(String chapaSelecionada) {
		this.chapaSelecionada = chapaSelecionada;
	}

	public Double getAlturaDuto() {
		return alturaDuto;
	}

	public void setAlturaDuto(Double alturaDuto) {
		this.alturaDuto = alturaDuto;
	}

	public Double getLarguraDuto() {
		return larguraDuto;
	}

	public void setLarguraDuto(Double larguraDuto) {
		this.larguraDuto = larguraDuto;
	}

	public Double getComprimentoDuto() {
		return comprimentoDuto;
	}

	public void setComprimentoDuto(Double comprimentoDuto) {
		this.comprimentoDuto = comprimentoDuto;
	}

	public Double getAreaChapa() {
		return areaChapa;
	}

	public void setAreaChapa(Double areaChapa) {
		this.areaChapa = areaChapa;
	}

	public Double getPesoChapa() {
		return pesoChapa;
	}

	public void setPesoChapa(Double pesoChapa) {
		this.pesoChapa = pesoChapa;
	}

	public Date getDataCalculo() {
		return dataCalculo;
	}

	public void setDataCalculo(Date dataCalculo) {
		this.dataCalculo = dataCalculo;
	}

	public String getNomeDoAmbiente() {
		return nomeDoAmbiente;
	}

	public void setNomeDoAmbiente(String nomeDoAmbiente) {
		this.nomeDoAmbiente = nomeDoAmbiente;
	}

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

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
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
	

	public Double calcularPesoDeChapaDeDuto(Double alturaDuto, Double larguraDuto, Double comprimentoDuto) {
		
		this.areaChapa = ((alturaDuto * 2 + larguraDuto * 2) / 1000) * comprimentoDuto;
		
		if(alturaDuto > larguraDuto || alturaDuto.equals(larguraDuto)) {
			if(alturaDuto <= 300) {
				pesoChapa = areaChapa * 4.42;
				chapaSelecionada = "#26";
				
			}else if (alturaDuto > 300 && alturaDuto <= 750) {
				pesoChapa = areaChapa * 5.64;
				chapaSelecionada = "#24";
				
			}else if (alturaDuto > 750 && alturaDuto <= 1400) {
				pesoChapa = areaChapa * 6.86;
				chapaSelecionada = "#22";
				
			}else if (alturaDuto > 1400 && alturaDuto <= 2100) {
				pesoChapa = areaChapa * 8.08;
				chapaSelecionada = "#20";
				
			}else {
				pesoChapa = areaChapa * 10.52;
				chapaSelecionada = "#18";
				
			}
			
			
		} else {
			if(larguraDuto <= 300) {
				pesoChapa = areaChapa * 4.42;
				chapaSelecionada = "#26";
				
			}else if (larguraDuto > 300 && larguraDuto <= 750) {
				pesoChapa = areaChapa * 5.64;
				chapaSelecionada = "#24";
				
			}else if (larguraDuto > 750 && larguraDuto <= 1400) {
				pesoChapa = areaChapa * 6.86;
				chapaSelecionada = "#22";
				
			}else if (larguraDuto > 1400 && larguraDuto <= 2100) {
				pesoChapa = areaChapa * 8.08;
				chapaSelecionada = "#20";
				
			}else {
				pesoChapa = areaChapa * 10.52;
				chapaSelecionada = "#18";
				
			}
			
		}
		
		return pesoChapa;
	}
	
}
