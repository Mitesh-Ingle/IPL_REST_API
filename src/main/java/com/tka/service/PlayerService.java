package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.PlayerDao;
import com.tka.model.Player;

@Service
public class PlayerService {

	@Autowired
	PlayerDao playerDao;

	public String addNewPlayer(Player player) {
		String addNewPlayer = playerDao.addNewPlayer(player);
		return addNewPlayer;
	}

	public List<Player> getAllplayers() {
		List<Player> allPlayers = playerDao.getAllPlayers();
		return allPlayers;

	}

	public Player getPlayerById(int id) {
		Player playerById = playerDao.getPlayerById(id);
		return playerById;

	}

	public String updatePlayerRole(int id, String role) {
		String updatePlayer = playerDao.updatePlayerRole(id, role);
		return updatePlayer;

	}

	public String deletePlayer(int id) {
		String deletePlayer = playerDao.deletePlayer(id);
//if (deletePlayer == 0) {
//	return "";

		return deletePlayer;
	}
}
