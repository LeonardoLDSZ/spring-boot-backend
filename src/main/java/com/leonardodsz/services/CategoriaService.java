package com.leonardodsz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leonardodsz.domain.Categoria;
import com.leonardodsz.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //Com isso, a dependecia é automaticamente instanciada
	private CategoriaRepository repo; //dependencia
	
	public Categoria buscar(Integer id) { //Recebe um Integer id como parâmetro
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElse(null); 
	}
}
