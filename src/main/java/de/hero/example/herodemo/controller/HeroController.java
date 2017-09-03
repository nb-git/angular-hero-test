package de.hero.example.herodemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.hero.example.herodemo.entity.Hero;
import de.hero.example.herodemo.model.HeroResource;

@RestController
@RequestMapping("/heroes")
public class HeroController {
	
	@RequestMapping
	public HttpEntity<List<HeroResource>> getHeroes(){
		List<HeroResource> heroes = new ArrayList<HeroResource>();
		heroes.add(new HeroResource(1, "Stromwind", "new Hero"));
		heroes.add(new HeroResource(2, "Mr. Pizza", "Fastfoods Superhero"));
		
		return new ResponseEntity<List<HeroResource>>(heroes, HttpStatus.OK);
	}
}
