import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://Utf8LenCounter", helpText = "Utf8LenCounter")
public class Utf8LenCounterCustomXPathFunctionGroup {
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "string1") }, helpText = "")
	public java.lang.String length(java.lang.String string1) {
		return Utf8LenCounter.length(string1);
	}
}
