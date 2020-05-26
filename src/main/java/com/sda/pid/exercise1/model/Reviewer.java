package com.sda.pid.exercise1.model;

import javax.xml.bind.annotation.XmlAttribute;

public class Reviewer {
	
    private String date;

    private String score;

    private String personID;

    private String content;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getPersonID() {
		return personID;
	}
	@XmlAttribute(name="personID")
	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
    
    


}
