package com.leonardodsz;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leonardodsz.domain.Categoria;
import com.leonardodsz.repositories.CategoriaRepository;

@SpringBootApplication
public class CourseApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informática"); //Objetos categoria criados
		Categoria cat2 = new Categoria(null,"Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
