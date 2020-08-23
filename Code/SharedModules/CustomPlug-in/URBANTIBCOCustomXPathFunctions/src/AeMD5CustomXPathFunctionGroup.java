import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;


@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://AeMD5", helpText = "AeMD5")
public class AeMD5CustomXPathFunctionGroup {
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "source") }, helpText = "")
	public java.lang.String getMD5(java.lang.String source) {
		return AeMD5.getMD5(source);
	}
}
