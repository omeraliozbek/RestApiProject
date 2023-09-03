package com.restApiProject.springBootRestApiProject.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.restApiProject.springBootRestApiProject.Entities.Player;

@Repository
public class HibernatePlayerDal implements IPlayerDal {
	
	private EntityManager entityManager;

	@Autowired
	public HibernatePlayerDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Player> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Player> players =session.createQuery("from Player", Player.class).getResultList();
		return players;
	}

	@Override
	public void add(Player player) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(player);			
	}

	@Override
	public void update(Player player) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(player);		
	}

	@Override
	public void delete(Player player) {
		Session session = entityManager.unwrap(Session.class);
		Player playerToDelete = session.get(Player.class, player.getId());
		session.delete(playerToDelete);
	}

	@Override
	public Player getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		Player player = session.get(Player.class, id);
		return player;
	}

}
