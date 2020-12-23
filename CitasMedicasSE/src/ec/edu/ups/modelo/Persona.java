package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name = "cdiscriminatoria")
@Table(name="persona")
public abstract class Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String cedula;
	private String telefono;
	//COLUMNA DISCRIMINATORIA: un atributo que indica de que tipo va a ser el hijo (estos van a ser: D de doctor, C de cliente, O de colaborador)
	private char cdiscriminatoria;
	
	public Persona() {
		super();
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public char getCdiscriminatoria() {
		return cdiscriminatoria;
	}

	public void setCdiscriminatoria(char cdiscriminatoria) {
		this.cdiscriminatoria = cdiscriminatoria;
	}
   
	
	
}
