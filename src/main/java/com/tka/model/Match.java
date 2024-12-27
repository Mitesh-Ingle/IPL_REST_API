package com.tka.model;

import java.util.Objects;

public class Match {
	private int matchId;
	private int teamOne;
	private int teamTwo;
	private String date;
	private String venue;
	private String result;

	public Match() {
		// TODO Auto-generated constructor stub
	}

	public Match(int matchId, int teamOne, int teamTwo, String date, String venue, String result) {
		super();
		this.matchId = matchId;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(int teamOne) {
		this.teamOne = teamOne;
	}

	public int getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(int teamTwo) {
		this.teamTwo = teamTwo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Match match = (Match) o;
		return matchId == match.matchId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matchId);
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", date=" + date
				+ ", venue=" + venue + ", result=" + result + "]";
	}

}
