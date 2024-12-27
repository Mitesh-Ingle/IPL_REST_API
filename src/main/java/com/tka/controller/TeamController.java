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

import com.tka.model.Team;
import com.tka.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;

	// To Add Team from postman for one method at a time
	@PostMapping("/api/teams")
	public String addTeam(@RequestBody Team team) {
		String message = teamService.addTeam(team);
		return message;

	}

	@GetMapping("/api/teams/all")
	public List<Team> getAllTeam() {
		List<Team> allTeams = teamService.getAllTeams();
		return allTeams;

	}

	// Get team by ID
	@GetMapping("/api/teams/{id}")
	public Object getTeamById(@PathVariable int id) {
		Team teamById = teamService.getTeamById(id);
		if (teamById != null) {
			return teamById;
		}
		return "No result found";
	}

	// for updating team by using put
	@PutMapping("/api/teams/{id}")
	public String updateTeam(@PathVariable int id, @RequestBody Team team) {
		String updateTeamCoach = teamService.updateTeamCoach(id, team.getCoach());
		return updateTeamCoach;

	}

	// delete team by id using delete
	@DeleteMapping("/api/teams/{id}")
	public String deleteTeamById(@PathVariable int id) {
		String deleteTeamById = teamService.deleteTeamById(id);
		return deleteTeamById;

	}

}
