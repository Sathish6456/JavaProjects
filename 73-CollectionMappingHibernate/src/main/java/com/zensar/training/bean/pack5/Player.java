package com.zensar.training.bean.pack5;

import java.util.Objects;

public class Player {
	private String playerName;
	private String typeOfPlayer;
	private int age;
	
	public Player(String playerName, String typeOfplayer, int age) {
		super();
		this.playerName = playerName;
		this.typeOfPlayer = typeOfplayer;
		this.age = age;
	}
	public Player() {
		super();
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTypeOfPlayer() {
		return typeOfPlayer;
	}
	public void setTypeOfPlayer(String typeOfplayer) {
		this.typeOfPlayer = typeOfplayer;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", typeOfplayer=" + typeOfPlayer + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(playerName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(playerName, other.playerName);
	};
	
	
}
