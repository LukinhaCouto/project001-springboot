package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;

@SpringBootApplication
public class Projeto001Application implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Projeto001Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
