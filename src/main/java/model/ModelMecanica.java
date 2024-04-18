package model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "modelmecanica")
//implementar o serializable
public class ModelMecanica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	// com equals e hashcode
	// criar construtor vazio

	@JoinColumn(name = "usuario_id") // Nome da coluna que será a chave estrangeira
	private Long usuario_id; // Objeto ModelLogin que representa o usuário associado a esta ModelMecanica

	private Double areaDoAmbiente;
	private Integer numeroDePessoas;
	private Double btuh;
	private String quantidadeDeSol;
	private Integer numeroDeEquipamentos;

	private Double alturaDuto;
	private Double larguraDuto;
	private Double comprimentoDuto;
	private Double areaChapa;
	private Double pesoChapa;
	private String chapaSelecionada;

	private Double vazaoH;
	private Double velocidade;
	private Double vazaoS;
	private Double area;
	private Double areaRes;
	private Double ladoA;
	private Double ladoB;
	private Double velocRes;

	public ModelMecanica() {
		// TODO Auto-generated constructor stub
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
		ModelMecanica other = (ModelMecanica) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Double getVazaoH() {
		return vazaoH;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public Double getVazaoS() {
		return vazaoS;
	}

	public Double getArea() {
		return area;
	}

	public Double getLadoA() {
		return ladoA;
	}

	public Double getLadoB() {
		return ladoB;
	}

	public Double getVelocRes() {
		return velocRes;
	}

	public void setVazaoH(Double vazaoH) {
		this.vazaoH = vazaoH;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}

	public void setVazaoS(Double vazaoS) {
		this.vazaoS = vazaoS;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}

	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}

	public void setVelocRes(Double velocRes) {
		this.velocRes = velocRes;
	}

	public Double getAreaRes() {
		return areaRes;
	}

	public void setAreaRes(Double areaRes) {
		this.areaRes = areaRes;

	}

	public Long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
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

		if (alturaDuto > larguraDuto || alturaDuto.equals(larguraDuto)) {
			if (alturaDuto <= 300) {
				pesoChapa = areaChapa * 4.42;
				chapaSelecionada = "#26";

			} else if (alturaDuto > 300 && alturaDuto <= 750) {
				pesoChapa = areaChapa * 5.64;
				chapaSelecionada = "#24";

			} else if (alturaDuto > 750 && alturaDuto <= 1400) {
				pesoChapa = areaChapa * 6.86;
				chapaSelecionada = "#22";

			} else if (alturaDuto > 1400 && alturaDuto <= 2100) {
				pesoChapa = areaChapa * 8.08;
				chapaSelecionada = "#20";

			} else {
				pesoChapa = areaChapa * 10.52;
				chapaSelecionada = "#18";

			}

		} else {
			if (larguraDuto <= 300) {
				pesoChapa = areaChapa * 4.42;
				chapaSelecionada = "#26";

			} else if (larguraDuto > 300 && larguraDuto <= 750) {
				pesoChapa = areaChapa * 5.64;
				chapaSelecionada = "#24";

			} else if (larguraDuto > 750 && larguraDuto <= 1400) {
				pesoChapa = areaChapa * 6.86;
				chapaSelecionada = "#22";

			} else if (larguraDuto > 1400 && larguraDuto <= 2100) {
				pesoChapa = areaChapa * 8.08;
				chapaSelecionada = "#20";

			} else {
				pesoChapa = areaChapa * 10.52;
				chapaSelecionada = "#18";

			}

		}

		return pesoChapa;
	}

	public Double calcularDutoVazaoS(Double vazaoH) {
		return vazaoS = vazaoH / 3600;

	}

	public Double calcularDutoArea(Double velocidade) {
		return area = vazaoS / velocidade;
	}

	public Double calcularDutoAreaRes(Double ladoA, Double ladoB) {
		return areaRes = (ladoA / 1000) * (ladoB / 1000);

	}

	public Double calcularDutoVelocRes(Double vazaoS, Double ladoA, Double ladoB) {
		return velocRes = vazaoS / ((ladoA / 1000) * (ladoB / 1000));

	}

}
