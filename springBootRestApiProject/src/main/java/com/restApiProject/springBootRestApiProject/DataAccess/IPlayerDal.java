package com.restApiProject.springBootRestApiProject.DataAccess;

import java.util.List;

import com.restApiProject.springBootRestApiProject.Entities.Player;

public interface IPlayerDal {
	
	List<Player> getAll();
	void add(Player player);
	void update(Player player);
	void delete(Player player);
	Player getById(int id);
}
