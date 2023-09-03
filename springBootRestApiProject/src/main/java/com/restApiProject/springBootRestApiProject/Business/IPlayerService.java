package com.restApiProject.springBootRestApiProject.Business;

import java.util.List;

import com.restApiProject.springBootRestApiProject.Entities.Player;

public interface IPlayerService {
	List<Player> getAll();
	void add(Player player);
	void update(Player player);
	void delete(Player player);
	Player getById(int id);

}
