package com.tka.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.tka.model.Team;

@Repository
public class TeamDao {

	List<Team> teams = new ArrayList<>();

	public TeamDao() {
		teams.add(new Team(1, "Mumbai Indians", "Mumbai", "Mahila Jayawardene"));
		teams.add(new Team(2, "Chennai Kings", "Chennai", "Ms Dhoni"));
		teams.add(new Team(3, "RCB", "Banglore", "Virat"));
		teams.add(new Team(4, "Realmadrid", "Madrid", "Ronaldo"));
		teams.add(new Team(5, "FCB", "Barcelona", "Messi"));
	}

	public String addTeam(Team team) {
		// Check if match already exists to prevent duplicates
		boolean isDuplicate = teams.stream().anyMatch(existingTeam -> existingTeam.getTeamId() == team.getTeamId());

		if (isDuplicate) {
			return "Duplicate team, cannot add.";
		}

		// Add the new match if it's not a duplicate
		teams.add(team);
		return "Team Added Successfully";
	}

	public List<Team> getAllTeams() {
		return teams;

	}

	public Team getTeamById(int id) {
		for (Team team : teams) { // Iterate over the list of teams
			if (team.getTeamId() == id) { // Compare the team's ID with the input ID
				return team; // Return the matching team
			}
		}
		return null;
	}

	public String updateTeam(int id, String newCoach) {
		for (Team team : teams) {
			System.err.println("Checking team with ID: " + team.getTeamId()); // Debugging line
			// Compare teamId with the provided id
			if (team.getTeamId() == id) {
				team.setCoach(newCoach); // Update the coach name
				return "Coach updated to: " + team.getCoach(); // Return the updated coach name
			}
		}
		return "No Result Found"; // If no team with the given ID is found
	}

	public int deleteTeamById(int id) {
//		String msg = "";
		for (Team team : teams) {
			if (team.getTeamId() == id) {
				teams.remove(team);
//				msg = "Team Deleted";
				return 1;
			}
		}
		return 0;

	}

}
