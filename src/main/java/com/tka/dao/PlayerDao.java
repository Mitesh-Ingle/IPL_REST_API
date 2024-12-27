package com.tka.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.tka.model.Player;

@Repository
public class PlayerDao {

	List<Player> players = new ArrayList<>();

	public PlayerDao() {
		players.add(new Player(1, "Rohit Sharma", 33, 1, "Batsman"));
		players.add(new Player(2, "MS Dhoni", 39, 2, "Wicketkeeper-Batsman"));
		players.add(new Player(3, "Virat Kohli", 35, 3, "Batsman"));
		players.add(new Player(4, "Maradona", 30, 4, "Bowler"));
	}

	public String addNewPlayer(Player player) {
		// Check if match already exists to prevent duplicates
		boolean isDuplicate = players.stream()
				.anyMatch(existingPlayer -> existingPlayer.getPlayerId() == player.getPlayerId());

		if (isDuplicate) {
			return "Duplicate player, cannot add.";
		}

		// Add the new match if it's not a duplicate
		players.add(player);
		return "player Added Successfully";
	}

	public List<Player> getAllPlayers() {
		return players;

	}

	public Player getPlayerById(int id) {
		for (Player player : players) {
			if (player.getPlayerId() == id) {
				return player;
			}
		}
		return null;

	}

	public String updatePlayerRole(int id, String role) {
		for (Player player : players) {
			if (player.getPlayerId() == id) {
				player.setRole(role);
			}
			return "Player Updated";
		}
		return "NO RESULT";
	}

	public String deletePlayer(int id) {
		for (Player player : players) {
			if (player.getPlayerId() == id) {
				players.remove(player);
				return "Player Deleted ";

			}
		}
		return "No Player Found";

	}

}
