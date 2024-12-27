package com.tka.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.tka.model.Match;

@Repository
public class MatchDao {

	private List<Match> matches = new ArrayList<>();

	public MatchDao() {
		// Adding initial matches
		matches.add(new Match(11, 1, 2, "2024-10-1", "Wankhede Stadium", "Mumbai Indians won "));
		matches.add(new Match(22, 2, 1, "2023-5-10", "Eden Gardens", "Delhi Capitals Lose"));
		matches.add(new Match(33, 1, 3, "2022-10-3", "Chinnaswamy Stadium", "Chennai Super Kings Lose "));
	}

// 1 problem
	public String addNewMatch(Match match) {
		// Check if match already exists to prevent duplicates
		boolean isDuplicate = matches.stream()
				.anyMatch(existingMatch -> existingMatch.getMatchId() == match.getMatchId());
		if (isDuplicate) {
			return "Duplicate match, cannot add.";
		}
		// Add the new match if it's not a duplicate
		matches.add(match);
		return "Match Added Successfully";
	}

//2 problem
	public List<Match> getAllMatches() {
		return matches; // Maintains insertion order as it's an ArrayList
	}

	// 3 problem
	public Object getMatchById(int id) {

		for (Match match : matches) {
			if (match.getMatchId() == id) {
				return match;
			}
		}

		return "Match Not Found in Schedule";

	}
//4 problem

	public String updateMatch(int id, Match match) {

		for (int i = 0; i < matches.size(); i++) {
			if (matches.get(i).getMatchId() == id) {
				matches.set(i, match);
				return "Match Updated Successfully...";
			}
		}

		return "Couldn't update match.Something went wrong...";
	}

// 5 problem
	public String deleteMatch(int id) {

		for (int i = 0; i < matches.size(); i++) {
			if (matches.get(i).getMatchId() == id) {
				matches.remove(i);
				return "Match deleted successfully...";
			}
		}

		return "Couldn't delete match. Something went wrong...";
	}

}