package ec.edu.ups.controlador;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ec.edu.ups.modelo.Especialidad;

public class GenerarTablas {

	public static void main(String[] args) {
		
		Class<Especialidad> persistentClass= Especialidad.class;
		EntityManager em = Persistence.createEntityManagerFactory("CitasMedicas").createEntityManager();
		
		Especialidad esp = new Especialidad(0, "doctorpro", "simon");
		
		em.getTransaction().begin();
		try {
			em.persist(esp);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("ERROR: JPAGenericDAO:create " + e);
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
	}

}
