package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cuenta
 *
 */
@Entity
@Table(name="cuenta")
public class Cuenta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private float cantidad;
	@ManyToOne
	@JoinColumn
	private PlanCuenta planCuenta;
	@ManyToOne
	@JoinColumn
	private Tipo tipo;
	
	
	public Cuenta(int id, String nombre, PlanCuenta planCuenta, Tipo tipo) {
		super();
		this.setId(id);
		this.setNombre(nombre);
		this.setPlanCuenta(planCuenta);
		this.setTipo(tipo);
	}
	
	public Cuenta() {
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


	public float getCantidad() {
		return cantidad;
	}


	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}


	public PlanCuenta getPlanCuenta() {
		return planCuenta;
	}


	public void setPlanCuenta(PlanCuenta planCuenta) {
		this.planCuenta = planCuenta;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	
   
}
