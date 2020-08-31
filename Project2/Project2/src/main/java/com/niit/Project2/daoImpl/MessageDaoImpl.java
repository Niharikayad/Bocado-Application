package com.niit.Project2.daoImpl;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.niit.Project2.dao.MessageDao;
import com.niit.Project2.model.Message;

@Repository(value="messageDao")
@Component
@Transactional
public class MessageDaoImpl implements MessageDao{
       @Autowired
       SessionFactory sessionFactory;
       
       public boolean sendMessage(Message message) {
    	   try
    	   {
    		   sessionFactory.getCurrentSession().save(message);
    		   return true;
    	   }
    	   catch(Exception ex)
    	   {
    		   return false;
    	   }
       }
       
      public List<Message> getMyMessage(String edmailID){
    	  return sessionFactory.getCurrentSession().createCriteria(Message.class).add(Restrictions.allEq("senderEmailID))
      }
}
