package cinema.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="movies")
public class MovieIdList {

	@XmlElement(nillable=true)
	public List<Integer> id;
	
	MovieIdList(){
		id = new ArrayList<>();
	}	
	MovieIdList(List<Integer> ids){
		id = ids;
	}
}
