package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Player;
import com.tka.service.PlayerService;

@RestController
public class PlayerController {
	@Autowired
	PlayerService playerService;

	// to add player
	@PostMapping("/api/players")
	public String addNewPlayer(@RequestBody Player player) {
		String addNewPlayer = playerService.addNewPlayer(player);
		return addNewPlayer;

	}

//to get all players
	@GetMapping("/api/players/all")
	public List<Player> getAllPlayers() {
		List<Player> allplayers = playerService.getAllplayers();
		return allplayers;
	}

	// Get player by ID
	@GetMapping("/api/players/{id}")
	public Object getPlayerById(@PathVariable int id) {
		Player playerById = playerService.getPlayerById(id);
		if (playerById != null) {
			return playerById;
		}
		return "No Player Found";
	}

//update player by id
	@PutMapping("/api/players/{id}")
	public String updatePlayer(@PathVariable int id, @RequestBody Player player) {
		String updatePlayer = playerService.updatePlayerRole(id, player.getRole());
		return updatePlayer;

	}

//delete player by id
	@DeleteMapping("/api/players/{id}")
	public String deletePlayer(@PathVariable int id) {
		String deletePlayer = playerService.deletePlayer(id);
		return deletePlayer;
	}

}
