package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Consulta
 *
 */
@Entity
@Table(name="consulta")
public class Consulta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String diagnostico;
	@OneToOne
	@JoinColumn
	private Cita cita;
	@ManyToOne
	@JoinColumn
	private Doctor doctor;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "consulta")
	private CertificadoMedico certificadoMedico;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "consulta")
	private RecetaMedica recetaMedica;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "consulta")
	private OrdenMedica ordenMedica;
	
	
	public Consulta(int id, String diagnostico, Cita cita, Doctor doctor) {
		super();
		this.setId(id);
		this.setDiagnostico(diagnostico);
		this.setDoctor(doctor);
	}
	
	public Consulta() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public Cita getCita() {
		return cita;
	}


	public void setCita(Cita cita) {
		this.cita = cita;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public CertificadoMedico getCertificadoMedico() {
		return certificadoMedico;
	}


	public void setCertificadoMedico(CertificadoMedico certificadoMedico) {
		this.certificadoMedico = certificadoMedico;
	}


	public RecetaMedica getRecetaMedica() {
		return recetaMedica;
	}


	public void setRecetaMedica(RecetaMedica recetaMedica) {
		this.recetaMedica = recetaMedica;
	}


	public OrdenMedica getOrdenMedica() {
		return ordenMedica;
	}


	public void setOrdenMedica(OrdenMedica ordenMedica) {
		this.ordenMedica = ordenMedica;
	}
	
	
   
}
