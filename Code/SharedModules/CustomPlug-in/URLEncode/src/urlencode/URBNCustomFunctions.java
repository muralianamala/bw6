package urlencode;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

import java.net.URLEncoder;

@XPathFunctionGroup(category = "URBNCustomFunctions", prefix = "urlencode", namespace = "http://www.urbanoutfitters.com/urlencode", helpText = "Custom defined function")
public class URBNCustomFunctions {

	@XPathFunction(helpText = "Description", parameters = {
			@XPathFunctionParameter(name = "url", optional = true, optionalValue = ""),
			@XPathFunctionParameter(name = "encode", optional = true, optionalValue = "") })
	public String urlencode(String url, String encode) {
		try {
			return URLEncoder.encode(url,encode).toString();
			}
			catch (Exception e){
				System.err.println("URL Problem");
				return null;
				
			}
	}
}
