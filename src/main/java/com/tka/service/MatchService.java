package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.dao.MatchDao;
import com.tka.model.Match;

@Service
public class MatchService {

	@Autowired
	MatchDao matchDao;

//1
	public String addNewMatch(Match match) {
		String addNewMatch = matchDao.addNewMatch(match);
		return addNewMatch;
	}

//2
	public List<Match> getAllMatches() {
		List<Match> allMatches = matchDao.getAllMatches();
		return allMatches;

	}

//3
	public Object getMatchById(int id) {

		return matchDao.getMatchById(id);
	}

// 4 problem
	public String updateMatch(int id, Match match) {
		return matchDao.updateMatch(id, match);
	}

	// 5 problem
	public String deleteMatch(int id) {
		return matchDao.deleteMatch(id);
	}

}