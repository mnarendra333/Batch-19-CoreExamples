package com.pragim.SpringBootWithRestWSNew;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.SpringBootWithRestWSNew.exception.PlayerNotFoundException;
import com.pragim.SpringBootWithRestWSNew.model.Player;
import com.pragim.SpringBootWithRestWSNew.repo.PlayerRepositry;


@RestController
@RequestMapping("/jpa")
public class PlayerController {
	
	@Autowired
	private PlayerRepositry playerRepositry;
	
	@GetMapping("/list")
	public List<Player> getAllPlayers(){
		List<Player> list = playerRepositry.findAll();
		return list;
	}
	
	@GetMapping("/list/{id}")
	public Optional<Player> getPlayer(@PathVariable String id){
		Optional<Player> plaObj = playerRepositry.findById(Integer.parseInt(id));
		if(!plaObj.isPresent())
			throw new PlayerNotFoundException(id +" - not present");
		
			return plaObj;
	}
	
	@GetMapping("/listname/{name}")
	public Optional<Player> getPlayerByName(@PathVariable String name){
		Optional<Player> plaObj = playerRepositry.findByName(name);
		if(!plaObj.isPresent())
			throw new PlayerNotFoundException(name +" - not present");
		
			return plaObj;
	}
	
	
	

}
