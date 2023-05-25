package br.edu.atitus.pooavancado.CadUsuario.servicesimpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.atitus.pooavancado.CadUsuario.repositories.ProdutoRepository;
import br.edu.atitus.pooavancado.CadUsuario.services.ProdutoService;


@Service
public class ProdutoServiceImpl implements ProdutoService{
	
	final ProdutoRepository produtoRepository;
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}

	@Override
	public ProdutoRepository getRepository() {
		return produtoRepository;
	}
	@Override
	@Transactional
	public void alteraStatus(long id) throws Exception {
		if (produtoRepository.existsById(id))
			throw new Exception("Não existe produto com o Id: " + id);
		produtoRepository.alteraStatus(id);
	}


}