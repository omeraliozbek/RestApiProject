package com.restApiProject.springBootRestApiProject.restApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restApiProject.springBootRestApiProject.Entities.*;
import com.restApiProject.springBootRestApiProject.Business.IPlayerService;

@RestController
@RequestMapping("/api")
public class PlayerController {
	
	private IPlayerService playerService;

	@Autowired
	public PlayerController(IPlayerService playerService) {
		this.playerService = playerService;
	}
	
	@GetMapping("/players")
	public List<Player> get(){
		return playerService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Player player) {
		playerService.add(player);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Player player) {
		playerService.update(player);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Player player) {
		playerService.delete(player);
	}
	
	@GetMapping("/players/{id}")
	public Player getById(@PathVariable int id) {
		return playerService.getById(id);
	}
	
	
}