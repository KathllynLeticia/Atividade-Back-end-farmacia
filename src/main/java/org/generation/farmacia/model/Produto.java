package org.generation.farmacia.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;



@Entity
@Table(name= "tb_produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@UpdateTimestamp
	private LocalDateTime validade;
	
	@NotBlank(message = "O atributo nome é Obrigatório")
	@Size(min = 5, max = 100, message = "O atributo nome deve conter no minimo 05 e no máximo 500 caracteres")
	private String nome;
	
	@NumberFormat(style = Style.CURRENCY)
	private float valor;
	
	

}

