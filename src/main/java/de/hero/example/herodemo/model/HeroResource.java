package de.hero.example.herodemo.model;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.hero.example.herodemo.entity.Hero;
import lombok.Data;

@Data
public class HeroResource extends ResourceSupport {

	private long heroId;
	private String name;
	private String description;

	@JsonCreator
	public HeroResource(@JsonProperty("id") long id, @JsonProperty("name") String name,
			@JsonProperty("description") String description) {
		this.heroId = id;
		this.name = name;
		this.description = description;
	}

	public HeroResource(Hero hero) {
		this.heroId = hero.getId();
		this.name = hero.getName();
		this.description = hero.getDescription();
	}
}
