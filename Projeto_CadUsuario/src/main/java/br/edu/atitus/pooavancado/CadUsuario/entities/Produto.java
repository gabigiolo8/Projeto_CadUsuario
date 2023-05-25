package br.edu.atitus.pooavancado.CadUsuario.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Produto extends GenericEntity{

	private static final long serialVersionUID = 1L;

	@Column(length = 150, nullable = true)
	private String nome;
	@Column(nullable = false)
	private float valorUnitario;
	
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static void alteraStatus(long id) {
		// TODO Auto-generated method stub
		
	}

	

}
