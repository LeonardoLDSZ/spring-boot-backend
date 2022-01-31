package com.leonardodsz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leonardodsz.domain.Pedido;
import com.leonardodsz.repositories.PedidoRepository;
import com.leonardodsz.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired //Com isso, a dependecia é automaticamente instanciada
	private PedidoRepository repo; //dependencia
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName(), null));
	}		
}
