package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CitaMedica
 *
 */
@Entity
@Table(name="recetamedica")
public class RecetaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn
	private Consulta consulta;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "recetaMedica")
	private HistoriaMedica historiaMedica;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "recetaMedica")
	private List<PrescripcionMedica> listPrescripcionMedica = new ArrayList<PrescripcionMedica>();
	
	
	public RecetaMedica(int id, Consulta consulta) {
		super();
		this.setId(id);
		this.setConsulta(consulta);
	}
	
	public RecetaMedica() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Consulta getConsulta() {
		return consulta;
	}


	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}


	public HistoriaMedica getHistoriaMedica() {
		return historiaMedica;
	}


	public void setHistoriaMedica(HistoriaMedica historiaMedica) {
		this.historiaMedica = historiaMedica;
	}


	public List<PrescripcionMedica> getListPrescripcionMedica() {
		return listPrescripcionMedica;
	}


	public void setListPrescripcionMedica(List<PrescripcionMedica> listPrescripcionMedica) {
		this.listPrescripcionMedica = listPrescripcionMedica;
	}
   
	public void addPrescripcionMedica(PrescripcionMedica prescripcionMedica) {
		this.listPrescripcionMedica.add(prescripcionMedica);
	}
	
}
