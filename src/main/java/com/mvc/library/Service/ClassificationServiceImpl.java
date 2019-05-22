package com.mvc.library.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.library.Dao.ClassificationDao;
import com.mvc.library.model.Classification;
@Service
public class ClassificationServiceImpl implements ClassificationService{
	
	@Autowired
	private ClassificationDao classificationDao;
	
	public Classification createClassification(Classification classification) {
		// TODO Auto-generated method stub
		classificationDao.addClassification(classification);
		return null;
	}
	
}
