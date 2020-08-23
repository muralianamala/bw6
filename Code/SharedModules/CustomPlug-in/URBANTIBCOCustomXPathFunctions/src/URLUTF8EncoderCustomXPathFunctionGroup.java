import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://UrlEncode", helpText = "UrlEncode")

public class URLUTF8EncoderCustomXPathFunctionGroup {
	
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "data") }, helpText = "")
	public java.lang.String encode(java.lang.String data) {
			return URLUTF8Encoder.encode(data);
	}

}
