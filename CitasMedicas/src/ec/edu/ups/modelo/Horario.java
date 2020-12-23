package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Horario
 *
 */
@Entity
@Table(name="horario")
public class Horario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dia;
	private int horaIngreso;
	private int horaSalida;
	@ManyToOne
	@JoinColumn
	private Doctor doctor;
	
	public Horario(int id, String dia, int horaIngreso, int horaSalida, Doctor doctor) {
		super();
		this.setId(id);
		this.setDia(dia);
		this.setHoraIngreso(horaIngreso);
		this.setHoraSalida(horaSalida);
		this.setDoctor(doctor);
	}
	
	public Horario() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(int horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
   
}
