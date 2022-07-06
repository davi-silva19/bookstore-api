package com.davisilva.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.davisilva.bookstore.domain.Categoria;
import com.davisilva.bookstore.domain.Livro;
import com.davisilva.bookstore.repositories.CategoriaRepository;
import com.davisilva.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria  cat1 = new Categoria(null, "informatica", "Livro de TI");
		Livro l1 = new Livro(null, "ClinCould", "Roberth Math", "loren Ipsun", cat1);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
		}

}
