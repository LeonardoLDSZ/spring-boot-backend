package com.leonardodsz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leonardodsz.domain.Categoria;
import com.leonardodsz.repositories.CategoriaRepository;
import com.leonardodsz.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired //Com isso, a dependecia é automaticamente instanciada
	private CategoriaRepository repo; //dependencia
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
	}		
}
