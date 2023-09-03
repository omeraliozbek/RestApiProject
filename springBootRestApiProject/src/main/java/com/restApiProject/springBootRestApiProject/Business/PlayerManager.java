package com.restApiProject.springBootRestApiProject.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restApiProject.springBootRestApiProject.DataAccess.IPlayerDal;
import com.restApiProject.springBootRestApiProject.Entities.Player;

@Service
public class PlayerManager implements IPlayerService {
	
	private IPlayerDal playerDal;

	@Autowired
	public PlayerManager(IPlayerDal playerDal) {
		this.playerDal = playerDal;
	}

	@Override
	@Transactional
	public List<Player> getAll() {
		
		return this.playerDal.getAll();
	}

	@Override
	@Transactional
	public void add(Player player) {
		this.playerDal.add(player);		
	}

	@Override
	@Transactional
	public void update(Player player) {
		this.playerDal.update(player);
	}

	@Override
	@Transactional
	public void delete(Player player) {
		this.playerDal.delete(player);	
	}

	@Override
	@Transactional
	public Player getById(int id) {
		return this.playerDal.getById(id);
	}

}
