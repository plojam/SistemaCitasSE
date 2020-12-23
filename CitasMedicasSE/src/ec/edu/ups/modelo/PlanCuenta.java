package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PlanCuenta
 *
 */
@Entity
@Table(name="plancuenta")
public class PlanCuenta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "planCuenta")
	private List<Cuenta> listCuenta = new ArrayList<Cuenta>();
	
	
	public PlanCuenta(int id) {
		super();
		this.setId(id);
	}
	
	public PlanCuenta() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Cuenta> getListCuenta() {
		return listCuenta;
	}


	public void setListCuenta(List<Cuenta> listCuenta) {
		this.listCuenta = listCuenta;
	}
   
	public void addCuenca(Cuenta cuenta) {
		this.listCuenta.add(cuenta);
	}
	
}
