package com.mvc.library.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mvc.library.model.Classification;
@Repository
public class ClassificationDaoImpl implements ClassificationDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Classification addClassification(Classification classification) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(classification);
		return null;
	}
	

}
