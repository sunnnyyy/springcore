package com.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionClass {
	private List<String> courseName;
	private Map<String, Integer> courseFee;
	private Properties config;

	public CollectionClass(List<String> courseName, Map<String, Integer> courseFee, Properties config) {
		super();
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.config = config;
	}

	public CollectionClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getCourseName() {
		return courseName;
	}

	public void setCourseName(List<String> courseName) {
		this.courseName = courseName;
	}

	public Map<String, Integer> getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Map<String, Integer> courseFee) {
		this.courseFee = courseFee;
	}

	public Properties getConfig() {
		return config;
	}

	public void setConfig(Properties config) {
		this.config = config;
	}

}
