package br.edu.atitus.pooavancado.CadUsuario.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.atitus.pooavancado.CadUsuario.entities.Produto;

@Repository
public interface ProdutoRepository extends GenericRepository<Produto>{
	
	@Query(value = "UPDATE produto set status = not status where id = :id", nativeQuery = true)
	@Modifying
	void alteraStatus(@Param("id") long id);
	
}