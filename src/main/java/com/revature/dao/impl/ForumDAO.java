package com.revature.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import com.revature.dao.IForumDAO;
import com.revature.pojo.Forum;
import com.revature.pojo.Message;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ForumDAO extends HibernateDaoSupport implements IForumDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public Forum getForumById(int forumId) {

        Forum f = new Forum();
        f.setForumId(forumId);
//        return getHibernateTemplate().findByExample(f).get(0);
        return entityManager.find(Forum.class, forumId);
    }

    @Override
    public List<Message> getMessages() {
        String hql = "from Message";
        return (List<Message>)getHibernateTemplate().find(hql);

//        Query query = entityManager.createNativeQuery("select * from message");
//        return query.getResultList();
    }
}
