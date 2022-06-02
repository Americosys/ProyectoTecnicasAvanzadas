package com.umet.institutoweb;

import javax.persistence.EntityManager;
// import javax.persistence.EntityManagerFactory;
// import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.umet.institutoweb.util.EntityManagerUtil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstitutoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstitutoWebApplication.class, args);

		//EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-db");
        //EntityManager entityManager = emFactory.createEntityManager();
		EntityManager entityManager = EntityManagerUtil.getEntityManager();        

		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("spGetRoles");

		//query.registerStoredProcedureParameter( 1, String.class, ParameterMode.IN );
		//query.registerStoredProcedureParameter( 2, String.class, ParameterMode.IN );
	    //query.registerStoredProcedureParameter( 1, Integer.class, ParameterMode.OUT );
	    //query.registerStoredProcedureParameter( 2, String.class, ParameterMode.OUT );
	    //query.setParameter( 1, "");
	    //query.setParameter( 2, "");
       
	    query.execute();
		// List<Object[]> listaRoles = query.getResultList();
		
		// for (int i = 0; i < listaRoles.size(); i++)
		// {
		// 	//int idRol = (listaRoles.get(0))[0];
		// 	//String nombreRol = listaRoles.get(0)[1];

		// }
	}

}
