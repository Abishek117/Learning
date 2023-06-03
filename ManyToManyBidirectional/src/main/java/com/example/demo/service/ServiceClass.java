package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Artists;
import com.example.demo.entity.Movies;
import com.example.demo.repo.ArtistRepository;
import com.example.demo.repo.MovieRepository;


@Service
public class ServiceClass
{
	@Autowired
	List<Artists> artists;
	
	@Autowired
	List<Movies> movies;
	
	@Autowired
	ArtistRepository repo1;
	
	@Autowired
	MovieRepository repo2;
	
	public void addEntity()
	{
		
//		 for(Artists artist : artists)
//		 {
//			 for(Movies movie : a)
//			 {
//				repo2.save(movie);
//			 }
//			 artist.setMovies(movies);
//			 repo1.save(artist);
//		 }
//		 System.out.println("Added");
//		for(Movies movie: movies)
//		{
//			repo2.save(movie);
//		}
//		for(Artists artist : artists)
//		{
//			List<Movies> a = artist.getMovies();
//			artist.setMovies(a);
//			repo1.save(artist);			
//		}
		
		//for(Artists artist : artists)
		//{
			for(Movies movie: movies)
			{
				List<Movies> m = new ArrayList<>();
				m.add(repo2.save(movie));
				//Movies m  = repo2.save(movie);
				for(Artists artist : artists)
				{
					artist.setMovies(m);
					repo1.save(artist);
				}
			}
		//}
		
		
	}
	
//	public void remove();
//	{
//		Optional<Artists> a = repo1.findById(102);
//		Users 
//	}
	
	
}
