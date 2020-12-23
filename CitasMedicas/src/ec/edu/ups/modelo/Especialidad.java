package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Especialidad
 *
 */
@Entity
@Table(name="especialidad")
public class Especialidad implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String Registro;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "especialidad")
	private List<Doctor> doctores = new ArrayList<Doctor>();
	
	public Especialidad(int id, String nombre, String registro) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setRegistro(registro);
	}
	
	public Especialidad() {
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

	public String getRegistro() {
		return Registro;
	}

	public void setRegistro(String registro) {
		Registro = registro;
	}

	public List<Doctor> getDoctores() {
		return doctores;
	}

	public void setDoctores(List<Doctor> doctores) {
		this.doctores = doctores;
	}
   
	public void addDoctor(Doctor doctor) {
		this.doctores.add(doctor);
	}
	
}
