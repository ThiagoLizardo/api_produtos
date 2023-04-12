package br.com.cotiinformatica.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.cotiinformatica.dtos.commands.ProdutoCreateCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoDeleteCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoUpdateCommand;
import br.com.cotiinformatica.dtos.queries.ProdutosDto;

@Service
public class ProdutoService {
	
	public void create(ProdutoCreateCommand command) {
		
	}

	public void update(ProdutoUpdateCommand command) {
		
	}
	
	public void delte(ProdutoDeleteCommand command) {
		
	}	
	
	public List<ProdutosDto> findAll(){
		return null;
	}
	
	public ProdutosDto findById(Integer id) {
		return null;
	}
	
}
