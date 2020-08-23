import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://Token", helpText = "Token")

public class TokenCustomXPathFunctionGroup {
	
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "jwtSecret")
	,@XPathFunctionParameter(name = "jwtPayloadKey")
	,@XPathFunctionParameter(name = "jwtPayloadHmacKey"),
	@XPathFunctionParameter(name = "Brand")}, helpText = "")	
	public java.lang.String Decrypt(String jwtSecret, String jwtPayloadKey, String jwtPayloadHmacKey, String Brand) {
		return Token.GenerateToken(jwtSecret, jwtPayloadKey, jwtPayloadHmacKey, Brand);
	}

}