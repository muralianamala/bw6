import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://Util", helpText = "Util")

public class UtilCustomXPathFunctionGroup {
	
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "string1")
	,@XPathFunctionParameter(name = "string2")
	,@XPathFunctionParameter(name = "string3"),
	@XPathFunctionParameter(name = "string4")}, helpText = "")	
	public java.lang.String Decrypt(String string1, String string2, String string3, String string4) {
		return Util.Decrypt(string1, string2, string3, string4);
	}

}
