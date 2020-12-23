package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CertificadoMedico
 *
 */
@Entity
@Table(name="certificadomedico")
public class CertificadoMedico implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descripcion;
	@OneToOne
	@JoinColumn
	private Consulta consulta;
	
	public CertificadoMedico(int id, String descripcion, Consulta consulta) {
		super();
		this.setId(id);
		this.setDescripcion(descripcion);
		this.setConsulta(consulta);
	}
	
	public CertificadoMedico() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
   
	
	
}
