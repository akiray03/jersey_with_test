package com.yumiyama.twitter;

// import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class User {
	public int id;
	public String userName;
	
	@XmlTransient
	public int age;
	
	// public List<Tweet> tweets;
}
