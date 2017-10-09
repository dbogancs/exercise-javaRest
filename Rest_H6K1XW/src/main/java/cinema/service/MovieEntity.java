package cinema.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="movie")
@XmlAccessorType(XmlAccessType.FIELD)
public class MovieEntity{

	@XmlTransient
	public int id;
	
	@XmlElement(nillable=true)
	public String title;
	
	@XmlElement(nillable=true)
	public Integer year;
	
	@XmlElement(nillable=true)
	public String director;
	
	@XmlElement(required=false)
	public String[] actor = {};
}
