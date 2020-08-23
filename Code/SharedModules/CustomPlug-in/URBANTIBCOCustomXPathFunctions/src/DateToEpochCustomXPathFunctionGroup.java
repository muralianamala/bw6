import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;


@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://DateToEpoch", helpText = "DateToEpoch")
public class DateToEpochCustomXPathFunctionGroup {
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "string1") }, helpText = "")
	public java.lang.String ToEpoch(java.lang.String string1) {
		return DateToEpoch.ToEpoch(string1);
	}
}
