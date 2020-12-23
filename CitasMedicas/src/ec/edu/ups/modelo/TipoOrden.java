package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TipoOrden
 *
 */
@Entity
@Table(name="tipoorden")
public class TipoOrden implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoOrden")
	private List<OrdenMedica> listOrdenMedica = new ArrayList<OrdenMedica>();
	
	
	public TipoOrden() {
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

	public List<OrdenMedica> getListOrdenMedica() {
		return listOrdenMedica;
	}

	public void setListOrdenMedica(List<OrdenMedica> listOrdenMedica) {
		this.listOrdenMedica = listOrdenMedica;
	}
	
	public void addOrdenMedica(OrdenMedica ordenMedica) {
		this.listOrdenMedica.add(ordenMedica);
	}
   
}
