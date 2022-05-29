package com.umet.institutoweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
// import javax.persistence.EntityManagerFactory;
// import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.umet.institutoweb.beans.Rol;
import com.umet.institutoweb.util.EntityManagerUtil;

import org.springframework.stereotype.Repository;


@Repository("UsuarioDao")
public class UsuarioDao {
    
    public List<Rol> getListaRoles()
    {
        // esto hay que armar una clase
        //EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-db");
        //EntityManager entityManager = emFactory.createEntityManager();
        EntityManager entityManager = EntityManagerUtil.getEntityManager();        

		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("spGetRoles");
       
	    query.execute();
		// List<Object[]> listaRoles = query.getResultList();
		
		// for (int i = 0; i < listaRoles.size(); i++)
		// {

		// }
    
    return null;  

    }
    
}
