package com.mvc.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="mvc_project",name="classification")

public class Classification {
	
	@Id
	@GeneratedValue
	
	@Column(name="classification_id")
	private int ClassificationId;
	
	@Column(name="classification_name")
	private String ClassificationName;

	public int getClassificationId() {
		return ClassificationId;
	}

	public void setClassificationId(int classificationId) {
		ClassificationId = classificationId;
	}

	public String getClassificationName() {
		return ClassificationName;
	}

	public void setClassificationName(String classificationName) {
		ClassificationName = classificationName;
	}
	

}
