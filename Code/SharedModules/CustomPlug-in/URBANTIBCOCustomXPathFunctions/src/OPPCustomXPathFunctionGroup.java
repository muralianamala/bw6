import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://OPP", helpText = "OPP")

public class OPPCustomXPathFunctionGroup {
	
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "keyFromConfigurationValue")
	,@XPathFunctionParameter(name = "ivFromHttpHeaderValue")
	,@XPathFunctionParameter(name = "authTagFromHttpHeaderValue"),
	@XPathFunctionParameter(name = "httpBodyValue")}, helpText = "")	
	public java.lang.String Decrypt(String keyFromConfigurationValue, String ivFromHttpHeaderValue, String authTagFromHttpHeaderValue, String httpBodyValue) {
		return OPP.Decryption(keyFromConfigurationValue, ivFromHttpHeaderValue, authTagFromHttpHeaderValue, httpBodyValue);
	}

}