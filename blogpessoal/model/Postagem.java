package org.generation.blogpessoal.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

@Entity // transforma em tabela 
@Table(name="tb_postagens") // nomeia a tabela
public class Postagem {

	@Id // informa que é um ID chave primária
	@GeneratedValue(strategy= GenerationType.IDENTITY) // auto increment
	private Long id; // "Long" sempre com "L" inicia-lo com letra maiuscula
	
	
	@NotNull //
	private String titulo;
	
	@Size(min=4, max=50) // Como colocar o texto use "size"
	private String texto;
	
	@UpdateTimestamp // Coloca horário e data da postagem
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

}