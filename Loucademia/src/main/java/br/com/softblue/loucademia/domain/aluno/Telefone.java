package br.com.softblue.loucademia.domain.aluno;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Telefone implements Serializable{
	
	@Column(name = "CELULAR_DDD", nullable  = false, length = 2)
	private Integer dddCelular;
	
	@Column(name = "CELULAR_NUMERO", nullable  = true, length = 9)
	private Integer numeroCelular;
	
	@Column(name = "FIXO_DDD", nullable  = true, length = 2)
	private Integer dddFixo;
	
	@Column(name = "FIXO_NUMERO", nullable  = true, length = 9)
	private Integer numeroFixo;

	public Integer getDddCelular() {
		return dddCelular;
	}

	public void setDddCelular(Integer dddCelular) {
		this.dddCelular = dddCelular;
	}

	public Integer getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(Integer numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public Integer getDddFixo() {
		return dddFixo;
	}

	public void setDddFixo(Integer dddFixo) {
		this.dddFixo = dddFixo;
	}

	public Integer getNumeroFixo() {
		return numeroFixo;
	}

	public void setNumeroFixo(Integer numeroFixo) {
		this.numeroFixo = numeroFixo;
	}

	@Override
	public String toString() {
		return "Telefone [dddCelular=" + dddCelular + ", numeroCelular=" + numeroCelular + ", dddFixo=" + dddFixo
				+ ", numeroFixo=" + numeroFixo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dddCelular, dddFixo, numeroCelular, numeroFixo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(dddCelular, other.dddCelular) && Objects.equals(dddFixo, other.dddFixo)
				&& Objects.equals(numeroCelular, other.numeroCelular) && Objects.equals(numeroFixo, other.numeroFixo);
	}
	
	
	

}
