package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medicamento
 *
 */
@Entity
@Table(name="medicamento")
public class Medicamento implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String viaAdministracion;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "medicamento")
	private List<PrescripcionMedica> listPrescripcionMedica = new ArrayList<PrescripcionMedica>();
	
	public Medicamento(int id, String nombre, String viaAdministracion) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setViaAdministracion(viaAdministracion);
	}
	
	public Medicamento() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getViaAdministracion() {
		return viaAdministracion;
	}

	public void setViaAdministracion(String viaAdministracion) {
		this.viaAdministracion = viaAdministracion;
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
