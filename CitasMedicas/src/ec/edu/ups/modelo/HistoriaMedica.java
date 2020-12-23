package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: HistoriaMedica
 *
 */
@Entity
@Table(name="historiamedica")
public class HistoriaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn
	private Cliente cliente;
	@OneToOne
	@JoinColumn
	private OrdenMedica ordenMedica;
	@OneToOne
	@JoinColumn
	private RecetaMedica recetaMedica;
	
	public HistoriaMedica(int id, OrdenMedica ordenMedica, RecetaMedica recetaMedica) {
		super();
		this.setId(id);
		this.setOrdenMedica(ordenMedica);
		this.setRecetaMedica(recetaMedica);
	}
	
	public HistoriaMedica() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrdenMedica getOrdenMedica() {
		return ordenMedica;
	}

	public void setOrdenMedica(OrdenMedica ordenMedica) {
		this.ordenMedica = ordenMedica;
	}

	public RecetaMedica getRecetaMedica() {
		return recetaMedica;
	}

	public void setRecetaMedica(RecetaMedica recetaMedica) {
		this.recetaMedica = recetaMedica;
	}
   
	
	
}
