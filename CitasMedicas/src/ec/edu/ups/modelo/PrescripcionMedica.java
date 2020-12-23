package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PrescripcionMedica
 *
 */
@Entity
@Table(name="prescripcionmedica")
public class PrescripcionMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String intervalo;
	@ManyToOne
	@JoinColumn
	private RecetaMedica recetaMedica;
	@OneToOne
	@JoinColumn
	private Medicamento medicamento;
	
	public PrescripcionMedica(int id, String intervalo, RecetaMedica recetaMedica, Medicamento medicamento) {
		super();
		this.setId(id);
		this.setIntervalo(intervalo);
		this.setRecetaMedica(recetaMedica);
		this.setMedicamento(medicamento);
	}
	
	public PrescripcionMedica() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(String intervalo) {
		this.intervalo = intervalo;
	}

	public RecetaMedica getRecetaMedica() {
		return recetaMedica;
	}

	public void setRecetaMedica(RecetaMedica recetaMedica) {
		this.recetaMedica = recetaMedica;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	
   
}
