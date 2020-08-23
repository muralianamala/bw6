import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;


@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://base64", helpText = "base64")
public class base64CustomXPathFunctionGroup {
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "string1") }, helpText = "")
	public java.lang.String base64encoding(java.lang.String string1) {
		return base64.base64encoding(string1);
	}

	@XPathFunction(parameters = { @XPathFunctionParameter(name = "string1") }, helpText = "")
	public java.lang.String base64decoding(java.lang.String string1) {
		return base64.base64decoding(string1);
	}
}
