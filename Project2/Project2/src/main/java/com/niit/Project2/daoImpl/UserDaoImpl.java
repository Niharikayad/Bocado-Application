package com.niit.Project2.daoImpl;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.Project2.dao.UserDao;
import com.niit.Project2.model.User;

@Repository(value="userDao")
@Component
@Transactional
public class UserDaoImpl implements UserDao {

	 @Autowired
     SessionFactory sessionFactory;
	 
	 @Autowired
     User user;
	 
	 public UserDaoImpl(SessionFactory sessionFactory) {
	    super();
	    this.sessionFactory=sessionFactory;
	 }
	 
	 @Override
	 public boolean save(User user) {
		 try {
			 user.setcPassword(user.getPassword());
			 user.setActive(true);
			 sessionFactory.getCurrentSession().save(user);
			 return true;
		 }
		 catch(HibernateException e) {
			 e.printStackTrace();
			 return false;
		 }
}
	 
	 @Override
	 public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		}
		 catch(HibernateException e){
			 e.printStackTrace();
			 return false;
		 }
	 }
	 
	 @Override
	 public User get(String id) {
		 user =(User)sessionFactory.getCurrentSession().get(User.class, id);
		 return user;
	 }
	 
	 @Override
	 public List<User> list(){
		 String qstr ="from User ";
		 Query query= sessionFactory.getCurrentSession().createQuery(qstr);
		 return query.list();
		 
		}
	 @Override
	 public User validate(String id,String password) {
		 String hql="from User where emailID='" +id + " ' and password='" + password +" ' ";
		 Query query =sessionFactory.openSession().createQuery(hql);
		 return (User) query.uniqueResult();*/
		 return null;
	 }
}
