package lab.helpers;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class Utils {

	
	public static String paramsFromMap(Map<String, String> map) {
		
		 MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		    for (Entry<String, String> entry : map.entrySet()) {
		        params.add(entry.getKey(), entry.getValue());
		    }
		    UriComponents uriComponents = UriComponentsBuilder.newInstance().queryParams(params).build();
		
		return uriComponents.getQuery();

		
	}
}
