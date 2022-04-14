package com.zensar.training.bean.pack5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class IPLTeam {
	private int id;
	private String name;
	private String region;
	Set<Player> players;
	public IPLTeam(int id, String name, String region) {
		super();
		this.id = id;
		this.name = name;
		this.region = region;
		this.players=new HashSet<>();
	}
	
	
	public IPLTeam(String name, String region, Set<Player> players) {
		super();
		this.name = name;
		this.region = region;
		this.players = players;
	}


	public IPLTeam() {
		super();
		this.players=new HashSet<>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "IPLTeam [id=" + id + ", name=" + name + ", region=" + region + ", players=" + players + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPLTeam other = (IPLTeam) obj;
		return id == other.id;
	}
	
	
}
