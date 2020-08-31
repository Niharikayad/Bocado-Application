package com.niit.Project2.dao;
import java.util.List;
import com.niit.Project2.model.Circle;

public interface CircleDao {

	boolean addCircle(Circle circle);
	boolean deleteCirecle(String emailID,String circleName);
	List<Circle>getAllCircle();
	List<Circle>getCircleByUser(String emailID);
	Circle getCircleByName(String circleName);
}
