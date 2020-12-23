package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Colaborador
 *
 */
@Entity
@DiscriminatorValue("O")
@Table(name="colaborador")
public class Colaborador extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String contrasena;
	@ManyToOne
	@JoinColumn
	private TipoConlaborador tipoColaborador;
	
	public Colaborador(int id, String nombre, String apellido, Date fechaNacimiento, String cedula, String telefono, char cdiscriminatoria,
			String usuario, String contrasena, TipoConlaborador tipoColaborador) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setFechaNacimiento(fechaNacimiento);
		this.setCedula(cedula);
		this.setTelefono(telefono);
		this.setCdiscriminatoria(cdiscriminatoria);
		this.setUsuario(usuario);
		this.setContrasena(contrasena);
		this.setTipoColaborador(tipoColaborador);
	}
	
	public Colaborador() {
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public TipoConlaborador getTipoColaborador() {
		return tipoColaborador;
	}


	public void setTipoColaborador(TipoConlaborador tipoColaborador) {
		this.tipoColaborador = tipoColaborador;
	}
	
	
   
}
