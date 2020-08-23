package urbantibcocustomxpathfunctions;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

import java.net.URLEncoder;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "urlencode", namespace = "http://www.urbanoutfitters.com/urlencode", helpText = "urlencode")
public class URLEncodeFunctionGroup {

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
