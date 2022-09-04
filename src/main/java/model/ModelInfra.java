package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Serializable;

public class ModelInfra implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double aco15mm;
	private Double aco20mm;
	private Double aco25mm;
	private Double aco32mm;
	private Double aco40mm;
	private Double aco50mm;
	private Double aco65mm;
	private Double aco80mm;
	private Double aco100mm;

	private Double pvc20mm;
	private Double pvc25mm;
	private Double pvc32mm;
	private Double pvc40mm;
	private Double pvc50mm;
	private Double pvc60mm;
	private Double pvc75mm;
	private Double pvc85mm;
	private Double pvc100mm;

	private Double eletrocalha50_50;
	private Double eletrocalha100_50;
	private Double eletrocalha100_100;
	private Double eletrocalha150_50;
	private Double eletrocalha150_100;
	private Double eletrocalha200_50;
	private Double eletrocalha200_100;
	private Double eletrocalha300_100;
	private Double eletrocalha400_100;
	private Double eletrocalha500_100;
	private String eletrocalhaLarg;
	private String eletrocalhaAlt;
	private Double eletrocalhaAreaCustom;
	private Double eletrocalhaOcupMax;
	private Double eletrocalhaOcupPercent;

	private Double perf38_38;
	private Double perf200_70;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Double getAco15mm() {
		return aco15mm;
	}

	public Double getAco20mm() {
		return aco20mm;
	}

	public Double getAco25mm() {
		return aco25mm;
	}

	public Double getAco32mm() {
		return aco32mm;
	}

	public Double getAco40mm() {
		return aco40mm;
	}

	public Double getAco50mm() {
		return aco50mm;
	}

	public Double getAco65mm() {
		return aco65mm;
	}

	public Double getAco80mm() {
		return aco80mm;
	}

	public Double getAco100mm() {
		return aco100mm;
	}

	public Double getPvc20mm() {
		return pvc20mm;
	}

	public Double getPvc25mm() {
		return pvc25mm;
	}

	public Double getPvc32mm() {
		return pvc32mm;
	}

	public Double getPvc40mm() {
		return pvc40mm;
	}

	public Double getPvc50mm() {
		return pvc50mm;
	}

	public Double getPvc60mm() {
		return pvc60mm;
	}

	public Double getPvc75mm() {
		return pvc75mm;
	}

	public Double getPvc85mm() {
		return pvc85mm;
	}

	public Double getPvc100mm() {
		return pvc100mm;
	}

	public Double getEletrocalha50_50() {
		return eletrocalha50_50;
	}

	public Double getEletrocalha100_50() {
		return eletrocalha100_50;
	}

	public Double getEletrocalha100_100() {
		return eletrocalha100_100;
	}

	public Double getEletrocalha150_50() {
		return eletrocalha150_50;
	}

	public Double getEletrocalha150_100() {
		return eletrocalha150_100;
	}

	public Double getEletrocalha200_50() {
		return eletrocalha200_50;
	}

	public Double getEletrocalha200_100() {
		return eletrocalha200_100;
	}

	public Double getEletrocalha300_100() {
		return eletrocalha300_100;
	}

	public Double getEletrocalha400_100() {
		return eletrocalha400_100;
	}

	public Double getEletrocalha500_100() {
		return eletrocalha500_100;
	}

	public String getEletrocalhaLarg() {
		return eletrocalhaLarg;
	}

	public String getEletrocalhaAlt() {
		return eletrocalhaAlt;
	}

	public Double getEletrocalhaAreaCustom() {
		return eletrocalhaAreaCustom;
	}

	public Double getEletrocalhaOcupMax() {
		return eletrocalhaOcupMax;
	}

	public Double getEletrocalhaOcupPercent() {
		return eletrocalhaOcupPercent;
	}

	public Double getPerf38_38() {
		return perf38_38;
	}

	public Double getPerf200_70() {
		return perf200_70;
	}

	public void setAco15mm(Double aco15mm) {
		this.aco15mm = aco15mm;
	}

	public void setAco20mm(Double aco20mm) {
		this.aco20mm = aco20mm;
	}

	public void setAco25mm(Double aco25mm) {
		this.aco25mm = aco25mm;
	}

	public void setAco32mm(Double aco32mm) {
		this.aco32mm = aco32mm;
	}

	public void setAco40mm(Double aco40mm) {
		this.aco40mm = aco40mm;
	}

	public void setAco50mm(Double aco50mm) {
		this.aco50mm = aco50mm;
	}

	public void setAco65mm(Double aco65mm) {
		this.aco65mm = aco65mm;
	}

	public void setAco80mm(Double aco80mm) {
		this.aco80mm = aco80mm;
	}

	public void setAco100mm(Double aco100mm) {
		this.aco100mm = aco100mm;
	}

	public void setPvc20mm(Double pvc20mm) {
		this.pvc20mm = pvc20mm;
	}

	public void setPvc25mm(Double pvc25mm) {
		this.pvc25mm = pvc25mm;
	}

	public void setPvc32mm(Double pvc32mm) {
		this.pvc32mm = pvc32mm;
	}

	public void setPvc40mm(Double pvc40mm) {
		this.pvc40mm = pvc40mm;
	}

	public void setPvc50mm(Double pvc50mm) {
		this.pvc50mm = pvc50mm;
	}

	public void setPvc60mm(Double pvc60mm) {
		this.pvc60mm = pvc60mm;
	}

	public void setPvc75mm(Double pvc75mm) {
		this.pvc75mm = pvc75mm;
	}

	public void setPvc85mm(Double pvc85mm) {
		this.pvc85mm = pvc85mm;
	}

	public void setPvc100mm(Double pvc100mm) {
		this.pvc100mm = pvc100mm;
	}

	public void setEletrocalha50_50(Double eletrocalha50_50) {
		this.eletrocalha50_50 = eletrocalha50_50;
	}

	public void setEletrocalha100_50(Double eletrocalha100_50) {
		this.eletrocalha100_50 = eletrocalha100_50;
	}

	public void setEletrocalha100_100(Double eletrocalha100_100) {
		this.eletrocalha100_100 = eletrocalha100_100;
	}

	public void setEletrocalha150_50(Double eletrocalha150_50) {
		this.eletrocalha150_50 = eletrocalha150_50;
	}

	public void setEletrocalha150_100(Double eletrocalha150_100) {
		this.eletrocalha150_100 = eletrocalha150_100;
	}

	public void setEletrocalha200_50(Double eletrocalha200_50) {
		this.eletrocalha200_50 = eletrocalha200_50;
	}

	public void setEletrocalha200_100(Double eletrocalha200_100) {
		this.eletrocalha200_100 = eletrocalha200_100;
	}

	public void setEletrocalha300_100(Double eletrocalha300_100) {
		this.eletrocalha300_100 = eletrocalha300_100;
	}

	public void setEletrocalha400_100(Double eletrocalha400_100) {
		this.eletrocalha400_100 = eletrocalha400_100;
	}

	public void setEletrocalha500_100(Double eletrocalha500_100) {
		this.eletrocalha500_100 = eletrocalha500_100;
	}

	public void setEletrocalhaLarg(String eletrocalhaLarg2) {
		this.eletrocalhaLarg = eletrocalhaLarg2;
	}

	public void setEletrocalhaAlt(String eletrocalhaAlt2) {
		this.eletrocalhaAlt = eletrocalhaAlt2;
	}

	public void setEletrocalhaAreaCustom(Double eletrocalhaAreaCustom) {
		this.eletrocalhaAreaCustom = eletrocalhaAreaCustom;
	}

	public void setEletrocalhaOcupMax(Double eletrocalhaOcupMax) {
		this.eletrocalhaOcupMax = eletrocalhaOcupMax;
	}

	public void setEletrocalhaOcupPercent(Double eletrocalhaOcupPercent) {
		this.eletrocalhaOcupPercent = eletrocalhaOcupPercent;
	}

	public void setPerf38_38(Double perf38_38) {
		this.perf38_38 = perf38_38;
	}

	public void setPerf200_70(Double perf200_70) {
		this.perf200_70 = perf200_70;
	}
	
	@Override
	public String toString() {
		return "ModelInfra [aco15mm=" + aco15mm + ", aco20mm=" + aco20mm + ", aco25mm=" + aco25mm + ", aco32mm="
				+ aco32mm + ", aco40mm=" + aco40mm + ", aco50mm=" + aco50mm + ", aco65mm=" + aco65mm + ", aco80mm="
				+ aco80mm + ", aco100mm=" + aco100mm + ", pvc20mm=" + pvc20mm + ", pvc25mm=" + pvc25mm + ", pvc32mm="
				+ pvc32mm + ", pvc40mm=" + pvc40mm + ", pvc50mm=" + pvc50mm + ", pvc60mm=" + pvc60mm + ", pvc75mm="
				+ pvc75mm + ", pvc85mm=" + pvc85mm + ", pvc100mm=" + pvc100mm + ", eletrocalha50_50=" + eletrocalha50_50
				+ ", eletrocalha100_50=" + eletrocalha100_50 + ", eletrocalha100_100=" + eletrocalha100_100
				+ ", eletrocalha150_50=" + eletrocalha150_50 + ", eletrocalha150_100=" + eletrocalha150_100
				+ ", eletrocalha200_50=" + eletrocalha200_50 + ", eletrocalha200_100=" + eletrocalha200_100
				+ ", eletrocalha300_100=" + eletrocalha300_100 + ", eletrocalha400_100=" + eletrocalha400_100
				+ ", eletrocalha500_100=" + eletrocalha500_100 + ", eletrocalhaLarg=" + eletrocalhaLarg
				+ ", eletrocalhaAlt=" + eletrocalhaAlt + ", eletrocalhaAreaCustom=" + eletrocalhaAreaCustom
				+ ", eletrocalhaOcupMax=" + eletrocalhaOcupMax + ", eletrocalhaOcupPercent=" + eletrocalhaOcupPercent
				+ ", perf38_38=" + perf38_38 + ", perf200_70=" + perf200_70 + "]";
	}
	
	public Double CalcAco15mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return aco15mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(7.5,2)));
	}

	public Double CalcAco20mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return aco20mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ (Math.PI * Math.pow(10,2)));
	}

	public Double CalcAco25mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return aco25mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(12.5,2)));
	}

	public Double CalcAco32mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return aco32mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(16,2)));
	}

	public Double CalcAco40mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return aco40mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(20,2)));
	}

	public Double CalcAco50mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return aco50mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(25,2)));
	}

	public Double CalcAco65mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return aco65mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ (Math.PI * Math.pow(32.5,2)));
	}

	public Double CalcAco80mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return aco80mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(40,2)));
	}

	public Double CalcAco100mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return aco100mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(50,2)));
	}

	public Double CalcPvc20mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return pvc20mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(10,2)));
	}
	
	public Double CalcPvc25mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return pvc25mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ (Math.PI * Math.pow(12.5,2)));
	}
	
	public Double CalcPvc32mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return pvc32mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(16,2)));
	}
	
	public Double CalcPvc40mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return pvc40mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ (Math.PI * Math.pow(20,2)));
	}
	
	public Double CalcPvc50mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return pvc50mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(25,2)));
	}
	
	public Double CalcPvc60mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return pvc60mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(30,2)));
	}
	
	public Double CalcPvc75mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return pvc75mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ (Math.PI * Math.pow(37.5,2)));
	}
	
	public Double CalcPvc85mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return pvc85mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ (Math.PI * Math.pow(42.5,2)));
	}
	
	public Double CalcPvc100mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return pvc100mm = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ (Math.PI * Math.pow(50,2)));
	}
	
	public Double CalcPerf38_38mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return perf38_38 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ 1444);
	}
	
	public Double CalcPerf200_70mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return perf200_70 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ 14000);
	}
	
	public Double CalcEletrocalha50_50mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha50_50 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ 2500);
	}

	public Double CalcEletrocalha100_50mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha100_50 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ 5000);
	}
	
	public Double CalcEletrocalha100_100mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha100_100 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ 10000);
	}
	
	public Double CalcEletrocalha150_50mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha150_50 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ 7500);
	}

	public Double CalcEletrocalha150_100mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha150_100 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46)) 
				
				/ 15000);
	}
	
	public Double CalcEletrocalha200_50mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha200_50 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ 10000);
	}
	
	public Double CalcEletrocalha200_100mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha200_100 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ 20000);
	}
	
	public Double CalcEletrocalha300_100mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha300_100 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ 30000);
	}
	
	public Double CalcEletrocalha400_100mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha400_100 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ 40000);
	}
	
	public Double CalcEletrocalha500_100mm(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72) {

		return eletrocalha500_100 = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ 50000);
	}
	
	public Double CalcEletrocalhaCustomArea(String eletrocalhaLarg, String eletrocalhaAlt) {
		
		return eletrocalhaAreaCustom = 
				
				(eletrocalhaLarg == null || eletrocalhaLarg.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eletrocalhaLarg))	*	
				
				(eletrocalhaAlt == null || eletrocalhaAlt.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eletrocalhaAlt));
	}
	
	public Double CalcEletrocalhaOcupMax(String eletrocalhaLarg, String eletrocalhaAlt) {

		return eletrocalhaOcupMax =

				((eletrocalhaLarg == null || eletrocalhaLarg.isEmpty() ? Double.parseDouble("0")
						: Double.parseDouble(eletrocalhaLarg)) *

						(eletrocalhaAlt == null || eletrocalhaAlt.isEmpty() ? Double.parseDouble("0")
								: Double.parseDouble(eletrocalhaAlt))) * 0.4;

	}
	
	public Double CalcEletrocalhaCustom(

			String pirastic_15, String pirastic_25, String pirastic_40, String pirastic_60, String pirastic_100,
			String pirastic_160, String pirastic_250, String pirastic_350, String pirastic_500, String pirastic_700,
			String pirastic_950, String pirastic_1200, String pirastic_1500, String pirastic_1850, String pirastic_2400,

			String sintenax_15, String sintenax_25, String sintenax_40, String sintenax_60, String sintenax_100,
			String sintenax_160, String sintenax_250, String sintenax_350, String sintenax_500, String sintenax_700,
			String sintenax_950, String sintenax_1200, String sintenax_1500, String sintenax_1850, String sintenax_2400,

			String eprotenax_15, String eprotenax_25, String eprotenax_40, String eprotenax_60, String eprotenax_100,
			String eprotenax_160, String eprotenax_250, String eprotenax_350, String eprotenax_500,
			String eprotenax_700, String eprotenax_950, String eprotenax_1200, String eprotenax_1500,
			String eprotenax_1850, String eprotenax_2400, String rg11, String rg59,

			String cat5, String cat5e, String cat6, String cat6a, String cat7,

			String fibras2, String fibras4, String fibras6, String fibras8, String fibras10, String fibras12,
			String fibras16, String fibras24, String fibras36, String fibras48, String fibras72,
			
			String eletrocalhaLarg, String eletrocalhaAlt) {

		return eletrocalhaOcupPercent = 100 * ( ((pirastic_15 == null || pirastic_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_15) * 6.61) 
						+ (pirastic_25 == null || pirastic_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_25) * 9.62)
						+ (pirastic_40 == null || pirastic_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_40) * 12.57) 
						+ (pirastic_60 == null || pirastic_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_60) * 16.62)
						+ (pirastic_100 == null || pirastic_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_100) * 27.34) 
						+ (pirastic_160 == null || pirastic_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_160) * 44.18)
						+ (pirastic_250 == null || pirastic_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_250) * 58.09) 
						+ (pirastic_350 == null || pirastic_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_350) * 88.25)
						+ (pirastic_500 == null || pirastic_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_500) * 113.10) 
						+ (pirastic_700 == null || pirastic_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_700) * 147.41)
						+ (pirastic_950 == null || pirastic_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_950) * 196.07) 
						+ (pirastic_1200 == null || pirastic_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1200) * 235.06)
						+ (pirastic_1500 == null || pirastic_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1500) * 301.72) 
						+ (pirastic_1850 == null || pirastic_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_1850) * 363.05)
						+ (pirastic_2400 == null || pirastic_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(pirastic_2400) * 467.59) 
						

						+ (sintenax_15 == null || sintenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_15) * 19.63) 
						+ (sintenax_25 == null || sintenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_25) * 22.90)
						+ (sintenax_40 == null || sintenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_40) * 33.18) 
						+ (sintenax_60 == null || sintenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_60) * 39.59)
						+ (sintenax_100 == null || sintenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_100) * 50.27) 
						+ (sintenax_160 == null || sintenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_160) * 72.38)
						+ (sintenax_250 == null || sintenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_250) * 95.03)
						+ (sintenax_350 == null || sintenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_350) * 134.78)
						+ (sintenax_500 == null || sintenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_500) * 169.72) 
						+ (sintenax_700 == null || sintenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_700) * 211.24)
						+ (sintenax_950 == null || sintenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_950) * 274.65)
						+ (sintenax_1200 == null || sintenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1200) * 349.67)
						+ (sintenax_1500 == null || sintenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1500) * 404.71) 
						+ (sintenax_1850 == null || sintenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_1850) * 483.05)
						+ (sintenax_2400 == null || sintenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(sintenax_2400) * 665.08) 

						+ (eprotenax_15 == null || eprotenax_15.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_15) * 19.63) 
						+ (eprotenax_25 == null || eprotenax_25.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_25) * 22.90)
						+ (eprotenax_40 == null || eprotenax_40.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_40) * 33.18) 
						+ (eprotenax_60 == null || eprotenax_60.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_60) * 39.59)
						+ (eprotenax_100 == null || eprotenax_100.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_100) * 50.27) 
						+ (eprotenax_160 == null || eprotenax_160.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_160) * 72.38)
						+ (eprotenax_250 == null || eprotenax_250.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_250) * 102.07) 
						+ (eprotenax_350 == null || eprotenax_350.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_350) * 134.78)
						+ (eprotenax_500 == null || eprotenax_500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_500) * 169.72) 
						+ (eprotenax_700 == null || eprotenax_700.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_700) * 221.67)
						+ (eprotenax_950 == null || eprotenax_950.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_950) * 289.53) 
						+ (eprotenax_1200 == null || eprotenax_1200.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1200) * 356.33)
						+ (eprotenax_1500 == null || eprotenax_1500.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1500) * 441.15) 
						+ (eprotenax_1850 == null || eprotenax_1850.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_1850) * 522.79)
						+ (eprotenax_2400 == null || eprotenax_2400.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(eprotenax_2400) * 669.66) 

						+ (fibras2 == null || fibras2.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras2) * 18.1)
						+ (fibras4 == null || fibras4.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras4) * 21.24) 
						+ (fibras6 == null || fibras6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras6) * 22.9)
						+ (fibras8 == null || fibras8.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras8) * 28.27) 
						+ (fibras10 == null || fibras10.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras10) * 32.17)
						+ (fibras12 == null || fibras12.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras12) * 34.21) 
						+ (fibras16 == null || fibras16.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras16) * 176.71)
						+ (fibras24 == null || fibras24.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras24) * 201.06) 
						+ (fibras36 == null || fibras36.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras36) * 254.47)
						+ (fibras48 == null || fibras48.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras48) * 271.72) 
						+ (fibras72 == null || fibras72.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(fibras72) * 366.44)

						+ (cat5 == null || cat5.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5) * 18.86) 
						+ (cat5e == null || cat5e.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat5e) * 22.90)
						+ (cat6 == null || cat6.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6) * 28.27) 
						+ (cat6a == null || cat6a.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat6a) * 58.09)
						+ (cat7 == null || cat7.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(cat7) * 56.75) 

						+ (rg11 == null || rg11.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg11) * 81.07)
						+ (rg59 == null || rg59.isEmpty() ? Double.parseDouble("0") : Double.parseDouble(rg59) * 28.46))  
				
				/ CalcEletrocalhaCustomArea(eletrocalhaLarg, eletrocalhaAlt));
	}
}
