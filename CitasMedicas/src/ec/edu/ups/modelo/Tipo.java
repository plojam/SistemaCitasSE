package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tipo
 *
 */
@Entity
@Table(name="tipo")
public class Tipo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipo")
	private List<Cuenta> listCuenta = new ArrayList<Cuenta>();
	
	public Tipo(int id, String nombre) {
		super();
		this.setId(id);
		this.setNombre(nombre);
	}
	
	public Tipo() {
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

	public List<Cuenta> getListCuenta() {
		return listCuenta;
	}

	public void setListCuenta(List<Cuenta> listCuenta) {
		this.listCuenta = listCuenta;
	}
   
	public void addCuenta(Cuenta cuenta) {
		this.listCuenta.add(cuenta);
	}
	
	
}
