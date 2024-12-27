package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.TeamDao;
import com.tka.model.Team;

@Service
public class TeamService {

	@Autowired
	private TeamDao teamDao;

	public String addTeam(Team team) {
		String message = teamDao.addTeam(team);
		return message;

	}

	public List<Team> getAllTeams() {
		List<Team> allTeams = teamDao.getAllTeams();
		return allTeams;

	}

	public Team getTeamById(int id) {
		Team teamById = teamDao.getTeamById(id);
		return teamById;
	}

	public String updateTeamCoach(int id, String coach) {
		String updateTeam = teamDao.updateTeam(id, coach);

		return updateTeam;

	}

	public String deleteTeamById(int id) {
		int status = teamDao.deleteTeamById(id);
//		String deleteTeamById = teamDao.deleteTeamById(id);

		if (status == 0) {
			return "Team Not Found";
		} else {
			return "Team deleted";
		}

//		return deleteTeamById;
	}

}
