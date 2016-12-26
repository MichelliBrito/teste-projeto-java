package br.com.michelli.dao;


import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.michelli.models.Curso;
import br.com.michelli.models.Materias;

@Repository//classe dao persiste dados. (Classe persistente)
@Transactional//classe que possui transação gerenciada pelo Spring.
public class materiaDao {
	
	 @PersistenceContext//cria uma instancia da classe EntityManager, para que ele seja injetável, diferente de quando se utiliza @Autoweird
	 private EntityManager manager;
	 
	public void gravarMateria(Materias materia){
		manager.persist(materia);
    }

	public List<Curso> lista() throws SQLException {
		return manager.createQuery("select u from Curso_Materias u").getResultList();
	}
}