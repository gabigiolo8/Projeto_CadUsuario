package br.edu.atitus.pooavancado.CadUsuario.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import br.edu.atitus.pooavancado.CadUsuario.entities.Produto;
import br.edu.atitus.pooavancado.CadUsuario.repositories.ProdutoRepository;

public interface ProdutoService extends GenericService<Produto, ProdutoRepository>{
	
	void alteraStatus(@Param("id") long id) throws Exception;

}
