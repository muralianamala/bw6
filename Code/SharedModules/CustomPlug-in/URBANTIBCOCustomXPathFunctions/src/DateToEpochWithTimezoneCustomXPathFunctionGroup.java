import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "URBANTIBCOCustomXPathFunctions", prefix = "URBANTIBCOCustomXPathFunctions", namespace = "java://DateToEpochWithTimezone", helpText = "DateToEpochWithTimezone")
public class DateToEpochWithTimezoneCustomXPathFunctionGroup {
	@XPathFunction(parameters = { @XPathFunctionParameter(name = "string1"),
			@XPathFunctionParameter(name = "string2") }, helpText = "")
	public java.lang.String DateToEpochWithTimezone(java.lang.String string1,
			java.lang.String string2) {
		return DateToEpochWithTimezone
				.DateToEpochWithTimezone(string1, string2);
	}
}
