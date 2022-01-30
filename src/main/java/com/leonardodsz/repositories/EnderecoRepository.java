package com.leonardodsz.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leonardodsz.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
				//Este objeto realizará acesso a dados e operações, salvar, deletar, alterar
				//Camada de acesso a dados do tipo categoria
}
