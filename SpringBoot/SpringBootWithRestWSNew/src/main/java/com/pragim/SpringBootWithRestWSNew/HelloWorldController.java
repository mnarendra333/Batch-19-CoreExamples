package com.pragim.SpringBootWithRestWSNew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.SpringBootWithRestWSNew.exception.PlayerNotFoundException;
import com.pragim.SpringBootWithRestWSNew.model.Player;

@RestController
public class HelloWorldController {
	
	private static List<Player> list= null;
	int counter = 104;
	static{
		list = new ArrayList<Player>();
		list.add(new Player(101, "Sachin", 40, "MI"));
		list.add(new Player(102, "Dhavan", 26, "DD"));
		list.add(new Player(103, "Kohli", 30, "RCB"));
		list.add(new Player(104, "Rishabanth", 40, "MI"));
	}
	
	
	@GetMapping(path="/welcome")
	public Map<String,String> sayHello(){
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("msg", "welcome to spring boot ! Happy learning :-)");
		return map;
	}
	
	@GetMapping(path="/list")
	public List<Player> getPlayers(){
		return list;
	}
	
	
	@GetMapping(path="/list/{id}")
	public Player getPlayerInfo(@PathVariable String id){
		Player player1 = null;
		for (Player player : list) {
			if(player.getId() == Integer.parseInt(id))
				player1 =  player;
		}
		if(player1 == null)
			throw new PlayerNotFoundException(id+"- not found");
		return player1;
		
	}
	
	@PostMapping("/add")
	public Player addPlayer(@RequestBody Player player){
		
		player.setId(++counter);
		list.add(player);
		return player;
	}

}
