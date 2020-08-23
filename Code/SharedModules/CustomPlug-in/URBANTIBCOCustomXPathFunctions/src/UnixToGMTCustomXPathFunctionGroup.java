import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://UnixToGMT", helpText = "UnixToGMT")
public class UnixToGMTCustomXPathFunctionGroup {
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "string1") }, helpText = "")
	public java.lang.String UnixToGMT(java.lang.String string1) {
		return UnixToGMT.UnixToGMT(string1);
	}
}
