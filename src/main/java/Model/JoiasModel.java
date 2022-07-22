package Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity // JPA que vai assumir o BD
@Table(name = "tb_joias") // Nome da atabela
public class JoiasModel {

	@Id//gera a PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoencremente Sequencial
	private long id;

	//Tamanho maximo do campo, nao nulo
	@Column(length = 50,nullable = false)
	private String material;

	@Column(length = 10, nullable = false)
	private long peso;
}
