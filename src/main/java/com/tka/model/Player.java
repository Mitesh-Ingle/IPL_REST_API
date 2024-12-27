package com.tka.model;

public class Player {
	private int playerId;
	private String name;
	private int age;
	private int teamId;
	private String role;

	public Player() {
	}

	public Player(int playerId, String name, int age, int teamId, String role) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.age = age;
		this.teamId = teamId;
		this.role = role;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", age=" + age + ", teamId=" + teamId + ", role="
				+ role + "]";
	}

}
