package com.leonardodsz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leonardodsz.domain.Cliente;
import com.leonardodsz.repositories.ClienteRepository;
import com.leonardodsz.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired //Com isso, a dependecia é automaticamente instanciada
	private ClienteRepository repo; //dependencia
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(), null));
	}		
}
