package com.davisilva.bookstore.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davisilva.bookstore.domain.Categoria;
import com.davisilva.bookstore.domain.Livro;
import com.davisilva.bookstore.repositories.CategoriaRepository;
import com.davisilva.bookstore.repositories.LivroRepository;

@Service
public class BDService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBasedeDados() {

		Categoria cat1 = new Categoria(null, "informatica", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Enfermagem", "Anatomia");
		Categoria cat3 = new Categoria(null, "Engenharia", "Cimento");

		Livro l1 = new Livro(null, "ClinCould", "Roberth Math", "loren Ipsun", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Loius. V. Gerster", "loren Ipsun", cat1);
		Livro l3 = new Livro(null, "The Time Machine", "W. S. Wells", "loren Ipsun", cat2);
		Livro l4 = new Livro(null, "The War Of ther Worlds", "M. G. Wells", "loren Ipsun", cat2);
		Livro l5 = new Livro(null, "I, Robot", "Isaac Asimov", "loren Ipsun", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4, l5));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}
}
