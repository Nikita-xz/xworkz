package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.jpa.util.SFUtil;
import com.xworkz.temple.entity.TempleEntity;

public class TempleRepositoryImpl implements TempleRepository {
	private EntityManagerFactory factory = SFUtil.getFactory();

	@Override
	public void persist(TempleEntity entity) {
		System.out.println("invoked persist");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Object findByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			manager.getTransaction().begin();
			Query q = manager.createNamedQuery("findByName");
			q.setParameter("nm", name);
			Object entity = q.getSingleResult();
			return entity;
		} finally {
			manager.close();
		}
	}

	@Override
	public void deleteById(int id) {
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			manager.getTransaction().begin();
			Query q=manager.createNamedQuery("deleteById");
			q.setParameter("tid", id);
			q.executeUpdate();
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}

	}

	@Override
	public List<TempleEntity> getAll() {
		EntityManager manager=null;
		try {
			manager=factory.createEntityManager();
			Query q=manager.createNamedQuery("getAll");
			List<TempleEntity> list=q.getResultList();
			return list;
		}
		finally {
			manager.close();
		}
	}

}
