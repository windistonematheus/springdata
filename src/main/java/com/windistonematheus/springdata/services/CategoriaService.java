package com.windistonematheus.springdata.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.windistonematheus.springdata.domain.Categoria;
import com.windistonematheus.springdata.repositories.CategoriaRepository;

@Service 
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.get();
		}
	/*public Categoria buscar (Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
		
	}*/

}
