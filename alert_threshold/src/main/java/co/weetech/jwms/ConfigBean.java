package co.weetech.jwms;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.json.JSONObject;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
 
@ManagedBean
@SessionScoped
public class ConfigBean implements Serializable {
 
	private String config;

	public String getConfig() {
		//return config;
		//return "test long config";
		String result = "";
		try {
			
			result = Files.lines(Paths.get(""))
			        .parallel() // for parallel processing 
			        .map(String::trim) // to change line   
			        //.filter(line -> line.length() > 2) // to filter some lines by a predicate                        
			        .collect(Collectors.joining());
			JSONObject json = new JSONObject(result);
			return json.toString(4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // to join lines
		
		return result;
	}

	public void setConfig(String config) {
		this.config = config;
	}

}
