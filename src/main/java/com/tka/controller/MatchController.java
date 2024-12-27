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
import com.tka.model.Match;
import com.tka.service.MatchService;

@RestController
public class MatchController {

	@Autowired
	MatchService matchService;

	// 1 to add match
	@PostMapping("/api/matches")
	public String addNewMatch(@RequestBody Match match) {
		String addNewPlayer = matchService.addNewMatch(match);
		return addNewPlayer;

	}

	// 2 to get all players
	@GetMapping("/api/matches/all")
	public List<Match> getAllMatches() {
		List<Match> allMatches = matchService.getAllMatches();
		return allMatches;
	}

// 3
	@GetMapping("/api/matches/{id}")
	public Object getMatchById(@PathVariable int id) {
		return matchService.getMatchById(id);
	}

	// 4
	@PutMapping("/api/matches/{id}")
	public String updateMatch(@PathVariable int id, @RequestBody Match match) {

		return matchService.updateMatch(id, match);
	}

	// 5 problem
	@DeleteMapping("/api/matches/{id}")
	public String deleteMatch(@PathVariable int id) {
		return matchService.deleteMatch(id);

	}

}
